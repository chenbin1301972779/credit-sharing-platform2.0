
package com.sinosure.exchange.edi.po;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ArrayOfDomDeclareApproveInfo complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ArrayOfDomDeclareApproveInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DomDeclareApproveInfo" type="{http://po.edi.exchange.sinosure.com}DomDeclareApproveInfo" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDomDeclareApproveInfo", propOrder = {
    "domDeclareApproveInfo"
})
public class ArrayOfDomDeclareApproveInfo {

    @XmlElement(name = "DomDeclareApproveInfo", nillable = true)
    protected List<DomDeclareApproveInfo> domDeclareApproveInfo;

    /**
     * Gets the value of the domDeclareApproveInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the domDeclareApproveInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDomDeclareApproveInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DomDeclareApproveInfo }
     * 
     * 
     */
    public List<DomDeclareApproveInfo> getDomDeclareApproveInfo() {
        if (domDeclareApproveInfo == null) {
            domDeclareApproveInfo = new ArrayList<DomDeclareApproveInfo>();
        }
        return this.domDeclareApproveInfo;
    }

}
