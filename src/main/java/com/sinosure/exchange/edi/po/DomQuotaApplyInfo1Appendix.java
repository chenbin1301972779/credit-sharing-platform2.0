
package com.sinosure.exchange.edi.po;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>DomQuotaApplyInfo1Appendix complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="DomQuotaApplyInfo1Appendix"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="creditsalesum" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="receivablessum" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="receivablessumtimea" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="receivablessumtimeb" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="receivablessumtimec" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="receivablessumtimed" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="receivablessumtimee" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="salesum" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="yearmonth" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DomQuotaApplyInfo1Appendix", propOrder = {
    "creditsalesum",
    "receivablessum",
    "receivablessumtimea",
    "receivablessumtimeb",
    "receivablessumtimec",
    "receivablessumtimed",
    "receivablessumtimee",
    "salesum",
    "yearmonth"
})
public class DomQuotaApplyInfo1Appendix {

    @XmlElementRef(name = "creditsalesum", namespace = "http://po.edi.exchange.sinosure.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> creditsalesum;
    @XmlElementRef(name = "receivablessum", namespace = "http://po.edi.exchange.sinosure.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> receivablessum;
    @XmlElementRef(name = "receivablessumtimea", namespace = "http://po.edi.exchange.sinosure.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> receivablessumtimea;
    @XmlElementRef(name = "receivablessumtimeb", namespace = "http://po.edi.exchange.sinosure.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> receivablessumtimeb;
    @XmlElementRef(name = "receivablessumtimec", namespace = "http://po.edi.exchange.sinosure.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> receivablessumtimec;
    @XmlElementRef(name = "receivablessumtimed", namespace = "http://po.edi.exchange.sinosure.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> receivablessumtimed;
    @XmlElementRef(name = "receivablessumtimee", namespace = "http://po.edi.exchange.sinosure.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> receivablessumtimee;
    @XmlElementRef(name = "salesum", namespace = "http://po.edi.exchange.sinosure.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> salesum;
    @XmlElementRef(name = "yearmonth", namespace = "http://po.edi.exchange.sinosure.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> yearmonth;

    /**
     * 获取creditsalesum属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getCreditsalesum() {
        return creditsalesum;
    }

    /**
     * 设置creditsalesum属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setCreditsalesum(JAXBElement<Double> value) {
        this.creditsalesum = value;
    }

    /**
     * 获取receivablessum属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getReceivablessum() {
        return receivablessum;
    }

    /**
     * 设置receivablessum属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setReceivablessum(JAXBElement<Double> value) {
        this.receivablessum = value;
    }

    /**
     * 获取receivablessumtimea属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getReceivablessumtimea() {
        return receivablessumtimea;
    }

    /**
     * 设置receivablessumtimea属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setReceivablessumtimea(JAXBElement<Double> value) {
        this.receivablessumtimea = value;
    }

    /**
     * 获取receivablessumtimeb属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getReceivablessumtimeb() {
        return receivablessumtimeb;
    }

    /**
     * 设置receivablessumtimeb属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setReceivablessumtimeb(JAXBElement<Double> value) {
        this.receivablessumtimeb = value;
    }

    /**
     * 获取receivablessumtimec属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getReceivablessumtimec() {
        return receivablessumtimec;
    }

    /**
     * 设置receivablessumtimec属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setReceivablessumtimec(JAXBElement<Double> value) {
        this.receivablessumtimec = value;
    }

    /**
     * 获取receivablessumtimed属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getReceivablessumtimed() {
        return receivablessumtimed;
    }

    /**
     * 设置receivablessumtimed属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setReceivablessumtimed(JAXBElement<Double> value) {
        this.receivablessumtimed = value;
    }

    /**
     * 获取receivablessumtimee属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getReceivablessumtimee() {
        return receivablessumtimee;
    }

    /**
     * 设置receivablessumtimee属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setReceivablessumtimee(JAXBElement<Double> value) {
        this.receivablessumtimee = value;
    }

    /**
     * 获取salesum属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getSalesum() {
        return salesum;
    }

    /**
     * 设置salesum属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setSalesum(JAXBElement<Double> value) {
        this.salesum = value;
    }

    /**
     * 获取yearmonth属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getYearmonth() {
        return yearmonth;
    }

    /**
     * 设置yearmonth属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setYearmonth(JAXBElement<String> value) {
        this.yearmonth = value;
    }

}
