
package com.sinosure.exchange.edi.po;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ArrayOfNoLcQuotaApplyInfoV2 complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ArrayOfNoLcQuotaApplyInfoV2"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="NoLcQuotaApplyInfoV2" type="{http://po.edi.exchange.sinosure.com}NoLcQuotaApplyInfoV2" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfNoLcQuotaApplyInfoV2", propOrder = {
    "noLcQuotaApplyInfoV2"
})
public class ArrayOfNoLcQuotaApplyInfoV2 {

    @XmlElement(name = "NoLcQuotaApplyInfoV2", nillable = true)
    protected List<NoLcQuotaApplyInfoV2> noLcQuotaApplyInfoV2;

    /**
     * Gets the value of the noLcQuotaApplyInfoV2 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the noLcQuotaApplyInfoV2 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNoLcQuotaApplyInfoV2().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NoLcQuotaApplyInfoV2 }
     * 
     * 
     */
    public List<NoLcQuotaApplyInfoV2> getNoLcQuotaApplyInfoV2() {
        if (noLcQuotaApplyInfoV2 == null) {
            noLcQuotaApplyInfoV2 = new ArrayList<NoLcQuotaApplyInfoV2>();
        }
        return this.noLcQuotaApplyInfoV2;
    }

}
