package br.dev.lomm.automecanicapoo.database;

import br.dev.lomm.automecanicapoo.database.Endereco;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2023-06-19T10:00:19", comments="EclipseLink-2.7.10.v20211216-rNA")
@StaticMetamodel(Bairro.class)
public class Bairro_ { 

    public static volatile ListAttribute<Bairro, Endereco> enderecoList;
    public static volatile SingularAttribute<Bairro, Integer> idbairro;
    public static volatile SingularAttribute<Bairro, String> baiDescricao;

}