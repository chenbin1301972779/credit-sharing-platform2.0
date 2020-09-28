
package com.sinosure.exchange.edi.po;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>EntrustInput complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="EntrustInput"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="applicantName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="applicantemail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="applicanttel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="applydate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="clientNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="corpSerialNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="creditno" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="deleteflag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="expobjects" type="{http://po.edi.exchange.sinosure.com}ArrayOfEdiExpObject" minOccurs="0"/&gt;
 *         &lt;element name="goodsType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="iaddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="iaddressAtel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="iidentNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="invoicePro" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="invoiceTitle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="invoiceType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="iopenbank" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ipayerName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ipostcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="irecipient" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="irecipientnum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="isSchHis" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="istranslation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="item1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="item2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="item3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="item4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="item5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ivnaccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="logid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="orgaddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="organizationcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="orgchnName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="orgcontacts" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="orgcontactstel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="orgcountryCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="orgemail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="orgengName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="orgexpstartyear" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="orgfax" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="orgindustry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="orglegalrep" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="orglegalreptel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="orgnature" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="orgpostcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="orgregeditarea" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="orgregeditcity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="orgregeditemail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="orgregeditprovince" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="orgregnum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="orgregtype" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="orgscope" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="orgtel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="orgwebsite" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="platserialno" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="rclientno" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="remark" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="reportCorpChnName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="reportCorpCountryCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="reportCorpEngName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="reportCorpaddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="reportCorpcontacts" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="reportCorpemail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="reportCorpfax" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="reportCorptel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="reportbuyerNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="sendStyle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="speed" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EntrustInput", propOrder = {
    "applicantName",
    "applicantemail",
    "applicanttel",
    "applydate",
    "clientNo",
    "corpSerialNo",
    "creditno",
    "deleteflag",
    "expobjects",
    "goodsType",
    "iaddress",
    "iaddressAtel",
    "iidentNum",
    "invoicePro",
    "invoiceTitle",
    "invoiceType",
    "iopenbank",
    "ipayerName",
    "ipostcode",
    "irecipient",
    "irecipientnum",
    "isSchHis",
    "istranslation",
    "item1",
    "item2",
    "item3",
    "item4",
    "item5",
    "ivnaccount",
    "logid",
    "orgaddress",
    "organizationcode",
    "orgchnName",
    "orgcontacts",
    "orgcontactstel",
    "orgcountryCode",
    "orgemail",
    "orgengName",
    "orgexpstartyear",
    "orgfax",
    "orgindustry",
    "orglegalrep",
    "orglegalreptel",
    "orgnature",
    "orgpostcode",
    "orgregeditarea",
    "orgregeditcity",
    "orgregeditemail",
    "orgregeditprovince",
    "orgregnum",
    "orgregtype",
    "orgscope",
    "orgtel",
    "orgwebsite",
    "platserialno",
    "rclientno",
    "remark",
    "reportCorpChnName",
    "reportCorpCountryCode",
    "reportCorpEngName",
    "reportCorpaddress",
    "reportCorpcontacts",
    "reportCorpemail",
    "reportCorpfax",
    "reportCorptel",
    "reportbuyerNo",
    "sendStyle",
    "speed"
})
public class EntrustInput {

    @XmlElementRef(name = "applicantName", namespace = "http://po.edi.exchange.sinosure.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> applicantName;
    @XmlElementRef(name = "applicantemail", namespace = "http://po.edi.exchange.sinosure.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> applicantemail;
    @XmlElementRef(name = "applicanttel", namespace = "http://po.edi.exchange.sinosure.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> applicanttel;
    @XmlElementRef(name = "applydate", namespace = "http://po.edi.exchange.sinosure.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> applydate;
    @XmlElementRef(name = "clientNo", namespace = "http://po.edi.exchange.sinosure.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> clientNo;
    @XmlElementRef(name = "corpSerialNo", namespace = "http://po.edi.exchange.sinosure.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> corpSerialNo;
    @XmlElementRef(name = "creditno", namespace = "http://po.edi.exchange.sinosure.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> creditno;
    @XmlElementRef(name = "deleteflag", namespace = "http://po.edi.exchange.sinosure.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> deleteflag;
    @XmlElementRef(name = "expobjects", namespace = "http://po.edi.exchange.sinosure.com", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfEdiExpObject> expobjects;
    @XmlElementRef(name = "goodsType", namespace = "http://po.edi.exchange.sinosure.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> goodsType;
    @XmlElementRef(name = "iaddress", namespace = "http://po.edi.exchange.sinosure.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> iaddress;
    @XmlElementRef(name = "iaddressAtel", namespace = "http://po.edi.exchange.sinosure.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> iaddressAtel;
    @XmlElementRef(name = "iidentNum", namespace = "http://po.edi.exchange.sinosure.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> iidentNum;
    @XmlElementRef(name = "invoicePro", namespace = "http://po.edi.exchange.sinosure.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> invoicePro;
    @XmlElementRef(name = "invoiceTitle", namespace = "http://po.edi.exchange.sinosure.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> invoiceTitle;
    @XmlElementRef(name = "invoiceType", namespace = "http://po.edi.exchange.sinosure.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> invoiceType;
    @XmlElementRef(name = "iopenbank", namespace = "http://po.edi.exchange.sinosure.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> iopenbank;
    @XmlElementRef(name = "ipayerName", namespace = "http://po.edi.exchange.sinosure.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> ipayerName;
    @XmlElementRef(name = "ipostcode", namespace = "http://po.edi.exchange.sinosure.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> ipostcode;
    @XmlElementRef(name = "irecipient", namespace = "http://po.edi.exchange.sinosure.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> irecipient;
    @XmlElementRef(name = "irecipientnum", namespace = "http://po.edi.exchange.sinosure.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> irecipientnum;
    @XmlElementRef(name = "isSchHis", namespace = "http://po.edi.exchange.sinosure.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> isSchHis;
    @XmlElementRef(name = "istranslation", namespace = "http://po.edi.exchange.sinosure.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> istranslation;
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
    @XmlElementRef(name = "ivnaccount", namespace = "http://po.edi.exchange.sinosure.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> ivnaccount;
    @XmlElementRef(name = "logid", namespace = "http://po.edi.exchange.sinosure.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> logid;
    @XmlElementRef(name = "orgaddress", namespace = "http://po.edi.exchange.sinosure.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> orgaddress;
    @XmlElementRef(name = "organizationcode", namespace = "http://po.edi.exchange.sinosure.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> organizationcode;
    @XmlElementRef(name = "orgchnName", namespace = "http://po.edi.exchange.sinosure.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> orgchnName;
    @XmlElementRef(name = "orgcontacts", namespace = "http://po.edi.exchange.sinosure.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> orgcontacts;
    @XmlElementRef(name = "orgcontactstel", namespace = "http://po.edi.exchange.sinosure.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> orgcontactstel;
    @XmlElementRef(name = "orgcountryCode", namespace = "http://po.edi.exchange.sinosure.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> orgcountryCode;
    @XmlElementRef(name = "orgemail", namespace = "http://po.edi.exchange.sinosure.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> orgemail;
    @XmlElementRef(name = "orgengName", namespace = "http://po.edi.exchange.sinosure.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> orgengName;
    @XmlElementRef(name = "orgexpstartyear", namespace = "http://po.edi.exchange.sinosure.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> orgexpstartyear;
    @XmlElementRef(name = "orgfax", namespace = "http://po.edi.exchange.sinosure.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> orgfax;
    @XmlElementRef(name = "orgindustry", namespace = "http://po.edi.exchange.sinosure.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> orgindustry;
    @XmlElementRef(name = "orglegalrep", namespace = "http://po.edi.exchange.sinosure.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> orglegalrep;
    @XmlElementRef(name = "orglegalreptel", namespace = "http://po.edi.exchange.sinosure.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> orglegalreptel;
    @XmlElementRef(name = "orgnature", namespace = "http://po.edi.exchange.sinosure.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> orgnature;
    @XmlElementRef(name = "orgpostcode", namespace = "http://po.edi.exchange.sinosure.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> orgpostcode;
    @XmlElementRef(name = "orgregeditarea", namespace = "http://po.edi.exchange.sinosure.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> orgregeditarea;
    @XmlElementRef(name = "orgregeditcity", namespace = "http://po.edi.exchange.sinosure.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> orgregeditcity;
    @XmlElementRef(name = "orgregeditemail", namespace = "http://po.edi.exchange.sinosure.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> orgregeditemail;
    @XmlElementRef(name = "orgregeditprovince", namespace = "http://po.edi.exchange.sinosure.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> orgregeditprovince;
    @XmlElementRef(name = "orgregnum", namespace = "http://po.edi.exchange.sinosure.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> orgregnum;
    @XmlElementRef(name = "orgregtype", namespace = "http://po.edi.exchange.sinosure.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> orgregtype;
    @XmlElementRef(name = "orgscope", namespace = "http://po.edi.exchange.sinosure.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> orgscope;
    @XmlElementRef(name = "orgtel", namespace = "http://po.edi.exchange.sinosure.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> orgtel;
    @XmlElementRef(name = "orgwebsite", namespace = "http://po.edi.exchange.sinosure.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> orgwebsite;
    @XmlElementRef(name = "platserialno", namespace = "http://po.edi.exchange.sinosure.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> platserialno;
    @XmlElementRef(name = "rclientno", namespace = "http://po.edi.exchange.sinosure.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> rclientno;
    @XmlElementRef(name = "remark", namespace = "http://po.edi.exchange.sinosure.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> remark;
    @XmlElementRef(name = "reportCorpChnName", namespace = "http://po.edi.exchange.sinosure.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> reportCorpChnName;
    @XmlElementRef(name = "reportCorpCountryCode", namespace = "http://po.edi.exchange.sinosure.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> reportCorpCountryCode;
    @XmlElementRef(name = "reportCorpEngName", namespace = "http://po.edi.exchange.sinosure.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> reportCorpEngName;
    @XmlElementRef(name = "reportCorpaddress", namespace = "http://po.edi.exchange.sinosure.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> reportCorpaddress;
    @XmlElementRef(name = "reportCorpcontacts", namespace = "http://po.edi.exchange.sinosure.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> reportCorpcontacts;
    @XmlElementRef(name = "reportCorpemail", namespace = "http://po.edi.exchange.sinosure.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> reportCorpemail;
    @XmlElementRef(name = "reportCorpfax", namespace = "http://po.edi.exchange.sinosure.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> reportCorpfax;
    @XmlElementRef(name = "reportCorptel", namespace = "http://po.edi.exchange.sinosure.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> reportCorptel;
    @XmlElementRef(name = "reportbuyerNo", namespace = "http://po.edi.exchange.sinosure.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> reportbuyerNo;
    @XmlElementRef(name = "sendStyle", namespace = "http://po.edi.exchange.sinosure.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> sendStyle;
    @XmlElementRef(name = "speed", namespace = "http://po.edi.exchange.sinosure.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> speed;

    /**
     * 获取applicantName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getApplicantName() {
        return applicantName;
    }

    /**
     * 设置applicantName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setApplicantName(JAXBElement<String> value) {
        this.applicantName = value;
    }

    /**
     * 获取applicantemail属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getApplicantemail() {
        return applicantemail;
    }

    /**
     * 设置applicantemail属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setApplicantemail(JAXBElement<String> value) {
        this.applicantemail = value;
    }

    /**
     * 获取applicanttel属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getApplicanttel() {
        return applicanttel;
    }

    /**
     * 设置applicanttel属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setApplicanttel(JAXBElement<String> value) {
        this.applicanttel = value;
    }

    /**
     * 获取applydate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getApplydate() {
        return applydate;
    }

    /**
     * 设置applydate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setApplydate(JAXBElement<String> value) {
        this.applydate = value;
    }

    /**
     * 获取clientNo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getClientNo() {
        return clientNo;
    }

    /**
     * 设置clientNo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setClientNo(JAXBElement<String> value) {
        this.clientNo = value;
    }

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
     * 获取creditno属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCreditno() {
        return creditno;
    }

    /**
     * 设置creditno属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCreditno(JAXBElement<String> value) {
        this.creditno = value;
    }

    /**
     * 获取deleteflag属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDeleteflag() {
        return deleteflag;
    }

    /**
     * 设置deleteflag属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDeleteflag(JAXBElement<String> value) {
        this.deleteflag = value;
    }

    /**
     * 获取expobjects属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfEdiExpObject }{@code >}
     *     
     */
    public JAXBElement<ArrayOfEdiExpObject> getExpobjects() {
        return expobjects;
    }

    /**
     * 设置expobjects属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfEdiExpObject }{@code >}
     *     
     */
    public void setExpobjects(JAXBElement<ArrayOfEdiExpObject> value) {
        this.expobjects = value;
    }

    /**
     * 获取goodsType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getGoodsType() {
        return goodsType;
    }

    /**
     * 设置goodsType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setGoodsType(JAXBElement<String> value) {
        this.goodsType = value;
    }

    /**
     * 获取iaddress属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIaddress() {
        return iaddress;
    }

    /**
     * 设置iaddress属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIaddress(JAXBElement<String> value) {
        this.iaddress = value;
    }

    /**
     * 获取iaddressAtel属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIaddressAtel() {
        return iaddressAtel;
    }

    /**
     * 设置iaddressAtel属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIaddressAtel(JAXBElement<String> value) {
        this.iaddressAtel = value;
    }

    /**
     * 获取iidentNum属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIidentNum() {
        return iidentNum;
    }

    /**
     * 设置iidentNum属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIidentNum(JAXBElement<String> value) {
        this.iidentNum = value;
    }

    /**
     * 获取invoicePro属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getInvoicePro() {
        return invoicePro;
    }

    /**
     * 设置invoicePro属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setInvoicePro(JAXBElement<String> value) {
        this.invoicePro = value;
    }

    /**
     * 获取invoiceTitle属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getInvoiceTitle() {
        return invoiceTitle;
    }

    /**
     * 设置invoiceTitle属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setInvoiceTitle(JAXBElement<String> value) {
        this.invoiceTitle = value;
    }

    /**
     * 获取invoiceType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getInvoiceType() {
        return invoiceType;
    }

    /**
     * 设置invoiceType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setInvoiceType(JAXBElement<String> value) {
        this.invoiceType = value;
    }

    /**
     * 获取iopenbank属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIopenbank() {
        return iopenbank;
    }

    /**
     * 设置iopenbank属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIopenbank(JAXBElement<String> value) {
        this.iopenbank = value;
    }

    /**
     * 获取ipayerName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIpayerName() {
        return ipayerName;
    }

    /**
     * 设置ipayerName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIpayerName(JAXBElement<String> value) {
        this.ipayerName = value;
    }

    /**
     * 获取ipostcode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIpostcode() {
        return ipostcode;
    }

    /**
     * 设置ipostcode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIpostcode(JAXBElement<String> value) {
        this.ipostcode = value;
    }

    /**
     * 获取irecipient属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIrecipient() {
        return irecipient;
    }

    /**
     * 设置irecipient属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIrecipient(JAXBElement<String> value) {
        this.irecipient = value;
    }

    /**
     * 获取irecipientnum属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIrecipientnum() {
        return irecipientnum;
    }

    /**
     * 设置irecipientnum属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIrecipientnum(JAXBElement<String> value) {
        this.irecipientnum = value;
    }

    /**
     * 获取isSchHis属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIsSchHis() {
        return isSchHis;
    }

    /**
     * 设置isSchHis属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIsSchHis(JAXBElement<String> value) {
        this.isSchHis = value;
    }

    /**
     * 获取istranslation属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIstranslation() {
        return istranslation;
    }

    /**
     * 设置istranslation属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIstranslation(JAXBElement<String> value) {
        this.istranslation = value;
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
     * 获取ivnaccount属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIvnaccount() {
        return ivnaccount;
    }

    /**
     * 设置ivnaccount属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIvnaccount(JAXBElement<String> value) {
        this.ivnaccount = value;
    }

    /**
     * 获取logid属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLogid() {
        return logid;
    }

    /**
     * 设置logid属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLogid(JAXBElement<String> value) {
        this.logid = value;
    }

    /**
     * 获取orgaddress属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOrgaddress() {
        return orgaddress;
    }

    /**
     * 设置orgaddress属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOrgaddress(JAXBElement<String> value) {
        this.orgaddress = value;
    }

    /**
     * 获取organizationcode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOrganizationcode() {
        return organizationcode;
    }

    /**
     * 设置organizationcode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOrganizationcode(JAXBElement<String> value) {
        this.organizationcode = value;
    }

    /**
     * 获取orgchnName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOrgchnName() {
        return orgchnName;
    }

    /**
     * 设置orgchnName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOrgchnName(JAXBElement<String> value) {
        this.orgchnName = value;
    }

    /**
     * 获取orgcontacts属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOrgcontacts() {
        return orgcontacts;
    }

    /**
     * 设置orgcontacts属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOrgcontacts(JAXBElement<String> value) {
        this.orgcontacts = value;
    }

    /**
     * 获取orgcontactstel属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOrgcontactstel() {
        return orgcontactstel;
    }

    /**
     * 设置orgcontactstel属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOrgcontactstel(JAXBElement<String> value) {
        this.orgcontactstel = value;
    }

    /**
     * 获取orgcountryCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOrgcountryCode() {
        return orgcountryCode;
    }

    /**
     * 设置orgcountryCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOrgcountryCode(JAXBElement<String> value) {
        this.orgcountryCode = value;
    }

    /**
     * 获取orgemail属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOrgemail() {
        return orgemail;
    }

    /**
     * 设置orgemail属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOrgemail(JAXBElement<String> value) {
        this.orgemail = value;
    }

    /**
     * 获取orgengName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOrgengName() {
        return orgengName;
    }

    /**
     * 设置orgengName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOrgengName(JAXBElement<String> value) {
        this.orgengName = value;
    }

    /**
     * 获取orgexpstartyear属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOrgexpstartyear() {
        return orgexpstartyear;
    }

    /**
     * 设置orgexpstartyear属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOrgexpstartyear(JAXBElement<String> value) {
        this.orgexpstartyear = value;
    }

    /**
     * 获取orgfax属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOrgfax() {
        return orgfax;
    }

    /**
     * 设置orgfax属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOrgfax(JAXBElement<String> value) {
        this.orgfax = value;
    }

    /**
     * 获取orgindustry属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOrgindustry() {
        return orgindustry;
    }

    /**
     * 设置orgindustry属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOrgindustry(JAXBElement<String> value) {
        this.orgindustry = value;
    }

    /**
     * 获取orglegalrep属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOrglegalrep() {
        return orglegalrep;
    }

    /**
     * 设置orglegalrep属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOrglegalrep(JAXBElement<String> value) {
        this.orglegalrep = value;
    }

    /**
     * 获取orglegalreptel属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOrglegalreptel() {
        return orglegalreptel;
    }

    /**
     * 设置orglegalreptel属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOrglegalreptel(JAXBElement<String> value) {
        this.orglegalreptel = value;
    }

    /**
     * 获取orgnature属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOrgnature() {
        return orgnature;
    }

    /**
     * 设置orgnature属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOrgnature(JAXBElement<String> value) {
        this.orgnature = value;
    }

    /**
     * 获取orgpostcode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOrgpostcode() {
        return orgpostcode;
    }

    /**
     * 设置orgpostcode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOrgpostcode(JAXBElement<String> value) {
        this.orgpostcode = value;
    }

    /**
     * 获取orgregeditarea属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOrgregeditarea() {
        return orgregeditarea;
    }

    /**
     * 设置orgregeditarea属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOrgregeditarea(JAXBElement<String> value) {
        this.orgregeditarea = value;
    }

    /**
     * 获取orgregeditcity属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOrgregeditcity() {
        return orgregeditcity;
    }

    /**
     * 设置orgregeditcity属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOrgregeditcity(JAXBElement<String> value) {
        this.orgregeditcity = value;
    }

    /**
     * 获取orgregeditemail属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOrgregeditemail() {
        return orgregeditemail;
    }

    /**
     * 设置orgregeditemail属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOrgregeditemail(JAXBElement<String> value) {
        this.orgregeditemail = value;
    }

    /**
     * 获取orgregeditprovince属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOrgregeditprovince() {
        return orgregeditprovince;
    }

    /**
     * 设置orgregeditprovince属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOrgregeditprovince(JAXBElement<String> value) {
        this.orgregeditprovince = value;
    }

    /**
     * 获取orgregnum属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOrgregnum() {
        return orgregnum;
    }

    /**
     * 设置orgregnum属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOrgregnum(JAXBElement<String> value) {
        this.orgregnum = value;
    }

    /**
     * 获取orgregtype属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOrgregtype() {
        return orgregtype;
    }

    /**
     * 设置orgregtype属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOrgregtype(JAXBElement<String> value) {
        this.orgregtype = value;
    }

    /**
     * 获取orgscope属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOrgscope() {
        return orgscope;
    }

    /**
     * 设置orgscope属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOrgscope(JAXBElement<String> value) {
        this.orgscope = value;
    }

    /**
     * 获取orgtel属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOrgtel() {
        return orgtel;
    }

    /**
     * 设置orgtel属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOrgtel(JAXBElement<String> value) {
        this.orgtel = value;
    }

    /**
     * 获取orgwebsite属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOrgwebsite() {
        return orgwebsite;
    }

    /**
     * 设置orgwebsite属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOrgwebsite(JAXBElement<String> value) {
        this.orgwebsite = value;
    }

    /**
     * 获取platserialno属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPlatserialno() {
        return platserialno;
    }

    /**
     * 设置platserialno属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPlatserialno(JAXBElement<String> value) {
        this.platserialno = value;
    }

    /**
     * 获取rclientno属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRclientno() {
        return rclientno;
    }

    /**
     * 设置rclientno属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRclientno(JAXBElement<String> value) {
        this.rclientno = value;
    }

    /**
     * 获取remark属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRemark() {
        return remark;
    }

    /**
     * 设置remark属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRemark(JAXBElement<String> value) {
        this.remark = value;
    }

    /**
     * 获取reportCorpChnName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getReportCorpChnName() {
        return reportCorpChnName;
    }

    /**
     * 设置reportCorpChnName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setReportCorpChnName(JAXBElement<String> value) {
        this.reportCorpChnName = value;
    }

    /**
     * 获取reportCorpCountryCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getReportCorpCountryCode() {
        return reportCorpCountryCode;
    }

    /**
     * 设置reportCorpCountryCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setReportCorpCountryCode(JAXBElement<String> value) {
        this.reportCorpCountryCode = value;
    }

    /**
     * 获取reportCorpEngName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getReportCorpEngName() {
        return reportCorpEngName;
    }

    /**
     * 设置reportCorpEngName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setReportCorpEngName(JAXBElement<String> value) {
        this.reportCorpEngName = value;
    }

    /**
     * 获取reportCorpaddress属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getReportCorpaddress() {
        return reportCorpaddress;
    }

    /**
     * 设置reportCorpaddress属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setReportCorpaddress(JAXBElement<String> value) {
        this.reportCorpaddress = value;
    }

    /**
     * 获取reportCorpcontacts属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getReportCorpcontacts() {
        return reportCorpcontacts;
    }

    /**
     * 设置reportCorpcontacts属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setReportCorpcontacts(JAXBElement<String> value) {
        this.reportCorpcontacts = value;
    }

    /**
     * 获取reportCorpemail属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getReportCorpemail() {
        return reportCorpemail;
    }

    /**
     * 设置reportCorpemail属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setReportCorpemail(JAXBElement<String> value) {
        this.reportCorpemail = value;
    }

    /**
     * 获取reportCorpfax属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getReportCorpfax() {
        return reportCorpfax;
    }

    /**
     * 设置reportCorpfax属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setReportCorpfax(JAXBElement<String> value) {
        this.reportCorpfax = value;
    }

    /**
     * 获取reportCorptel属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getReportCorptel() {
        return reportCorptel;
    }

    /**
     * 设置reportCorptel属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setReportCorptel(JAXBElement<String> value) {
        this.reportCorptel = value;
    }

    /**
     * 获取reportbuyerNo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getReportbuyerNo() {
        return reportbuyerNo;
    }

    /**
     * 设置reportbuyerNo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setReportbuyerNo(JAXBElement<String> value) {
        this.reportbuyerNo = value;
    }

    /**
     * 获取sendStyle属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSendStyle() {
        return sendStyle;
    }

    /**
     * 设置sendStyle属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSendStyle(JAXBElement<String> value) {
        this.sendStyle = value;
    }

    /**
     * 获取speed属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSpeed() {
        return speed;
    }

    /**
     * 设置speed属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSpeed(JAXBElement<String> value) {
        this.speed = value;
    }

}
