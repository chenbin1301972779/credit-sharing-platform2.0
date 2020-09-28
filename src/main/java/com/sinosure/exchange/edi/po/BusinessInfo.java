
package com.sinosure.exchange.edi.po;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>BusinessInfo complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="BusinessInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="brandType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="brands" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="businessType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="chinaSIC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="domesticPurchaseMode" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="domesticPurchaseRatio" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="domesticSaleMode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="exportMode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="foreignPurchaseRatio" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="holdingsType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="importAmount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="importMode" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="importUSD" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="location" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="mainSalesTerritory" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="numberOfCustomer" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="premiseSize" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="premiseValue" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="premiseValueUSD" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="primarySIC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="primarySICType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="productionCapacity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="products" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="purchasingArea" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="sizeUnit" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="totalExport" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="totalExportUSD" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="totalPurchase" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="totalPurchaseUSD" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="totalSales" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="totalSalesUSD" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="trendOfIndustry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BusinessInfo", propOrder = {
    "brandType",
    "brands",
    "businessType",
    "chinaSIC",
    "domesticPurchaseMode",
    "domesticPurchaseRatio",
    "domesticSaleMode",
    "exportMode",
    "foreignPurchaseRatio",
    "holdingsType",
    "importAmount",
    "importMode",
    "importUSD",
    "location",
    "mainSalesTerritory",
    "numberOfCustomer",
    "premiseSize",
    "premiseValue",
    "premiseValueUSD",
    "primarySIC",
    "primarySICType",
    "productionCapacity",
    "products",
    "purchasingArea",
    "sizeUnit",
    "totalExport",
    "totalExportUSD",
    "totalPurchase",
    "totalPurchaseUSD",
    "totalSales",
    "totalSalesUSD",
    "trendOfIndustry"
})
public class BusinessInfo {

    @XmlElementRef(name = "brandType", namespace = "http://po.edi.exchange.sinosure.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> brandType;
    @XmlElementRef(name = "brands", namespace = "http://po.edi.exchange.sinosure.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> brands;
    @XmlElementRef(name = "businessType", namespace = "http://po.edi.exchange.sinosure.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> businessType;
    @XmlElementRef(name = "chinaSIC", namespace = "http://po.edi.exchange.sinosure.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> chinaSIC;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar domesticPurchaseMode;
    @XmlElementRef(name = "domesticPurchaseRatio", namespace = "http://po.edi.exchange.sinosure.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> domesticPurchaseRatio;
    @XmlElementRef(name = "domesticSaleMode", namespace = "http://po.edi.exchange.sinosure.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> domesticSaleMode;
    @XmlElementRef(name = "exportMode", namespace = "http://po.edi.exchange.sinosure.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> exportMode;
    @XmlElementRef(name = "foreignPurchaseRatio", namespace = "http://po.edi.exchange.sinosure.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> foreignPurchaseRatio;
    @XmlElementRef(name = "holdingsType", namespace = "http://po.edi.exchange.sinosure.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> holdingsType;
    @XmlElementRef(name = "importAmount", namespace = "http://po.edi.exchange.sinosure.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> importAmount;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar importMode;
    @XmlElementRef(name = "importUSD", namespace = "http://po.edi.exchange.sinosure.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> importUSD;
    @XmlElementRef(name = "location", namespace = "http://po.edi.exchange.sinosure.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> location;
    @XmlElementRef(name = "mainSalesTerritory", namespace = "http://po.edi.exchange.sinosure.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mainSalesTerritory;
    @XmlElementRef(name = "numberOfCustomer", namespace = "http://po.edi.exchange.sinosure.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> numberOfCustomer;
    @XmlElementRef(name = "premiseSize", namespace = "http://po.edi.exchange.sinosure.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> premiseSize;
    @XmlElementRef(name = "premiseValue", namespace = "http://po.edi.exchange.sinosure.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> premiseValue;
    @XmlElementRef(name = "premiseValueUSD", namespace = "http://po.edi.exchange.sinosure.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> premiseValueUSD;
    @XmlElementRef(name = "primarySIC", namespace = "http://po.edi.exchange.sinosure.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> primarySIC;
    @XmlElementRef(name = "primarySICType", namespace = "http://po.edi.exchange.sinosure.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> primarySICType;
    @XmlElementRef(name = "productionCapacity", namespace = "http://po.edi.exchange.sinosure.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> productionCapacity;
    @XmlElementRef(name = "products", namespace = "http://po.edi.exchange.sinosure.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> products;
    @XmlElementRef(name = "purchasingArea", namespace = "http://po.edi.exchange.sinosure.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> purchasingArea;
    @XmlElementRef(name = "sizeUnit", namespace = "http://po.edi.exchange.sinosure.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> sizeUnit;
    @XmlElementRef(name = "totalExport", namespace = "http://po.edi.exchange.sinosure.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> totalExport;
    @XmlElementRef(name = "totalExportUSD", namespace = "http://po.edi.exchange.sinosure.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> totalExportUSD;
    @XmlElementRef(name = "totalPurchase", namespace = "http://po.edi.exchange.sinosure.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> totalPurchase;
    @XmlElementRef(name = "totalPurchaseUSD", namespace = "http://po.edi.exchange.sinosure.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> totalPurchaseUSD;
    @XmlElementRef(name = "totalSales", namespace = "http://po.edi.exchange.sinosure.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> totalSales;
    @XmlElementRef(name = "totalSalesUSD", namespace = "http://po.edi.exchange.sinosure.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> totalSalesUSD;
    @XmlElementRef(name = "trendOfIndustry", namespace = "http://po.edi.exchange.sinosure.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> trendOfIndustry;

    /**
     * 获取brandType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBrandType() {
        return brandType;
    }

    /**
     * 设置brandType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBrandType(JAXBElement<String> value) {
        this.brandType = value;
    }

    /**
     * 获取brands属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBrands() {
        return brands;
    }

    /**
     * 设置brands属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBrands(JAXBElement<String> value) {
        this.brands = value;
    }

    /**
     * 获取businessType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBusinessType() {
        return businessType;
    }

    /**
     * 设置businessType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBusinessType(JAXBElement<String> value) {
        this.businessType = value;
    }

    /**
     * 获取chinaSIC属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getChinaSIC() {
        return chinaSIC;
    }

    /**
     * 设置chinaSIC属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setChinaSIC(JAXBElement<String> value) {
        this.chinaSIC = value;
    }

    /**
     * 获取domesticPurchaseMode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDomesticPurchaseMode() {
        return domesticPurchaseMode;
    }

    /**
     * 设置domesticPurchaseMode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDomesticPurchaseMode(XMLGregorianCalendar value) {
        this.domesticPurchaseMode = value;
    }

    /**
     * 获取domesticPurchaseRatio属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getDomesticPurchaseRatio() {
        return domesticPurchaseRatio;
    }

    /**
     * 设置domesticPurchaseRatio属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setDomesticPurchaseRatio(JAXBElement<Double> value) {
        this.domesticPurchaseRatio = value;
    }

    /**
     * 获取domesticSaleMode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDomesticSaleMode() {
        return domesticSaleMode;
    }

    /**
     * 设置domesticSaleMode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDomesticSaleMode(JAXBElement<String> value) {
        this.domesticSaleMode = value;
    }

    /**
     * 获取exportMode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getExportMode() {
        return exportMode;
    }

    /**
     * 设置exportMode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setExportMode(JAXBElement<String> value) {
        this.exportMode = value;
    }

    /**
     * 获取foreignPurchaseRatio属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getForeignPurchaseRatio() {
        return foreignPurchaseRatio;
    }

    /**
     * 设置foreignPurchaseRatio属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setForeignPurchaseRatio(JAXBElement<Double> value) {
        this.foreignPurchaseRatio = value;
    }

    /**
     * 获取holdingsType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getHoldingsType() {
        return holdingsType;
    }

    /**
     * 设置holdingsType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setHoldingsType(JAXBElement<String> value) {
        this.holdingsType = value;
    }

    /**
     * 获取importAmount属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getImportAmount() {
        return importAmount;
    }

    /**
     * 设置importAmount属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setImportAmount(JAXBElement<Double> value) {
        this.importAmount = value;
    }

    /**
     * 获取importMode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getImportMode() {
        return importMode;
    }

    /**
     * 设置importMode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setImportMode(XMLGregorianCalendar value) {
        this.importMode = value;
    }

    /**
     * 获取importUSD属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getImportUSD() {
        return importUSD;
    }

    /**
     * 设置importUSD属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setImportUSD(JAXBElement<Double> value) {
        this.importUSD = value;
    }

    /**
     * 获取location属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLocation() {
        return location;
    }

    /**
     * 设置location属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLocation(JAXBElement<String> value) {
        this.location = value;
    }

    /**
     * 获取mainSalesTerritory属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMainSalesTerritory() {
        return mainSalesTerritory;
    }

    /**
     * 设置mainSalesTerritory属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMainSalesTerritory(JAXBElement<String> value) {
        this.mainSalesTerritory = value;
    }

    /**
     * 获取numberOfCustomer属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getNumberOfCustomer() {
        return numberOfCustomer;
    }

    /**
     * 设置numberOfCustomer属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setNumberOfCustomer(JAXBElement<Double> value) {
        this.numberOfCustomer = value;
    }

    /**
     * 获取premiseSize属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getPremiseSize() {
        return premiseSize;
    }

    /**
     * 设置premiseSize属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setPremiseSize(JAXBElement<Double> value) {
        this.premiseSize = value;
    }

    /**
     * 获取premiseValue属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getPremiseValue() {
        return premiseValue;
    }

    /**
     * 设置premiseValue属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setPremiseValue(JAXBElement<Double> value) {
        this.premiseValue = value;
    }

    /**
     * 获取premiseValueUSD属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getPremiseValueUSD() {
        return premiseValueUSD;
    }

    /**
     * 设置premiseValueUSD属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setPremiseValueUSD(JAXBElement<Double> value) {
        this.premiseValueUSD = value;
    }

    /**
     * 获取primarySIC属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPrimarySIC() {
        return primarySIC;
    }

    /**
     * 设置primarySIC属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPrimarySIC(JAXBElement<String> value) {
        this.primarySIC = value;
    }

    /**
     * 获取primarySICType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPrimarySICType() {
        return primarySICType;
    }

    /**
     * 设置primarySICType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPrimarySICType(JAXBElement<String> value) {
        this.primarySICType = value;
    }

    /**
     * 获取productionCapacity属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getProductionCapacity() {
        return productionCapacity;
    }

    /**
     * 设置productionCapacity属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setProductionCapacity(JAXBElement<String> value) {
        this.productionCapacity = value;
    }

    /**
     * 获取products属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getProducts() {
        return products;
    }

    /**
     * 设置products属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setProducts(JAXBElement<String> value) {
        this.products = value;
    }

    /**
     * 获取purchasingArea属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPurchasingArea() {
        return purchasingArea;
    }

    /**
     * 设置purchasingArea属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPurchasingArea(JAXBElement<String> value) {
        this.purchasingArea = value;
    }

    /**
     * 获取sizeUnit属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getSizeUnit() {
        return sizeUnit;
    }

    /**
     * 设置sizeUnit属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setSizeUnit(JAXBElement<Double> value) {
        this.sizeUnit = value;
    }

    /**
     * 获取totalExport属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getTotalExport() {
        return totalExport;
    }

    /**
     * 设置totalExport属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setTotalExport(JAXBElement<Double> value) {
        this.totalExport = value;
    }

    /**
     * 获取totalExportUSD属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getTotalExportUSD() {
        return totalExportUSD;
    }

    /**
     * 设置totalExportUSD属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setTotalExportUSD(JAXBElement<Double> value) {
        this.totalExportUSD = value;
    }

    /**
     * 获取totalPurchase属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getTotalPurchase() {
        return totalPurchase;
    }

    /**
     * 设置totalPurchase属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setTotalPurchase(JAXBElement<Double> value) {
        this.totalPurchase = value;
    }

    /**
     * 获取totalPurchaseUSD属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getTotalPurchaseUSD() {
        return totalPurchaseUSD;
    }

    /**
     * 设置totalPurchaseUSD属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setTotalPurchaseUSD(JAXBElement<Double> value) {
        this.totalPurchaseUSD = value;
    }

    /**
     * 获取totalSales属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getTotalSales() {
        return totalSales;
    }

    /**
     * 设置totalSales属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setTotalSales(JAXBElement<Double> value) {
        this.totalSales = value;
    }

    /**
     * 获取totalSalesUSD属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getTotalSalesUSD() {
        return totalSalesUSD;
    }

    /**
     * 设置totalSalesUSD属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setTotalSalesUSD(JAXBElement<Double> value) {
        this.totalSalesUSD = value;
    }

    /**
     * 获取trendOfIndustry属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTrendOfIndustry() {
        return trendOfIndustry;
    }

    /**
     * 设置trendOfIndustry属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTrendOfIndustry(JAXBElement<String> value) {
        this.trendOfIndustry = value;
    }

}
