
package com.sinosure.exchange.edi.po;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ArrayOfQuotaApplyBackInfo complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ArrayOfQuotaApplyBackInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="QuotaApplyBackInfo" type="{http://po.edi.exchange.sinosure.com}QuotaApplyBackInfo" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfQuotaApplyBackInfo", propOrder = {
    "quotaApplyBackInfo"
})
public class ArrayOfQuotaApplyBackInfo {

    @XmlElement(name = "QuotaApplyBackInfo", nillable = true)
    protected List<QuotaApplyBackInfo> quotaApplyBackInfo;

    /**
     * Gets the value of the quotaApplyBackInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the quotaApplyBackInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getQuotaApplyBackInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link QuotaApplyBackInfo }
     * 
     * 
     */
    public List<QuotaApplyBackInfo> getQuotaApplyBackInfo() {
        if (quotaApplyBackInfo == null) {
            quotaApplyBackInfo = new ArrayList<QuotaApplyBackInfo>();
        }
        return this.quotaApplyBackInfo;
    }

}
