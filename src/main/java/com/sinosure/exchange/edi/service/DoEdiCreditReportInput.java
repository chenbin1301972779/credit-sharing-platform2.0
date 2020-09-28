
package com.sinosure.exchange.edi.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.sinosure.exchange.edi.po.ArrayOfEntrustInput;


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
 *         &lt;element name="entrustInputList" type="{http://po.edi.exchange.sinosure.com}ArrayOfEntrustInput"/&gt;
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
    "entrustInputList"
})
@XmlRootElement(name = "doEdiCreditReportInput")
public class DoEdiCreditReportInput {

    @XmlElement(required = true, nillable = true)
    protected ArrayOfEntrustInput entrustInputList;

    /**
     * 获取entrustInputList属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfEntrustInput }
     *     
     */
    public ArrayOfEntrustInput getEntrustInputList() {
        return entrustInputList;
    }

    /**
     * 设置entrustInputList属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfEntrustInput }
     *     
     */
    public void setEntrustInputList(ArrayOfEntrustInput value) {
        this.entrustInputList = value;
    }

}
