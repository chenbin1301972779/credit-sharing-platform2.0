
package com.sinosure.exchange.sedi3.po;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.sinosure.exchange.sedi3.po package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _EdiExpObjectEdiKey_QNAME = new QName("http://po.sedi3.exchange.sinosure.com", "ediKey");
    private final static QName _EdiExpObjectEdiVal_QNAME = new QName("http://po.sedi3.exchange.sinosure.com", "ediVal");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.sinosure.exchange.sedi3.po
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ArrayOfEdiExpObject }
     * 
     */
    public ArrayOfEdiExpObject createArrayOfEdiExpObject() {
        return new ArrayOfEdiExpObject();
    }

    /**
     * Create an instance of {@link EdiExpObject }
     * 
     */
    public EdiExpObject createEdiExpObject() {
        return new EdiExpObject();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://po.sedi3.exchange.sinosure.com", name = "ediKey", scope = EdiExpObject.class)
    public JAXBElement<String> createEdiExpObjectEdiKey(String value) {
        return new JAXBElement<String>(_EdiExpObjectEdiKey_QNAME, String.class, EdiExpObject.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://po.sedi3.exchange.sinosure.com", name = "ediVal", scope = EdiExpObject.class)
    public JAXBElement<String> createEdiExpObjectEdiVal(String value) {
        return new JAXBElement<String>(_EdiExpObjectEdiVal_QNAME, String.class, EdiExpObject.class, value);
    }

}
