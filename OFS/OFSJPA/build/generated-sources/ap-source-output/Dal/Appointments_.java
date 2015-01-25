package Dal;

import Dal.Addressbook;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-01-25T21:47:38")
@StaticMetamodel(Appointments.class)
public class Appointments_ { 

    public static volatile SingularAttribute<Appointments, Integer> afspraakId;
    public static volatile SingularAttribute<Appointments, Date> datum;
    public static volatile SingularAttribute<Appointments, String> note;
    public static volatile SingularAttribute<Appointments, Addressbook> naam;

}