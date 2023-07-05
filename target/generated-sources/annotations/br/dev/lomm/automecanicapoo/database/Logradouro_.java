package br.dev.lomm.automecanicapoo.database;

import br.dev.lomm.automecanicapoo.database.Endereco;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2023-07-05T03:01:41", comments="EclipseLink-2.7.10.v20211216-rNA")
@StaticMetamodel(Logradouro.class)
public class Logradouro_ { 

    public static volatile ListAttribute<Logradouro, Endereco> enderecoList;
    public static volatile SingularAttribute<Logradouro, String> logDescricao;
    public static volatile SingularAttribute<Logradouro, Integer> idlogradouro;

}