// Copyright 2014, Google Inc. All Rights Reserved.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//     http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package com.google.api.ads.dfp.lib.factory.helper;

import static org.junit.Assert.assertEquals;

import com.google.api.ads.common.lib.conf.AdsLibConfiguration;
import com.google.api.ads.common.lib.factory.FactoryModule.AdsServiceClientFactoryInterface;
import com.google.api.ads.common.lib.factory.FactoryModule.AdsServiceDescriptorFactoryInterface;
import com.google.api.ads.common.lib.soap.SoapClientHandlerInterface;
import com.google.api.ads.dfp.lib.client.DfpServiceClient;
import com.google.api.ads.dfp.lib.client.DfpServiceDescriptor;
import com.google.api.ads.dfp.lib.client.DfpSession;
import com.google.api.client.auth.oauth2.BearerToken;
import com.google.api.client.auth.oauth2.Credential;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

/**
 * Test for {@link DfpServiceClientFactoryHelper}.
 */
@RunWith(JUnit4.class)
public class DfpServiceClientFactoryHelperTest {

  @Mock
  private AdsServiceClientFactoryInterface<
      DfpServiceClient, DfpSession, DfpServiceDescriptor> adsServiceClientFactory;
  @Mock
  private AdsServiceDescriptorFactoryInterface<DfpServiceDescriptor>
      adsServiceDescriptorFactory;
  @Mock /* The type argument for SoapClientHandlerInterface does not matter for this test. */
  private SoapClientHandlerInterface<Object> soapClientHandler;
  @Mock
  private AdsLibConfiguration adsLibConfiguration;

  @Before
  public void setup() {
    MockitoAnnotations.initMocks(this);
  }

  @Test
  public void testVersionedPackage() throws Exception {
    DfpServiceClientFactoryHelper helper = new DfpServiceClientFactoryHelper(
        adsServiceClientFactory, adsServiceDescriptorFactory, soapClientHandler,
        adsLibConfiguration);
    assertEquals("v201702", helper.determineVersion(
        com.google.api.ads.dfp.lib.factory.helper.testing.v201702.TestService.class));
  }

  @Test
  public void testCheckServiceClientPreconditions_passOAuth2() throws Exception {
    DfpServiceClientFactoryHelper helper = new DfpServiceClientFactoryHelper(
        adsServiceClientFactory, adsServiceDescriptorFactory, soapClientHandler,
        adsLibConfiguration);

    Credential credential = new Credential(BearerToken.authorizationHeaderAccessMethod());

    DfpSession dfpSession = new DfpSession.Builder()
        .withApplicationName("FooBar")
        .withNetworkCode("1000")
        .withEndpoint("https://ads.google.com")
        .withOAuth2Credential(credential)
        .build();

    helper.checkServiceClientPreconditions(dfpSession,
        com.google.api.ads.dfp.lib.factory.helper.testing.v201702.TestService.class);
  }
}
