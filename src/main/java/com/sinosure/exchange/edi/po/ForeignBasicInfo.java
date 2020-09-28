
package com.sinosure.exchange.edi.po;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ForeignBasicInfo complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ForeignBasicInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="branchEmployeeNum" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="branchNumber" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="dateFounded" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="dateRegistered" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="educationCEO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="employeeNum" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="initialCapital" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="initialCapitalUSD" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="legalForm" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="listedFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nationalityCEO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="operationStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="paidUpCapital" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="paidUpCapitalUSD" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="parent" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="parentId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="registerCapital" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="registerCapitalUSD" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="tockExchange" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="uParentId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ultimateParent" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="yearInBizCEO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ForeignBasicInfo", propOrder = {
    "branchEmployeeNum",
    "branchNumber",
    "dateFounded",
    "dateRegistered",
    "educationCEO",
    "employeeNum",
    "initialCapital",
    "initialCapitalUSD",
    "legalForm",
    "listedFlag",
    "nationalityCEO",
    "operationStatus",
    "paidUpCapital",
    "paidUpCapitalUSD",
    "parent",
    "parentId",
    "registerCapital",
    "registerCapitalUSD",
    "tockExchange",
    "uParentId",
    "ultimateParent",
    "yearInBizCEO"
})
public class ForeignBasicInfo {

    @XmlElementRef(name = "branchEmployeeNum", namespace = "http://po.edi.exchange.sinosure.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> branchEmployeeNum;
    @XmlElementRef(name = "branchNumber", namespace = "http://po.edi.exchange.sinosure.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> branchNumber;
    @XmlElementRef(name = "dateFounded", namespace = "http://po.edi.exchange.sinosure.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> dateFounded;
    @XmlElementRef(name = "dateRegistered", namespace = "http://po.edi.exchange.sinosure.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> dateRegistered;
    @XmlElementRef(name = "educationCEO", namespace = "http://po.edi.exchange.sinosure.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> educationCEO;
    @XmlElementRef(name = "employeeNum", namespace = "http://po.edi.exchange.sinosure.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> employeeNum;
    @XmlElementRef(name = "initialCapital", namespace = "http://po.edi.exchange.sinosure.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> initialCapital;
    @XmlElementRef(name = "initialCapitalUSD", namespace = "http://po.edi.exchange.sinosure.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> initialCapitalUSD;
    @XmlElementRef(name = "legalForm", namespace = "http://po.edi.exchange.sinosure.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> legalForm;
    @XmlElementRef(name = "listedFlag", namespace = "http://po.edi.exchange.sinosure.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> listedFlag;
    @XmlElementRef(name = "nationalityCEO", namespace = "http://po.edi.exchange.sinosure.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> nationalityCEO;
    @XmlElementRef(name = "operationStatus", namespace = "http://po.edi.exchange.sinosure.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> operationStatus;
    @XmlElementRef(name = "paidUpCapital", namespace = "http://po.edi.exchange.sinosure.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> paidUpCapital;
    @XmlElementRef(name = "paidUpCapitalUSD", namespace = "http://po.edi.exchange.sinosure.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> paidUpCapitalUSD;
    @XmlElementRef(name = "parent", namespace = "http://po.edi.exchange.sinosure.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> parent;
    @XmlElementRef(name = "parentId", namespace = "http://po.edi.exchange.sinosure.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> parentId;
    @XmlElementRef(name = "registerCapital", namespace = "http://po.edi.exchange.sinosure.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> registerCapital;
    @XmlElementRef(name = "registerCapitalUSD", namespace = "http://po.edi.exchange.sinosure.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> registerCapitalUSD;
    @XmlElementRef(name = "tockExchange", namespace = "http://po.edi.exchange.sinosure.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> tockExchange;
    @XmlElementRef(name = "uParentId", namespace = "http://po.edi.exchange.sinosure.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> uParentId;
    @XmlElementRef(name = "ultimateParent", namespace = "http://po.edi.exchange.sinosure.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> ultimateParent;
    @XmlElementRef(name = "yearInBizCEO", namespace = "http://po.edi.exchange.sinosure.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> yearInBizCEO;

    /**
     * 获取branchEmployeeNum属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getBranchEmployeeNum() {
        return branchEmployeeNum;
    }

    /**
     * 设置branchEmployeeNum属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setBranchEmployeeNum(JAXBElement<Double> value) {
        this.branchEmployeeNum = value;
    }

    /**
     * 获取branchNumber属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getBranchNumber() {
        return branchNumber;
    }

    /**
     * 设置branchNumber属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setBranchNumber(JAXBElement<Double> value) {
        this.branchNumber = value;
    }

    /**
     * 获取dateFounded属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDateFounded() {
        return dateFounded;
    }

    /**
     * 设置dateFounded属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDateFounded(JAXBElement<String> value) {
        this.dateFounded = value;
    }

    /**
     * 获取dateRegistered属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDateRegistered() {
        return dateRegistered;
    }

    /**
     * 设置dateRegistered属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDateRegistered(JAXBElement<String> value) {
        this.dateRegistered = value;
    }

    /**
     * 获取educationCEO属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEducationCEO() {
        return educationCEO;
    }

    /**
     * 设置educationCEO属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEducationCEO(JAXBElement<String> value) {
        this.educationCEO = value;
    }

    /**
     * 获取employeeNum属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getEmployeeNum() {
        return employeeNum;
    }

    /**
     * 设置employeeNum属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setEmployeeNum(JAXBElement<Double> value) {
        this.employeeNum = value;
    }

    /**
     * 获取initialCapital属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getInitialCapital() {
        return initialCapital;
    }

    /**
     * 设置initialCapital属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setInitialCapital(JAXBElement<String> value) {
        this.initialCapital = value;
    }

    /**
     * 获取initialCapitalUSD属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getInitialCapitalUSD() {
        return initialCapitalUSD;
    }

    /**
     * 设置initialCapitalUSD属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setInitialCapitalUSD(JAXBElement<Double> value) {
        this.initialCapitalUSD = value;
    }

    /**
     * 获取legalForm属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLegalForm() {
        return legalForm;
    }

    /**
     * 设置legalForm属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLegalForm(JAXBElement<String> value) {
        this.legalForm = value;
    }

    /**
     * 获取listedFlag属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getListedFlag() {
        return listedFlag;
    }

    /**
     * 设置listedFlag属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setListedFlag(JAXBElement<String> value) {
        this.listedFlag = value;
    }

    /**
     * 获取nationalityCEO属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNationalityCEO() {
        return nationalityCEO;
    }

    /**
     * 设置nationalityCEO属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNationalityCEO(JAXBElement<String> value) {
        this.nationalityCEO = value;
    }

    /**
     * 获取operationStatus属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOperationStatus() {
        return operationStatus;
    }

    /**
     * 设置operationStatus属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOperationStatus(JAXBElement<String> value) {
        this.operationStatus = value;
    }

    /**
     * 获取paidUpCapital属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getPaidUpCapital() {
        return paidUpCapital;
    }

    /**
     * 设置paidUpCapital属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setPaidUpCapital(JAXBElement<Double> value) {
        this.paidUpCapital = value;
    }

    /**
     * 获取paidUpCapitalUSD属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getPaidUpCapitalUSD() {
        return paidUpCapitalUSD;
    }

    /**
     * 设置paidUpCapitalUSD属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setPaidUpCapitalUSD(JAXBElement<Double> value) {
        this.paidUpCapitalUSD = value;
    }

    /**
     * 获取parent属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getParent() {
        return parent;
    }

    /**
     * 设置parent属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setParent(JAXBElement<String> value) {
        this.parent = value;
    }

    /**
     * 获取parentId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getParentId() {
        return parentId;
    }

    /**
     * 设置parentId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setParentId(JAXBElement<String> value) {
        this.parentId = value;
    }

    /**
     * 获取registerCapital属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getRegisterCapital() {
        return registerCapital;
    }

    /**
     * 设置registerCapital属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setRegisterCapital(JAXBElement<Double> value) {
        this.registerCapital = value;
    }

    /**
     * 获取registerCapitalUSD属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getRegisterCapitalUSD() {
        return registerCapitalUSD;
    }

    /**
     * 设置registerCapitalUSD属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setRegisterCapitalUSD(JAXBElement<Double> value) {
        this.registerCapitalUSD = value;
    }

    /**
     * 获取tockExchange属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTockExchange() {
        return tockExchange;
    }

    /**
     * 设置tockExchange属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTockExchange(JAXBElement<String> value) {
        this.tockExchange = value;
    }

    /**
     * 获取uParentId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUParentId() {
        return uParentId;
    }

    /**
     * 设置uParentId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUParentId(JAXBElement<String> value) {
        this.uParentId = value;
    }

    /**
     * 获取ultimateParent属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUltimateParent() {
        return ultimateParent;
    }

    /**
     * 设置ultimateParent属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUltimateParent(JAXBElement<String> value) {
        this.ultimateParent = value;
    }

    /**
     * 获取yearInBizCEO属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getYearInBizCEO() {
        return yearInBizCEO;
    }

    /**
     * 设置yearInBizCEO属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setYearInBizCEO(JAXBElement<String> value) {
        this.yearInBizCEO = value;
    }

}
