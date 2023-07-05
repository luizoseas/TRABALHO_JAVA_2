package br.dev.lomm.automecanicapoo.database;

import br.dev.lomm.automecanicapoo.database.Funcionario;
import br.dev.lomm.automecanicapoo.database.Pecasconserto;
import br.dev.lomm.automecanicapoo.database.Status;
import br.dev.lomm.automecanicapoo.database.Veiculo;
import java.util.Date;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2023-07-05T01:44:52", comments="EclipseLink-2.7.10.v20211216-rNA")
@StaticMetamodel(Conserto.class)
public class Conserto_ { 

    public static volatile ListAttribute<Conserto, Pecasconserto> pecasconsertoList;
    public static volatile SingularAttribute<Conserto, String> consDescricao;
    public static volatile SingularAttribute<Conserto, Funcionario> consIdfuncionario;
    public static volatile SingularAttribute<Conserto, Status> consIdstatus;
    public static volatile SingularAttribute<Conserto, Date> consDatainicio;
    public static volatile SingularAttribute<Conserto, Integer> idconserto;
    public static volatile SingularAttribute<Conserto, Date> consDatafim;
    public static volatile SingularAttribute<Conserto, Veiculo> consIdveiculo;

}