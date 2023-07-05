package Dao;

import Models.Pecasconserto;
import Models.Conserto;
import Models.Estoque;
import Models.PecasconsertoPK;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2023-07-05T19:05:38", comments="EclipseLink-2.7.10.v20211216-rNA")
@StaticMetamodel(Pecasconserto.class)
public class Pecasconserto_ { 

    public static volatile SingularAttribute<Pecasconserto, Estoque> estoque;
    public static volatile SingularAttribute<Pecasconserto, Integer> pcQuantidade;
    public static volatile SingularAttribute<Pecasconserto, Conserto> conserto;
    public static volatile SingularAttribute<Pecasconserto, PecasconsertoPK> pecasconsertoPK;

}