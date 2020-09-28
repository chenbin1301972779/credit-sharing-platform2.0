
package com.sinosure.exchange.edi.po;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ArrayOfEdiPolicyInfoDetail complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ArrayOfEdiPolicyInfoDetail"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="EdiPolicyInfoDetail" type="{http://po.edi.exchange.sinosure.com}EdiPolicyInfoDetail" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfEdiPolicyInfoDetail", propOrder = {
    "ediPolicyInfoDetail"
})
public class ArrayOfEdiPolicyInfoDetail {

    @XmlElement(name = "EdiPolicyInfoDetail", nillable = true)
    protected List<EdiPolicyInfoDetail> ediPolicyInfoDetail;

    /**
     * Gets the value of the ediPolicyInfoDetail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ediPolicyInfoDetail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEdiPolicyInfoDetail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EdiPolicyInfoDetail }
     * 
     * 
     */
    public List<EdiPolicyInfoDetail> getEdiPolicyInfoDetail() {
        if (ediPolicyInfoDetail == null) {
            ediPolicyInfoDetail = new ArrayList<EdiPolicyInfoDetail>();
        }
        return this.ediPolicyInfoDetail;
    }

}
