package Models;

import Models.Cargo;
import Models.Conserto;
import Models.Pessoa;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2023-07-05T22:55:52", comments="EclipseLink-2.7.10.v20211216-rNA")
@StaticMetamodel(Funcionario.class)
public class Funcionario_ { 

    public static volatile SingularAttribute<Funcionario, Pessoa> funIdpessoa;
    public static volatile SingularAttribute<Funcionario, Integer> idfuncionario;
    public static volatile SingularAttribute<Funcionario, Cargo> funIdcargo;
    public static volatile ListAttribute<Funcionario, Conserto> consertoList;

}