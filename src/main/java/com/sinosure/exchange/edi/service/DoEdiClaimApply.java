
package com.sinosure.exchange.edi.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.sinosure.exchange.edi.po.ArrayOfClaimApply;


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
 *         &lt;element name="claimApplyList" type="{http://po.edi.exchange.sinosure.com}ArrayOfClaimApply"/&gt;
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
    "claimApplyList"
})
@XmlRootElement(name = "doEdiClaimApply")
public class DoEdiClaimApply {

    @XmlElement(required = true, nillable = true)
    protected ArrayOfClaimApply claimApplyList;

    /**
     * 获取claimApplyList属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfClaimApply }
     *     
     */
    public ArrayOfClaimApply getClaimApplyList() {
        return claimApplyList;
    }

    /**
     * 设置claimApplyList属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfClaimApply }
     *     
     */
    public void setClaimApplyList(ArrayOfClaimApply value) {
        this.claimApplyList = value;
    }

}
