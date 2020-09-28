
package com.sinosure.exchange.edi.po;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ArrayOfEdiRateInfoDetail complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ArrayOfEdiRateInfoDetail"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="EdiRateInfoDetail" type="{http://po.edi.exchange.sinosure.com}EdiRateInfoDetail" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfEdiRateInfoDetail", propOrder = {
    "ediRateInfoDetail"
})
public class ArrayOfEdiRateInfoDetail {

    @XmlElement(name = "EdiRateInfoDetail", nillable = true)
    protected List<EdiRateInfoDetail> ediRateInfoDetail;

    /**
     * Gets the value of the ediRateInfoDetail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ediRateInfoDetail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEdiRateInfoDetail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EdiRateInfoDetail }
     * 
     * 
     */
    public List<EdiRateInfoDetail> getEdiRateInfoDetail() {
        if (ediRateInfoDetail == null) {
            ediRateInfoDetail = new ArrayList<EdiRateInfoDetail>();
        }
        return this.ediRateInfoDetail;
    }

}
