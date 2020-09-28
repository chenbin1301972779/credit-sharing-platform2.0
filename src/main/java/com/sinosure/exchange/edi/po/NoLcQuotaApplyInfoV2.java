
package com.sinosure.exchange.edi.po;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>NoLcQuotaApplyInfoV2 complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="NoLcQuotaApplyInfoV2"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="aftercreditterm" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="applicant" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="applyTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="areaNo" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="armSum" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="buyerChnAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="buyerChnName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="buyerCountryCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="buyerEngAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="buyerEngName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="buyerFax" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="buyerOweElseReason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="buyerOweReasonCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="buyerPayBehave1" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="buyerPayBehave2" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="buyerPayBehave3" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="buyerPayBehave4" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="buyerRegNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="buyerTel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="clientNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="contractPayMode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="corpBuyerNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="corpSerialNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="corpWarrantorNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="creditno" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="declaration" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="earlyTradeYear" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="employeeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="filenum" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="ifHistTrade" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ifapplycredit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ifhaverelation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ifhavetradefinancing" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ifsamewithpolicy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="issamewithcontract" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="item1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="item2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="item3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="item4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="item5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="lastPayMode1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="lastPayMode2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="lastPayMode3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="lastSum1" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="lastSum2" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="lastSum3" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="lastYear1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="lastYear2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="lastYear3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nosamewithcontractreason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="orderSum" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="orgno" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="payTermApply" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="policyNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="precreditterm" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="quotaSumApply" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="relationdetail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="remark" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="sinosureBuyerNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="sinosureWarrantorNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="startDebtYear" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tradeElseName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tradeElseTerms" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tradeNameCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tradeTerms" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="warrantorChnAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="warrantorChnName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="warrantorCountryCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="warrantorEngAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="warrantorEngName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="warrantorFax" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="warrantorRegNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="warrantorTel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="warrantorType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="warrantorareano" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="warrantorcreditno" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="warrantororgno" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NoLcQuotaApplyInfoV2", propOrder = {
    "aftercreditterm",
    "applicant",
    "applyTime",
    "areaNo",
    "armSum",
    "buyerChnAddress",
    "buyerChnName",
    "buyerCountryCode",
    "buyerEngAddress",
    "buyerEngName",
    "buyerFax",
    "buyerOweElseReason",
    "buyerOweReasonCode",
    "buyerPayBehave1",
    "buyerPayBehave2",
    "buyerPayBehave3",
    "buyerPayBehave4",
    "buyerRegNo",
    "buyerTel",
    "clientNo",
    "contractPayMode",
    "corpBuyerNo",
    "corpSerialNo",
    "corpWarrantorNo",
    "creditno",
    "declaration",
    "earlyTradeYear",
    "employeeName",
    "filenum",
    "ifHistTrade",
    "ifapplycredit",
    "ifhaverelation",
    "ifhavetradefinancing",
    "ifsamewithpolicy",
    "issamewithcontract",
    "item1",
    "item2",
    "item3",
    "item4",
    "item5",
    "lastPayMode1",
    "lastPayMode2",
    "lastPayMode3",
    "lastSum1",
    "lastSum2",
    "lastSum3",
    "lastYear1",
    "lastYear2",
    "lastYear3",
    "nosamewithcontractreason",
    "orderSum",
    "orgno",
    "payTermApply",
    "policyNo",
    "precreditterm",
    "quotaSumApply",
    "relationdetail",
    "remark",
    "sinosureBuyerNo",
    "sinosureWarrantorNo",
    "startDebtYear",
    "tradeElseName",
    "tradeElseTerms",
    "tradeNameCode",
    "tradeTerms",
    "warrantorChnAddress",
    "warrantorChnName",
    "warrantorCountryCode",
    "warrantorEngAddress",
    "warrantorEngName",
    "warrantorFax",
    "warrantorRegNo",
    "warrantorTel",
    "warrantorType",
    "warrantorareano",
    "warrantorcreditno",
    "warrantororgno"
})
public class NoLcQuotaApplyInfoV2 {

    @XmlElementRef(name = "aftercreditterm", namespace = "http://po.edi.exchange.sinosure.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> aftercreditterm;
    @XmlElementRef(name = "applicant", namespace = "http://po.edi.exchange.sinosure.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> applicant;
    @XmlElementRef(name = "applyTime", namespace = "http://po.edi.exchange.sinosure.com", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> applyTime;
    @XmlElementRef(name = "areaNo", namespace = "http://po.edi.exchange.sinosure.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> areaNo;
    @XmlElementRef(name = "armSum", namespace = "http://po.edi.exchange.sinosure.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> armSum;
    @XmlElementRef(name = "buyerChnAddress", namespace = "http://po.edi.exchange.sinosure.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> buyerChnAddress;
    @XmlElementRef(name = "buyerChnName", namespace = "http://po.edi.exchange.sinosure.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> buyerChnName;
    @XmlElementRef(name = "buyerCountryCode", namespace = "http://po.edi.exchange.sinosure.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> buyerCountryCode;
    @XmlElementRef(name = "buyerEngAddress", namespace = "http://po.edi.exchange.sinosure.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> buyerEngAddress;
    @XmlElementRef(name = "buyerEngName", namespace = "http://po.edi.exchange.sinosure.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> buyerEngName;
    @XmlElementRef(name = "buyerFax", namespace = "http://po.edi.exchange.sinosure.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> buyerFax;
    @XmlElementRef(name = "buyerOweElseReason", namespace = "http://po.edi.exchange.sinosure.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> buyerOweElseReason;
    @XmlElementRef(name = "buyerOweReasonCode", namespace = "http://po.edi.exchange.sinosure.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> buyerOweReasonCode;
    @XmlElementRef(name = "buyerPayBehave1", namespace = "http://po.edi.exchange.sinosure.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> buyerPayBehave1;
    @XmlElementRef(name = "buyerPayBehave2", namespace = "http://po.edi.exchange.sinosure.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> buyerPayBehave2;
    @XmlElementRef(name = "buyerPayBehave3", namespace = "http://po.edi.exchange.sinosure.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> buyerPayBehave3;
    @XmlElementRef(name = "buyerPayBehave4", namespace = "http://po.edi.exchange.sinosure.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> buyerPayBehave4;
    @XmlElementRef(name = "buyerRegNo", namespace = "http://po.edi.exchange.sinosure.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> buyerRegNo;
    @XmlElementRef(name = "buyerTel", namespace = "http://po.edi.exchange.sinosure.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> buyerTel;
    @XmlElementRef(name = "clientNo", namespace = "http://po.edi.exchange.sinosure.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> clientNo;
    @XmlElementRef(name = "contractPayMode", namespace = "http://po.edi.exchange.sinosure.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> contractPayMode;
    @XmlElementRef(name = "corpBuyerNo", namespace = "http://po.edi.exchange.sinosure.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> corpBuyerNo;
    @XmlElementRef(name = "corpSerialNo", namespace = "http://po.edi.exchange.sinosure.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> corpSerialNo;
    @XmlElementRef(name = "corpWarrantorNo", namespace = "http://po.edi.exchange.sinosure.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> corpWarrantorNo;
    @XmlElementRef(name = "creditno", namespace = "http://po.edi.exchange.sinosure.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> creditno;
    @XmlElementRef(name = "declaration", namespace = "http://po.edi.exchange.sinosure.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> declaration;
    @XmlElementRef(name = "earlyTradeYear", namespace = "http://po.edi.exchange.sinosure.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> earlyTradeYear;
    @XmlElementRef(name = "employeeName", namespace = "http://po.edi.exchange.sinosure.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> employeeName;
    @XmlElementRef(name = "filenum", namespace = "http://po.edi.exchange.sinosure.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> filenum;
    @XmlElementRef(name = "ifHistTrade", namespace = "http://po.edi.exchange.sinosure.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> ifHistTrade;
    @XmlElementRef(name = "ifapplycredit", namespace = "http://po.edi.exchange.sinosure.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> ifapplycredit;
    @XmlElementRef(name = "ifhaverelation", namespace = "http://po.edi.exchange.sinosure.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> ifhaverelation;
    @XmlElementRef(name = "ifhavetradefinancing", namespace = "http://po.edi.exchange.sinosure.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> ifhavetradefinancing;
    @XmlElementRef(name = "ifsamewithpolicy", namespace = "http://po.edi.exchange.sinosure.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> ifsamewithpolicy;
    @XmlElementRef(name = "issamewithcontract", namespace = "http://po.edi.exchange.sinosure.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> issamewithcontract;
    @XmlElementRef(name = "item1", namespace = "http://po.edi.exchange.sinosure.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> item1;
    @XmlElementRef(name = "item2", namespace = "http://po.edi.exchange.sinosure.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> item2;
    @XmlElementRef(name = "item3", namespace = "http://po.edi.exchange.sinosure.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> item3;
    @XmlElementRef(name = "item4", namespace = "http://po.edi.exchange.sinosure.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> item4;
    @XmlElementRef(name = "item5", namespace = "http://po.edi.exchange.sinosure.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> item5;
    @XmlElementRef(name = "lastPayMode1", namespace = "http://po.edi.exchange.sinosure.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> lastPayMode1;
    @XmlElementRef(name = "lastPayMode2", namespace = "http://po.edi.exchange.sinosure.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> lastPayMode2;
    @XmlElementRef(name = "lastPayMode3", namespace = "http://po.edi.exchange.sinosure.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> lastPayMode3;
    @XmlElementRef(name = "lastSum1", namespace = "http://po.edi.exchange.sinosure.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> lastSum1;
    @XmlElementRef(name = "lastSum2", namespace = "http://po.edi.exchange.sinosure.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> lastSum2;
    @XmlElementRef(name = "lastSum3", namespace = "http://po.edi.exchange.sinosure.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> lastSum3;
    @XmlElementRef(name = "lastYear1", namespace = "http://po.edi.exchange.sinosure.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> lastYear1;
    @XmlElementRef(name = "lastYear2", namespace = "http://po.edi.exchange.sinosure.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> lastYear2;
    @XmlElementRef(name = "lastYear3", namespace = "http://po.edi.exchange.sinosure.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> lastYear3;
    @XmlElementRef(name = "nosamewithcontractreason", namespace = "http://po.edi.exchange.sinosure.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> nosamewithcontractreason;
    @XmlElementRef(name = "orderSum", namespace = "http://po.edi.exchange.sinosure.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> orderSum;
    @XmlElementRef(name = "orgno", namespace = "http://po.edi.exchange.sinosure.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> orgno;
    @XmlElementRef(name = "payTermApply", namespace = "http://po.edi.exchange.sinosure.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> payTermApply;
    @XmlElementRef(name = "policyNo", namespace = "http://po.edi.exchange.sinosure.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> policyNo;
    @XmlElementRef(name = "precreditterm", namespace = "http://po.edi.exchange.sinosure.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> precreditterm;
    @XmlElementRef(name = "quotaSumApply", namespace = "http://po.edi.exchange.sinosure.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> quotaSumApply;
    @XmlElementRef(name = "relationdetail", namespace = "http://po.edi.exchange.sinosure.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> relationdetail;
    @XmlElementRef(name = "remark", namespace = "http://po.edi.exchange.sinosure.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> remark;
    @XmlElementRef(name = "sinosureBuyerNo", namespace = "http://po.edi.exchange.sinosure.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> sinosureBuyerNo;
    @XmlElementRef(name = "sinosureWarrantorNo", namespace = "http://po.edi.exchange.sinosure.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> sinosureWarrantorNo;
    @XmlElementRef(name = "startDebtYear", namespace = "http://po.edi.exchange.sinosure.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> startDebtYear;
    @XmlElementRef(name = "tradeElseName", namespace = "http://po.edi.exchange.sinosure.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> tradeElseName;
    @XmlElementRef(name = "tradeElseTerms", namespace = "http://po.edi.exchange.sinosure.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> tradeElseTerms;
    @XmlElementRef(name = "tradeNameCode", namespace = "http://po.edi.exchange.sinosure.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> tradeNameCode;
    @XmlElementRef(name = "tradeTerms", namespace = "http://po.edi.exchange.sinosure.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> tradeTerms;
    @XmlElementRef(name = "warrantorChnAddress", namespace = "http://po.edi.exchange.sinosure.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> warrantorChnAddress;
    @XmlElementRef(name = "warrantorChnName", namespace = "http://po.edi.exchange.sinosure.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> warrantorChnName;
    @XmlElementRef(name = "warrantorCountryCode", namespace = "http://po.edi.exchange.sinosure.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> warrantorCountryCode;
    @XmlElementRef(name = "warrantorEngAddress", namespace = "http://po.edi.exchange.sinosure.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> warrantorEngAddress;
    @XmlElementRef(name = "warrantorEngName", namespace = "http://po.edi.exchange.sinosure.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> warrantorEngName;
    @XmlElementRef(name = "warrantorFax", namespace = "http://po.edi.exchange.sinosure.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> warrantorFax;
    @XmlElementRef(name = "warrantorRegNo", namespace = "http://po.edi.exchange.sinosure.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> warrantorRegNo;
    @XmlElementRef(name = "warrantorTel", namespace = "http://po.edi.exchange.sinosure.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> warrantorTel;
    @XmlElementRef(name = "warrantorType", namespace = "http://po.edi.exchange.sinosure.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> warrantorType;
    @XmlElementRef(name = "warrantorareano", namespace = "http://po.edi.exchange.sinosure.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> warrantorareano;
    @XmlElementRef(name = "warrantorcreditno", namespace = "http://po.edi.exchange.sinosure.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> warrantorcreditno;
    @XmlElementRef(name = "warrantororgno", namespace = "http://po.edi.exchange.sinosure.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> warrantororgno;

    /**
     * 获取aftercreditterm属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getAftercreditterm() {
        return aftercreditterm;
    }

    /**
     * 设置aftercreditterm属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setAftercreditterm(JAXBElement<Long> value) {
        this.aftercreditterm = value;
    }

    /**
     * 获取applicant属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getApplicant() {
        return applicant;
    }

    /**
     * 设置applicant属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setApplicant(JAXBElement<String> value) {
        this.applicant = value;
    }

    /**
     * 获取applyTime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getApplyTime() {
        return applyTime;
    }

    /**
     * 设置applyTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setApplyTime(JAXBElement<XMLGregorianCalendar> value) {
        this.applyTime = value;
    }

    /**
     * 获取areaNo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getAreaNo() {
        return areaNo;
    }

    /**
     * 设置areaNo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setAreaNo(JAXBElement<Integer> value) {
        this.areaNo = value;
    }

    /**
     * 获取armSum属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getArmSum() {
        return armSum;
    }

    /**
     * 设置armSum属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setArmSum(JAXBElement<Double> value) {
        this.armSum = value;
    }

    /**
     * 获取buyerChnAddress属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBuyerChnAddress() {
        return buyerChnAddress;
    }

    /**
     * 设置buyerChnAddress属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBuyerChnAddress(JAXBElement<String> value) {
        this.buyerChnAddress = value;
    }

    /**
     * 获取buyerChnName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBuyerChnName() {
        return buyerChnName;
    }

    /**
     * 设置buyerChnName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBuyerChnName(JAXBElement<String> value) {
        this.buyerChnName = value;
    }

    /**
     * 获取buyerCountryCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBuyerCountryCode() {
        return buyerCountryCode;
    }

    /**
     * 设置buyerCountryCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBuyerCountryCode(JAXBElement<String> value) {
        this.buyerCountryCode = value;
    }

    /**
     * 获取buyerEngAddress属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBuyerEngAddress() {
        return buyerEngAddress;
    }

    /**
     * 设置buyerEngAddress属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBuyerEngAddress(JAXBElement<String> value) {
        this.buyerEngAddress = value;
    }

    /**
     * 获取buyerEngName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBuyerEngName() {
        return buyerEngName;
    }

    /**
     * 设置buyerEngName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBuyerEngName(JAXBElement<String> value) {
        this.buyerEngName = value;
    }

    /**
     * 获取buyerFax属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBuyerFax() {
        return buyerFax;
    }

    /**
     * 设置buyerFax属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBuyerFax(JAXBElement<String> value) {
        this.buyerFax = value;
    }

    /**
     * 获取buyerOweElseReason属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBuyerOweElseReason() {
        return buyerOweElseReason;
    }

    /**
     * 设置buyerOweElseReason属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBuyerOweElseReason(JAXBElement<String> value) {
        this.buyerOweElseReason = value;
    }

    /**
     * 获取buyerOweReasonCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBuyerOweReasonCode() {
        return buyerOweReasonCode;
    }

    /**
     * 设置buyerOweReasonCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBuyerOweReasonCode(JAXBElement<String> value) {
        this.buyerOweReasonCode = value;
    }

    /**
     * 获取buyerPayBehave1属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getBuyerPayBehave1() {
        return buyerPayBehave1;
    }

    /**
     * 设置buyerPayBehave1属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setBuyerPayBehave1(JAXBElement<Double> value) {
        this.buyerPayBehave1 = value;
    }

    /**
     * 获取buyerPayBehave2属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getBuyerPayBehave2() {
        return buyerPayBehave2;
    }

    /**
     * 设置buyerPayBehave2属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setBuyerPayBehave2(JAXBElement<Double> value) {
        this.buyerPayBehave2 = value;
    }

    /**
     * 获取buyerPayBehave3属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getBuyerPayBehave3() {
        return buyerPayBehave3;
    }

    /**
     * 设置buyerPayBehave3属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setBuyerPayBehave3(JAXBElement<Double> value) {
        this.buyerPayBehave3 = value;
    }

    /**
     * 获取buyerPayBehave4属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getBuyerPayBehave4() {
        return buyerPayBehave4;
    }

    /**
     * 设置buyerPayBehave4属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setBuyerPayBehave4(JAXBElement<Double> value) {
        this.buyerPayBehave4 = value;
    }

    /**
     * 获取buyerRegNo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBuyerRegNo() {
        return buyerRegNo;
    }

    /**
     * 设置buyerRegNo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBuyerRegNo(JAXBElement<String> value) {
        this.buyerRegNo = value;
    }

    /**
     * 获取buyerTel属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBuyerTel() {
        return buyerTel;
    }

    /**
     * 设置buyerTel属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBuyerTel(JAXBElement<String> value) {
        this.buyerTel = value;
    }

    /**
     * 获取clientNo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getClientNo() {
        return clientNo;
    }

    /**
     * 设置clientNo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setClientNo(JAXBElement<String> value) {
        this.clientNo = value;
    }

    /**
     * 获取contractPayMode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getContractPayMode() {
        return contractPayMode;
    }

    /**
     * 设置contractPayMode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setContractPayMode(JAXBElement<String> value) {
        this.contractPayMode = value;
    }

    /**
     * 获取corpBuyerNo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCorpBuyerNo() {
        return corpBuyerNo;
    }

    /**
     * 设置corpBuyerNo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCorpBuyerNo(JAXBElement<String> value) {
        this.corpBuyerNo = value;
    }

    /**
     * 获取corpSerialNo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCorpSerialNo() {
        return corpSerialNo;
    }

    /**
     * 设置corpSerialNo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCorpSerialNo(JAXBElement<String> value) {
        this.corpSerialNo = value;
    }

    /**
     * 获取corpWarrantorNo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCorpWarrantorNo() {
        return corpWarrantorNo;
    }

    /**
     * 设置corpWarrantorNo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCorpWarrantorNo(JAXBElement<String> value) {
        this.corpWarrantorNo = value;
    }

    /**
     * 获取creditno属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCreditno() {
        return creditno;
    }

    /**
     * 设置creditno属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCreditno(JAXBElement<String> value) {
        this.creditno = value;
    }

    /**
     * 获取declaration属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDeclaration() {
        return declaration;
    }

    /**
     * 设置declaration属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDeclaration(JAXBElement<String> value) {
        this.declaration = value;
    }

    /**
     * 获取earlyTradeYear属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEarlyTradeYear() {
        return earlyTradeYear;
    }

    /**
     * 设置earlyTradeYear属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEarlyTradeYear(JAXBElement<String> value) {
        this.earlyTradeYear = value;
    }

    /**
     * 获取employeeName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEmployeeName() {
        return employeeName;
    }

    /**
     * 设置employeeName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEmployeeName(JAXBElement<String> value) {
        this.employeeName = value;
    }

    /**
     * 获取filenum属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getFilenum() {
        return filenum;
    }

    /**
     * 设置filenum属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setFilenum(JAXBElement<Long> value) {
        this.filenum = value;
    }

    /**
     * 获取ifHistTrade属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIfHistTrade() {
        return ifHistTrade;
    }

    /**
     * 设置ifHistTrade属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIfHistTrade(JAXBElement<String> value) {
        this.ifHistTrade = value;
    }

    /**
     * 获取ifapplycredit属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIfapplycredit() {
        return ifapplycredit;
    }

    /**
     * 设置ifapplycredit属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIfapplycredit(JAXBElement<String> value) {
        this.ifapplycredit = value;
    }

    /**
     * 获取ifhaverelation属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIfhaverelation() {
        return ifhaverelation;
    }

    /**
     * 设置ifhaverelation属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIfhaverelation(JAXBElement<String> value) {
        this.ifhaverelation = value;
    }

    /**
     * 获取ifhavetradefinancing属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIfhavetradefinancing() {
        return ifhavetradefinancing;
    }

    /**
     * 设置ifhavetradefinancing属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIfhavetradefinancing(JAXBElement<String> value) {
        this.ifhavetradefinancing = value;
    }

    /**
     * 获取ifsamewithpolicy属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIfsamewithpolicy() {
        return ifsamewithpolicy;
    }

    /**
     * 设置ifsamewithpolicy属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIfsamewithpolicy(JAXBElement<String> value) {
        this.ifsamewithpolicy = value;
    }

    /**
     * 获取issamewithcontract属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIssamewithcontract() {
        return issamewithcontract;
    }

    /**
     * 设置issamewithcontract属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIssamewithcontract(JAXBElement<String> value) {
        this.issamewithcontract = value;
    }

    /**
     * 获取item1属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getItem1() {
        return item1;
    }

    /**
     * 设置item1属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setItem1(JAXBElement<String> value) {
        this.item1 = value;
    }

    /**
     * 获取item2属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getItem2() {
        return item2;
    }

    /**
     * 设置item2属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setItem2(JAXBElement<String> value) {
        this.item2 = value;
    }

    /**
     * 获取item3属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getItem3() {
        return item3;
    }

    /**
     * 设置item3属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setItem3(JAXBElement<String> value) {
        this.item3 = value;
    }

    /**
     * 获取item4属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getItem4() {
        return item4;
    }

    /**
     * 设置item4属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setItem4(JAXBElement<String> value) {
        this.item4 = value;
    }

    /**
     * 获取item5属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getItem5() {
        return item5;
    }

    /**
     * 设置item5属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setItem5(JAXBElement<String> value) {
        this.item5 = value;
    }

    /**
     * 获取lastPayMode1属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLastPayMode1() {
        return lastPayMode1;
    }

    /**
     * 设置lastPayMode1属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLastPayMode1(JAXBElement<String> value) {
        this.lastPayMode1 = value;
    }

    /**
     * 获取lastPayMode2属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLastPayMode2() {
        return lastPayMode2;
    }

    /**
     * 设置lastPayMode2属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLastPayMode2(JAXBElement<String> value) {
        this.lastPayMode2 = value;
    }

    /**
     * 获取lastPayMode3属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLastPayMode3() {
        return lastPayMode3;
    }

    /**
     * 设置lastPayMode3属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLastPayMode3(JAXBElement<String> value) {
        this.lastPayMode3 = value;
    }

    /**
     * 获取lastSum1属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getLastSum1() {
        return lastSum1;
    }

    /**
     * 设置lastSum1属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setLastSum1(JAXBElement<Double> value) {
        this.lastSum1 = value;
    }

    /**
     * 获取lastSum2属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getLastSum2() {
        return lastSum2;
    }

    /**
     * 设置lastSum2属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setLastSum2(JAXBElement<Double> value) {
        this.lastSum2 = value;
    }

    /**
     * 获取lastSum3属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getLastSum3() {
        return lastSum3;
    }

    /**
     * 设置lastSum3属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setLastSum3(JAXBElement<Double> value) {
        this.lastSum3 = value;
    }

    /**
     * 获取lastYear1属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLastYear1() {
        return lastYear1;
    }

    /**
     * 设置lastYear1属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLastYear1(JAXBElement<String> value) {
        this.lastYear1 = value;
    }

    /**
     * 获取lastYear2属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLastYear2() {
        return lastYear2;
    }

    /**
     * 设置lastYear2属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLastYear2(JAXBElement<String> value) {
        this.lastYear2 = value;
    }

    /**
     * 获取lastYear3属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLastYear3() {
        return lastYear3;
    }

    /**
     * 设置lastYear3属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLastYear3(JAXBElement<String> value) {
        this.lastYear3 = value;
    }

    /**
     * 获取nosamewithcontractreason属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNosamewithcontractreason() {
        return nosamewithcontractreason;
    }

    /**
     * 设置nosamewithcontractreason属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNosamewithcontractreason(JAXBElement<String> value) {
        this.nosamewithcontractreason = value;
    }

    /**
     * 获取orderSum属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getOrderSum() {
        return orderSum;
    }

    /**
     * 设置orderSum属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setOrderSum(JAXBElement<Double> value) {
        this.orderSum = value;
    }

    /**
     * 获取orgno属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOrgno() {
        return orgno;
    }

    /**
     * 设置orgno属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOrgno(JAXBElement<String> value) {
        this.orgno = value;
    }

    /**
     * 获取payTermApply属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getPayTermApply() {
        return payTermApply;
    }

    /**
     * 设置payTermApply属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setPayTermApply(JAXBElement<Long> value) {
        this.payTermApply = value;
    }

    /**
     * 获取policyNo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPolicyNo() {
        return policyNo;
    }

    /**
     * 设置policyNo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPolicyNo(JAXBElement<String> value) {
        this.policyNo = value;
    }

    /**
     * 获取precreditterm属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getPrecreditterm() {
        return precreditterm;
    }

    /**
     * 设置precreditterm属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setPrecreditterm(JAXBElement<Long> value) {
        this.precreditterm = value;
    }

    /**
     * 获取quotaSumApply属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getQuotaSumApply() {
        return quotaSumApply;
    }

    /**
     * 设置quotaSumApply属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setQuotaSumApply(JAXBElement<Double> value) {
        this.quotaSumApply = value;
    }

    /**
     * 获取relationdetail属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRelationdetail() {
        return relationdetail;
    }

    /**
     * 设置relationdetail属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRelationdetail(JAXBElement<String> value) {
        this.relationdetail = value;
    }

    /**
     * 获取remark属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRemark() {
        return remark;
    }

    /**
     * 设置remark属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRemark(JAXBElement<String> value) {
        this.remark = value;
    }

    /**
     * 获取sinosureBuyerNo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSinosureBuyerNo() {
        return sinosureBuyerNo;
    }

    /**
     * 设置sinosureBuyerNo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSinosureBuyerNo(JAXBElement<String> value) {
        this.sinosureBuyerNo = value;
    }

    /**
     * 获取sinosureWarrantorNo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSinosureWarrantorNo() {
        return sinosureWarrantorNo;
    }

    /**
     * 设置sinosureWarrantorNo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSinosureWarrantorNo(JAXBElement<String> value) {
        this.sinosureWarrantorNo = value;
    }

    /**
     * 获取startDebtYear属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getStartDebtYear() {
        return startDebtYear;
    }

    /**
     * 设置startDebtYear属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setStartDebtYear(JAXBElement<String> value) {
        this.startDebtYear = value;
    }

    /**
     * 获取tradeElseName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTradeElseName() {
        return tradeElseName;
    }

    /**
     * 设置tradeElseName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTradeElseName(JAXBElement<String> value) {
        this.tradeElseName = value;
    }

    /**
     * 获取tradeElseTerms属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTradeElseTerms() {
        return tradeElseTerms;
    }

    /**
     * 设置tradeElseTerms属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTradeElseTerms(JAXBElement<String> value) {
        this.tradeElseTerms = value;
    }

    /**
     * 获取tradeNameCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTradeNameCode() {
        return tradeNameCode;
    }

    /**
     * 设置tradeNameCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTradeNameCode(JAXBElement<String> value) {
        this.tradeNameCode = value;
    }

    /**
     * 获取tradeTerms属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTradeTerms() {
        return tradeTerms;
    }

    /**
     * 设置tradeTerms属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTradeTerms(JAXBElement<String> value) {
        this.tradeTerms = value;
    }

    /**
     * 获取warrantorChnAddress属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getWarrantorChnAddress() {
        return warrantorChnAddress;
    }

    /**
     * 设置warrantorChnAddress属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setWarrantorChnAddress(JAXBElement<String> value) {
        this.warrantorChnAddress = value;
    }

    /**
     * 获取warrantorChnName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getWarrantorChnName() {
        return warrantorChnName;
    }

    /**
     * 设置warrantorChnName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setWarrantorChnName(JAXBElement<String> value) {
        this.warrantorChnName = value;
    }

    /**
     * 获取warrantorCountryCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getWarrantorCountryCode() {
        return warrantorCountryCode;
    }

    /**
     * 设置warrantorCountryCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setWarrantorCountryCode(JAXBElement<String> value) {
        this.warrantorCountryCode = value;
    }

    /**
     * 获取warrantorEngAddress属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getWarrantorEngAddress() {
        return warrantorEngAddress;
    }

    /**
     * 设置warrantorEngAddress属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setWarrantorEngAddress(JAXBElement<String> value) {
        this.warrantorEngAddress = value;
    }

    /**
     * 获取warrantorEngName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getWarrantorEngName() {
        return warrantorEngName;
    }

    /**
     * 设置warrantorEngName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setWarrantorEngName(JAXBElement<String> value) {
        this.warrantorEngName = value;
    }

    /**
     * 获取warrantorFax属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getWarrantorFax() {
        return warrantorFax;
    }

    /**
     * 设置warrantorFax属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setWarrantorFax(JAXBElement<String> value) {
        this.warrantorFax = value;
    }

    /**
     * 获取warrantorRegNo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getWarrantorRegNo() {
        return warrantorRegNo;
    }

    /**
     * 设置warrantorRegNo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setWarrantorRegNo(JAXBElement<String> value) {
        this.warrantorRegNo = value;
    }

    /**
     * 获取warrantorTel属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getWarrantorTel() {
        return warrantorTel;
    }

    /**
     * 设置warrantorTel属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setWarrantorTel(JAXBElement<String> value) {
        this.warrantorTel = value;
    }

    /**
     * 获取warrantorType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getWarrantorType() {
        return warrantorType;
    }

    /**
     * 设置warrantorType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setWarrantorType(JAXBElement<String> value) {
        this.warrantorType = value;
    }

    /**
     * 获取warrantorareano属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getWarrantorareano() {
        return warrantorareano;
    }

    /**
     * 设置warrantorareano属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setWarrantorareano(JAXBElement<Integer> value) {
        this.warrantorareano = value;
    }

    /**
     * 获取warrantorcreditno属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getWarrantorcreditno() {
        return warrantorcreditno;
    }

    /**
     * 设置warrantorcreditno属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setWarrantorcreditno(JAXBElement<String> value) {
        this.warrantorcreditno = value;
    }

    /**
     * 获取warrantororgno属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getWarrantororgno() {
        return warrantororgno;
    }

    /**
     * 设置warrantororgno属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setWarrantororgno(JAXBElement<String> value) {
        this.warrantororgno = value;
    }

}
