package br.dev.lomm.automecanicapoo.database;

import br.dev.lomm.automecanicapoo.database.Cargo;
import br.dev.lomm.automecanicapoo.database.Conserto;
import br.dev.lomm.automecanicapoo.database.Pessoa;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2023-07-04T23:48:49", comments="EclipseLink-2.7.10.v20211216-rNA")
@StaticMetamodel(Funcionario.class)
public class Funcionario_ { 

    public static volatile SingularAttribute<Funcionario, Pessoa> funIdpessoa;
    public static volatile SingularAttribute<Funcionario, Integer> idfuncionario;
    public static volatile SingularAttribute<Funcionario, Cargo> funIdcargo;
    public static volatile ListAttribute<Funcionario, Conserto> consertoList;

}