
package com.sinosure.exchange.edi.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.sinosure.exchange.edi.po.ArrayOfLcQuotaApplyInfoV2;


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
 *         &lt;element name="lcQuotaList" type="{http://po.edi.exchange.sinosure.com}ArrayOfLcQuotaApplyInfoV2"/&gt;
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
    "lcQuotaList"
})
@XmlRootElement(name = "doEdiLcQuotaApplyV2")
public class DoEdiLcQuotaApplyV2 {

    @XmlElement(required = true, nillable = true)
    protected ArrayOfLcQuotaApplyInfoV2 lcQuotaList;

    /**
     * 获取lcQuotaList属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfLcQuotaApplyInfoV2 }
     *     
     */
    public ArrayOfLcQuotaApplyInfoV2 getLcQuotaList() {
        return lcQuotaList;
    }

    /**
     * 设置lcQuotaList属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfLcQuotaApplyInfoV2 }
     *     
     */
    public void setLcQuotaList(ArrayOfLcQuotaApplyInfoV2 value) {
        this.lcQuotaList = value;
    }

}
