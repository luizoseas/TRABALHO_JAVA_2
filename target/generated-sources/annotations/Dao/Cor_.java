package Dao;

import Models.Cor;
import Models.Veiculo;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2023-07-05T19:05:39", comments="EclipseLink-2.7.10.v20211216-rNA")
@StaticMetamodel(Cor.class)
public class Cor_ { 

    public static volatile ListAttribute<Cor, Veiculo> veiculoList;
    public static volatile SingularAttribute<Cor, String> corDescricao;
    public static volatile SingularAttribute<Cor, Integer> idcor;

}