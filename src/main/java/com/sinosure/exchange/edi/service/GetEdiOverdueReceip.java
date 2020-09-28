
package com.sinosure.exchange.edi.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="invoiceno" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="buyerNo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="OverdueS" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="OverdueE" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="policyno" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
    "invoiceno",
    "buyerNo",
    "overdueS",
    "overdueE",
    "policyno"
})
@XmlRootElement(name = "getEdiOverdueReceip")
public class GetEdiOverdueReceip {

    @XmlElement(required = true, nillable = true)
    protected String corpSerialNo;
    @XmlElement(required = true, nillable = true)
    protected String invoiceno;
    @XmlElement(required = true, nillable = true)
    protected String buyerNo;
    @XmlElement(name = "OverdueS", required = true, nillable = true)
    protected String overdueS;
    @XmlElement(name = "OverdueE", required = true, nillable = true)
    protected String overdueE;
    @XmlElement(required = true, nillable = true)
    protected String policyno;

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
     * 获取invoiceno属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInvoiceno() {
        return invoiceno;
    }

    /**
     * 设置invoiceno属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInvoiceno(String value) {
        this.invoiceno = value;
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
     * 获取overdueS属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOverdueS() {
        return overdueS;
    }

    /**
     * 设置overdueS属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOverdueS(String value) {
        this.overdueS = value;
    }

    /**
     * 获取overdueE属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOverdueE() {
        return overdueE;
    }

    /**
     * 设置overdueE属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOverdueE(String value) {
        this.overdueE = value;
    }

    /**
     * 获取policyno属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPolicyno() {
        return policyno;
    }

    /**
     * 设置policyno属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPolicyno(String value) {
        this.policyno = value;
    }

}
