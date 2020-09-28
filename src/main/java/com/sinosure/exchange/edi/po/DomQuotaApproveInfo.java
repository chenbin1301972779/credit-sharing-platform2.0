
package com.sinosure.exchange.edi.po;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>DomQuotaApproveInfo complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="DomQuotaApproveInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="approveFlag" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="corpSerialNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="domBuyerQuotaInfo" type="{http://po.edi.exchange.sinosure.com}DomBuyerQuotaInfo" minOccurs="0"/&gt;
 *         &lt;element name="noticeSerialNo" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="notifyTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="unAcceptReason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DomQuotaApproveInfo", propOrder = {
    "approveFlag",
    "corpSerialNo",
    "domBuyerQuotaInfo",
    "noticeSerialNo",
    "notifyTime",
    "unAcceptReason"
})
public class DomQuotaApproveInfo {

    @XmlElementRef(name = "approveFlag", namespace = "http://po.edi.exchange.sinosure.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> approveFlag;
    @XmlElementRef(name = "corpSerialNo", namespace = "http://po.edi.exchange.sinosure.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> corpSerialNo;
    @XmlElementRef(name = "domBuyerQuotaInfo", namespace = "http://po.edi.exchange.sinosure.com", type = JAXBElement.class, required = false)
    protected JAXBElement<DomBuyerQuotaInfo> domBuyerQuotaInfo;
    @XmlElementRef(name = "noticeSerialNo", namespace = "http://po.edi.exchange.sinosure.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> noticeSerialNo;
    @XmlElementRef(name = "notifyTime", namespace = "http://po.edi.exchange.sinosure.com", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> notifyTime;
    @XmlElementRef(name = "unAcceptReason", namespace = "http://po.edi.exchange.sinosure.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> unAcceptReason;

    /**
     * 获取approveFlag属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getApproveFlag() {
        return approveFlag;
    }

    /**
     * 设置approveFlag属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setApproveFlag(JAXBElement<Long> value) {
        this.approveFlag = value;
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
     * 获取domBuyerQuotaInfo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DomBuyerQuotaInfo }{@code >}
     *     
     */
    public JAXBElement<DomBuyerQuotaInfo> getDomBuyerQuotaInfo() {
        return domBuyerQuotaInfo;
    }

    /**
     * 设置domBuyerQuotaInfo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DomBuyerQuotaInfo }{@code >}
     *     
     */
    public void setDomBuyerQuotaInfo(JAXBElement<DomBuyerQuotaInfo> value) {
        this.domBuyerQuotaInfo = value;
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
     * 获取notifyTime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getNotifyTime() {
        return notifyTime;
    }

    /**
     * 设置notifyTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setNotifyTime(JAXBElement<XMLGregorianCalendar> value) {
        this.notifyTime = value;
    }

    /**
     * 获取unAcceptReason属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUnAcceptReason() {
        return unAcceptReason;
    }

    /**
     * 设置unAcceptReason属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUnAcceptReason(JAXBElement<String> value) {
        this.unAcceptReason = value;
    }

}
