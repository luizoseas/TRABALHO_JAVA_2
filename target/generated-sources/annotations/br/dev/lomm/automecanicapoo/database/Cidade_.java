package br.dev.lomm.automecanicapoo.database;

import br.dev.lomm.automecanicapoo.database.Endereco;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2023-07-05T19:01:06", comments="EclipseLink-2.7.10.v20211216-rNA")
@StaticMetamodel(Cidade.class)
public class Cidade_ { 

    public static volatile ListAttribute<Cidade, Endereco> enderecoList;
    public static volatile SingularAttribute<Cidade, String> cidDescricao;
    public static volatile SingularAttribute<Cidade, Integer> idcidade;

}