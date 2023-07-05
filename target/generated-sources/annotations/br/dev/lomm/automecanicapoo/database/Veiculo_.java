package br.dev.lomm.automecanicapoo.database;

import br.dev.lomm.automecanicapoo.database.Classificacao;
import br.dev.lomm.automecanicapoo.database.Cliente;
import br.dev.lomm.automecanicapoo.database.Combustivel;
import br.dev.lomm.automecanicapoo.database.Conserto;
import br.dev.lomm.automecanicapoo.database.Cor;
import br.dev.lomm.automecanicapoo.database.Modelo;
import java.util.Date;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2023-07-05T05:24:15", comments="EclipseLink-2.7.10.v20211216-rNA")
@StaticMetamodel(Veiculo.class)
public class Veiculo_ { 

    public static volatile SingularAttribute<Veiculo, Cor> veiIdcor;
    public static volatile SingularAttribute<Veiculo, Integer> idveiculo;
    public static volatile SingularAttribute<Veiculo, Combustivel> veiIdcombustivel;
    public static volatile SingularAttribute<Veiculo, Cliente> veiIdcliente;
    public static volatile SingularAttribute<Veiculo, Date> veiDatafabric;
    public static volatile SingularAttribute<Veiculo, String> veiQuilometragem;
    public static volatile SingularAttribute<Veiculo, Classificacao> veiIdclassificacao;
    public static volatile SingularAttribute<Veiculo, Modelo> veiIdmodelo;
    public static volatile SingularAttribute<Veiculo, String> veiPlaca;
    public static volatile ListAttribute<Veiculo, Conserto> consertoList;

}