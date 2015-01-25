package Dal;

import Dal.Addressbook;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-01-25T21:47:38")
@StaticMetamodel(Invoices.class)
public class Invoices_ { 

    public static volatile SingularAttribute<Invoices, Date> ontvangen;
    public static volatile SingularAttribute<Invoices, Boolean> betaald;
    public static volatile SingularAttribute<Invoices, Integer> factuurId;
    public static volatile SingularAttribute<Invoices, byte[]> formulier;
    public static volatile SingularAttribute<Invoices, Addressbook> naam;
    public static volatile SingularAttribute<Invoices, Date> vervaldatum;
    public static volatile SingularAttribute<Invoices, Double> prijs;

}