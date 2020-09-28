
package com.sinosure.exchange.edi.po;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>FinanceInfo complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="FinanceInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="EBIT" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="EBITDAMargin" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="accountPayableTurnover" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="auditFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cFIvestment" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="cashAndEquivalent" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="cfFinancing" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="cfOperation" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="collectionPeriod" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="currency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="currentDebts" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="currentRatio" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="debtRatio" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="debutToEquity" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="financeDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="financeReportType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="financialExpenses" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="intangibleAssets" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="interestTimes" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="inventory" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="inventoryTurnover" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="inventoryTurnoverPeriod" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="marketValue" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="moneyUnit" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="netProfit" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="netProfitMargin" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="operatingProfit" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="payables" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="paymentPeriod" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="quickRatio" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="receivableTurnover" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="receivables" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="reportType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="retainedEaring" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="returnOnAssets" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="returnOnEquity" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="salesCost" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="salesRevenue" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="totalAssetTurnover" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="totalAssets" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="totalEquity" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="totalLiability" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="workingCapital" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FinanceInfo", propOrder = {
    "ebit",
    "ebitdaMargin",
    "accountPayableTurnover",
    "auditFlag",
    "cfIvestment",
    "cashAndEquivalent",
    "cfFinancing",
    "cfOperation",
    "collectionPeriod",
    "currency",
    "currentDebts",
    "currentRatio",
    "debtRatio",
    "debutToEquity",
    "financeDate",
    "financeReportType",
    "financialExpenses",
    "intangibleAssets",
    "interestTimes",
    "inventory",
    "inventoryTurnover",
    "inventoryTurnoverPeriod",
    "marketValue",
    "moneyUnit",
    "netProfit",
    "netProfitMargin",
    "operatingProfit",
    "payables",
    "paymentPeriod",
    "quickRatio",
    "receivableTurnover",
    "receivables",
    "reportType",
    "retainedEaring",
    "returnOnAssets",
    "returnOnEquity",
    "salesCost",
    "salesRevenue",
    "totalAssetTurnover",
    "totalAssets",
    "totalEquity",
    "totalLiability",
    "workingCapital"
})
public class FinanceInfo {

    @XmlElementRef(name = "EBIT", namespace = "http://po.edi.exchange.sinosure.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> ebit;
    @XmlElementRef(name = "EBITDAMargin", namespace = "http://po.edi.exchange.sinosure.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> ebitdaMargin;
    @XmlElementRef(name = "accountPayableTurnover", namespace = "http://po.edi.exchange.sinosure.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> accountPayableTurnover;
    @XmlElementRef(name = "auditFlag", namespace = "http://po.edi.exchange.sinosure.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> auditFlag;
    @XmlElementRef(name = "cFIvestment", namespace = "http://po.edi.exchange.sinosure.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> cfIvestment;
    @XmlElementRef(name = "cashAndEquivalent", namespace = "http://po.edi.exchange.sinosure.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> cashAndEquivalent;
    @XmlElementRef(name = "cfFinancing", namespace = "http://po.edi.exchange.sinosure.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> cfFinancing;
    @XmlElementRef(name = "cfOperation", namespace = "http://po.edi.exchange.sinosure.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> cfOperation;
    @XmlElementRef(name = "collectionPeriod", namespace = "http://po.edi.exchange.sinosure.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> collectionPeriod;
    @XmlElementRef(name = "currency", namespace = "http://po.edi.exchange.sinosure.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> currency;
    @XmlElementRef(name = "currentDebts", namespace = "http://po.edi.exchange.sinosure.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> currentDebts;
    @XmlElementRef(name = "currentRatio", namespace = "http://po.edi.exchange.sinosure.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> currentRatio;
    @XmlElementRef(name = "debtRatio", namespace = "http://po.edi.exchange.sinosure.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> debtRatio;
    @XmlElementRef(name = "debutToEquity", namespace = "http://po.edi.exchange.sinosure.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> debutToEquity;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar financeDate;
    @XmlElementRef(name = "financeReportType", namespace = "http://po.edi.exchange.sinosure.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> financeReportType;
    @XmlElementRef(name = "financialExpenses", namespace = "http://po.edi.exchange.sinosure.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> financialExpenses;
    @XmlElementRef(name = "intangibleAssets", namespace = "http://po.edi.exchange.sinosure.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> intangibleAssets;
    @XmlElementRef(name = "interestTimes", namespace = "http://po.edi.exchange.sinosure.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> interestTimes;
    @XmlElementRef(name = "inventory", namespace = "http://po.edi.exchange.sinosure.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> inventory;
    @XmlElementRef(name = "inventoryTurnover", namespace = "http://po.edi.exchange.sinosure.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> inventoryTurnover;
    @XmlElementRef(name = "inventoryTurnoverPeriod", namespace = "http://po.edi.exchange.sinosure.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> inventoryTurnoverPeriod;
    @XmlElementRef(name = "marketValue", namespace = "http://po.edi.exchange.sinosure.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> marketValue;
    @XmlElementRef(name = "moneyUnit", namespace = "http://po.edi.exchange.sinosure.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> moneyUnit;
    @XmlElementRef(name = "netProfit", namespace = "http://po.edi.exchange.sinosure.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> netProfit;
    @XmlElementRef(name = "netProfitMargin", namespace = "http://po.edi.exchange.sinosure.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> netProfitMargin;
    @XmlElementRef(name = "operatingProfit", namespace = "http://po.edi.exchange.sinosure.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> operatingProfit;
    @XmlElementRef(name = "payables", namespace = "http://po.edi.exchange.sinosure.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> payables;
    @XmlElementRef(name = "paymentPeriod", namespace = "http://po.edi.exchange.sinosure.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> paymentPeriod;
    @XmlElementRef(name = "quickRatio", namespace = "http://po.edi.exchange.sinosure.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> quickRatio;
    @XmlElementRef(name = "receivableTurnover", namespace = "http://po.edi.exchange.sinosure.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> receivableTurnover;
    @XmlElementRef(name = "receivables", namespace = "http://po.edi.exchange.sinosure.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> receivables;
    @XmlElementRef(name = "reportType", namespace = "http://po.edi.exchange.sinosure.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> reportType;
    @XmlElementRef(name = "retainedEaring", namespace = "http://po.edi.exchange.sinosure.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> retainedEaring;
    @XmlElementRef(name = "returnOnAssets", namespace = "http://po.edi.exchange.sinosure.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> returnOnAssets;
    @XmlElementRef(name = "returnOnEquity", namespace = "http://po.edi.exchange.sinosure.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> returnOnEquity;
    @XmlElementRef(name = "salesCost", namespace = "http://po.edi.exchange.sinosure.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> salesCost;
    @XmlElementRef(name = "salesRevenue", namespace = "http://po.edi.exchange.sinosure.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> salesRevenue;
    @XmlElementRef(name = "totalAssetTurnover", namespace = "http://po.edi.exchange.sinosure.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> totalAssetTurnover;
    @XmlElementRef(name = "totalAssets", namespace = "http://po.edi.exchange.sinosure.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> totalAssets;
    @XmlElementRef(name = "totalEquity", namespace = "http://po.edi.exchange.sinosure.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> totalEquity;
    @XmlElementRef(name = "totalLiability", namespace = "http://po.edi.exchange.sinosure.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> totalLiability;
    @XmlElementRef(name = "workingCapital", namespace = "http://po.edi.exchange.sinosure.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> workingCapital;

    /**
     * 获取ebit属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getEBIT() {
        return ebit;
    }

    /**
     * 设置ebit属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setEBIT(JAXBElement<Double> value) {
        this.ebit = value;
    }

    /**
     * 获取ebitdaMargin属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getEBITDAMargin() {
        return ebitdaMargin;
    }

    /**
     * 设置ebitdaMargin属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setEBITDAMargin(JAXBElement<Double> value) {
        this.ebitdaMargin = value;
    }

    /**
     * 获取accountPayableTurnover属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getAccountPayableTurnover() {
        return accountPayableTurnover;
    }

    /**
     * 设置accountPayableTurnover属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setAccountPayableTurnover(JAXBElement<Double> value) {
        this.accountPayableTurnover = value;
    }

    /**
     * 获取auditFlag属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAuditFlag() {
        return auditFlag;
    }

    /**
     * 设置auditFlag属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAuditFlag(JAXBElement<String> value) {
        this.auditFlag = value;
    }

    /**
     * 获取cfIvestment属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getCFIvestment() {
        return cfIvestment;
    }

    /**
     * 设置cfIvestment属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setCFIvestment(JAXBElement<Double> value) {
        this.cfIvestment = value;
    }

    /**
     * 获取cashAndEquivalent属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getCashAndEquivalent() {
        return cashAndEquivalent;
    }

    /**
     * 设置cashAndEquivalent属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setCashAndEquivalent(JAXBElement<Double> value) {
        this.cashAndEquivalent = value;
    }

    /**
     * 获取cfFinancing属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getCfFinancing() {
        return cfFinancing;
    }

    /**
     * 设置cfFinancing属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setCfFinancing(JAXBElement<Double> value) {
        this.cfFinancing = value;
    }

    /**
     * 获取cfOperation属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getCfOperation() {
        return cfOperation;
    }

    /**
     * 设置cfOperation属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setCfOperation(JAXBElement<Double> value) {
        this.cfOperation = value;
    }

    /**
     * 获取collectionPeriod属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getCollectionPeriod() {
        return collectionPeriod;
    }

    /**
     * 设置collectionPeriod属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setCollectionPeriod(JAXBElement<Double> value) {
        this.collectionPeriod = value;
    }

    /**
     * 获取currency属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCurrency() {
        return currency;
    }

    /**
     * 设置currency属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCurrency(JAXBElement<String> value) {
        this.currency = value;
    }

    /**
     * 获取currentDebts属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getCurrentDebts() {
        return currentDebts;
    }

    /**
     * 设置currentDebts属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setCurrentDebts(JAXBElement<Double> value) {
        this.currentDebts = value;
    }

    /**
     * 获取currentRatio属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getCurrentRatio() {
        return currentRatio;
    }

    /**
     * 设置currentRatio属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setCurrentRatio(JAXBElement<Double> value) {
        this.currentRatio = value;
    }

    /**
     * 获取debtRatio属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getDebtRatio() {
        return debtRatio;
    }

    /**
     * 设置debtRatio属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setDebtRatio(JAXBElement<Double> value) {
        this.debtRatio = value;
    }

    /**
     * 获取debutToEquity属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getDebutToEquity() {
        return debutToEquity;
    }

    /**
     * 设置debutToEquity属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setDebutToEquity(JAXBElement<Double> value) {
        this.debutToEquity = value;
    }

    /**
     * 获取financeDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFinanceDate() {
        return financeDate;
    }

    /**
     * 设置financeDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFinanceDate(XMLGregorianCalendar value) {
        this.financeDate = value;
    }

    /**
     * 获取financeReportType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFinanceReportType() {
        return financeReportType;
    }

    /**
     * 设置financeReportType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFinanceReportType(JAXBElement<String> value) {
        this.financeReportType = value;
    }

    /**
     * 获取financialExpenses属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getFinancialExpenses() {
        return financialExpenses;
    }

    /**
     * 设置financialExpenses属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setFinancialExpenses(JAXBElement<Double> value) {
        this.financialExpenses = value;
    }

    /**
     * 获取intangibleAssets属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getIntangibleAssets() {
        return intangibleAssets;
    }

    /**
     * 设置intangibleAssets属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setIntangibleAssets(JAXBElement<Double> value) {
        this.intangibleAssets = value;
    }

    /**
     * 获取interestTimes属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getInterestTimes() {
        return interestTimes;
    }

    /**
     * 设置interestTimes属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setInterestTimes(JAXBElement<Double> value) {
        this.interestTimes = value;
    }

    /**
     * 获取inventory属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getInventory() {
        return inventory;
    }

    /**
     * 设置inventory属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setInventory(JAXBElement<Double> value) {
        this.inventory = value;
    }

    /**
     * 获取inventoryTurnover属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getInventoryTurnover() {
        return inventoryTurnover;
    }

    /**
     * 设置inventoryTurnover属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setInventoryTurnover(JAXBElement<Double> value) {
        this.inventoryTurnover = value;
    }

    /**
     * 获取inventoryTurnoverPeriod属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getInventoryTurnoverPeriod() {
        return inventoryTurnoverPeriod;
    }

    /**
     * 设置inventoryTurnoverPeriod属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setInventoryTurnoverPeriod(JAXBElement<Double> value) {
        this.inventoryTurnoverPeriod = value;
    }

    /**
     * 获取marketValue属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getMarketValue() {
        return marketValue;
    }

    /**
     * 设置marketValue属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setMarketValue(JAXBElement<Double> value) {
        this.marketValue = value;
    }

    /**
     * 获取moneyUnit属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getMoneyUnit() {
        return moneyUnit;
    }

    /**
     * 设置moneyUnit属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setMoneyUnit(JAXBElement<Double> value) {
        this.moneyUnit = value;
    }

    /**
     * 获取netProfit属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getNetProfit() {
        return netProfit;
    }

    /**
     * 设置netProfit属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setNetProfit(JAXBElement<Double> value) {
        this.netProfit = value;
    }

    /**
     * 获取netProfitMargin属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getNetProfitMargin() {
        return netProfitMargin;
    }

    /**
     * 设置netProfitMargin属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setNetProfitMargin(JAXBElement<Double> value) {
        this.netProfitMargin = value;
    }

    /**
     * 获取operatingProfit属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getOperatingProfit() {
        return operatingProfit;
    }

    /**
     * 设置operatingProfit属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setOperatingProfit(JAXBElement<Double> value) {
        this.operatingProfit = value;
    }

    /**
     * 获取payables属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getPayables() {
        return payables;
    }

    /**
     * 设置payables属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setPayables(JAXBElement<Double> value) {
        this.payables = value;
    }

    /**
     * 获取paymentPeriod属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getPaymentPeriod() {
        return paymentPeriod;
    }

    /**
     * 设置paymentPeriod属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setPaymentPeriod(JAXBElement<Double> value) {
        this.paymentPeriod = value;
    }

    /**
     * 获取quickRatio属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getQuickRatio() {
        return quickRatio;
    }

    /**
     * 设置quickRatio属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setQuickRatio(JAXBElement<Double> value) {
        this.quickRatio = value;
    }

    /**
     * 获取receivableTurnover属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getReceivableTurnover() {
        return receivableTurnover;
    }

    /**
     * 设置receivableTurnover属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setReceivableTurnover(JAXBElement<Double> value) {
        this.receivableTurnover = value;
    }

    /**
     * 获取receivables属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getReceivables() {
        return receivables;
    }

    /**
     * 设置receivables属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setReceivables(JAXBElement<Double> value) {
        this.receivables = value;
    }

    /**
     * 获取reportType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getReportType() {
        return reportType;
    }

    /**
     * 设置reportType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setReportType(JAXBElement<String> value) {
        this.reportType = value;
    }

    /**
     * 获取retainedEaring属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getRetainedEaring() {
        return retainedEaring;
    }

    /**
     * 设置retainedEaring属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setRetainedEaring(JAXBElement<Double> value) {
        this.retainedEaring = value;
    }

    /**
     * 获取returnOnAssets属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getReturnOnAssets() {
        return returnOnAssets;
    }

    /**
     * 设置returnOnAssets属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setReturnOnAssets(JAXBElement<Double> value) {
        this.returnOnAssets = value;
    }

    /**
     * 获取returnOnEquity属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getReturnOnEquity() {
        return returnOnEquity;
    }

    /**
     * 设置returnOnEquity属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setReturnOnEquity(JAXBElement<Double> value) {
        this.returnOnEquity = value;
    }

    /**
     * 获取salesCost属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getSalesCost() {
        return salesCost;
    }

    /**
     * 设置salesCost属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setSalesCost(JAXBElement<Double> value) {
        this.salesCost = value;
    }

    /**
     * 获取salesRevenue属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getSalesRevenue() {
        return salesRevenue;
    }

    /**
     * 设置salesRevenue属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setSalesRevenue(JAXBElement<Double> value) {
        this.salesRevenue = value;
    }

    /**
     * 获取totalAssetTurnover属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getTotalAssetTurnover() {
        return totalAssetTurnover;
    }

    /**
     * 设置totalAssetTurnover属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setTotalAssetTurnover(JAXBElement<Double> value) {
        this.totalAssetTurnover = value;
    }

    /**
     * 获取totalAssets属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getTotalAssets() {
        return totalAssets;
    }

    /**
     * 设置totalAssets属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setTotalAssets(JAXBElement<Double> value) {
        this.totalAssets = value;
    }

    /**
     * 获取totalEquity属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getTotalEquity() {
        return totalEquity;
    }

    /**
     * 设置totalEquity属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setTotalEquity(JAXBElement<Double> value) {
        this.totalEquity = value;
    }

    /**
     * 获取totalLiability属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getTotalLiability() {
        return totalLiability;
    }

    /**
     * 设置totalLiability属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setTotalLiability(JAXBElement<Double> value) {
        this.totalLiability = value;
    }

    /**
     * 获取workingCapital属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getWorkingCapital() {
        return workingCapital;
    }

    /**
     * 设置workingCapital属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setWorkingCapital(JAXBElement<Double> value) {
        this.workingCapital = value;
    }

}
