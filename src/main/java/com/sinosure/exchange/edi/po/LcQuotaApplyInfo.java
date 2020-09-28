
package com.sinosure.exchange.edi.po;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>LcQuotaApplyInfo complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="LcQuotaApplyInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="filenum" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="lcQuotaApplyBasicInfo" type="{http://po.edi.exchange.sinosure.com}LcQuotaApplyBasicInfo" minOccurs="0"/&gt;
 *         &lt;element name="lcQuotaApplyOweInfoList" type="{http://po.edi.exchange.sinosure.com}ArrayOfLcQuotaApplyOweInfo" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LcQuotaApplyInfo", propOrder = {
    "filenum",
    "lcQuotaApplyBasicInfo",
    "lcQuotaApplyOweInfoList"
})
public class LcQuotaApplyInfo {

    @XmlElementRef(name = "filenum", namespace = "http://po.edi.exchange.sinosure.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> filenum;
    @XmlElementRef(name = "lcQuotaApplyBasicInfo", namespace = "http://po.edi.exchange.sinosure.com", type = JAXBElement.class, required = false)
    protected JAXBElement<LcQuotaApplyBasicInfo> lcQuotaApplyBasicInfo;
    @XmlElementRef(name = "lcQuotaApplyOweInfoList", namespace = "http://po.edi.exchange.sinosure.com", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfLcQuotaApplyOweInfo> lcQuotaApplyOweInfoList;

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
     * 获取lcQuotaApplyBasicInfo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link LcQuotaApplyBasicInfo }{@code >}
     *     
     */
    public JAXBElement<LcQuotaApplyBasicInfo> getLcQuotaApplyBasicInfo() {
        return lcQuotaApplyBasicInfo;
    }

    /**
     * 设置lcQuotaApplyBasicInfo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link LcQuotaApplyBasicInfo }{@code >}
     *     
     */
    public void setLcQuotaApplyBasicInfo(JAXBElement<LcQuotaApplyBasicInfo> value) {
        this.lcQuotaApplyBasicInfo = value;
    }

    /**
     * 获取lcQuotaApplyOweInfoList属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfLcQuotaApplyOweInfo }{@code >}
     *     
     */
    public JAXBElement<ArrayOfLcQuotaApplyOweInfo> getLcQuotaApplyOweInfoList() {
        return lcQuotaApplyOweInfoList;
    }

    /**
     * 设置lcQuotaApplyOweInfoList属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfLcQuotaApplyOweInfo }{@code >}
     *     
     */
    public void setLcQuotaApplyOweInfoList(JAXBElement<ArrayOfLcQuotaApplyOweInfo> value) {
        this.lcQuotaApplyOweInfoList = value;
    }

}
