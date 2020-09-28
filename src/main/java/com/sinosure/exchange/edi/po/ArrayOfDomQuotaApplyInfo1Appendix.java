
package com.sinosure.exchange.edi.po;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ArrayOfDomQuotaApplyInfo1Appendix complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ArrayOfDomQuotaApplyInfo1Appendix"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DomQuotaApplyInfo1Appendix" type="{http://po.edi.exchange.sinosure.com}DomQuotaApplyInfo1Appendix" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDomQuotaApplyInfo1Appendix", propOrder = {
    "domQuotaApplyInfo1Appendix"
})
public class ArrayOfDomQuotaApplyInfo1Appendix {

    @XmlElement(name = "DomQuotaApplyInfo1Appendix", nillable = true)
    protected List<DomQuotaApplyInfo1Appendix> domQuotaApplyInfo1Appendix;

    /**
     * Gets the value of the domQuotaApplyInfo1Appendix property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the domQuotaApplyInfo1Appendix property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDomQuotaApplyInfo1Appendix().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DomQuotaApplyInfo1Appendix }
     * 
     * 
     */
    public List<DomQuotaApplyInfo1Appendix> getDomQuotaApplyInfo1Appendix() {
        if (domQuotaApplyInfo1Appendix == null) {
            domQuotaApplyInfo1Appendix = new ArrayList<DomQuotaApplyInfo1Appendix>();
        }
        return this.domQuotaApplyInfo1Appendix;
    }

}
