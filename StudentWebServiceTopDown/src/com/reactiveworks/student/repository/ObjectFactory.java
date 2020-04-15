
package com.reactiveworks.student.repository;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.reactiveworks.student.repository package. 
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

    private final static QName _DaoOperationFailureException_QNAME = new QName("http://repository.student.reactiveworks.com/", "DaoOperationFailureException");
    private final static QName _DataSourceAccessFailureDaoException_QNAME = new QName("http://repository.student.reactiveworks.com/", "DataSourceAccessFailureDaoException");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.reactiveworks.student.repository
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetStudents }
     * 
     */
    public GetStudents createGetStudents() {
        return new GetStudents();
    }

    /**
     * Create an instance of {@link GetStudentsResponse }
     * 
     */
    public GetStudentsResponse createGetStudentsResponse() {
        return new GetStudentsResponse();
    }

    /**
     * Create an instance of {@link Student }
     * 
     */
    public Student createStudent() {
        return new Student();
    }

    /**
     * Create an instance of {@link GetStudent }
     * 
     */
    public GetStudent createGetStudent() {
        return new GetStudent();
    }

    /**
     * Create an instance of {@link GetStudentResponse }
     * 
     */
    public GetStudentResponse createGetStudentResponse() {
        return new GetStudentResponse();
    }

    /**
     * Create an instance of {@link DeleteStudent }
     * 
     */
    public DeleteStudent createDeleteStudent() {
        return new DeleteStudent();
    }

    /**
     * Create an instance of {@link DeleteStudentResponse }
     * 
     */
    public DeleteStudentResponse createDeleteStudentResponse() {
        return new DeleteStudentResponse();
    }

    /**
     * Create an instance of {@link DaoOperationFailureException }
     * 
     */
    public DaoOperationFailureException createDaoOperationFailureException() {
        return new DaoOperationFailureException();
    }

    /**
     * Create an instance of {@link DataSourceAccessFailureDaoException }
     * 
     */
    public DataSourceAccessFailureDaoException createDataSourceAccessFailureDaoException() {
        return new DataSourceAccessFailureDaoException();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DaoOperationFailureException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://repository.student.reactiveworks.com/", name = "DaoOperationFailureException")
    public JAXBElement<DaoOperationFailureException> createDaoOperationFailureException(DaoOperationFailureException value) {
        return new JAXBElement<DaoOperationFailureException>(_DaoOperationFailureException_QNAME, DaoOperationFailureException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DataSourceAccessFailureDaoException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://repository.student.reactiveworks.com/", name = "DataSourceAccessFailureDaoException")
    public JAXBElement<DataSourceAccessFailureDaoException> createDataSourceAccessFailureDaoException(DataSourceAccessFailureDaoException value) {
        return new JAXBElement<DataSourceAccessFailureDaoException>(_DataSourceAccessFailureDaoException_QNAME, DataSourceAccessFailureDaoException.class, null, value);
    }

}
