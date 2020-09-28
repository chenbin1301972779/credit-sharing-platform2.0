
package com.sinosure.exchange.edi.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>anonymous complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="corpSerialNo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="policyNo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="buyerNo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="openBankSwift" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="exBankSwift" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="payMode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="payTerm" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="preTransporteDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="insuranceRange" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "corpSerialNo",
    "policyNo",
    "buyerNo",
    "openBankSwift",
    "exBankSwift",
    "payMode",
    "payTerm",
    "preTransporteDate",
    "insuranceRange"
})
@XmlRootElement(name = "EdiCheckAutoQuota")
public class EdiCheckAutoQuota {

    @XmlElement(required = true, nillable = true)
    protected String corpSerialNo;
    @XmlElement(required = true, nillable = true)
    protected String policyNo;
    @XmlElement(required = true, nillable = true)
    protected String buyerNo;
    @XmlElement(required = true, nillable = true)
    protected String openBankSwift;
    @XmlElement(required = true, nillable = true)
    protected String exBankSwift;
    @XmlElement(required = true, nillable = true)
    protected String payMode;
    @XmlElement(required = true, type = Long.class, nillable = true)
    protected Long payTerm;
    @XmlElement(required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar preTransporteDate;
    @XmlElement(required = true, type = Long.class, nillable = true)
    protected Long insuranceRange;

    /**
     * 获取corpSerialNo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCorpSerialNo() {
        return corpSerialNo;
    }

    /**
     * 设置corpSerialNo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCorpSerialNo(String value) {
        this.corpSerialNo = value;
    }

    /**
     * 获取policyNo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPolicyNo() {
        return policyNo;
    }

    /**
     * 设置policyNo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPolicyNo(String value) {
        this.policyNo = value;
    }

    /**
     * 获取buyerNo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBuyerNo() {
        return buyerNo;
    }

    /**
     * 设置buyerNo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBuyerNo(String value) {
        this.buyerNo = value;
    }

    /**
     * 获取openBankSwift属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOpenBankSwift() {
        return openBankSwift;
    }

    /**
     * 设置openBankSwift属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOpenBankSwift(String value) {
        this.openBankSwift = value;
    }

    /**
     * 获取exBankSwift属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExBankSwift() {
        return exBankSwift;
    }

    /**
     * 设置exBankSwift属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExBankSwift(String value) {
        this.exBankSwift = value;
    }

    /**
     * 获取payMode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayMode() {
        return payMode;
    }

    /**
     * 设置payMode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayMode(String value) {
        this.payMode = value;
    }

    /**
     * 获取payTerm属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPayTerm() {
        return payTerm;
    }

    /**
     * 设置payTerm属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPayTerm(Long value) {
        this.payTerm = value;
    }

    /**
     * 获取preTransporteDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPreTransporteDate() {
        return preTransporteDate;
    }

    /**
     * 设置preTransporteDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPreTransporteDate(XMLGregorianCalendar value) {
        this.preTransporteDate = value;
    }

    /**
     * 获取insuranceRange属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getInsuranceRange() {
        return insuranceRange;
    }

    /**
     * 设置insuranceRange属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setInsuranceRange(Long value) {
        this.insuranceRange = value;
    }

}
