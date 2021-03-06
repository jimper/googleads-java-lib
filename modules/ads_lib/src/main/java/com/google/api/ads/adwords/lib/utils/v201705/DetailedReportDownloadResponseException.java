// Copyright 2017 Google Inc. All Rights Reserved.
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

package com.google.api.ads.adwords.lib.utils.v201705;

/**
 * Exception wrapping the ReportDownloadError the server responded with. Will populate the
 * fieldPath, trigger and type fields if the XML can be parsed successfully, otherwise errorText
 * should have the HTTP response body.
 */
public class DetailedReportDownloadResponseException
    extends com.google.api.ads.adwords.lib.utils.DetailedReportDownloadResponseException {

  public DetailedReportDownloadResponseException(int httpStatus, String errorText) {
    super(httpStatus, errorText);
  }

  static class Builder
      implements com.google.api.ads.adwords.lib.utils.DetailedReportDownloadResponseException
          .Builder {
    @Override
    public com.google.api.ads.adwords.lib.utils.DetailedReportDownloadResponseException build(
        int httpStatus, String errorText) {
      return new DetailedReportDownloadResponseException(httpStatus, errorText);
    }
  }
}
