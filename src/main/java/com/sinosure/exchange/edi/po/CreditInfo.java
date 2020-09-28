
package com.sinosure.exchange.edi.po;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>CreditInfo complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="CreditInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="averageDBT" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="badPaymentFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="bankComment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="bankCreditMax" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="bankCreditMaxUSD" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="creditRecommendation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="guaranteeAmount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="guaranteeAmountUSD" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="guarantorAmount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="guarantorAmountUSD" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="highestCreditUSD" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="highestCredt" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="highestPayment" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="highestUSD" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="mortgageAmount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="mortgageAmountUSD" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="noOfPaymentRecords" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="paymentScore" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="riskAnalysis" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="riskScore" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="totalAmount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="totalAmountUSD" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="tradeHistory" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreditInfo", propOrder = {
    "averageDBT",
    "badPaymentFlag",
    "bankComment",
    "bankCreditMax",
    "bankCreditMaxUSD",
    "creditRecommendation",
    "guaranteeAmount",
    "guaranteeAmountUSD",
    "guarantorAmount",
    "guarantorAmountUSD",
    "highestCreditUSD",
    "highestCredt",
    "highestPayment",
    "highestUSD",
    "mortgageAmount",
    "mortgageAmountUSD",
    "noOfPaymentRecords",
    "paymentScore",
    "riskAnalysis",
    "riskScore",
    "totalAmount",
    "totalAmountUSD",
    "tradeHistory"
})
public class CreditInfo {

    @XmlElementRef(name = "averageDBT", namespace = "http://po.edi.exchange.sinosure.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> averageDBT;
    @XmlElementRef(name = "badPaymentFlag", namespace = "http://po.edi.exchange.sinosure.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> badPaymentFlag;
    @XmlElementRef(name = "bankComment", namespace = "http://po.edi.exchange.sinosure.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> bankComment;
    @XmlElementRef(name = "bankCreditMax", namespace = "http://po.edi.exchange.sinosure.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> bankCreditMax;
    @XmlElementRef(name = "bankCreditMaxUSD", namespace = "http://po.edi.exchange.sinosure.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> bankCreditMaxUSD;
    @XmlElementRef(name = "creditRecommendation", namespace = "http://po.edi.exchange.sinosure.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> creditRecommendation;
    @XmlElementRef(name = "guaranteeAmount", namespace = "http://po.edi.exchange.sinosure.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> guaranteeAmount;
    @XmlElementRef(name = "guaranteeAmountUSD", namespace = "http://po.edi.exchange.sinosure.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> guaranteeAmountUSD;
    @XmlElementRef(name = "guarantorAmount", namespace = "http://po.edi.exchange.sinosure.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> guarantorAmount;
    @XmlElementRef(name = "guarantorAmountUSD", namespace = "http://po.edi.exchange.sinosure.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> guarantorAmountUSD;
    @XmlElementRef(name = "highestCreditUSD", namespace = "http://po.edi.exchange.sinosure.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> highestCreditUSD;
    @XmlElementRef(name = "highestCredt", namespace = "http://po.edi.exchange.sinosure.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> highestCredt;
    @XmlElementRef(name = "highestPayment", namespace = "http://po.edi.exchange.sinosure.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> highestPayment;
    @XmlElementRef(name = "highestUSD", namespace = "http://po.edi.exchange.sinosure.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> highestUSD;
    @XmlElementRef(name = "mortgageAmount", namespace = "http://po.edi.exchange.sinosure.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> mortgageAmount;
    @XmlElementRef(name = "mortgageAmountUSD", namespace = "http://po.edi.exchange.sinosure.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> mortgageAmountUSD;
    @XmlElementRef(name = "noOfPaymentRecords", namespace = "http://po.edi.exchange.sinosure.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> noOfPaymentRecords;
    @XmlElementRef(name = "paymentScore", namespace = "http://po.edi.exchange.sinosure.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> paymentScore;
    @XmlElementRef(name = "riskAnalysis", namespace = "http://po.edi.exchange.sinosure.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> riskAnalysis;
    @XmlElementRef(name = "riskScore", namespace = "http://po.edi.exchange.sinosure.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> riskScore;
    @XmlElementRef(name = "totalAmount", namespace = "http://po.edi.exchange.sinosure.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> totalAmount;
    @XmlElementRef(name = "totalAmountUSD", namespace = "http://po.edi.exchange.sinosure.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> totalAmountUSD;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar tradeHistory;

    /**
     * 获取averageDBT属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getAverageDBT() {
        return averageDBT;
    }

    /**
     * 设置averageDBT属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setAverageDBT(JAXBElement<Double> value) {
        this.averageDBT = value;
    }

    /**
     * 获取badPaymentFlag属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBadPaymentFlag() {
        return badPaymentFlag;
    }

    /**
     * 设置badPaymentFlag属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBadPaymentFlag(JAXBElement<String> value) {
        this.badPaymentFlag = value;
    }

    /**
     * 获取bankComment属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBankComment() {
        return bankComment;
    }

    /**
     * 设置bankComment属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBankComment(JAXBElement<String> value) {
        this.bankComment = value;
    }

    /**
     * 获取bankCreditMax属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getBankCreditMax() {
        return bankCreditMax;
    }

    /**
     * 设置bankCreditMax属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setBankCreditMax(JAXBElement<Double> value) {
        this.bankCreditMax = value;
    }

    /**
     * 获取bankCreditMaxUSD属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getBankCreditMaxUSD() {
        return bankCreditMaxUSD;
    }

    /**
     * 设置bankCreditMaxUSD属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setBankCreditMaxUSD(JAXBElement<Double> value) {
        this.bankCreditMaxUSD = value;
    }

    /**
     * 获取creditRecommendation属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCreditRecommendation() {
        return creditRecommendation;
    }

    /**
     * 设置creditRecommendation属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCreditRecommendation(JAXBElement<String> value) {
        this.creditRecommendation = value;
    }

    /**
     * 获取guaranteeAmount属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getGuaranteeAmount() {
        return guaranteeAmount;
    }

    /**
     * 设置guaranteeAmount属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setGuaranteeAmount(JAXBElement<Double> value) {
        this.guaranteeAmount = value;
    }

    /**
     * 获取guaranteeAmountUSD属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getGuaranteeAmountUSD() {
        return guaranteeAmountUSD;
    }

    /**
     * 设置guaranteeAmountUSD属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setGuaranteeAmountUSD(JAXBElement<Double> value) {
        this.guaranteeAmountUSD = value;
    }

    /**
     * 获取guarantorAmount属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getGuarantorAmount() {
        return guarantorAmount;
    }

    /**
     * 设置guarantorAmount属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setGuarantorAmount(JAXBElement<Double> value) {
        this.guarantorAmount = value;
    }

    /**
     * 获取guarantorAmountUSD属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getGuarantorAmountUSD() {
        return guarantorAmountUSD;
    }

    /**
     * 设置guarantorAmountUSD属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setGuarantorAmountUSD(JAXBElement<Double> value) {
        this.guarantorAmountUSD = value;
    }

    /**
     * 获取highestCreditUSD属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getHighestCreditUSD() {
        return highestCreditUSD;
    }

    /**
     * 设置highestCreditUSD属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setHighestCreditUSD(JAXBElement<Double> value) {
        this.highestCreditUSD = value;
    }

    /**
     * 获取highestCredt属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getHighestCredt() {
        return highestCredt;
    }

    /**
     * 设置highestCredt属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setHighestCredt(JAXBElement<Double> value) {
        this.highestCredt = value;
    }

    /**
     * 获取highestPayment属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getHighestPayment() {
        return highestPayment;
    }

    /**
     * 设置highestPayment属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setHighestPayment(JAXBElement<Double> value) {
        this.highestPayment = value;
    }

    /**
     * 获取highestUSD属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getHighestUSD() {
        return highestUSD;
    }

    /**
     * 设置highestUSD属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setHighestUSD(JAXBElement<Double> value) {
        this.highestUSD = value;
    }

    /**
     * 获取mortgageAmount属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getMortgageAmount() {
        return mortgageAmount;
    }

    /**
     * 设置mortgageAmount属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setMortgageAmount(JAXBElement<Double> value) {
        this.mortgageAmount = value;
    }

    /**
     * 获取mortgageAmountUSD属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getMortgageAmountUSD() {
        return mortgageAmountUSD;
    }

    /**
     * 设置mortgageAmountUSD属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setMortgageAmountUSD(JAXBElement<Double> value) {
        this.mortgageAmountUSD = value;
    }

    /**
     * 获取noOfPaymentRecords属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNoOfPaymentRecords() {
        return noOfPaymentRecords;
    }

    /**
     * 设置noOfPaymentRecords属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNoOfPaymentRecords(JAXBElement<String> value) {
        this.noOfPaymentRecords = value;
    }

    /**
     * 获取paymentScore属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getPaymentScore() {
        return paymentScore;
    }

    /**
     * 设置paymentScore属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setPaymentScore(JAXBElement<Double> value) {
        this.paymentScore = value;
    }

    /**
     * 获取riskAnalysis属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRiskAnalysis() {
        return riskAnalysis;
    }

    /**
     * 设置riskAnalysis属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRiskAnalysis(JAXBElement<String> value) {
        this.riskAnalysis = value;
    }

    /**
     * 获取riskScore属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRiskScore() {
        return riskScore;
    }

    /**
     * 设置riskScore属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRiskScore(JAXBElement<String> value) {
        this.riskScore = value;
    }

    /**
     * 获取totalAmount属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getTotalAmount() {
        return totalAmount;
    }

    /**
     * 设置totalAmount属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setTotalAmount(JAXBElement<Double> value) {
        this.totalAmount = value;
    }

    /**
     * 获取totalAmountUSD属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getTotalAmountUSD() {
        return totalAmountUSD;
    }

    /**
     * 设置totalAmountUSD属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setTotalAmountUSD(JAXBElement<Double> value) {
        this.totalAmountUSD = value;
    }

    /**
     * 获取tradeHistory属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTradeHistory() {
        return tradeHistory;
    }

    /**
     * 设置tradeHistory属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTradeHistory(XMLGregorianCalendar value) {
        this.tradeHistory = value;
    }

}
