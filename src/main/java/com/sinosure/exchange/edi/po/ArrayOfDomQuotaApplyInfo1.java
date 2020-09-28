
package com.sinosure.exchange.edi.po;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ArrayOfDomQuotaApplyInfo1 complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ArrayOfDomQuotaApplyInfo1"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DomQuotaApplyInfo1" type="{http://po.edi.exchange.sinosure.com}DomQuotaApplyInfo1" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDomQuotaApplyInfo1", propOrder = {
    "domQuotaApplyInfo1"
})
public class ArrayOfDomQuotaApplyInfo1 {

    @XmlElement(name = "DomQuotaApplyInfo1", nillable = true)
    protected List<DomQuotaApplyInfo1> domQuotaApplyInfo1;

    /**
     * Gets the value of the domQuotaApplyInfo1 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the domQuotaApplyInfo1 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDomQuotaApplyInfo1().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DomQuotaApplyInfo1 }
     * 
     * 
     */
    public List<DomQuotaApplyInfo1> getDomQuotaApplyInfo1() {
        if (domQuotaApplyInfo1 == null) {
            domQuotaApplyInfo1 = new ArrayList<DomQuotaApplyInfo1>();
        }
        return this.domQuotaApplyInfo1;
    }

}
