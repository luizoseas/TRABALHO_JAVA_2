package Models;

import Models.Veiculo;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2023-07-06T00:15:17", comments="EclipseLink-2.7.10.v20211216-rNA")
@StaticMetamodel(Combustivel.class)
public class Combustivel_ { 

    public static volatile SingularAttribute<Combustivel, Integer> idcombustivel;
    public static volatile ListAttribute<Combustivel, Veiculo> veiculoList;
    public static volatile SingularAttribute<Combustivel, String> combDescricao;

}