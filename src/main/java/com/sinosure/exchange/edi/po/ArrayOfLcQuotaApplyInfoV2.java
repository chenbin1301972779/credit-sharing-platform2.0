
package com.sinosure.exchange.edi.po;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ArrayOfLcQuotaApplyInfoV2 complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ArrayOfLcQuotaApplyInfoV2"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="LcQuotaApplyInfoV2" type="{http://po.edi.exchange.sinosure.com}LcQuotaApplyInfoV2" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfLcQuotaApplyInfoV2", propOrder = {
    "lcQuotaApplyInfoV2"
})
public class ArrayOfLcQuotaApplyInfoV2 {

    @XmlElement(name = "LcQuotaApplyInfoV2", nillable = true)
    protected List<LcQuotaApplyInfoV2> lcQuotaApplyInfoV2;

    /**
     * Gets the value of the lcQuotaApplyInfoV2 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the lcQuotaApplyInfoV2 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLcQuotaApplyInfoV2().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LcQuotaApplyInfoV2 }
     * 
     * 
     */
    public List<LcQuotaApplyInfoV2> getLcQuotaApplyInfoV2() {
        if (lcQuotaApplyInfoV2 == null) {
            lcQuotaApplyInfoV2 = new ArrayList<LcQuotaApplyInfoV2>();
        }
        return this.lcQuotaApplyInfoV2;
    }

}
