
package com.reactiveworks.productservice.service;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.reactiveworks.productservice.service package. 
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

    private final static QName _DeleteProduct_QNAME = new QName("http://service.productservice.reactiveworks.com/", "deleteProduct");
    private final static QName _DeleteProductResponse_QNAME = new QName("http://service.productservice.reactiveworks.com/", "deleteProductResponse");
    private final static QName _GetProduct_QNAME = new QName("http://service.productservice.reactiveworks.com/", "getProduct");
    private final static QName _GetProductResponse_QNAME = new QName("http://service.productservice.reactiveworks.com/", "getProductResponse");
    private final static QName _GetProducts_QNAME = new QName("http://service.productservice.reactiveworks.com/", "getProducts");
    private final static QName _GetProductsResponse_QNAME = new QName("http://service.productservice.reactiveworks.com/", "getProductsResponse");
    private final static QName _InsertProduct_QNAME = new QName("http://service.productservice.reactiveworks.com/", "insertProduct");
    private final static QName _InsertProductResponse_QNAME = new QName("http://service.productservice.reactiveworks.com/", "insertProductResponse");
    private final static QName _UnableToReadPropertyFileException_QNAME = new QName("http://service.productservice.reactiveworks.com/", "UnableToReadPropertyFileException");
    private final static QName _DataBaseAccessFailureException_QNAME = new QName("http://service.productservice.reactiveworks.com/", "DataBaseAccessFailureException");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.reactiveworks.productservice.service
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DeleteProduct }
     * 
     */
    public DeleteProduct createDeleteProduct() {
        return new DeleteProduct();
    }

    /**
     * Create an instance of {@link DeleteProductResponse }
     * 
     */
    public DeleteProductResponse createDeleteProductResponse() {
        return new DeleteProductResponse();
    }

    /**
     * Create an instance of {@link GetProduct }
     * 
     */
    public GetProduct createGetProduct() {
        return new GetProduct();
    }

    /**
     * Create an instance of {@link GetProductResponse }
     * 
     */
    public GetProductResponse createGetProductResponse() {
        return new GetProductResponse();
    }

    /**
     * Create an instance of {@link GetProducts }
     * 
     */
    public GetProducts createGetProducts() {
        return new GetProducts();
    }

    /**
     * Create an instance of {@link GetProductsResponse }
     * 
     */
    public GetProductsResponse createGetProductsResponse() {
        return new GetProductsResponse();
    }

    /**
     * Create an instance of {@link InsertProduct }
     * 
     */
    public InsertProduct createInsertProduct() {
        return new InsertProduct();
    }

    /**
     * Create an instance of {@link InsertProductResponse }
     * 
     */
    public InsertProductResponse createInsertProductResponse() {
        return new InsertProductResponse();
    }

    /**
     * Create an instance of {@link UnableToReadPropertyFileException }
     * 
     */
    public UnableToReadPropertyFileException createUnableToReadPropertyFileException() {
        return new UnableToReadPropertyFileException();
    }

    /**
     * Create an instance of {@link DataBaseAccessFailureException }
     * 
     */
    public DataBaseAccessFailureException createDataBaseAccessFailureException() {
        return new DataBaseAccessFailureException();
    }

    /**
     * Create an instance of {@link Product }
     * 
     */
    public Product createProduct() {
        return new Product();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteProduct }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.productservice.reactiveworks.com/", name = "deleteProduct")
    public JAXBElement<DeleteProduct> createDeleteProduct(DeleteProduct value) {
        return new JAXBElement<DeleteProduct>(_DeleteProduct_QNAME, DeleteProduct.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteProductResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.productservice.reactiveworks.com/", name = "deleteProductResponse")
    public JAXBElement<DeleteProductResponse> createDeleteProductResponse(DeleteProductResponse value) {
        return new JAXBElement<DeleteProductResponse>(_DeleteProductResponse_QNAME, DeleteProductResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetProduct }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.productservice.reactiveworks.com/", name = "getProduct")
    public JAXBElement<GetProduct> createGetProduct(GetProduct value) {
        return new JAXBElement<GetProduct>(_GetProduct_QNAME, GetProduct.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetProductResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.productservice.reactiveworks.com/", name = "getProductResponse")
    public JAXBElement<GetProductResponse> createGetProductResponse(GetProductResponse value) {
        return new JAXBElement<GetProductResponse>(_GetProductResponse_QNAME, GetProductResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetProducts }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.productservice.reactiveworks.com/", name = "getProducts")
    public JAXBElement<GetProducts> createGetProducts(GetProducts value) {
        return new JAXBElement<GetProducts>(_GetProducts_QNAME, GetProducts.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetProductsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.productservice.reactiveworks.com/", name = "getProductsResponse")
    public JAXBElement<GetProductsResponse> createGetProductsResponse(GetProductsResponse value) {
        return new JAXBElement<GetProductsResponse>(_GetProductsResponse_QNAME, GetProductsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertProduct }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.productservice.reactiveworks.com/", name = "insertProduct")
    public JAXBElement<InsertProduct> createInsertProduct(InsertProduct value) {
        return new JAXBElement<InsertProduct>(_InsertProduct_QNAME, InsertProduct.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertProductResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.productservice.reactiveworks.com/", name = "insertProductResponse")
    public JAXBElement<InsertProductResponse> createInsertProductResponse(InsertProductResponse value) {
        return new JAXBElement<InsertProductResponse>(_InsertProductResponse_QNAME, InsertProductResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UnableToReadPropertyFileException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.productservice.reactiveworks.com/", name = "UnableToReadPropertyFileException")
    public JAXBElement<UnableToReadPropertyFileException> createUnableToReadPropertyFileException(UnableToReadPropertyFileException value) {
        return new JAXBElement<UnableToReadPropertyFileException>(_UnableToReadPropertyFileException_QNAME, UnableToReadPropertyFileException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DataBaseAccessFailureException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.productservice.reactiveworks.com/", name = "DataBaseAccessFailureException")
    public JAXBElement<DataBaseAccessFailureException> createDataBaseAccessFailureException(DataBaseAccessFailureException value) {
        return new JAXBElement<DataBaseAccessFailureException>(_DataBaseAccessFailureException_QNAME, DataBaseAccessFailureException.class, null, value);
    }

}
