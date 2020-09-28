
package com.sinosure.exchange.edi.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.sinosure.exchange.edi.po.ArrayOfShipmentApplyInfo;


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
 *         &lt;element name="shipmentList" type="{http://po.edi.exchange.sinosure.com}ArrayOfShipmentApplyInfo"/&gt;
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
    "shipmentList"
})
@XmlRootElement(name = "doEdiShipmentApply")
public class DoEdiShipmentApply {

    @XmlElement(required = true, nillable = true)
    protected ArrayOfShipmentApplyInfo shipmentList;

    /**
     * 获取shipmentList属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfShipmentApplyInfo }
     *     
     */
    public ArrayOfShipmentApplyInfo getShipmentList() {
        return shipmentList;
    }

    /**
     * 设置shipmentList属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfShipmentApplyInfo }
     *     
     */
    public void setShipmentList(ArrayOfShipmentApplyInfo value) {
        this.shipmentList = value;
    }

}
