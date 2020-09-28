
package com.sinosure.exchange.edi.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.sinosure.exchange.edi.po.ArrayOfShipmentAlterApplyInfo;


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
 *         &lt;element name="shipmentAltList" type="{http://po.edi.exchange.sinosure.com}ArrayOfShipmentAlterApplyInfo"/&gt;
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
    "shipmentAltList"
})
@XmlRootElement(name = "doEdiShipmentAlterApply")
public class DoEdiShipmentAlterApply {

    @XmlElement(required = true, nillable = true)
    protected ArrayOfShipmentAlterApplyInfo shipmentAltList;

    /**
     * 获取shipmentAltList属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfShipmentAlterApplyInfo }
     *     
     */
    public ArrayOfShipmentAlterApplyInfo getShipmentAltList() {
        return shipmentAltList;
    }

    /**
     * 设置shipmentAltList属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfShipmentAlterApplyInfo }
     *     
     */
    public void setShipmentAltList(ArrayOfShipmentAlterApplyInfo value) {
        this.shipmentAltList = value;
    }

}
