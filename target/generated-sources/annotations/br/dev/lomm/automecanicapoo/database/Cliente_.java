package br.dev.lomm.automecanicapoo.database;

import br.dev.lomm.automecanicapoo.database.Pessoa;
import br.dev.lomm.automecanicapoo.database.Veiculo;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2023-07-05T05:24:15", comments="EclipseLink-2.7.10.v20211216-rNA")
@StaticMetamodel(Cliente.class)
public class Cliente_ { 

    public static volatile ListAttribute<Cliente, Veiculo> veiculoList;
    public static volatile SingularAttribute<Cliente, Pessoa> cliIdpessoa;
    public static volatile SingularAttribute<Cliente, Integer> idcliente;

}