
package com.sinosure.exchange.edi.po;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>OverdueReceipt complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="OverdueReceipt"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="buyerno" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="corpserialno" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="inviceNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="overdue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="policyNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="transportDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OverdueReceipt", propOrder = {
    "buyerno",
    "corpserialno",
    "inviceNo",
    "overdue",
    "policyNo",
    "transportDate",
    "type"
})
public class OverdueReceipt {

    @XmlElementRef(name = "buyerno", namespace = "http://po.edi.exchange.sinosure.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> buyerno;
    @XmlElementRef(name = "corpserialno", namespace = "http://po.edi.exchange.sinosure.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> corpserialno;
    @XmlElementRef(name = "inviceNo", namespace = "http://po.edi.exchange.sinosure.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> inviceNo;
    @XmlElementRef(name = "overdue", namespace = "http://po.edi.exchange.sinosure.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> overdue;
    @XmlElementRef(name = "policyNo", namespace = "http://po.edi.exchange.sinosure.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> policyNo;
    @XmlElementRef(name = "transportDate", namespace = "http://po.edi.exchange.sinosure.com", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> transportDate;
    @XmlElementRef(name = "type", namespace = "http://po.edi.exchange.sinosure.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> type;

    /**
     * 获取buyerno属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBuyerno() {
        return buyerno;
    }

    /**
     * 设置buyerno属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBuyerno(JAXBElement<String> value) {
        this.buyerno = value;
    }

    /**
     * 获取corpserialno属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCorpserialno() {
        return corpserialno;
    }

    /**
     * 设置corpserialno属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCorpserialno(JAXBElement<String> value) {
        this.corpserialno = value;
    }

    /**
     * 获取inviceNo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getInviceNo() {
        return inviceNo;
    }

    /**
     * 设置inviceNo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setInviceNo(JAXBElement<String> value) {
        this.inviceNo = value;
    }

    /**
     * 获取overdue属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOverdue() {
        return overdue;
    }

    /**
     * 设置overdue属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOverdue(JAXBElement<String> value) {
        this.overdue = value;
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
     * 获取transportDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getTransportDate() {
        return transportDate;
    }

    /**
     * 设置transportDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setTransportDate(JAXBElement<XMLGregorianCalendar> value) {
        this.transportDate = value;
    }

    /**
     * 获取type属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getType() {
        return type;
    }

    /**
     * 设置type属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setType(JAXBElement<String> value) {
        this.type = value;
    }

}
