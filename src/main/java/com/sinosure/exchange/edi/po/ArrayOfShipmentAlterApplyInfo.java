
package com.sinosure.exchange.edi.po;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ArrayOfShipmentAlterApplyInfo complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ArrayOfShipmentAlterApplyInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ShipmentAlterApplyInfo" type="{http://po.edi.exchange.sinosure.com}ShipmentAlterApplyInfo" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfShipmentAlterApplyInfo", propOrder = {
    "shipmentAlterApplyInfo"
})
public class ArrayOfShipmentAlterApplyInfo {

    @XmlElement(name = "ShipmentAlterApplyInfo", nillable = true)
    protected List<ShipmentAlterApplyInfo> shipmentAlterApplyInfo;

    /**
     * Gets the value of the shipmentAlterApplyInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the shipmentAlterApplyInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getShipmentAlterApplyInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ShipmentAlterApplyInfo }
     * 
     * 
     */
    public List<ShipmentAlterApplyInfo> getShipmentAlterApplyInfo() {
        if (shipmentAlterApplyInfo == null) {
            shipmentAlterApplyInfo = new ArrayList<ShipmentAlterApplyInfo>();
        }
        return this.shipmentAlterApplyInfo;
    }

}
