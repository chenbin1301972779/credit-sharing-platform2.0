
package com.sinosure.exchange.edi.po;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ArrayOfDomPlnoticeApproveInfo complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ArrayOfDomPlnoticeApproveInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DomPlnoticeApproveInfo" type="{http://po.edi.exchange.sinosure.com}DomPlnoticeApproveInfo" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDomPlnoticeApproveInfo", propOrder = {
    "domPlnoticeApproveInfo"
})
public class ArrayOfDomPlnoticeApproveInfo {

    @XmlElement(name = "DomPlnoticeApproveInfo", nillable = true)
    protected List<DomPlnoticeApproveInfo> domPlnoticeApproveInfo;

    /**
     * Gets the value of the domPlnoticeApproveInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the domPlnoticeApproveInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDomPlnoticeApproveInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DomPlnoticeApproveInfo }
     * 
     * 
     */
    public List<DomPlnoticeApproveInfo> getDomPlnoticeApproveInfo() {
        if (domPlnoticeApproveInfo == null) {
            domPlnoticeApproveInfo = new ArrayList<DomPlnoticeApproveInfo>();
        }
        return this.domPlnoticeApproveInfo;
    }

}
