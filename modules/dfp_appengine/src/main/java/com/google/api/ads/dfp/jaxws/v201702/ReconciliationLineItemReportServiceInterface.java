// Copyright 2017 Google Inc. All Rights Reserved.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
// http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.


package com.google.api.ads.dfp.jaxws.v201702;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * 
 *       Provides methods for retrieving and updating {@link ReconciliationLineItemReport} objects.
 *     
 * 
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.1
 * 
 */
@WebService(name = "ReconciliationLineItemReportServiceInterface", targetNamespace = "https://www.google.com/apis/ads/publisher/v201702")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface ReconciliationLineItemReportServiceInterface {


    /**
     * 
     *         Gets a {@link ReconciliationLineItemReportPage} of {@link ReconciliationLineItemReport}
     *         objects that satisfy the given {@link Statement#query}.
     *         The following fields are supported for filtering:
     *         
     *         <table>
     *         <tr>
     *         <th scope="col">PQL Property</th> <th scope="col">Object Property</th>
     *         </tr>
     *         <tr>
     *         <td>{@code id}</td>
     *         <td>{@link ReconciliationLineItemReport#id}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code reconciliationReportId}</td>
     *         <td>{@link ReconciliationLineItemReport#reconciliationReportId}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code orderId}</td>
     *         <td>{@link ReconciliationLineItemReport#orderId}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code proposalId}</td>
     *         <td>{@link ReconciliationLineItemReport#proposalId}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code lineItemId}</td>
     *         <td>{@link ReconciliationLineItemReport#lineItemId}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code proposalLineItemId}</td>
     *         <td>{@link ReconciliationLineItemReport#proposalLineItemId}</td>
     *         </tr>
     *         </table>
     *         
     *         @param filterStatement a Publisher Query Language statement used to filter the result
     *         @return the {@link ReconciliationLineItemReport} objects that match the given filter
     *       
     * 
     * @param filterStatement
     * @return
     *     returns com.google.api.ads.dfp.jaxws.v201702.ReconciliationLineItemReportPage
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://www.google.com/apis/ads/publisher/v201702")
    @RequestWrapper(localName = "getReconciliationLineItemReportsByStatement", targetNamespace = "https://www.google.com/apis/ads/publisher/v201702", className = "com.google.api.ads.dfp.jaxws.v201702.ReconciliationLineItemReportServiceInterfacegetReconciliationLineItemReportsByStatement")
    @ResponseWrapper(localName = "getReconciliationLineItemReportsByStatementResponse", targetNamespace = "https://www.google.com/apis/ads/publisher/v201702", className = "com.google.api.ads.dfp.jaxws.v201702.ReconciliationLineItemReportServiceInterfacegetReconciliationLineItemReportsByStatementResponse")
    public ReconciliationLineItemReportPage getReconciliationLineItemReportsByStatement(
        @WebParam(name = "filterStatement", targetNamespace = "https://www.google.com/apis/ads/publisher/v201702")
        Statement filterStatement)
        throws ApiException_Exception
    ;

    /**
     * 
     *         Updates a list of {@link ReconciliationLineItemReport} objects which belong to same
     *         {@link ReconciliationReport}.
     *         
     *         @param reconciliationLineItemReports a list of
     *         {@link ReconciliationLineItemReport reconciliation line item reports} to update
     *         @return the updated {@link ReconciliationLineItemReport} objects
     *       
     * 
     * @param reconciliationLineItemReports
     * @return
     *     returns java.util.List<com.google.api.ads.dfp.jaxws.v201702.ReconciliationLineItemReport>
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://www.google.com/apis/ads/publisher/v201702")
    @RequestWrapper(localName = "updateReconciliationLineItemReports", targetNamespace = "https://www.google.com/apis/ads/publisher/v201702", className = "com.google.api.ads.dfp.jaxws.v201702.ReconciliationLineItemReportServiceInterfaceupdateReconciliationLineItemReports")
    @ResponseWrapper(localName = "updateReconciliationLineItemReportsResponse", targetNamespace = "https://www.google.com/apis/ads/publisher/v201702", className = "com.google.api.ads.dfp.jaxws.v201702.ReconciliationLineItemReportServiceInterfaceupdateReconciliationLineItemReportsResponse")
    public List<ReconciliationLineItemReport> updateReconciliationLineItemReports(
        @WebParam(name = "reconciliationLineItemReports", targetNamespace = "https://www.google.com/apis/ads/publisher/v201702")
        List<ReconciliationLineItemReport> reconciliationLineItemReports)
        throws ApiException_Exception
    ;

}
