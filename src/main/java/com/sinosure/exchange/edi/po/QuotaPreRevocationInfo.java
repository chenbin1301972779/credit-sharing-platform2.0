
package com.sinosure.exchange.edi.po;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>QuotaPreRevocationInfo complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="QuotaPreRevocationInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="adcondition" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="bankSwift" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="bizbuyerNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="buyerquotano" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="calculateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="clientno" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="corpbuyerNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="effectdate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="lapsedate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="lcNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="newlapsedate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="otherRate" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="payMode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="payTerm" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="policyNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="quotaSum" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="refuseRate" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QuotaPreRevocationInfo", propOrder = {
    "adcondition",
    "bankSwift",
    "bizbuyerNo",
    "buyerquotano",
    "calculateTime",
    "clientno",
    "corpbuyerNo",
    "effectdate",
    "lapsedate",
    "lcNo",
    "newlapsedate",
    "otherRate",
    "payMode",
    "payTerm",
    "policyNo",
    "quotaSum",
    "refuseRate"
})
public class QuotaPreRevocationInfo {

    @XmlElementRef(name = "adcondition", namespace = "http://po.edi.exchange.sinosure.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> adcondition;
    @XmlElementRef(name = "bankSwift", namespace = "http://po.edi.exchange.sinosure.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> bankSwift;
    @XmlElementRef(name = "bizbuyerNo", namespace = "http://po.edi.exchange.sinosure.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> bizbuyerNo;
    @XmlElementRef(name = "buyerquotano", namespace = "http://po.edi.exchange.sinosure.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> buyerquotano;
    @XmlElementRef(name = "calculateTime", namespace = "http://po.edi.exchange.sinosure.com", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> calculateTime;
    @XmlElementRef(name = "clientno", namespace = "http://po.edi.exchange.sinosure.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> clientno;
    @XmlElementRef(name = "corpbuyerNo", namespace = "http://po.edi.exchange.sinosure.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> corpbuyerNo;
    @XmlElementRef(name = "effectdate", namespace = "http://po.edi.exchange.sinosure.com", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> effectdate;
    @XmlElementRef(name = "lapsedate", namespace = "http://po.edi.exchange.sinosure.com", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> lapsedate;
    @XmlElementRef(name = "lcNo", namespace = "http://po.edi.exchange.sinosure.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> lcNo;
    @XmlElementRef(name = "newlapsedate", namespace = "http://po.edi.exchange.sinosure.com", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> newlapsedate;
    @XmlElementRef(name = "otherRate", namespace = "http://po.edi.exchange.sinosure.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> otherRate;
    @XmlElementRef(name = "payMode", namespace = "http://po.edi.exchange.sinosure.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> payMode;
    @XmlElementRef(name = "payTerm", namespace = "http://po.edi.exchange.sinosure.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> payTerm;
    @XmlElementRef(name = "policyNo", namespace = "http://po.edi.exchange.sinosure.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> policyNo;
    @XmlElementRef(name = "quotaSum", namespace = "http://po.edi.exchange.sinosure.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> quotaSum;
    @XmlElementRef(name = "refuseRate", namespace = "http://po.edi.exchange.sinosure.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> refuseRate;

    /**
     * 获取adcondition属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAdcondition() {
        return adcondition;
    }

    /**
     * 设置adcondition属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAdcondition(JAXBElement<String> value) {
        this.adcondition = value;
    }

    /**
     * 获取bankSwift属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBankSwift() {
        return bankSwift;
    }

    /**
     * 设置bankSwift属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBankSwift(JAXBElement<String> value) {
        this.bankSwift = value;
    }

    /**
     * 获取bizbuyerNo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBizbuyerNo() {
        return bizbuyerNo;
    }

    /**
     * 设置bizbuyerNo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBizbuyerNo(JAXBElement<String> value) {
        this.bizbuyerNo = value;
    }

    /**
     * 获取buyerquotano属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBuyerquotano() {
        return buyerquotano;
    }

    /**
     * 设置buyerquotano属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBuyerquotano(JAXBElement<String> value) {
        this.buyerquotano = value;
    }

    /**
     * 获取calculateTime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getCalculateTime() {
        return calculateTime;
    }

    /**
     * 设置calculateTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setCalculateTime(JAXBElement<XMLGregorianCalendar> value) {
        this.calculateTime = value;
    }

    /**
     * 获取clientno属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getClientno() {
        return clientno;
    }

    /**
     * 设置clientno属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setClientno(JAXBElement<String> value) {
        this.clientno = value;
    }

    /**
     * 获取corpbuyerNo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCorpbuyerNo() {
        return corpbuyerNo;
    }

    /**
     * 设置corpbuyerNo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCorpbuyerNo(JAXBElement<String> value) {
        this.corpbuyerNo = value;
    }

    /**
     * 获取effectdate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getEffectdate() {
        return effectdate;
    }

    /**
     * 设置effectdate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setEffectdate(JAXBElement<XMLGregorianCalendar> value) {
        this.effectdate = value;
    }

    /**
     * 获取lapsedate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getLapsedate() {
        return lapsedate;
    }

    /**
     * 设置lapsedate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setLapsedate(JAXBElement<XMLGregorianCalendar> value) {
        this.lapsedate = value;
    }

    /**
     * 获取lcNo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLcNo() {
        return lcNo;
    }

    /**
     * 设置lcNo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLcNo(JAXBElement<String> value) {
        this.lcNo = value;
    }

    /**
     * 获取newlapsedate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getNewlapsedate() {
        return newlapsedate;
    }

    /**
     * 设置newlapsedate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setNewlapsedate(JAXBElement<XMLGregorianCalendar> value) {
        this.newlapsedate = value;
    }

    /**
     * 获取otherRate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getOtherRate() {
        return otherRate;
    }

    /**
     * 设置otherRate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setOtherRate(JAXBElement<Double> value) {
        this.otherRate = value;
    }

    /**
     * 获取payMode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPayMode() {
        return payMode;
    }

    /**
     * 设置payMode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPayMode(JAXBElement<String> value) {
        this.payMode = value;
    }

    /**
     * 获取payTerm属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getPayTerm() {
        return payTerm;
    }

    /**
     * 设置payTerm属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setPayTerm(JAXBElement<Long> value) {
        this.payTerm = value;
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
     * 获取quotaSum属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getQuotaSum() {
        return quotaSum;
    }

    /**
     * 设置quotaSum属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setQuotaSum(JAXBElement<Double> value) {
        this.quotaSum = value;
    }

    /**
     * 获取refuseRate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getRefuseRate() {
        return refuseRate;
    }

    /**
     * 设置refuseRate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setRefuseRate(JAXBElement<Double> value) {
        this.refuseRate = value;
    }

}
