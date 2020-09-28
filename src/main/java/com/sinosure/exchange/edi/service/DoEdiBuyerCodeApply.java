
package com.sinosure.exchange.edi.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.sinosure.exchange.edi.po.ArrayOfBuyerCodeApplyInfo;


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
 *         &lt;element name="buyerCodeApplyInfoList" type="{http://po.edi.exchange.sinosure.com}ArrayOfBuyerCodeApplyInfo"/&gt;
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
    "buyerCodeApplyInfoList"
})
@XmlRootElement(name = "doEdiBuyerCodeApply")
public class DoEdiBuyerCodeApply {

    @XmlElement(required = true, nillable = true)
    protected ArrayOfBuyerCodeApplyInfo buyerCodeApplyInfoList;

    /**
     * 获取buyerCodeApplyInfoList属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfBuyerCodeApplyInfo }
     *     
     */
    public ArrayOfBuyerCodeApplyInfo getBuyerCodeApplyInfoList() {
        return buyerCodeApplyInfoList;
    }

    /**
     * 设置buyerCodeApplyInfoList属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfBuyerCodeApplyInfo }
     *     
     */
    public void setBuyerCodeApplyInfoList(ArrayOfBuyerCodeApplyInfo value) {
        this.buyerCodeApplyInfoList = value;
    }

}
