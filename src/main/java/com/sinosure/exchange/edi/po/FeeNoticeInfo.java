
package com.sinosure.exchange.edi.po;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>FeeNoticeInfo complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="FeeNoticeInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="effectdate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="feeNoticeShipmentInfo" type="{http://po.edi.exchange.sinosure.com}ArrayOfFeeNoticeShipmentInfo" minOccurs="0"/&gt;
 *         &lt;element name="feenoticeno" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="feenoticetype" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="insurant" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="invoicesum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="moneyid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="noticeSerialNo" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="policyno" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="policytype" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="premiumbalance1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="premiumbalance2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="premiumsum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="premiumsum2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FeeNoticeInfo", propOrder = {
    "effectdate",
    "feeNoticeShipmentInfo",
    "feenoticeno",
    "feenoticetype",
    "insurant",
    "invoicesum",
    "moneyid",
    "noticeSerialNo",
    "policyno",
    "policytype",
    "premiumbalance1",
    "premiumbalance2",
    "premiumsum",
    "premiumsum2"
})
public class FeeNoticeInfo {

    @XmlElementRef(name = "effectdate", namespace = "http://po.edi.exchange.sinosure.com", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> effectdate;
    @XmlElementRef(name = "feeNoticeShipmentInfo", namespace = "http://po.edi.exchange.sinosure.com", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfFeeNoticeShipmentInfo> feeNoticeShipmentInfo;
    @XmlElementRef(name = "feenoticeno", namespace = "http://po.edi.exchange.sinosure.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> feenoticeno;
    @XmlElementRef(name = "feenoticetype", namespace = "http://po.edi.exchange.sinosure.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> feenoticetype;
    @XmlElementRef(name = "insurant", namespace = "http://po.edi.exchange.sinosure.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> insurant;
    @XmlElementRef(name = "invoicesum", namespace = "http://po.edi.exchange.sinosure.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> invoicesum;
    @XmlElementRef(name = "moneyid", namespace = "http://po.edi.exchange.sinosure.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> moneyid;
    @XmlElementRef(name = "noticeSerialNo", namespace = "http://po.edi.exchange.sinosure.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> noticeSerialNo;
    @XmlElementRef(name = "policyno", namespace = "http://po.edi.exchange.sinosure.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> policyno;
    @XmlElementRef(name = "policytype", namespace = "http://po.edi.exchange.sinosure.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> policytype;
    @XmlElementRef(name = "premiumbalance1", namespace = "http://po.edi.exchange.sinosure.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> premiumbalance1;
    @XmlElementRef(name = "premiumbalance2", namespace = "http://po.edi.exchange.sinosure.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> premiumbalance2;
    @XmlElementRef(name = "premiumsum", namespace = "http://po.edi.exchange.sinosure.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> premiumsum;
    @XmlElementRef(name = "premiumsum2", namespace = "http://po.edi.exchange.sinosure.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> premiumsum2;

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
     * 获取feeNoticeShipmentInfo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfFeeNoticeShipmentInfo }{@code >}
     *     
     */
    public JAXBElement<ArrayOfFeeNoticeShipmentInfo> getFeeNoticeShipmentInfo() {
        return feeNoticeShipmentInfo;
    }

    /**
     * 设置feeNoticeShipmentInfo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfFeeNoticeShipmentInfo }{@code >}
     *     
     */
    public void setFeeNoticeShipmentInfo(JAXBElement<ArrayOfFeeNoticeShipmentInfo> value) {
        this.feeNoticeShipmentInfo = value;
    }

    /**
     * 获取feenoticeno属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFeenoticeno() {
        return feenoticeno;
    }

    /**
     * 设置feenoticeno属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFeenoticeno(JAXBElement<String> value) {
        this.feenoticeno = value;
    }

    /**
     * 获取feenoticetype属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFeenoticetype() {
        return feenoticetype;
    }

    /**
     * 设置feenoticetype属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFeenoticetype(JAXBElement<String> value) {
        this.feenoticetype = value;
    }

    /**
     * 获取insurant属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getInsurant() {
        return insurant;
    }

    /**
     * 设置insurant属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setInsurant(JAXBElement<String> value) {
        this.insurant = value;
    }

    /**
     * 获取invoicesum属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getInvoicesum() {
        return invoicesum;
    }

    /**
     * 设置invoicesum属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setInvoicesum(JAXBElement<String> value) {
        this.invoicesum = value;
    }

    /**
     * 获取moneyid属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMoneyid() {
        return moneyid;
    }

    /**
     * 设置moneyid属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMoneyid(JAXBElement<String> value) {
        this.moneyid = value;
    }

    /**
     * 获取noticeSerialNo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getNoticeSerialNo() {
        return noticeSerialNo;
    }

    /**
     * 设置noticeSerialNo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setNoticeSerialNo(JAXBElement<Long> value) {
        this.noticeSerialNo = value;
    }

    /**
     * 获取policyno属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPolicyno() {
        return policyno;
    }

    /**
     * 设置policyno属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPolicyno(JAXBElement<String> value) {
        this.policyno = value;
    }

    /**
     * 获取policytype属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPolicytype() {
        return policytype;
    }

    /**
     * 设置policytype属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPolicytype(JAXBElement<String> value) {
        this.policytype = value;
    }

    /**
     * 获取premiumbalance1属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPremiumbalance1() {
        return premiumbalance1;
    }

    /**
     * 设置premiumbalance1属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPremiumbalance1(JAXBElement<String> value) {
        this.premiumbalance1 = value;
    }

    /**
     * 获取premiumbalance2属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPremiumbalance2() {
        return premiumbalance2;
    }

    /**
     * 设置premiumbalance2属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPremiumbalance2(JAXBElement<String> value) {
        this.premiumbalance2 = value;
    }

    /**
     * 获取premiumsum属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPremiumsum() {
        return premiumsum;
    }

    /**
     * 设置premiumsum属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPremiumsum(JAXBElement<String> value) {
        this.premiumsum = value;
    }

    /**
     * 获取premiumsum2属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPremiumsum2() {
        return premiumsum2;
    }

    /**
     * 设置premiumsum2属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPremiumsum2(JAXBElement<String> value) {
        this.premiumsum2 = value;
    }

}
