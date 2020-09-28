
package com.sinosure.exchange.sedi3.po;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>EdiExpObject complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="EdiExpObject"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ediKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ediVal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EdiExpObject", propOrder = {
    "ediKey",
    "ediVal"
})
public class EdiExpObject {

    @XmlElementRef(name = "ediKey", namespace = "http://po.sedi3.exchange.sinosure.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> ediKey;
    @XmlElementRef(name = "ediVal", namespace = "http://po.sedi3.exchange.sinosure.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> ediVal;

    /**
     * 获取ediKey属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEdiKey() {
        return ediKey;
    }

    /**
     * 设置ediKey属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEdiKey(JAXBElement<String> value) {
        this.ediKey = value;
    }

    /**
     * 获取ediVal属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEdiVal() {
        return ediVal;
    }

    /**
     * 设置ediVal属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEdiVal(JAXBElement<String> value) {
        this.ediVal = value;
    }

}
