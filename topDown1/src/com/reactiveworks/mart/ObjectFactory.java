
package com.reactiveworks.mart;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.reactiveworks.mart package. 
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

    private final static QName _AddProduct_QNAME = new QName("http://mart.reactiveworks.com/", "addProduct");
    private final static QName _AddProductResponse_QNAME = new QName("http://mart.reactiveworks.com/", "addProductResponse");
    private final static QName _GetProductByCategory_QNAME = new QName("http://mart.reactiveworks.com/", "getProductByCategory");
    private final static QName _GetProductByCategoryResponse_QNAME = new QName("http://mart.reactiveworks.com/", "getProductByCategoryResponse");
    private final static QName _GetProductCategories_QNAME = new QName("http://mart.reactiveworks.com/", "getProductCategories");
    private final static QName _GetProductCategoriesResponse_QNAME = new QName("http://mart.reactiveworks.com/", "getProductCategoriesResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.reactiveworks.mart
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AddProduct }
     * 
     */
    public AddProduct createAddProduct() {
        return new AddProduct();
    }

    /**
     * Create an instance of {@link AddProductResponse }
     * 
     */
    public AddProductResponse createAddProductResponse() {
        return new AddProductResponse();
    }

    /**
     * Create an instance of {@link GetProductByCategory }
     * 
     */
    public GetProductByCategory createGetProductByCategory() {
        return new GetProductByCategory();
    }

    /**
     * Create an instance of {@link GetProductByCategoryResponse }
     * 
     */
    public GetProductByCategoryResponse createGetProductByCategoryResponse() {
        return new GetProductByCategoryResponse();
    }

    /**
     * Create an instance of {@link GetProductCategories }
     * 
     */
    public GetProductCategories createGetProductCategories() {
        return new GetProductCategories();
    }

    /**
     * Create an instance of {@link GetProductCategoriesResponse }
     * 
     */
    public GetProductCategoriesResponse createGetProductCategoriesResponse() {
        return new GetProductCategoriesResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddProduct }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mart.reactiveworks.com/", name = "addProduct")
    public JAXBElement<AddProduct> createAddProduct(AddProduct value) {
        return new JAXBElement<AddProduct>(_AddProduct_QNAME, AddProduct.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddProductResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mart.reactiveworks.com/", name = "addProductResponse")
    public JAXBElement<AddProductResponse> createAddProductResponse(AddProductResponse value) {
        return new JAXBElement<AddProductResponse>(_AddProductResponse_QNAME, AddProductResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetProductByCategory }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mart.reactiveworks.com/", name = "getProductByCategory")
    public JAXBElement<GetProductByCategory> createGetProductByCategory(GetProductByCategory value) {
        return new JAXBElement<GetProductByCategory>(_GetProductByCategory_QNAME, GetProductByCategory.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetProductByCategoryResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mart.reactiveworks.com/", name = "getProductByCategoryResponse")
    public JAXBElement<GetProductByCategoryResponse> createGetProductByCategoryResponse(GetProductByCategoryResponse value) {
        return new JAXBElement<GetProductByCategoryResponse>(_GetProductByCategoryResponse_QNAME, GetProductByCategoryResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetProductCategories }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mart.reactiveworks.com/", name = "getProductCategories")
    public JAXBElement<GetProductCategories> createGetProductCategories(GetProductCategories value) {
        return new JAXBElement<GetProductCategories>(_GetProductCategories_QNAME, GetProductCategories.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetProductCategoriesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mart.reactiveworks.com/", name = "getProductCategoriesResponse")
    public JAXBElement<GetProductCategoriesResponse> createGetProductCategoriesResponse(GetProductCategoriesResponse value) {
        return new JAXBElement<GetProductCategoriesResponse>(_GetProductCategoriesResponse_QNAME, GetProductCategoriesResponse.class, null, value);
    }

}
