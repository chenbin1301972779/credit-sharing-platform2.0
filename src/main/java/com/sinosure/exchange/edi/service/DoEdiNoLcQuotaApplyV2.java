
package com.sinosure.exchange.edi.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.sinosure.exchange.edi.po.ArrayOfNoLcQuotaApplyInfoV2;


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
 *         &lt;element name="noLcQuotaList" type="{http://po.edi.exchange.sinosure.com}ArrayOfNoLcQuotaApplyInfoV2"/&gt;
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
    "noLcQuotaList"
})
@XmlRootElement(name = "doEdiNoLcQuotaApplyV2")
public class DoEdiNoLcQuotaApplyV2 {

    @XmlElement(required = true, nillable = true)
    protected ArrayOfNoLcQuotaApplyInfoV2 noLcQuotaList;

    /**
     * 获取noLcQuotaList属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfNoLcQuotaApplyInfoV2 }
     *     
     */
    public ArrayOfNoLcQuotaApplyInfoV2 getNoLcQuotaList() {
        return noLcQuotaList;
    }

    /**
     * 设置noLcQuotaList属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfNoLcQuotaApplyInfoV2 }
     *     
     */
    public void setNoLcQuotaList(ArrayOfNoLcQuotaApplyInfoV2 value) {
        this.noLcQuotaList = value;
    }

}
