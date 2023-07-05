package Dao;

import Models.Estoque;
import Models.Nota;
import Models.Pecasconserto;
import Models.Produto;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2023-07-05T19:05:40", comments="EclipseLink-2.7.10.v20211216-rNA")
@StaticMetamodel(Estoque.class)
public class Estoque_ { 

    public static volatile SingularAttribute<Estoque, Integer> estQuantidade;
    public static volatile ListAttribute<Estoque, Pecasconserto> pecasconsertoList;
    public static volatile SingularAttribute<Estoque, Produto> estIdproduto;
    public static volatile SingularAttribute<Estoque, Double> estPreco;
    public static volatile SingularAttribute<Estoque, Integer> idestoque;
    public static volatile SingularAttribute<Estoque, Nota> estIdnota;

}