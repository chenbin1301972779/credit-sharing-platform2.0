
package com.sinosure.exchange.edi.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.sinosure.exchange.edi.po.ArrayOfDomDeclareApplyInfo;


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
 *         &lt;element name="domDeclareList" type="{http://po.edi.exchange.sinosure.com}ArrayOfDomDeclareApplyInfo"/&gt;
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
    "domDeclareList"
})
@XmlRootElement(name = "doEdiDomDeclareApply")
public class DoEdiDomDeclareApply {

    @XmlElement(required = true, nillable = true)
    protected ArrayOfDomDeclareApplyInfo domDeclareList;

    /**
     * 获取domDeclareList属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDomDeclareApplyInfo }
     *     
     */
    public ArrayOfDomDeclareApplyInfo getDomDeclareList() {
        return domDeclareList;
    }

    /**
     * 设置domDeclareList属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDomDeclareApplyInfo }
     *     
     */
    public void setDomDeclareList(ArrayOfDomDeclareApplyInfo value) {
        this.domDeclareList = value;
    }

}
