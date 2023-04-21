
package org.example;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.example package. 
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

    private static final QName _PersonExistsEx_QNAME = new QName("http://example.org/", "PersonExistsEx");
    private static final QName _PersonNotFoundEx_QNAME = new QName("http://example.org/", "PersonNotFoundEx");
    private static final QName _AddPerson_QNAME = new QName("http://example.org/", "addPerson");
    private static final QName _AddPersonResponse_QNAME = new QName("http://example.org/", "addPersonResponse");
    private static final QName _UpdatePerson_QNAME = new QName("http://example.org/", "updatePerson");
    private static final QName _UpdatePersonResponse_QNAME = new QName("http://example.org/", "updatePersonResponse");
    private static final QName _CountPersons_QNAME = new QName("http://example.org/", "countPersons");
    private static final QName _CountPersonsResponse_QNAME = new QName("http://example.org/", "countPersonsResponse");
    private static final QName _DeletePerson_QNAME = new QName("http://example.org/", "deletePerson");
    private static final QName _DeletePersonResponse_QNAME = new QName("http://example.org/", "deletePersonResponse");
    private static final QName _GetAllPersons_QNAME = new QName("http://example.org/", "getAllPersons");
    private static final QName _GetAllPersonsResponse_QNAME = new QName("http://example.org/", "getAllPersonsResponse");
    private static final QName _GetPerson_QNAME = new QName("http://example.org/", "getPerson");
    private static final QName _GetPersonResponse_QNAME = new QName("http://example.org/", "getPersonResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.example
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link PersonExistsEx }
     * 
     * @return
     *     the new instance of {@link PersonExistsEx }
     */
    public PersonExistsEx createPersonExistsEx() {
        return new PersonExistsEx();
    }

    /**
     * Create an instance of {@link PersonNotFoundEx }
     * 
     * @return
     *     the new instance of {@link PersonNotFoundEx }
     */
    public PersonNotFoundEx createPersonNotFoundEx() {
        return new PersonNotFoundEx();
    }

    /**
     * Create an instance of {@link AddPerson }
     * 
     * @return
     *     the new instance of {@link AddPerson }
     */
    public AddPerson createAddPerson() {
        return new AddPerson();
    }

    /**
     * Create an instance of {@link AddPersonResponse }
     * 
     * @return
     *     the new instance of {@link AddPersonResponse }
     */
    public AddPersonResponse createAddPersonResponse() {
        return new AddPersonResponse();
    }

    /**
     * Create an instance of {@link UpdatePerson }
     * 
     * @return
     *     the new instance of {@link UpdatePerson }
     */
    public UpdatePerson createUpdatePerson() {
        return new UpdatePerson();
    }

    /**
     * Create an instance of {@link UpdatePersonResponse }
     * 
     * @return
     *     the new instance of {@link UpdatePersonResponse }
     */
    public UpdatePersonResponse createUpdatePersonResponse() {
        return new UpdatePersonResponse();
    }

    /**
     * Create an instance of {@link CountPersons }
     * 
     * @return
     *     the new instance of {@link CountPersons }
     */
    public CountPersons createCountPersons() {
        return new CountPersons();
    }

    /**
     * Create an instance of {@link CountPersonsResponse }
     * 
     * @return
     *     the new instance of {@link CountPersonsResponse }
     */
    public CountPersonsResponse createCountPersonsResponse() {
        return new CountPersonsResponse();
    }

    /**
     * Create an instance of {@link DeletePerson }
     * 
     * @return
     *     the new instance of {@link DeletePerson }
     */
    public DeletePerson createDeletePerson() {
        return new DeletePerson();
    }

    /**
     * Create an instance of {@link DeletePersonResponse }
     * 
     * @return
     *     the new instance of {@link DeletePersonResponse }
     */
    public DeletePersonResponse createDeletePersonResponse() {
        return new DeletePersonResponse();
    }

    /**
     * Create an instance of {@link GetAllPersons }
     * 
     * @return
     *     the new instance of {@link GetAllPersons }
     */
    public GetAllPersons createGetAllPersons() {
        return new GetAllPersons();
    }

    /**
     * Create an instance of {@link GetAllPersonsResponse }
     * 
     * @return
     *     the new instance of {@link GetAllPersonsResponse }
     */
    public GetAllPersonsResponse createGetAllPersonsResponse() {
        return new GetAllPersonsResponse();
    }

    /**
     * Create an instance of {@link GetPerson }
     * 
     * @return
     *     the new instance of {@link GetPerson }
     */
    public GetPerson createGetPerson() {
        return new GetPerson();
    }

    /**
     * Create an instance of {@link GetPersonResponse }
     * 
     * @return
     *     the new instance of {@link GetPersonResponse }
     */
    public GetPersonResponse createGetPersonResponse() {
        return new GetPersonResponse();
    }

    /**
     * Create an instance of {@link Person }
     * 
     * @return
     *     the new instance of {@link Person }
     */
    public Person createPerson() {
        return new Person();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PersonExistsEx }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PersonExistsEx }{@code >}
     */
    @XmlElementDecl(namespace = "http://example.org/", name = "PersonExistsEx")
    public JAXBElement<PersonExistsEx> createPersonExistsEx(PersonExistsEx value) {
        return new JAXBElement<>(_PersonExistsEx_QNAME, PersonExistsEx.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PersonNotFoundEx }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PersonNotFoundEx }{@code >}
     */
    @XmlElementDecl(namespace = "http://example.org/", name = "PersonNotFoundEx")
    public JAXBElement<PersonNotFoundEx> createPersonNotFoundEx(PersonNotFoundEx value) {
        return new JAXBElement<>(_PersonNotFoundEx_QNAME, PersonNotFoundEx.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddPerson }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AddPerson }{@code >}
     */
    @XmlElementDecl(namespace = "http://example.org/", name = "addPerson")
    public JAXBElement<AddPerson> createAddPerson(AddPerson value) {
        return new JAXBElement<>(_AddPerson_QNAME, AddPerson.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddPersonResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AddPersonResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://example.org/", name = "addPersonResponse")
    public JAXBElement<AddPersonResponse> createAddPersonResponse(AddPersonResponse value) {
        return new JAXBElement<>(_AddPersonResponse_QNAME, AddPersonResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdatePerson }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UpdatePerson }{@code >}
     */
    @XmlElementDecl(namespace = "http://example.org/", name = "updatePerson")
    public JAXBElement<UpdatePerson> createUpdatePerson(UpdatePerson value) {
        return new JAXBElement<>(_UpdatePerson_QNAME, UpdatePerson.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdatePersonResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UpdatePersonResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://example.org/", name = "updatePersonResponse")
    public JAXBElement<UpdatePersonResponse> createUpdatePersonResponse(UpdatePersonResponse value) {
        return new JAXBElement<>(_UpdatePersonResponse_QNAME, UpdatePersonResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CountPersons }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CountPersons }{@code >}
     */
    @XmlElementDecl(namespace = "http://example.org/", name = "countPersons")
    public JAXBElement<CountPersons> createCountPersons(CountPersons value) {
        return new JAXBElement<>(_CountPersons_QNAME, CountPersons.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CountPersonsResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CountPersonsResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://example.org/", name = "countPersonsResponse")
    public JAXBElement<CountPersonsResponse> createCountPersonsResponse(CountPersonsResponse value) {
        return new JAXBElement<>(_CountPersonsResponse_QNAME, CountPersonsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeletePerson }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DeletePerson }{@code >}
     */
    @XmlElementDecl(namespace = "http://example.org/", name = "deletePerson")
    public JAXBElement<DeletePerson> createDeletePerson(DeletePerson value) {
        return new JAXBElement<>(_DeletePerson_QNAME, DeletePerson.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeletePersonResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DeletePersonResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://example.org/", name = "deletePersonResponse")
    public JAXBElement<DeletePersonResponse> createDeletePersonResponse(DeletePersonResponse value) {
        return new JAXBElement<>(_DeletePersonResponse_QNAME, DeletePersonResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllPersons }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetAllPersons }{@code >}
     */
    @XmlElementDecl(namespace = "http://example.org/", name = "getAllPersons")
    public JAXBElement<GetAllPersons> createGetAllPersons(GetAllPersons value) {
        return new JAXBElement<>(_GetAllPersons_QNAME, GetAllPersons.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllPersonsResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetAllPersonsResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://example.org/", name = "getAllPersonsResponse")
    public JAXBElement<GetAllPersonsResponse> createGetAllPersonsResponse(GetAllPersonsResponse value) {
        return new JAXBElement<>(_GetAllPersonsResponse_QNAME, GetAllPersonsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPerson }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetPerson }{@code >}
     */
    @XmlElementDecl(namespace = "http://example.org/", name = "getPerson")
    public JAXBElement<GetPerson> createGetPerson(GetPerson value) {
        return new JAXBElement<>(_GetPerson_QNAME, GetPerson.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPersonResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetPersonResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://example.org/", name = "getPersonResponse")
    public JAXBElement<GetPersonResponse> createGetPersonResponse(GetPersonResponse value) {
        return new JAXBElement<>(_GetPersonResponse_QNAME, GetPersonResponse.class, null, value);
    }

}
