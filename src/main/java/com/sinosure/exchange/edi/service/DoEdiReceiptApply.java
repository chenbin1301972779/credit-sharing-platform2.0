
package com.sinosure.exchange.edi.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.sinosure.exchange.edi.po.ArrayOfReceiptApplyInfo;


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
 *         &lt;element name="receiptList" type="{http://po.edi.exchange.sinosure.com}ArrayOfReceiptApplyInfo"/&gt;
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
    "receiptList"
})
@XmlRootElement(name = "doEdiReceiptApply")
public class DoEdiReceiptApply {

    @XmlElement(required = true, nillable = true)
    protected ArrayOfReceiptApplyInfo receiptList;

    /**
     * 获取receiptList属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfReceiptApplyInfo }
     *     
     */
    public ArrayOfReceiptApplyInfo getReceiptList() {
        return receiptList;
    }

    /**
     * 设置receiptList属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfReceiptApplyInfo }
     *     
     */
    public void setReceiptList(ArrayOfReceiptApplyInfo value) {
        this.receiptList = value;
    }

}
