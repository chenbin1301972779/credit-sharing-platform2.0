
package com.sinosure.exchange.edi.po;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import com.sinosure.exchange.sedi3.po.ArrayOfEdiExpObject;


/**
 * <p>Attafile complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="Attafile"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="corpserialno" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ediexpobjects" type="{http://po.sedi3.exchange.sinosure.com}ArrayOfEdiExpObject" minOccurs="0"/&gt;
 *         &lt;element name="filebyte" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/&gt;
 *         &lt;element name="filename" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="srcCorpserialno" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
@XmlType(name = "Attafile", propOrder = {
    "corpserialno",
    "ediexpobjects",
    "filebyte",
    "filename",
    "srcCorpserialno",
    "type"
})
public class Attafile {

    @XmlElementRef(name = "corpserialno", namespace = "http://po.edi.exchange.sinosure.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> corpserialno;
    @XmlElementRef(name = "ediexpobjects", namespace = "http://po.edi.exchange.sinosure.com", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfEdiExpObject> ediexpobjects;
    @XmlElementRef(name = "filebyte", namespace = "http://po.edi.exchange.sinosure.com", type = JAXBElement.class, required = false)
    protected JAXBElement<byte[]> filebyte;
    @XmlElementRef(name = "filename", namespace = "http://po.edi.exchange.sinosure.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> filename;
    @XmlElementRef(name = "srcCorpserialno", namespace = "http://po.edi.exchange.sinosure.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> srcCorpserialno;
    @XmlElementRef(name = "type", namespace = "http://po.edi.exchange.sinosure.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> type;

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
     * 获取ediexpobjects属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfEdiExpObject }{@code >}
     *     
     */
    public JAXBElement<ArrayOfEdiExpObject> getEdiexpobjects() {
        return ediexpobjects;
    }

    /**
     * 设置ediexpobjects属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfEdiExpObject }{@code >}
     *     
     */
    public void setEdiexpobjects(JAXBElement<ArrayOfEdiExpObject> value) {
        this.ediexpobjects = value;
    }

    /**
     * 获取filebyte属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     *     
     */
    public JAXBElement<byte[]> getFilebyte() {
        return filebyte;
    }

    /**
     * 设置filebyte属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     *     
     */
    public void setFilebyte(JAXBElement<byte[]> value) {
        this.filebyte = value;
    }

    /**
     * 获取filename属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFilename() {
        return filename;
    }

    /**
     * 设置filename属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFilename(JAXBElement<String> value) {
        this.filename = value;
    }

    /**
     * 获取srcCorpserialno属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSrcCorpserialno() {
        return srcCorpserialno;
    }

    /**
     * 设置srcCorpserialno属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSrcCorpserialno(JAXBElement<String> value) {
        this.srcCorpserialno = value;
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
