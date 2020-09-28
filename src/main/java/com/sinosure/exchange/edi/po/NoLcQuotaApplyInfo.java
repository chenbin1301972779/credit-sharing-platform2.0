
package com.sinosure.exchange.edi.po;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>NoLcQuotaApplyInfo complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="NoLcQuotaApplyInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="filenum" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="noLcQuotaApplyAppendix" type="{http://po.edi.exchange.sinosure.com}NoLcQuotaApplyAppendix" minOccurs="0"/&gt;
 *         &lt;element name="noLcQuotaApplyAppendix2" type="{http://po.edi.exchange.sinosure.com}NoLcQuotaApplyAppendix2" minOccurs="0"/&gt;
 *         &lt;element name="noLcQuotaApplyBasicInfo" type="{http://po.edi.exchange.sinosure.com}NoLcQuotaApplyBasicInfo" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NoLcQuotaApplyInfo", propOrder = {
    "filenum",
    "noLcQuotaApplyAppendix",
    "noLcQuotaApplyAppendix2",
    "noLcQuotaApplyBasicInfo"
})
public class NoLcQuotaApplyInfo {

    @XmlElementRef(name = "filenum", namespace = "http://po.edi.exchange.sinosure.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> filenum;
    @XmlElementRef(name = "noLcQuotaApplyAppendix", namespace = "http://po.edi.exchange.sinosure.com", type = JAXBElement.class, required = false)
    protected JAXBElement<NoLcQuotaApplyAppendix> noLcQuotaApplyAppendix;
    @XmlElementRef(name = "noLcQuotaApplyAppendix2", namespace = "http://po.edi.exchange.sinosure.com", type = JAXBElement.class, required = false)
    protected JAXBElement<NoLcQuotaApplyAppendix2> noLcQuotaApplyAppendix2;
    @XmlElementRef(name = "noLcQuotaApplyBasicInfo", namespace = "http://po.edi.exchange.sinosure.com", type = JAXBElement.class, required = false)
    protected JAXBElement<NoLcQuotaApplyBasicInfo> noLcQuotaApplyBasicInfo;

    /**
     * 获取filenum属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getFilenum() {
        return filenum;
    }

    /**
     * 设置filenum属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setFilenum(JAXBElement<Long> value) {
        this.filenum = value;
    }

    /**
     * 获取noLcQuotaApplyAppendix属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link NoLcQuotaApplyAppendix }{@code >}
     *     
     */
    public JAXBElement<NoLcQuotaApplyAppendix> getNoLcQuotaApplyAppendix() {
        return noLcQuotaApplyAppendix;
    }

    /**
     * 设置noLcQuotaApplyAppendix属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link NoLcQuotaApplyAppendix }{@code >}
     *     
     */
    public void setNoLcQuotaApplyAppendix(JAXBElement<NoLcQuotaApplyAppendix> value) {
        this.noLcQuotaApplyAppendix = value;
    }

    /**
     * 获取noLcQuotaApplyAppendix2属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link NoLcQuotaApplyAppendix2 }{@code >}
     *     
     */
    public JAXBElement<NoLcQuotaApplyAppendix2> getNoLcQuotaApplyAppendix2() {
        return noLcQuotaApplyAppendix2;
    }

    /**
     * 设置noLcQuotaApplyAppendix2属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link NoLcQuotaApplyAppendix2 }{@code >}
     *     
     */
    public void setNoLcQuotaApplyAppendix2(JAXBElement<NoLcQuotaApplyAppendix2> value) {
        this.noLcQuotaApplyAppendix2 = value;
    }

    /**
     * 获取noLcQuotaApplyBasicInfo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link NoLcQuotaApplyBasicInfo }{@code >}
     *     
     */
    public JAXBElement<NoLcQuotaApplyBasicInfo> getNoLcQuotaApplyBasicInfo() {
        return noLcQuotaApplyBasicInfo;
    }

    /**
     * 设置noLcQuotaApplyBasicInfo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link NoLcQuotaApplyBasicInfo }{@code >}
     *     
     */
    public void setNoLcQuotaApplyBasicInfo(JAXBElement<NoLcQuotaApplyBasicInfo> value) {
        this.noLcQuotaApplyBasicInfo = value;
    }

}
