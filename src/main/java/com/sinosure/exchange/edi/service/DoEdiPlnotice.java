
package com.sinosure.exchange.edi.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.sinosure.exchange.edi.po.ArrayOfPlnotice;


/**
 * <p>anonymous complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="plnoticeList" type="{http://po.edi.exchange.sinosure.com}ArrayOfPlnotice"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "plnoticeList"
})
@XmlRootElement(name = "doEdiPlnotice")
public class DoEdiPlnotice {

    @XmlElement(required = true, nillable = true)
    protected ArrayOfPlnotice plnoticeList;

    /**
     * 获取plnoticeList属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfPlnotice }
     *     
     */
    public ArrayOfPlnotice getPlnoticeList() {
        return plnoticeList;
    }

    /**
     * 设置plnoticeList属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfPlnotice }
     *     
     */
    public void setPlnoticeList(ArrayOfPlnotice value) {
        this.plnoticeList = value;
    }

}
