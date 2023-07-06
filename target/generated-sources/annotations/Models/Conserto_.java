package Models;

import Models.Funcionario;
import Models.Pecasconserto;
import Models.Status;
import Models.Veiculo;
import java.util.Date;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2023-07-06T00:15:17", comments="EclipseLink-2.7.10.v20211216-rNA")
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