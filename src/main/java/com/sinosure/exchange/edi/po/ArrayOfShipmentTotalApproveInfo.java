
package com.sinosure.exchange.edi.po;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ArrayOfShipmentTotalApproveInfo complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ArrayOfShipmentTotalApproveInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ShipmentTotalApproveInfo" type="{http://po.edi.exchange.sinosure.com}ShipmentTotalApproveInfo" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfShipmentTotalApproveInfo", propOrder = {
    "shipmentTotalApproveInfo"
})
public class ArrayOfShipmentTotalApproveInfo {

    @XmlElement(name = "ShipmentTotalApproveInfo", nillable = true)
    protected List<ShipmentTotalApproveInfo> shipmentTotalApproveInfo;

    /**
     * Gets the value of the shipmentTotalApproveInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the shipmentTotalApproveInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getShipmentTotalApproveInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ShipmentTotalApproveInfo }
     * 
     * 
     */
    public List<ShipmentTotalApproveInfo> getShipmentTotalApproveInfo() {
        if (shipmentTotalApproveInfo == null) {
            shipmentTotalApproveInfo = new ArrayList<ShipmentTotalApproveInfo>();
        }
        return this.shipmentTotalApproveInfo;
    }

}
