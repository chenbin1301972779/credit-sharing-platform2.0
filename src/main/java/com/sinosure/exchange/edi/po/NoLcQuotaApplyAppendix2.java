
package com.sinosure.exchange.edi.po;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>NoLcQuotaApplyAppendix2 complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="NoLcQuotaApplyAppendix2"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="corpSerialNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ifAgree" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ifConflict" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="item1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="item2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="item3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="item4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="item5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="lastGoodsName1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="lastGoodsName2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="lastGoodsName3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="lastNoReceiveSum1" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="lastNoReceiveSum2" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="lastNoReceiveSum3" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="lastPayMode1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="lastPayMode2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="lastPayMode3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="lastReceiveSum1" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="lastReceiveSum2" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="lastReceiveSum3" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="lastSum1" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="lastSum2" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="lastSum3" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="lastUnreceiveSum1" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="lastUnreceiveSum2" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="lastYear1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="lastYear2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="lastYear3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="mainReason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="otherExplain" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="riskControl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="solution" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="thisBillGoodsName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="thisBillPayMode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="thisBillSum" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="thisBillTopSingleSum" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="thisBillTransportDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="thisBillTransportNum" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="thisYearTradeSum" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="tradeBackGround" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="unReceiveReason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NoLcQuotaApplyAppendix2", propOrder = {
    "corpSerialNo",
    "ifAgree",
    "ifConflict",
    "item1",
    "item2",
    "item3",
    "item4",
    "item5",
    "lastGoodsName1",
    "lastGoodsName2",
    "lastGoodsName3",
    "lastNoReceiveSum1",
    "lastNoReceiveSum2",
    "lastNoReceiveSum3",
    "lastPayMode1",
    "lastPayMode2",
    "lastPayMode3",
    "lastReceiveSum1",
    "lastReceiveSum2",
    "lastReceiveSum3",
    "lastSum1",
    "lastSum2",
    "lastSum3",
    "lastUnreceiveSum1",
    "lastUnreceiveSum2",
    "lastYear1",
    "lastYear2",
    "lastYear3",
    "mainReason",
    "otherExplain",
    "riskControl",
    "solution",
    "thisBillGoodsName",
    "thisBillPayMode",
    "thisBillSum",
    "thisBillTopSingleSum",
    "thisBillTransportDate",
    "thisBillTransportNum",
    "thisYearTradeSum",
    "tradeBackGround",
    "unReceiveReason"
})
public class NoLcQuotaApplyAppendix2 {

    @XmlElementRef(name = "corpSerialNo", namespace = "http://po.edi.exchange.sinosure.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> corpSerialNo;
    @XmlElementRef(name = "ifAgree", namespace = "http://po.edi.exchange.sinosure.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> ifAgree;
    @XmlElementRef(name = "ifConflict", namespace = "http://po.edi.exchange.sinosure.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> ifConflict;
    @XmlElementRef(name = "item1", namespace = "http://po.edi.exchange.sinosure.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> item1;
    @XmlElementRef(name = "item2", namespace = "http://po.edi.exchange.sinosure.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> item2;
    @XmlElementRef(name = "item3", namespace = "http://po.edi.exchange.sinosure.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> item3;
    @XmlElementRef(name = "item4", namespace = "http://po.edi.exchange.sinosure.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> item4;
    @XmlElementRef(name = "item5", namespace = "http://po.edi.exchange.sinosure.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> item5;
    @XmlElementRef(name = "lastGoodsName1", namespace = "http://po.edi.exchange.sinosure.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> lastGoodsName1;
    @XmlElementRef(name = "lastGoodsName2", namespace = "http://po.edi.exchange.sinosure.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> lastGoodsName2;
    @XmlElementRef(name = "lastGoodsName3", namespace = "http://po.edi.exchange.sinosure.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> lastGoodsName3;
    @XmlElementRef(name = "lastNoReceiveSum1", namespace = "http://po.edi.exchange.sinosure.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> lastNoReceiveSum1;
    @XmlElementRef(name = "lastNoReceiveSum2", namespace = "http://po.edi.exchange.sinosure.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> lastNoReceiveSum2;
    @XmlElementRef(name = "lastNoReceiveSum3", namespace = "http://po.edi.exchange.sinosure.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> lastNoReceiveSum3;
    @XmlElementRef(name = "lastPayMode1", namespace = "http://po.edi.exchange.sinosure.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> lastPayMode1;
    @XmlElementRef(name = "lastPayMode2", namespace = "http://po.edi.exchange.sinosure.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> lastPayMode2;
    @XmlElementRef(name = "lastPayMode3", namespace = "http://po.edi.exchange.sinosure.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> lastPayMode3;
    @XmlElementRef(name = "lastReceiveSum1", namespace = "http://po.edi.exchange.sinosure.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> lastReceiveSum1;
    @XmlElementRef(name = "lastReceiveSum2", namespace = "http://po.edi.exchange.sinosure.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> lastReceiveSum2;
    @XmlElementRef(name = "lastReceiveSum3", namespace = "http://po.edi.exchange.sinosure.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> lastReceiveSum3;
    @XmlElementRef(name = "lastSum1", namespace = "http://po.edi.exchange.sinosure.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> lastSum1;
    @XmlElementRef(name = "lastSum2", namespace = "http://po.edi.exchange.sinosure.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> lastSum2;
    @XmlElementRef(name = "lastSum3", namespace = "http://po.edi.exchange.sinosure.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> lastSum3;
    @XmlElementRef(name = "lastUnreceiveSum1", namespace = "http://po.edi.exchange.sinosure.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> lastUnreceiveSum1;
    @XmlElementRef(name = "lastUnreceiveSum2", namespace = "http://po.edi.exchange.sinosure.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> lastUnreceiveSum2;
    @XmlElementRef(name = "lastYear1", namespace = "http://po.edi.exchange.sinosure.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> lastYear1;
    @XmlElementRef(name = "lastYear2", namespace = "http://po.edi.exchange.sinosure.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> lastYear2;
    @XmlElementRef(name = "lastYear3", namespace = "http://po.edi.exchange.sinosure.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> lastYear3;
    @XmlElementRef(name = "mainReason", namespace = "http://po.edi.exchange.sinosure.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mainReason;
    @XmlElementRef(name = "otherExplain", namespace = "http://po.edi.exchange.sinosure.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> otherExplain;
    @XmlElementRef(name = "riskControl", namespace = "http://po.edi.exchange.sinosure.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> riskControl;
    @XmlElementRef(name = "solution", namespace = "http://po.edi.exchange.sinosure.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> solution;
    @XmlElementRef(name = "thisBillGoodsName", namespace = "http://po.edi.exchange.sinosure.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> thisBillGoodsName;
    @XmlElementRef(name = "thisBillPayMode", namespace = "http://po.edi.exchange.sinosure.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> thisBillPayMode;
    @XmlElementRef(name = "thisBillSum", namespace = "http://po.edi.exchange.sinosure.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> thisBillSum;
    @XmlElementRef(name = "thisBillTopSingleSum", namespace = "http://po.edi.exchange.sinosure.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> thisBillTopSingleSum;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar thisBillTransportDate;
    @XmlElementRef(name = "thisBillTransportNum", namespace = "http://po.edi.exchange.sinosure.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> thisBillTransportNum;
    @XmlElementRef(name = "thisYearTradeSum", namespace = "http://po.edi.exchange.sinosure.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> thisYearTradeSum;
    @XmlElementRef(name = "tradeBackGround", namespace = "http://po.edi.exchange.sinosure.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> tradeBackGround;
    @XmlElementRef(name = "unReceiveReason", namespace = "http://po.edi.exchange.sinosure.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> unReceiveReason;

    /**
     * 获取corpSerialNo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCorpSerialNo() {
        return corpSerialNo;
    }

    /**
     * 设置corpSerialNo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCorpSerialNo(JAXBElement<String> value) {
        this.corpSerialNo = value;
    }

    /**
     * 获取ifAgree属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIfAgree() {
        return ifAgree;
    }

    /**
     * 设置ifAgree属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIfAgree(JAXBElement<String> value) {
        this.ifAgree = value;
    }

    /**
     * 获取ifConflict属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIfConflict() {
        return ifConflict;
    }

    /**
     * 设置ifConflict属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIfConflict(JAXBElement<String> value) {
        this.ifConflict = value;
    }

    /**
     * 获取item1属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getItem1() {
        return item1;
    }

    /**
     * 设置item1属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setItem1(JAXBElement<String> value) {
        this.item1 = value;
    }

    /**
     * 获取item2属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getItem2() {
        return item2;
    }

    /**
     * 设置item2属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setItem2(JAXBElement<String> value) {
        this.item2 = value;
    }

    /**
     * 获取item3属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getItem3() {
        return item3;
    }

    /**
     * 设置item3属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setItem3(JAXBElement<String> value) {
        this.item3 = value;
    }

    /**
     * 获取item4属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getItem4() {
        return item4;
    }

    /**
     * 设置item4属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setItem4(JAXBElement<String> value) {
        this.item4 = value;
    }

    /**
     * 获取item5属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getItem5() {
        return item5;
    }

    /**
     * 设置item5属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setItem5(JAXBElement<String> value) {
        this.item5 = value;
    }

    /**
     * 获取lastGoodsName1属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLastGoodsName1() {
        return lastGoodsName1;
    }

    /**
     * 设置lastGoodsName1属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLastGoodsName1(JAXBElement<String> value) {
        this.lastGoodsName1 = value;
    }

    /**
     * 获取lastGoodsName2属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLastGoodsName2() {
        return lastGoodsName2;
    }

    /**
     * 设置lastGoodsName2属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLastGoodsName2(JAXBElement<String> value) {
        this.lastGoodsName2 = value;
    }

    /**
     * 获取lastGoodsName3属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLastGoodsName3() {
        return lastGoodsName3;
    }

    /**
     * 设置lastGoodsName3属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLastGoodsName3(JAXBElement<String> value) {
        this.lastGoodsName3 = value;
    }

    /**
     * 获取lastNoReceiveSum1属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getLastNoReceiveSum1() {
        return lastNoReceiveSum1;
    }

    /**
     * 设置lastNoReceiveSum1属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setLastNoReceiveSum1(JAXBElement<Double> value) {
        this.lastNoReceiveSum1 = value;
    }

    /**
     * 获取lastNoReceiveSum2属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getLastNoReceiveSum2() {
        return lastNoReceiveSum2;
    }

    /**
     * 设置lastNoReceiveSum2属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setLastNoReceiveSum2(JAXBElement<Double> value) {
        this.lastNoReceiveSum2 = value;
    }

    /**
     * 获取lastNoReceiveSum3属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getLastNoReceiveSum3() {
        return lastNoReceiveSum3;
    }

    /**
     * 设置lastNoReceiveSum3属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setLastNoReceiveSum3(JAXBElement<Double> value) {
        this.lastNoReceiveSum3 = value;
    }

    /**
     * 获取lastPayMode1属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLastPayMode1() {
        return lastPayMode1;
    }

    /**
     * 设置lastPayMode1属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLastPayMode1(JAXBElement<String> value) {
        this.lastPayMode1 = value;
    }

    /**
     * 获取lastPayMode2属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLastPayMode2() {
        return lastPayMode2;
    }

    /**
     * 设置lastPayMode2属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLastPayMode2(JAXBElement<String> value) {
        this.lastPayMode2 = value;
    }

    /**
     * 获取lastPayMode3属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLastPayMode3() {
        return lastPayMode3;
    }

    /**
     * 设置lastPayMode3属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLastPayMode3(JAXBElement<String> value) {
        this.lastPayMode3 = value;
    }

    /**
     * 获取lastReceiveSum1属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getLastReceiveSum1() {
        return lastReceiveSum1;
    }

    /**
     * 设置lastReceiveSum1属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setLastReceiveSum1(JAXBElement<Double> value) {
        this.lastReceiveSum1 = value;
    }

    /**
     * 获取lastReceiveSum2属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getLastReceiveSum2() {
        return lastReceiveSum2;
    }

    /**
     * 设置lastReceiveSum2属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setLastReceiveSum2(JAXBElement<Double> value) {
        this.lastReceiveSum2 = value;
    }

    /**
     * 获取lastReceiveSum3属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getLastReceiveSum3() {
        return lastReceiveSum3;
    }

    /**
     * 设置lastReceiveSum3属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setLastReceiveSum3(JAXBElement<Double> value) {
        this.lastReceiveSum3 = value;
    }

    /**
     * 获取lastSum1属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getLastSum1() {
        return lastSum1;
    }

    /**
     * 设置lastSum1属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setLastSum1(JAXBElement<Double> value) {
        this.lastSum1 = value;
    }

    /**
     * 获取lastSum2属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getLastSum2() {
        return lastSum2;
    }

    /**
     * 设置lastSum2属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setLastSum2(JAXBElement<Double> value) {
        this.lastSum2 = value;
    }

    /**
     * 获取lastSum3属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getLastSum3() {
        return lastSum3;
    }

    /**
     * 设置lastSum3属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setLastSum3(JAXBElement<Double> value) {
        this.lastSum3 = value;
    }

    /**
     * 获取lastUnreceiveSum1属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getLastUnreceiveSum1() {
        return lastUnreceiveSum1;
    }

    /**
     * 设置lastUnreceiveSum1属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setLastUnreceiveSum1(JAXBElement<Double> value) {
        this.lastUnreceiveSum1 = value;
    }

    /**
     * 获取lastUnreceiveSum2属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getLastUnreceiveSum2() {
        return lastUnreceiveSum2;
    }

    /**
     * 设置lastUnreceiveSum2属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setLastUnreceiveSum2(JAXBElement<Double> value) {
        this.lastUnreceiveSum2 = value;
    }

    /**
     * 获取lastYear1属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLastYear1() {
        return lastYear1;
    }

    /**
     * 设置lastYear1属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLastYear1(JAXBElement<String> value) {
        this.lastYear1 = value;
    }

    /**
     * 获取lastYear2属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLastYear2() {
        return lastYear2;
    }

    /**
     * 设置lastYear2属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLastYear2(JAXBElement<String> value) {
        this.lastYear2 = value;
    }

    /**
     * 获取lastYear3属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLastYear3() {
        return lastYear3;
    }

    /**
     * 设置lastYear3属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLastYear3(JAXBElement<String> value) {
        this.lastYear3 = value;
    }

    /**
     * 获取mainReason属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMainReason() {
        return mainReason;
    }

    /**
     * 设置mainReason属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMainReason(JAXBElement<String> value) {
        this.mainReason = value;
    }

    /**
     * 获取otherExplain属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOtherExplain() {
        return otherExplain;
    }

    /**
     * 设置otherExplain属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOtherExplain(JAXBElement<String> value) {
        this.otherExplain = value;
    }

    /**
     * 获取riskControl属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRiskControl() {
        return riskControl;
    }

    /**
     * 设置riskControl属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRiskControl(JAXBElement<String> value) {
        this.riskControl = value;
    }

    /**
     * 获取solution属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSolution() {
        return solution;
    }

    /**
     * 设置solution属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSolution(JAXBElement<String> value) {
        this.solution = value;
    }

    /**
     * 获取thisBillGoodsName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getThisBillGoodsName() {
        return thisBillGoodsName;
    }

    /**
     * 设置thisBillGoodsName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setThisBillGoodsName(JAXBElement<String> value) {
        this.thisBillGoodsName = value;
    }

    /**
     * 获取thisBillPayMode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getThisBillPayMode() {
        return thisBillPayMode;
    }

    /**
     * 设置thisBillPayMode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setThisBillPayMode(JAXBElement<String> value) {
        this.thisBillPayMode = value;
    }

    /**
     * 获取thisBillSum属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getThisBillSum() {
        return thisBillSum;
    }

    /**
     * 设置thisBillSum属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setThisBillSum(JAXBElement<Double> value) {
        this.thisBillSum = value;
    }

    /**
     * 获取thisBillTopSingleSum属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getThisBillTopSingleSum() {
        return thisBillTopSingleSum;
    }

    /**
     * 设置thisBillTopSingleSum属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setThisBillTopSingleSum(JAXBElement<Double> value) {
        this.thisBillTopSingleSum = value;
    }

    /**
     * 获取thisBillTransportDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getThisBillTransportDate() {
        return thisBillTransportDate;
    }

    /**
     * 设置thisBillTransportDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setThisBillTransportDate(XMLGregorianCalendar value) {
        this.thisBillTransportDate = value;
    }

    /**
     * 获取thisBillTransportNum属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getThisBillTransportNum() {
        return thisBillTransportNum;
    }

    /**
     * 设置thisBillTransportNum属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setThisBillTransportNum(JAXBElement<Long> value) {
        this.thisBillTransportNum = value;
    }

    /**
     * 获取thisYearTradeSum属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getThisYearTradeSum() {
        return thisYearTradeSum;
    }

    /**
     * 设置thisYearTradeSum属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setThisYearTradeSum(JAXBElement<Double> value) {
        this.thisYearTradeSum = value;
    }

    /**
     * 获取tradeBackGround属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTradeBackGround() {
        return tradeBackGround;
    }

    /**
     * 设置tradeBackGround属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTradeBackGround(JAXBElement<String> value) {
        this.tradeBackGround = value;
    }

    /**
     * 获取unReceiveReason属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUnReceiveReason() {
        return unReceiveReason;
    }

    /**
     * 设置unReceiveReason属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUnReceiveReason(JAXBElement<String> value) {
        this.unReceiveReason = value;
    }

}
