package Dao;

import Models.Modelo;
import Models.Veiculo;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2023-07-05T19:05:39", comments="EclipseLink-2.7.10.v20211216-rNA")
@StaticMetamodel(Modelo.class)
public class Modelo_ { 

    public static volatile SingularAttribute<Modelo, String> modDescricao;
    public static volatile ListAttribute<Modelo, Veiculo> veiculoList;
    public static volatile SingularAttribute<Modelo, Integer> idmodelo;

}