package Models;

import Models.Conserto;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2023-07-05T22:55:52", comments="EclipseLink-2.7.10.v20211216-rNA")
@StaticMetamodel(Status.class)
public class Status_ { 

    public static volatile SingularAttribute<Status, Integer> idstatus;
    public static volatile SingularAttribute<Status, String> statDescricao;
    public static volatile ListAttribute<Status, Conserto> consertoList;

}