package br.dev.lomm.automecanicapoo.database;

import br.dev.lomm.automecanicapoo.database.Pessoa;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2023-07-04T23:48:49", comments="EclipseLink-2.7.10.v20211216-rNA")
@StaticMetamodel(Telefone.class)
public class Telefone_ { 

    public static volatile SingularAttribute<Telefone, String> telNumero;
    public static volatile SingularAttribute<Telefone, Integer> idtelefone;
    public static volatile SingularAttribute<Telefone, String> telDdd;
    public static volatile SingularAttribute<Telefone, String> telCodpais;
    public static volatile SingularAttribute<Telefone, Pessoa> telIdpessoa;

}