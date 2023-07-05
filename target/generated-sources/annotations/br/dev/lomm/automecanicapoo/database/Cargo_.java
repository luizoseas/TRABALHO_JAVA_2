package br.dev.lomm.automecanicapoo.database;

import br.dev.lomm.automecanicapoo.database.Funcionario;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2023-07-05T03:01:41", comments="EclipseLink-2.7.10.v20211216-rNA")
@StaticMetamodel(Cargo.class)
public class Cargo_ { 

    public static volatile SingularAttribute<Cargo, Double> cargSalario;
    public static volatile SingularAttribute<Cargo, String> cargDescricao;
    public static volatile SingularAttribute<Cargo, Integer> idcargo;
    public static volatile ListAttribute<Cargo, Funcionario> funcionarioList;

}