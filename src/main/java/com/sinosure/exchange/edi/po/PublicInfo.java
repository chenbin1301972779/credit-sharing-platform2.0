
package com.sinosure.exchange.edi.po;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>PublicInfo complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="PublicInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="bankruptcyFlg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="bulletinFlg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="lienFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="litigationFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="mortgateFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="newsFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="otherPublicRecordFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PublicInfo", propOrder = {
    "bankruptcyFlg",
    "bulletinFlg",
    "lienFlag",
    "litigationFlag",
    "mortgateFlag",
    "newsFlag",
    "otherPublicRecordFlag"
})
public class PublicInfo {

    @XmlElementRef(name = "bankruptcyFlg", namespace = "http://po.edi.exchange.sinosure.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> bankruptcyFlg;
    @XmlElementRef(name = "bulletinFlg", namespace = "http://po.edi.exchange.sinosure.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> bulletinFlg;
    @XmlElementRef(name = "lienFlag", namespace = "http://po.edi.exchange.sinosure.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> lienFlag;
    @XmlElementRef(name = "litigationFlag", namespace = "http://po.edi.exchange.sinosure.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> litigationFlag;
    @XmlElementRef(name = "mortgateFlag", namespace = "http://po.edi.exchange.sinosure.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mortgateFlag;
    @XmlElementRef(name = "newsFlag", namespace = "http://po.edi.exchange.sinosure.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> newsFlag;
    @XmlElementRef(name = "otherPublicRecordFlag", namespace = "http://po.edi.exchange.sinosure.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> otherPublicRecordFlag;

    /**
     * 获取bankruptcyFlg属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBankruptcyFlg() {
        return bankruptcyFlg;
    }

    /**
     * 设置bankruptcyFlg属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBankruptcyFlg(JAXBElement<String> value) {
        this.bankruptcyFlg = value;
    }

    /**
     * 获取bulletinFlg属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBulletinFlg() {
        return bulletinFlg;
    }

    /**
     * 设置bulletinFlg属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBulletinFlg(JAXBElement<String> value) {
        this.bulletinFlg = value;
    }

    /**
     * 获取lienFlag属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLienFlag() {
        return lienFlag;
    }

    /**
     * 设置lienFlag属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLienFlag(JAXBElement<String> value) {
        this.lienFlag = value;
    }

    /**
     * 获取litigationFlag属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLitigationFlag() {
        return litigationFlag;
    }

    /**
     * 设置litigationFlag属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLitigationFlag(JAXBElement<String> value) {
        this.litigationFlag = value;
    }

    /**
     * 获取mortgateFlag属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMortgateFlag() {
        return mortgateFlag;
    }

    /**
     * 设置mortgateFlag属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMortgateFlag(JAXBElement<String> value) {
        this.mortgateFlag = value;
    }

    /**
     * 获取newsFlag属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNewsFlag() {
        return newsFlag;
    }

    /**
     * 设置newsFlag属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNewsFlag(JAXBElement<String> value) {
        this.newsFlag = value;
    }

    /**
     * 获取otherPublicRecordFlag属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOtherPublicRecordFlag() {
        return otherPublicRecordFlag;
    }

    /**
     * 设置otherPublicRecordFlag属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOtherPublicRecordFlag(JAXBElement<String> value) {
        this.otherPublicRecordFlag = value;
    }

}
