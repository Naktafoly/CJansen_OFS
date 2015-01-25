package Dal;

import Dal.Appointments;
import Dal.Invoices;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-01-25T21:47:38")
@StaticMetamodel(Addressbook.class)
public class Addressbook_ { 

    public static volatile SingularAttribute<Addressbook, Integer> naamId;
    public static volatile SingularAttribute<Addressbook, Integer> telefoon;
    public static volatile SingularAttribute<Addressbook, String> adres;
    public static volatile CollectionAttribute<Addressbook, Invoices> invoicesCollection;
    public static volatile SingularAttribute<Addressbook, String> naam;
    public static volatile SingularAttribute<Addressbook, String> email;
    public static volatile CollectionAttribute<Addressbook, Appointments> appointmentsCollection;

}