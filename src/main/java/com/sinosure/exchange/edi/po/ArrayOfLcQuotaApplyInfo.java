
package com.sinosure.exchange.edi.po;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ArrayOfLcQuotaApplyInfo complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ArrayOfLcQuotaApplyInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="LcQuotaApplyInfo" type="{http://po.edi.exchange.sinosure.com}LcQuotaApplyInfo" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfLcQuotaApplyInfo", propOrder = {
    "lcQuotaApplyInfo"
})
public class ArrayOfLcQuotaApplyInfo {

    @XmlElement(name = "LcQuotaApplyInfo", nillable = true)
    protected List<LcQuotaApplyInfo> lcQuotaApplyInfo;

    /**
     * Gets the value of the lcQuotaApplyInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the lcQuotaApplyInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLcQuotaApplyInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LcQuotaApplyInfo }
     * 
     * 
     */
    public List<LcQuotaApplyInfo> getLcQuotaApplyInfo() {
        if (lcQuotaApplyInfo == null) {
            lcQuotaApplyInfo = new ArrayList<LcQuotaApplyInfo>();
        }
        return this.lcQuotaApplyInfo;
    }

}
