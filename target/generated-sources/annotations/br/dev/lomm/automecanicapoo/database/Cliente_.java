package br.dev.lomm.automecanicapoo.database;

import Dao.Cliente;
import Dao.Pessoa;
import Dao.Veiculo;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2023-07-05T19:01:06", comments="EclipseLink-2.7.10.v20211216-rNA")
@StaticMetamodel(Cliente.class)
public class Cliente_ { 

    public static volatile ListAttribute<Cliente, Veiculo> veiculoList;
    public static volatile SingularAttribute<Cliente, Pessoa> cliIdpessoa;
    public static volatile SingularAttribute<Cliente, Integer> idcliente;

}