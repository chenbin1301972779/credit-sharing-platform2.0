
package com.sinosure.exchange.edi.po;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>RatingInfo complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="RatingInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="businessInfo" type="{http://po.edi.exchange.sinosure.com}BusinessInfo" minOccurs="0"/&gt;
 *         &lt;element name="buyerChnAddr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="buyerChnName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="buyerCountryCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="buyerEngAddr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="buyerEngName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="clientNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="creditInfo" type="{http://po.edi.exchange.sinosure.com}CreditInfo" minOccurs="0"/&gt;
 *         &lt;element name="financeInfos" type="{http://po.edi.exchange.sinosure.com}ArrayOfFinanceInfo" minOccurs="0"/&gt;
 *         &lt;element name="foreignBasicInfo" type="{http://po.edi.exchange.sinosure.com}ForeignBasicInfo" minOccurs="0"/&gt;
 *         &lt;element name="noticeSerialNo" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="notifyTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="policyNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="publicInfo" type="{http://po.edi.exchange.sinosure.com}PublicInfo" minOccurs="0"/&gt;
 *         &lt;element name="registerAddr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="reportMoneyID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="reportNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="reportType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="sharesInfos" type="{http://po.edi.exchange.sinosure.com}ArrayOfSharesInfo" minOccurs="0"/&gt;
 *         &lt;element name="sinosureBuyerNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RatingInfo", propOrder = {
    "businessInfo",
    "buyerChnAddr",
    "buyerChnName",
    "buyerCountryCode",
    "buyerEngAddr",
    "buyerEngName",
    "clientNo",
    "creditInfo",
    "financeInfos",
    "foreignBasicInfo",
    "noticeSerialNo",
    "notifyTime",
    "policyNo",
    "publicInfo",
    "registerAddr",
    "reportMoneyID",
    "reportNo",
    "reportType",
    "sharesInfos",
    "sinosureBuyerNo"
})
public class RatingInfo {

    @XmlElementRef(name = "businessInfo", namespace = "http://po.edi.exchange.sinosure.com", type = JAXBElement.class, required = false)
    protected JAXBElement<BusinessInfo> businessInfo;
    @XmlElementRef(name = "buyerChnAddr", namespace = "http://po.edi.exchange.sinosure.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> buyerChnAddr;
    @XmlElementRef(name = "buyerChnName", namespace = "http://po.edi.exchange.sinosure.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> buyerChnName;
    @XmlElementRef(name = "buyerCountryCode", namespace = "http://po.edi.exchange.sinosure.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> buyerCountryCode;
    @XmlElementRef(name = "buyerEngAddr", namespace = "http://po.edi.exchange.sinosure.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> buyerEngAddr;
    @XmlElementRef(name = "buyerEngName", namespace = "http://po.edi.exchange.sinosure.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> buyerEngName;
    @XmlElementRef(name = "clientNo", namespace = "http://po.edi.exchange.sinosure.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> clientNo;
    @XmlElementRef(name = "creditInfo", namespace = "http://po.edi.exchange.sinosure.com", type = JAXBElement.class, required = false)
    protected JAXBElement<CreditInfo> creditInfo;
    @XmlElementRef(name = "financeInfos", namespace = "http://po.edi.exchange.sinosure.com", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfFinanceInfo> financeInfos;
    @XmlElementRef(name = "foreignBasicInfo", namespace = "http://po.edi.exchange.sinosure.com", type = JAXBElement.class, required = false)
    protected JAXBElement<ForeignBasicInfo> foreignBasicInfo;
    @XmlElementRef(name = "noticeSerialNo", namespace = "http://po.edi.exchange.sinosure.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> noticeSerialNo;
    @XmlElementRef(name = "notifyTime", namespace = "http://po.edi.exchange.sinosure.com", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> notifyTime;
    @XmlElementRef(name = "policyNo", namespace = "http://po.edi.exchange.sinosure.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> policyNo;
    @XmlElementRef(name = "publicInfo", namespace = "http://po.edi.exchange.sinosure.com", type = JAXBElement.class, required = false)
    protected JAXBElement<PublicInfo> publicInfo;
    @XmlElementRef(name = "registerAddr", namespace = "http://po.edi.exchange.sinosure.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> registerAddr;
    @XmlElementRef(name = "reportMoneyID", namespace = "http://po.edi.exchange.sinosure.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> reportMoneyID;
    @XmlElementRef(name = "reportNo", namespace = "http://po.edi.exchange.sinosure.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> reportNo;
    @XmlElementRef(name = "reportType", namespace = "http://po.edi.exchange.sinosure.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> reportType;
    @XmlElementRef(name = "sharesInfos", namespace = "http://po.edi.exchange.sinosure.com", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfSharesInfo> sharesInfos;
    @XmlElementRef(name = "sinosureBuyerNo", namespace = "http://po.edi.exchange.sinosure.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> sinosureBuyerNo;

    /**
     * 获取businessInfo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BusinessInfo }{@code >}
     *     
     */
    public JAXBElement<BusinessInfo> getBusinessInfo() {
        return businessInfo;
    }

    /**
     * 设置businessInfo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BusinessInfo }{@code >}
     *     
     */
    public void setBusinessInfo(JAXBElement<BusinessInfo> value) {
        this.businessInfo = value;
    }

    /**
     * 获取buyerChnAddr属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBuyerChnAddr() {
        return buyerChnAddr;
    }

    /**
     * 设置buyerChnAddr属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBuyerChnAddr(JAXBElement<String> value) {
        this.buyerChnAddr = value;
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
     * 获取buyerEngAddr属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBuyerEngAddr() {
        return buyerEngAddr;
    }

    /**
     * 设置buyerEngAddr属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBuyerEngAddr(JAXBElement<String> value) {
        this.buyerEngAddr = value;
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
     * 获取creditInfo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CreditInfo }{@code >}
     *     
     */
    public JAXBElement<CreditInfo> getCreditInfo() {
        return creditInfo;
    }

    /**
     * 设置creditInfo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CreditInfo }{@code >}
     *     
     */
    public void setCreditInfo(JAXBElement<CreditInfo> value) {
        this.creditInfo = value;
    }

    /**
     * 获取financeInfos属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfFinanceInfo }{@code >}
     *     
     */
    public JAXBElement<ArrayOfFinanceInfo> getFinanceInfos() {
        return financeInfos;
    }

    /**
     * 设置financeInfos属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfFinanceInfo }{@code >}
     *     
     */
    public void setFinanceInfos(JAXBElement<ArrayOfFinanceInfo> value) {
        this.financeInfos = value;
    }

    /**
     * 获取foreignBasicInfo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ForeignBasicInfo }{@code >}
     *     
     */
    public JAXBElement<ForeignBasicInfo> getForeignBasicInfo() {
        return foreignBasicInfo;
    }

    /**
     * 设置foreignBasicInfo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ForeignBasicInfo }{@code >}
     *     
     */
    public void setForeignBasicInfo(JAXBElement<ForeignBasicInfo> value) {
        this.foreignBasicInfo = value;
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
     * 获取publicInfo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PublicInfo }{@code >}
     *     
     */
    public JAXBElement<PublicInfo> getPublicInfo() {
        return publicInfo;
    }

    /**
     * 设置publicInfo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PublicInfo }{@code >}
     *     
     */
    public void setPublicInfo(JAXBElement<PublicInfo> value) {
        this.publicInfo = value;
    }

    /**
     * 获取registerAddr属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRegisterAddr() {
        return registerAddr;
    }

    /**
     * 设置registerAddr属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRegisterAddr(JAXBElement<String> value) {
        this.registerAddr = value;
    }

    /**
     * 获取reportMoneyID属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getReportMoneyID() {
        return reportMoneyID;
    }

    /**
     * 设置reportMoneyID属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setReportMoneyID(JAXBElement<String> value) {
        this.reportMoneyID = value;
    }

    /**
     * 获取reportNo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getReportNo() {
        return reportNo;
    }

    /**
     * 设置reportNo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setReportNo(JAXBElement<String> value) {
        this.reportNo = value;
    }

    /**
     * 获取reportType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getReportType() {
        return reportType;
    }

    /**
     * 设置reportType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setReportType(JAXBElement<String> value) {
        this.reportType = value;
    }

    /**
     * 获取sharesInfos属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfSharesInfo }{@code >}
     *     
     */
    public JAXBElement<ArrayOfSharesInfo> getSharesInfos() {
        return sharesInfos;
    }

    /**
     * 设置sharesInfos属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfSharesInfo }{@code >}
     *     
     */
    public void setSharesInfos(JAXBElement<ArrayOfSharesInfo> value) {
        this.sharesInfos = value;
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

}
