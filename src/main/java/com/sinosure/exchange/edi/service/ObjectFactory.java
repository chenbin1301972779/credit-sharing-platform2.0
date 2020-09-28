
package com.sinosure.exchange.edi.service;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.sinosure.exchange.edi.service package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _EdiException_QNAME = new QName("http://service.edi.exchange.sinosure.com", "EdiException");
    private final static QName _EdiExceptionErrorCode_QNAME = new QName("http://service.edi.exchange.sinosure.com", "errorCode");
    private final static QName _EdiExceptionErrorMsg_QNAME = new QName("http://service.edi.exchange.sinosure.com", "errorMsg");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.sinosure.exchange.edi.service
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetEdiReceiptAltApproveInfo }
     * 
     */
    public GetEdiReceiptAltApproveInfo createGetEdiReceiptAltApproveInfo() {
        return new GetEdiReceiptAltApproveInfo();
    }

    /**
     * Create an instance of {@link GetEdiReceiptAltApproveInfoResponse }
     * 
     */
    public GetEdiReceiptAltApproveInfoResponse createGetEdiReceiptAltApproveInfoResponse() {
        return new GetEdiReceiptAltApproveInfoResponse();
    }

    /**
     * Create an instance of {@link EdiException }
     * 
     */
    public EdiException createEdiException() {
        return new EdiException();
    }

    /**
     * Create an instance of {@link GetEdiDomDelcareApproveInfo }
     * 
     */
    public GetEdiDomDelcareApproveInfo createGetEdiDomDelcareApproveInfo() {
        return new GetEdiDomDelcareApproveInfo();
    }

    /**
     * Create an instance of {@link GetEdiDomDelcareApproveInfoResponse }
     * 
     */
    public GetEdiDomDelcareApproveInfoResponse createGetEdiDomDelcareApproveInfoResponse() {
        return new GetEdiDomDelcareApproveInfoResponse();
    }

    /**
     * Create an instance of {@link GetEdiCreditApplyInfo }
     * 
     */
    public GetEdiCreditApplyInfo createGetEdiCreditApplyInfo() {
        return new GetEdiCreditApplyInfo();
    }

    /**
     * Create an instance of {@link GetEdiCreditApplyInfoResponse }
     * 
     */
    public GetEdiCreditApplyInfoResponse createGetEdiCreditApplyInfoResponse() {
        return new GetEdiCreditApplyInfoResponse();
    }

    /**
     * Create an instance of {@link GetEdiRatingApproveInfo }
     * 
     */
    public GetEdiRatingApproveInfo createGetEdiRatingApproveInfo() {
        return new GetEdiRatingApproveInfo();
    }

    /**
     * Create an instance of {@link GetEdiRatingApproveInfoResponse }
     * 
     */
    public GetEdiRatingApproveInfoResponse createGetEdiRatingApproveInfoResponse() {
        return new GetEdiRatingApproveInfoResponse();
    }

    /**
     * Create an instance of {@link DoEdiSupplementData }
     * 
     */
    public DoEdiSupplementData createDoEdiSupplementData() {
        return new DoEdiSupplementData();
    }

    /**
     * Create an instance of {@link DoEdiSupplementDataResponse }
     * 
     */
    public DoEdiSupplementDataResponse createDoEdiSupplementDataResponse() {
        return new DoEdiSupplementDataResponse();
    }

    /**
     * Create an instance of {@link DoEdiBankCodeApply }
     * 
     */
    public DoEdiBankCodeApply createDoEdiBankCodeApply() {
        return new DoEdiBankCodeApply();
    }

    /**
     * Create an instance of {@link DoEdiBankCodeApplyResponse }
     * 
     */
    public DoEdiBankCodeApplyResponse createDoEdiBankCodeApplyResponse() {
        return new DoEdiBankCodeApplyResponse();
    }

    /**
     * Create an instance of {@link DoEdiDocumentList }
     * 
     */
    public DoEdiDocumentList createDoEdiDocumentList() {
        return new DoEdiDocumentList();
    }

    /**
     * Create an instance of {@link DoEdiDocumentListResponse }
     * 
     */
    public DoEdiDocumentListResponse createDoEdiDocumentListResponse() {
        return new DoEdiDocumentListResponse();
    }

    /**
     * Create an instance of {@link DoEdiInfoRetrieve }
     * 
     */
    public DoEdiInfoRetrieve createDoEdiInfoRetrieve() {
        return new DoEdiInfoRetrieve();
    }

    /**
     * Create an instance of {@link ArrayOfString }
     * 
     */
    public ArrayOfString createArrayOfString() {
        return new ArrayOfString();
    }

    /**
     * Create an instance of {@link DoEdiInfoRetrieveResponse }
     * 
     */
    public DoEdiInfoRetrieveResponse createDoEdiInfoRetrieveResponse() {
        return new DoEdiInfoRetrieveResponse();
    }

    /**
     * Create an instance of {@link DoEdiBuyerCodeApprove }
     * 
     */
    public DoEdiBuyerCodeApprove createDoEdiBuyerCodeApprove() {
        return new DoEdiBuyerCodeApprove();
    }

    /**
     * Create an instance of {@link DoEdiBuyerCodeApproveResponse }
     * 
     */
    public DoEdiBuyerCodeApproveResponse createDoEdiBuyerCodeApproveResponse() {
        return new DoEdiBuyerCodeApproveResponse();
    }

    /**
     * Create an instance of {@link DoEdiClaimApply }
     * 
     */
    public DoEdiClaimApply createDoEdiClaimApply() {
        return new DoEdiClaimApply();
    }

    /**
     * Create an instance of {@link DoEdiClaimApplyResponse }
     * 
     */
    public DoEdiClaimApplyResponse createDoEdiClaimApplyResponse() {
        return new DoEdiClaimApplyResponse();
    }

    /**
     * Create an instance of {@link DoEdiContractApply }
     * 
     */
    public DoEdiContractApply createDoEdiContractApply() {
        return new DoEdiContractApply();
    }

    /**
     * Create an instance of {@link DoEdiContractApplyResponse }
     * 
     */
    public DoEdiContractApplyResponse createDoEdiContractApplyResponse() {
        return new DoEdiContractApplyResponse();
    }

    /**
     * Create an instance of {@link GetEdiCountryClassify }
     * 
     */
    public GetEdiCountryClassify createGetEdiCountryClassify() {
        return new GetEdiCountryClassify();
    }

    /**
     * Create an instance of {@link GetEdiCountryClassifyResponse }
     * 
     */
    public GetEdiCountryClassifyResponse createGetEdiCountryClassifyResponse() {
        return new GetEdiCountryClassifyResponse();
    }

    /**
     * Create an instance of {@link GetEdiSupplementDataApproveInfo }
     * 
     */
    public GetEdiSupplementDataApproveInfo createGetEdiSupplementDataApproveInfo() {
        return new GetEdiSupplementDataApproveInfo();
    }

    /**
     * Create an instance of {@link GetEdiSupplementDataApproveInfoResponse }
     * 
     */
    public GetEdiSupplementDataApproveInfoResponse createGetEdiSupplementDataApproveInfoResponse() {
        return new GetEdiSupplementDataApproveInfoResponse();
    }

    /**
     * Create an instance of {@link DoEdiDomDeclareApply }
     * 
     */
    public DoEdiDomDeclareApply createDoEdiDomDeclareApply() {
        return new DoEdiDomDeclareApply();
    }

    /**
     * Create an instance of {@link DoEdiDomDeclareApplyResponse }
     * 
     */
    public DoEdiDomDeclareApplyResponse createDoEdiDomDeclareApplyResponse() {
        return new DoEdiDomDeclareApplyResponse();
    }

    /**
     * Create an instance of {@link DoEdiNoLcQuotaApplyV2 }
     * 
     */
    public DoEdiNoLcQuotaApplyV2 createDoEdiNoLcQuotaApplyV2() {
        return new DoEdiNoLcQuotaApplyV2();
    }

    /**
     * Create an instance of {@link DoEdiNoLcQuotaApplyV2Response }
     * 
     */
    public DoEdiNoLcQuotaApplyV2Response createDoEdiNoLcQuotaApplyV2Response() {
        return new DoEdiNoLcQuotaApplyV2Response();
    }

    /**
     * Create an instance of {@link GetEdiDomReceiptApproveInfo }
     * 
     */
    public GetEdiDomReceiptApproveInfo createGetEdiDomReceiptApproveInfo() {
        return new GetEdiDomReceiptApproveInfo();
    }

    /**
     * Create an instance of {@link GetEdiDomReceiptApproveInfoResponse }
     * 
     */
    public GetEdiDomReceiptApproveInfoResponse createGetEdiDomReceiptApproveInfoResponse() {
        return new GetEdiDomReceiptApproveInfoResponse();
    }

    /**
     * Create an instance of {@link GetEdiOverdueReceip }
     * 
     */
    public GetEdiOverdueReceip createGetEdiOverdueReceip() {
        return new GetEdiOverdueReceip();
    }

    /**
     * Create an instance of {@link GetEdiOverdueReceipResponse }
     * 
     */
    public GetEdiOverdueReceipResponse createGetEdiOverdueReceipResponse() {
        return new GetEdiOverdueReceipResponse();
    }

    /**
     * Create an instance of {@link GetEdiPolicyApproveInfo }
     * 
     */
    public GetEdiPolicyApproveInfo createGetEdiPolicyApproveInfo() {
        return new GetEdiPolicyApproveInfo();
    }

    /**
     * Create an instance of {@link GetEdiPolicyApproveInfoResponse }
     * 
     */
    public GetEdiPolicyApproveInfoResponse createGetEdiPolicyApproveInfoResponse() {
        return new GetEdiPolicyApproveInfoResponse();
    }

    /**
     * Create an instance of {@link DoEdiDomDeclareSupplementApply }
     * 
     */
    public DoEdiDomDeclareSupplementApply createDoEdiDomDeclareSupplementApply() {
        return new DoEdiDomDeclareSupplementApply();
    }

    /**
     * Create an instance of {@link DoEdiDomDeclareSupplementApplyResponse }
     * 
     */
    public DoEdiDomDeclareSupplementApplyResponse createDoEdiDomDeclareSupplementApplyResponse() {
        return new DoEdiDomDeclareSupplementApplyResponse();
    }

    /**
     * Create an instance of {@link DoEdiReceiptApply }
     * 
     */
    public DoEdiReceiptApply createDoEdiReceiptApply() {
        return new DoEdiReceiptApply();
    }

    /**
     * Create an instance of {@link DoEdiReceiptApplyResponse }
     * 
     */
    public DoEdiReceiptApplyResponse createDoEdiReceiptApplyResponse() {
        return new DoEdiReceiptApplyResponse();
    }

    /**
     * Create an instance of {@link DoEdiTotalDomDeclareApply }
     * 
     */
    public DoEdiTotalDomDeclareApply createDoEdiTotalDomDeclareApply() {
        return new DoEdiTotalDomDeclareApply();
    }

    /**
     * Create an instance of {@link DoEdiTotalDomDeclareApplyResponse }
     * 
     */
    public DoEdiTotalDomDeclareApplyResponse createDoEdiTotalDomDeclareApplyResponse() {
        return new DoEdiTotalDomDeclareApplyResponse();
    }

    /**
     * Create an instance of {@link GetEdiSpecialFeeRate }
     * 
     */
    public GetEdiSpecialFeeRate createGetEdiSpecialFeeRate() {
        return new GetEdiSpecialFeeRate();
    }

    /**
     * Create an instance of {@link GetEdiSpecialFeeRateResponse }
     * 
     */
    public GetEdiSpecialFeeRateResponse createGetEdiSpecialFeeRateResponse() {
        return new GetEdiSpecialFeeRateResponse();
    }

    /**
     * Create an instance of {@link DoEdiDomPlnotice }
     * 
     */
    public DoEdiDomPlnotice createDoEdiDomPlnotice() {
        return new DoEdiDomPlnotice();
    }

    /**
     * Create an instance of {@link DoEdiDomPlnoticeResponse }
     * 
     */
    public DoEdiDomPlnoticeResponse createDoEdiDomPlnoticeResponse() {
        return new DoEdiDomPlnoticeResponse();
    }

    /**
     * Create an instance of {@link DoEdiBuyerCodeApply }
     * 
     */
    public DoEdiBuyerCodeApply createDoEdiBuyerCodeApply() {
        return new DoEdiBuyerCodeApply();
    }

    /**
     * Create an instance of {@link DoEdiBuyerCodeApplyResponse }
     * 
     */
    public DoEdiBuyerCodeApplyResponse createDoEdiBuyerCodeApplyResponse() {
        return new DoEdiBuyerCodeApplyResponse();
    }

    /**
     * Create an instance of {@link DoEdiShipmentAlterApply }
     * 
     */
    public DoEdiShipmentAlterApply createDoEdiShipmentAlterApply() {
        return new DoEdiShipmentAlterApply();
    }

    /**
     * Create an instance of {@link DoEdiShipmentAlterApplyResponse }
     * 
     */
    public DoEdiShipmentAlterApplyResponse createDoEdiShipmentAlterApplyResponse() {
        return new DoEdiShipmentAlterApplyResponse();
    }

    /**
     * Create an instance of {@link GetQuotaBalanceInfoByPolicyNo }
     * 
     */
    public GetQuotaBalanceInfoByPolicyNo createGetQuotaBalanceInfoByPolicyNo() {
        return new GetQuotaBalanceInfoByPolicyNo();
    }

    /**
     * Create an instance of {@link GetQuotaBalanceInfoByPolicyNoResponse }
     * 
     */
    public GetQuotaBalanceInfoByPolicyNoResponse createGetQuotaBalanceInfoByPolicyNoResponse() {
        return new GetQuotaBalanceInfoByPolicyNoResponse();
    }

    /**
     * Create an instance of {@link GetEdiDomDeclareSupplementApproveInfo }
     * 
     */
    public GetEdiDomDeclareSupplementApproveInfo createGetEdiDomDeclareSupplementApproveInfo() {
        return new GetEdiDomDeclareSupplementApproveInfo();
    }

    /**
     * Create an instance of {@link GetEdiDomDeclareSupplementApproveInfoResponse }
     * 
     */
    public GetEdiDomDeclareSupplementApproveInfoResponse createGetEdiDomDeclareSupplementApproveInfoResponse() {
        return new GetEdiDomDeclareSupplementApproveInfoResponse();
    }

    /**
     * Create an instance of {@link GetExchangeRate }
     * 
     */
    public GetExchangeRate createGetExchangeRate() {
        return new GetExchangeRate();
    }

    /**
     * Create an instance of {@link GetExchangeRateResponse }
     * 
     */
    public GetExchangeRateResponse createGetExchangeRateResponse() {
        return new GetExchangeRateResponse();
    }

    /**
     * Create an instance of {@link DoEdiPlnotice }
     * 
     */
    public DoEdiPlnotice createDoEdiPlnotice() {
        return new DoEdiPlnotice();
    }

    /**
     * Create an instance of {@link DoEdiPlnoticeResponse }
     * 
     */
    public DoEdiPlnoticeResponse createDoEdiPlnoticeResponse() {
        return new DoEdiPlnoticeResponse();
    }

    /**
     * Create an instance of {@link GetEdiQuotaApproveInfo }
     * 
     */
    public GetEdiQuotaApproveInfo createGetEdiQuotaApproveInfo() {
        return new GetEdiQuotaApproveInfo();
    }

    /**
     * Create an instance of {@link GetEdiQuotaApproveInfoResponse }
     * 
     */
    public GetEdiQuotaApproveInfoResponse createGetEdiQuotaApproveInfoResponse() {
        return new GetEdiQuotaApproveInfoResponse();
    }

    /**
     * Create an instance of {@link DoEdiCreditReportInput }
     * 
     */
    public DoEdiCreditReportInput createDoEdiCreditReportInput() {
        return new DoEdiCreditReportInput();
    }

    /**
     * Create an instance of {@link DoEdiCreditReportInputResponse }
     * 
     */
    public DoEdiCreditReportInputResponse createDoEdiCreditReportInputResponse() {
        return new DoEdiCreditReportInputResponse();
    }

    /**
     * Create an instance of {@link GetEdiShipmentApproveInfo }
     * 
     */
    public GetEdiShipmentApproveInfo createGetEdiShipmentApproveInfo() {
        return new GetEdiShipmentApproveInfo();
    }

    /**
     * Create an instance of {@link GetEdiShipmentApproveInfoResponse }
     * 
     */
    public GetEdiShipmentApproveInfoResponse createGetEdiShipmentApproveInfoResponse() {
        return new GetEdiShipmentApproveInfoResponse();
    }

    /**
     * Create an instance of {@link DoEdiAccountList }
     * 
     */
    public DoEdiAccountList createDoEdiAccountList() {
        return new DoEdiAccountList();
    }

    /**
     * Create an instance of {@link DoEdiAccountListResponse }
     * 
     */
    public DoEdiAccountListResponse createDoEdiAccountListResponse() {
        return new DoEdiAccountListResponse();
    }

    /**
     * Create an instance of {@link GetEdiPlnoticeApproveInfo }
     * 
     */
    public GetEdiPlnoticeApproveInfo createGetEdiPlnoticeApproveInfo() {
        return new GetEdiPlnoticeApproveInfo();
    }

    /**
     * Create an instance of {@link GetEdiPlnoticeApproveInfoResponse }
     * 
     */
    public GetEdiPlnoticeApproveInfoResponse createGetEdiPlnoticeApproveInfoResponse() {
        return new GetEdiPlnoticeApproveInfoResponse();
    }

    /**
     * Create an instance of {@link DoEdiInfoQuery }
     * 
     */
    public DoEdiInfoQuery createDoEdiInfoQuery() {
        return new DoEdiInfoQuery();
    }

    /**
     * Create an instance of {@link DoEdiInfoQueryResponse }
     * 
     */
    public DoEdiInfoQueryResponse createDoEdiInfoQueryResponse() {
        return new DoEdiInfoQueryResponse();
    }

    /**
     * Create an instance of {@link DoEdiInfoAttachDownload }
     * 
     */
    public DoEdiInfoAttachDownload createDoEdiInfoAttachDownload() {
        return new DoEdiInfoAttachDownload();
    }

    /**
     * Create an instance of {@link DoEdiInfoAttachDownloadResponse }
     * 
     */
    public DoEdiInfoAttachDownloadResponse createDoEdiInfoAttachDownloadResponse() {
        return new DoEdiInfoAttachDownloadResponse();
    }

    /**
     * Create an instance of {@link GetEdiReceiptApproveInfo }
     * 
     */
    public GetEdiReceiptApproveInfo createGetEdiReceiptApproveInfo() {
        return new GetEdiReceiptApproveInfo();
    }

    /**
     * Create an instance of {@link GetEdiReceiptApproveInfoResponse }
     * 
     */
    public GetEdiReceiptApproveInfoResponse createGetEdiReceiptApproveInfoResponse() {
        return new GetEdiReceiptApproveInfoResponse();
    }

    /**
     * Create an instance of {@link GetEdiContractApproveInfo }
     * 
     */
    public GetEdiContractApproveInfo createGetEdiContractApproveInfo() {
        return new GetEdiContractApproveInfo();
    }

    /**
     * Create an instance of {@link GetEdiContractApproveInfoResponse }
     * 
     */
    public GetEdiContractApproveInfoResponse createGetEdiContractApproveInfoResponse() {
        return new GetEdiContractApproveInfoResponse();
    }

    /**
     * Create an instance of {@link GetEdiPolicyApplyInfo }
     * 
     */
    public GetEdiPolicyApplyInfo createGetEdiPolicyApplyInfo() {
        return new GetEdiPolicyApplyInfo();
    }

    /**
     * Create an instance of {@link GetEdiPolicyApplyInfoResponse }
     * 
     */
    public GetEdiPolicyApplyInfoResponse createGetEdiPolicyApplyInfoResponse() {
        return new GetEdiPolicyApplyInfoResponse();
    }

    /**
     * Create an instance of {@link DoEdiDomQuotaApply }
     * 
     */
    public DoEdiDomQuotaApply createDoEdiDomQuotaApply() {
        return new DoEdiDomQuotaApply();
    }

    /**
     * Create an instance of {@link DoEdiDomQuotaApplyResponse }
     * 
     */
    public DoEdiDomQuotaApplyResponse createDoEdiDomQuotaApplyResponse() {
        return new DoEdiDomQuotaApplyResponse();
    }

    /**
     * Create an instance of {@link DoEdiShipmentTotalApply }
     * 
     */
    public DoEdiShipmentTotalApply createDoEdiShipmentTotalApply() {
        return new DoEdiShipmentTotalApply();
    }

    /**
     * Create an instance of {@link DoEdiShipmentTotalApplyResponse }
     * 
     */
    public DoEdiShipmentTotalApplyResponse createDoEdiShipmentTotalApplyResponse() {
        return new DoEdiShipmentTotalApplyResponse();
    }

    /**
     * Create an instance of {@link GetEdiDomTotalDelcareApproveInfo }
     * 
     */
    public GetEdiDomTotalDelcareApproveInfo createGetEdiDomTotalDelcareApproveInfo() {
        return new GetEdiDomTotalDelcareApproveInfo();
    }

    /**
     * Create an instance of {@link GetEdiDomTotalDelcareApproveInfoResponse }
     * 
     */
    public GetEdiDomTotalDelcareApproveInfoResponse createGetEdiDomTotalDelcareApproveInfoResponse() {
        return new GetEdiDomTotalDelcareApproveInfoResponse();
    }

    /**
     * Create an instance of {@link GetEdiDomQuotaApproveInfo }
     * 
     */
    public GetEdiDomQuotaApproveInfo createGetEdiDomQuotaApproveInfo() {
        return new GetEdiDomQuotaApproveInfo();
    }

    /**
     * Create an instance of {@link GetEdiDomQuotaApproveInfoResponse }
     * 
     */
    public GetEdiDomQuotaApproveInfoResponse createGetEdiDomQuotaApproveInfoResponse() {
        return new GetEdiDomQuotaApproveInfoResponse();
    }

    /**
     * Create an instance of {@link GetEdiCreditReportApprove }
     * 
     */
    public GetEdiCreditReportApprove createGetEdiCreditReportApprove() {
        return new GetEdiCreditReportApprove();
    }

    /**
     * Create an instance of {@link GetEdiCreditReportApproveResponse }
     * 
     */
    public GetEdiCreditReportApproveResponse createGetEdiCreditReportApproveResponse() {
        return new GetEdiCreditReportApproveResponse();
    }

    /**
     * Create an instance of {@link DoEdiPolicyConfirm }
     * 
     */
    public DoEdiPolicyConfirm createDoEdiPolicyConfirm() {
        return new DoEdiPolicyConfirm();
    }

    /**
     * Create an instance of {@link DoEdiPolicyConfirmResponse }
     * 
     */
    public DoEdiPolicyConfirmResponse createDoEdiPolicyConfirmResponse() {
        return new DoEdiPolicyConfirmResponse();
    }

    /**
     * Create an instance of {@link DoEdiShipmentApply }
     * 
     */
    public DoEdiShipmentApply createDoEdiShipmentApply() {
        return new DoEdiShipmentApply();
    }

    /**
     * Create an instance of {@link DoEdiShipmentApplyResponse }
     * 
     */
    public DoEdiShipmentApplyResponse createDoEdiShipmentApplyResponse() {
        return new DoEdiShipmentApplyResponse();
    }

    /**
     * Create an instance of {@link GetEdiDomQuotaPreRevocationInfo }
     * 
     */
    public GetEdiDomQuotaPreRevocationInfo createGetEdiDomQuotaPreRevocationInfo() {
        return new GetEdiDomQuotaPreRevocationInfo();
    }

    /**
     * Create an instance of {@link GetEdiDomQuotaPreRevocationInfoResponse }
     * 
     */
    public GetEdiDomQuotaPreRevocationInfoResponse createGetEdiDomQuotaPreRevocationInfoResponse() {
        return new GetEdiDomQuotaPreRevocationInfoResponse();
    }

    /**
     * Create an instance of {@link GetEdiQuotaapplys }
     * 
     */
    public GetEdiQuotaapplys createGetEdiQuotaapplys() {
        return new GetEdiQuotaapplys();
    }

    /**
     * Create an instance of {@link GetEdiQuotaapplysResponse }
     * 
     */
    public GetEdiQuotaapplysResponse createGetEdiQuotaapplysResponse() {
        return new GetEdiQuotaapplysResponse();
    }

    /**
     * Create an instance of {@link GetEdiClaimApproveInfo }
     * 
     */
    public GetEdiClaimApproveInfo createGetEdiClaimApproveInfo() {
        return new GetEdiClaimApproveInfo();
    }

    /**
     * Create an instance of {@link GetEdiClaimApproveInfoResponse }
     * 
     */
    public GetEdiClaimApproveInfoResponse createGetEdiClaimApproveInfoResponse() {
        return new GetEdiClaimApproveInfoResponse();
    }

    /**
     * Create an instance of {@link GetEdiShipmentAlterApproveInfo }
     * 
     */
    public GetEdiShipmentAlterApproveInfo createGetEdiShipmentAlterApproveInfo() {
        return new GetEdiShipmentAlterApproveInfo();
    }

    /**
     * Create an instance of {@link GetEdiShipmentAlterApproveInfoResponse }
     * 
     */
    public GetEdiShipmentAlterApproveInfoResponse createGetEdiShipmentAlterApproveInfoResponse() {
        return new GetEdiShipmentAlterApproveInfoResponse();
    }

    /**
     * Create an instance of {@link DoEdiFileUpload }
     * 
     */
    public DoEdiFileUpload createDoEdiFileUpload() {
        return new DoEdiFileUpload();
    }

    /**
     * Create an instance of {@link DoEdiFileUploadResponse }
     * 
     */
    public DoEdiFileUploadResponse createDoEdiFileUploadResponse() {
        return new DoEdiFileUploadResponse();
    }

    /**
     * Create an instance of {@link GetEdiQuotaPreRevocationInfo }
     * 
     */
    public GetEdiQuotaPreRevocationInfo createGetEdiQuotaPreRevocationInfo() {
        return new GetEdiQuotaPreRevocationInfo();
    }

    /**
     * Create an instance of {@link GetEdiQuotaPreRevocationInfoResponse }
     * 
     */
    public GetEdiQuotaPreRevocationInfoResponse createGetEdiQuotaPreRevocationInfoResponse() {
        return new GetEdiQuotaPreRevocationInfoResponse();
    }

    /**
     * Create an instance of {@link GetEdiShipmentTotalApproveInfo }
     * 
     */
    public GetEdiShipmentTotalApproveInfo createGetEdiShipmentTotalApproveInfo() {
        return new GetEdiShipmentTotalApproveInfo();
    }

    /**
     * Create an instance of {@link GetEdiShipmentTotalApproveInfoResponse }
     * 
     */
    public GetEdiShipmentTotalApproveInfoResponse createGetEdiShipmentTotalApproveInfoResponse() {
        return new GetEdiShipmentTotalApproveInfoResponse();
    }

    /**
     * Create an instance of {@link DoEdiBankCodeApprove }
     * 
     */
    public DoEdiBankCodeApprove createDoEdiBankCodeApprove() {
        return new DoEdiBankCodeApprove();
    }

    /**
     * Create an instance of {@link DoEdiBankCodeApproveResponse }
     * 
     */
    public DoEdiBankCodeApproveResponse createDoEdiBankCodeApproveResponse() {
        return new DoEdiBankCodeApproveResponse();
    }

    /**
     * Create an instance of {@link GetEdiQuotaBackApproveInfo }
     * 
     */
    public GetEdiQuotaBackApproveInfo createGetEdiQuotaBackApproveInfo() {
        return new GetEdiQuotaBackApproveInfo();
    }

    /**
     * Create an instance of {@link GetEdiQuotaBackApproveInfoResponse }
     * 
     */
    public GetEdiQuotaBackApproveInfoResponse createGetEdiQuotaBackApproveInfoResponse() {
        return new GetEdiQuotaBackApproveInfoResponse();
    }

    /**
     * Create an instance of {@link DoEdiReceiptAltApply }
     * 
     */
    public DoEdiReceiptAltApply createDoEdiReceiptAltApply() {
        return new DoEdiReceiptAltApply();
    }

    /**
     * Create an instance of {@link DoEdiReceiptAltApplyResponse }
     * 
     */
    public DoEdiReceiptAltApplyResponse createDoEdiReceiptAltApplyResponse() {
        return new DoEdiReceiptAltApplyResponse();
    }

    /**
     * Create an instance of {@link GetEdiBasicFeeRate }
     * 
     */
    public GetEdiBasicFeeRate createGetEdiBasicFeeRate() {
        return new GetEdiBasicFeeRate();
    }

    /**
     * Create an instance of {@link GetEdiBasicFeeRateResponse }
     * 
     */
    public GetEdiBasicFeeRateResponse createGetEdiBasicFeeRateResponse() {
        return new GetEdiBasicFeeRateResponse();
    }

    /**
     * Create an instance of {@link GetEdiFeeNoticeInfo }
     * 
     */
    public GetEdiFeeNoticeInfo createGetEdiFeeNoticeInfo() {
        return new GetEdiFeeNoticeInfo();
    }

    /**
     * Create an instance of {@link GetEdiFeeNoticeInfoResponse }
     * 
     */
    public GetEdiFeeNoticeInfoResponse createGetEdiFeeNoticeInfoResponse() {
        return new GetEdiFeeNoticeInfoResponse();
    }

    /**
     * Create an instance of {@link DoEdiLcQuotaApplyV2 }
     * 
     */
    public DoEdiLcQuotaApplyV2 createDoEdiLcQuotaApplyV2() {
        return new DoEdiLcQuotaApplyV2();
    }

    /**
     * Create an instance of {@link DoEdiLcQuotaApplyV2Response }
     * 
     */
    public DoEdiLcQuotaApplyV2Response createDoEdiLcQuotaApplyV2Response() {
        return new DoEdiLcQuotaApplyV2Response();
    }

    /**
     * Create an instance of {@link DoEdiNoLcQuotaApply }
     * 
     */
    public DoEdiNoLcQuotaApply createDoEdiNoLcQuotaApply() {
        return new DoEdiNoLcQuotaApply();
    }

    /**
     * Create an instance of {@link DoEdiNoLcQuotaApplyResponse }
     * 
     */
    public DoEdiNoLcQuotaApplyResponse createDoEdiNoLcQuotaApplyResponse() {
        return new DoEdiNoLcQuotaApplyResponse();
    }

    /**
     * Create an instance of {@link DoQuotaBackApply }
     * 
     */
    public DoQuotaBackApply createDoQuotaBackApply() {
        return new DoQuotaBackApply();
    }

    /**
     * Create an instance of {@link DoQuotaBackApplyResponse }
     * 
     */
    public DoQuotaBackApplyResponse createDoQuotaBackApplyResponse() {
        return new DoQuotaBackApplyResponse();
    }

    /**
     * Create an instance of {@link GetQuotaBalanceInfo }
     * 
     */
    public GetQuotaBalanceInfo createGetQuotaBalanceInfo() {
        return new GetQuotaBalanceInfo();
    }

    /**
     * Create an instance of {@link GetQuotaBalanceInfoResponse }
     * 
     */
    public GetQuotaBalanceInfoResponse createGetQuotaBalanceInfoResponse() {
        return new GetQuotaBalanceInfoResponse();
    }

    /**
     * Create an instance of {@link DoEdiDocumentDownload }
     * 
     */
    public DoEdiDocumentDownload createDoEdiDocumentDownload() {
        return new DoEdiDocumentDownload();
    }

    /**
     * Create an instance of {@link DoEdiDocumentDownloadResponse }
     * 
     */
    public DoEdiDocumentDownloadResponse createDoEdiDocumentDownloadResponse() {
        return new DoEdiDocumentDownloadResponse();
    }

    /**
     * Create an instance of {@link DoEdiDomReceiptApply }
     * 
     */
    public DoEdiDomReceiptApply createDoEdiDomReceiptApply() {
        return new DoEdiDomReceiptApply();
    }

    /**
     * Create an instance of {@link DoEdiDomReceiptApplyResponse }
     * 
     */
    public DoEdiDomReceiptApplyResponse createDoEdiDomReceiptApplyResponse() {
        return new DoEdiDomReceiptApplyResponse();
    }

    /**
     * Create an instance of {@link GetSOLUserAuthorizationInfo }
     * 
     */
    public GetSOLUserAuthorizationInfo createGetSOLUserAuthorizationInfo() {
        return new GetSOLUserAuthorizationInfo();
    }

    /**
     * Create an instance of {@link GetSOLUserAuthorizationInfoResponse }
     * 
     */
    public GetSOLUserAuthorizationInfoResponse createGetSOLUserAuthorizationInfoResponse() {
        return new GetSOLUserAuthorizationInfoResponse();
    }

    /**
     * Create an instance of {@link DoEdiShipmentApplyV2 }
     * 
     */
    public DoEdiShipmentApplyV2 createDoEdiShipmentApplyV2() {
        return new DoEdiShipmentApplyV2();
    }

    /**
     * Create an instance of {@link DoEdiShipmentApplyV2Response }
     * 
     */
    public DoEdiShipmentApplyV2Response createDoEdiShipmentApplyV2Response() {
        return new DoEdiShipmentApplyV2Response();
    }

    /**
     * Create an instance of {@link GetEdiDomPlNoticeApproveInfo }
     * 
     */
    public GetEdiDomPlNoticeApproveInfo createGetEdiDomPlNoticeApproveInfo() {
        return new GetEdiDomPlNoticeApproveInfo();
    }

    /**
     * Create an instance of {@link GetEdiDomPlNoticeApproveInfoResponse }
     * 
     */
    public GetEdiDomPlNoticeApproveInfoResponse createGetEdiDomPlNoticeApproveInfoResponse() {
        return new GetEdiDomPlNoticeApproveInfoResponse();
    }

    /**
     * Create an instance of {@link DoEdiPolicyApply }
     * 
     */
    public DoEdiPolicyApply createDoEdiPolicyApply() {
        return new DoEdiPolicyApply();
    }

    /**
     * Create an instance of {@link DoEdiPolicyApplyResponse }
     * 
     */
    public DoEdiPolicyApplyResponse createDoEdiPolicyApplyResponse() {
        return new DoEdiPolicyApplyResponse();
    }

    /**
     * Create an instance of {@link EdiCheckAutoQuota }
     * 
     */
    public EdiCheckAutoQuota createEdiCheckAutoQuota() {
        return new EdiCheckAutoQuota();
    }

    /**
     * Create an instance of {@link EdiCheckAutoQuotaResponse }
     * 
     */
    public EdiCheckAutoQuotaResponse createEdiCheckAutoQuotaResponse() {
        return new EdiCheckAutoQuotaResponse();
    }

    /**
     * Create an instance of {@link DoEdiLcQuotaApply }
     * 
     */
    public DoEdiLcQuotaApply createDoEdiLcQuotaApply() {
        return new DoEdiLcQuotaApply();
    }

    /**
     * Create an instance of {@link DoEdiLcQuotaApplyResponse }
     * 
     */
    public DoEdiLcQuotaApplyResponse createDoEdiLcQuotaApplyResponse() {
        return new DoEdiLcQuotaApplyResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EdiException }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link EdiException }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.edi.exchange.sinosure.com", name = "EdiException")
    public JAXBElement<EdiException> createEdiException(EdiException value) {
        return new JAXBElement<EdiException>(_EdiException_QNAME, EdiException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.edi.exchange.sinosure.com", name = "errorCode", scope = EdiException.class)
    public JAXBElement<String> createEdiExceptionErrorCode(String value) {
        return new JAXBElement<String>(_EdiExceptionErrorCode_QNAME, String.class, EdiException.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.edi.exchange.sinosure.com", name = "errorMsg", scope = EdiException.class)
    public JAXBElement<String> createEdiExceptionErrorMsg(String value) {
        return new JAXBElement<String>(_EdiExceptionErrorMsg_QNAME, String.class, EdiException.class, value);
    }

}
