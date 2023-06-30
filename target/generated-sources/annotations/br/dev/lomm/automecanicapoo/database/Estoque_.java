package br.dev.lomm.automecanicapoo.database;

import br.dev.lomm.automecanicapoo.database.Nota;
import br.dev.lomm.automecanicapoo.database.Pecasconserto;
import br.dev.lomm.automecanicapoo.database.Produto;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2023-06-19T10:00:19", comments="EclipseLink-2.7.10.v20211216-rNA")
@StaticMetamodel(Estoque.class)
public class Estoque_ { 

    public static volatile SingularAttribute<Estoque, Integer> estQuantidade;
    public static volatile ListAttribute<Estoque, Pecasconserto> pecasconsertoList;
    public static volatile SingularAttribute<Estoque, Produto> estIdproduto;
    public static volatile SingularAttribute<Estoque, Double> estPreco;
    public static volatile SingularAttribute<Estoque, Integer> idestoque;
    public static volatile SingularAttribute<Estoque, Nota> estIdnota;

}