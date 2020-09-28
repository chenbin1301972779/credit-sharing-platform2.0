
package com.sinosure.exchange.edi.po;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>NoLcQuotaApplyBasicInfo complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="NoLcQuotaApplyBasicInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="applicant" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="applyTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="buyerChnAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="buyerChnName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="buyerCountryCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="buyerEngAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="buyerEngName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="buyerFax" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="buyerPayBehave" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="buyerRegNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="buyerTel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="clientNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="contractPayMode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="contractSum" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="corpBuyerNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="corpSerialNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="corpWarrantorNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="earlyTradeYear" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="employeeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="goodsCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="goodsName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ifBuyerAccordant" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ifHistTrade" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ifapplycredit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ifhaverelation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ifhavetradefinancing" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="issamewithcontract" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="item1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="item2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="item3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="item4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="item5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="lastTradeSumDA" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="lastTradeSumDP" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="lastTradeSumLC" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="lastTradeSumOA" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="nosamewithcontractreason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="oweDateNum" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="oweFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="oweSum" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="payTermApply" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="policyNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="quotaSumApply" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="relationdetail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="remark" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="sinosureBuyerNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="sinosureWarrantorNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="startDebtYear" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="topSingleMoney" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="warrantorChnAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="warrantorChnName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="warrantorCountryCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="warrantorEngAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="warrantorEngName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="warrantorFax" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="warrantorRegNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="warrantorTel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="warrantorType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NoLcQuotaApplyBasicInfo", propOrder = {
    "applicant",
    "applyTime",
    "buyerChnAddress",
    "buyerChnName",
    "buyerCountryCode",
    "buyerEngAddress",
    "buyerEngName",
    "buyerFax",
    "buyerPayBehave",
    "buyerRegNo",
    "buyerTel",
    "clientNo",
    "contractPayMode",
    "contractSum",
    "corpBuyerNo",
    "corpSerialNo",
    "corpWarrantorNo",
    "earlyTradeYear",
    "employeeName",
    "goodsCode",
    "goodsName",
    "ifBuyerAccordant",
    "ifHistTrade",
    "ifapplycredit",
    "ifhaverelation",
    "ifhavetradefinancing",
    "issamewithcontract",
    "item1",
    "item2",
    "item3",
    "item4",
    "item5",
    "lastTradeSumDA",
    "lastTradeSumDP",
    "lastTradeSumLC",
    "lastTradeSumOA",
    "nosamewithcontractreason",
    "oweDateNum",
    "oweFlag",
    "oweSum",
    "payTermApply",
    "policyNo",
    "quotaSumApply",
    "relationdetail",
    "remark",
    "sinosureBuyerNo",
    "sinosureWarrantorNo",
    "startDebtYear",
    "topSingleMoney",
    "warrantorChnAddress",
    "warrantorChnName",
    "warrantorCountryCode",
    "warrantorEngAddress",
    "warrantorEngName",
    "warrantorFax",
    "warrantorRegNo",
    "warrantorTel",
    "warrantorType"
})
public class NoLcQuotaApplyBasicInfo {

    @XmlElementRef(name = "applicant", namespace = "http://po.edi.exchange.sinosure.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> applicant;
    @XmlElementRef(name = "applyTime", namespace = "http://po.edi.exchange.sinosure.com", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> applyTime;
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
    @XmlElementRef(name = "buyerPayBehave", namespace = "http://po.edi.exchange.sinosure.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> buyerPayBehave;
    @XmlElementRef(name = "buyerRegNo", namespace = "http://po.edi.exchange.sinosure.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> buyerRegNo;
    @XmlElementRef(name = "buyerTel", namespace = "http://po.edi.exchange.sinosure.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> buyerTel;
    @XmlElementRef(name = "clientNo", namespace = "http://po.edi.exchange.sinosure.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> clientNo;
    @XmlElementRef(name = "contractPayMode", namespace = "http://po.edi.exchange.sinosure.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> contractPayMode;
    @XmlElementRef(name = "contractSum", namespace = "http://po.edi.exchange.sinosure.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> contractSum;
    @XmlElementRef(name = "corpBuyerNo", namespace = "http://po.edi.exchange.sinosure.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> corpBuyerNo;
    @XmlElementRef(name = "corpSerialNo", namespace = "http://po.edi.exchange.sinosure.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> corpSerialNo;
    @XmlElementRef(name = "corpWarrantorNo", namespace = "http://po.edi.exchange.sinosure.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> corpWarrantorNo;
    @XmlElementRef(name = "earlyTradeYear", namespace = "http://po.edi.exchange.sinosure.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> earlyTradeYear;
    @XmlElementRef(name = "employeeName", namespace = "http://po.edi.exchange.sinosure.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> employeeName;
    @XmlElementRef(name = "goodsCode", namespace = "http://po.edi.exchange.sinosure.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> goodsCode;
    @XmlElementRef(name = "goodsName", namespace = "http://po.edi.exchange.sinosure.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> goodsName;
    @XmlElementRef(name = "ifBuyerAccordant", namespace = "http://po.edi.exchange.sinosure.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> ifBuyerAccordant;
    @XmlElementRef(name = "ifHistTrade", namespace = "http://po.edi.exchange.sinosure.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> ifHistTrade;
    @XmlElementRef(name = "ifapplycredit", namespace = "http://po.edi.exchange.sinosure.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> ifapplycredit;
    @XmlElementRef(name = "ifhaverelation", namespace = "http://po.edi.exchange.sinosure.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> ifhaverelation;
    @XmlElementRef(name = "ifhavetradefinancing", namespace = "http://po.edi.exchange.sinosure.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> ifhavetradefinancing;
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
    @XmlElementRef(name = "lastTradeSumDA", namespace = "http://po.edi.exchange.sinosure.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> lastTradeSumDA;
    @XmlElementRef(name = "lastTradeSumDP", namespace = "http://po.edi.exchange.sinosure.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> lastTradeSumDP;
    @XmlElementRef(name = "lastTradeSumLC", namespace = "http://po.edi.exchange.sinosure.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> lastTradeSumLC;
    @XmlElementRef(name = "lastTradeSumOA", namespace = "http://po.edi.exchange.sinosure.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> lastTradeSumOA;
    @XmlElementRef(name = "nosamewithcontractreason", namespace = "http://po.edi.exchange.sinosure.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> nosamewithcontractreason;
    @XmlElementRef(name = "oweDateNum", namespace = "http://po.edi.exchange.sinosure.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> oweDateNum;
    @XmlElementRef(name = "oweFlag", namespace = "http://po.edi.exchange.sinosure.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> oweFlag;
    @XmlElementRef(name = "oweSum", namespace = "http://po.edi.exchange.sinosure.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> oweSum;
    @XmlElementRef(name = "payTermApply", namespace = "http://po.edi.exchange.sinosure.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> payTermApply;
    @XmlElementRef(name = "policyNo", namespace = "http://po.edi.exchange.sinosure.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> policyNo;
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
    @XmlElementRef(name = "topSingleMoney", namespace = "http://po.edi.exchange.sinosure.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> topSingleMoney;
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
     * 获取buyerPayBehave属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBuyerPayBehave() {
        return buyerPayBehave;
    }

    /**
     * 设置buyerPayBehave属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBuyerPayBehave(JAXBElement<String> value) {
        this.buyerPayBehave = value;
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
     * 获取contractSum属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getContractSum() {
        return contractSum;
    }

    /**
     * 设置contractSum属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setContractSum(JAXBElement<Double> value) {
        this.contractSum = value;
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
     * 获取goodsCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getGoodsCode() {
        return goodsCode;
    }

    /**
     * 设置goodsCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setGoodsCode(JAXBElement<String> value) {
        this.goodsCode = value;
    }

    /**
     * 获取goodsName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getGoodsName() {
        return goodsName;
    }

    /**
     * 设置goodsName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setGoodsName(JAXBElement<String> value) {
        this.goodsName = value;
    }

    /**
     * 获取ifBuyerAccordant属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIfBuyerAccordant() {
        return ifBuyerAccordant;
    }

    /**
     * 设置ifBuyerAccordant属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIfBuyerAccordant(JAXBElement<String> value) {
        this.ifBuyerAccordant = value;
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
     * 获取lastTradeSumDA属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getLastTradeSumDA() {
        return lastTradeSumDA;
    }

    /**
     * 设置lastTradeSumDA属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setLastTradeSumDA(JAXBElement<Double> value) {
        this.lastTradeSumDA = value;
    }

    /**
     * 获取lastTradeSumDP属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getLastTradeSumDP() {
        return lastTradeSumDP;
    }

    /**
     * 设置lastTradeSumDP属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setLastTradeSumDP(JAXBElement<Double> value) {
        this.lastTradeSumDP = value;
    }

    /**
     * 获取lastTradeSumLC属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getLastTradeSumLC() {
        return lastTradeSumLC;
    }

    /**
     * 设置lastTradeSumLC属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setLastTradeSumLC(JAXBElement<Double> value) {
        this.lastTradeSumLC = value;
    }

    /**
     * 获取lastTradeSumOA属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getLastTradeSumOA() {
        return lastTradeSumOA;
    }

    /**
     * 设置lastTradeSumOA属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setLastTradeSumOA(JAXBElement<Double> value) {
        this.lastTradeSumOA = value;
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
     * 获取oweDateNum属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getOweDateNum() {
        return oweDateNum;
    }

    /**
     * 设置oweDateNum属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setOweDateNum(JAXBElement<Long> value) {
        this.oweDateNum = value;
    }

    /**
     * 获取oweFlag属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOweFlag() {
        return oweFlag;
    }

    /**
     * 设置oweFlag属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOweFlag(JAXBElement<String> value) {
        this.oweFlag = value;
    }

    /**
     * 获取oweSum属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getOweSum() {
        return oweSum;
    }

    /**
     * 设置oweSum属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setOweSum(JAXBElement<Double> value) {
        this.oweSum = value;
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
     * 获取topSingleMoney属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getTopSingleMoney() {
        return topSingleMoney;
    }

    /**
     * 设置topSingleMoney属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setTopSingleMoney(JAXBElement<Double> value) {
        this.topSingleMoney = value;
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

}
