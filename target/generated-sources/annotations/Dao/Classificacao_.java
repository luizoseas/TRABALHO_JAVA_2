package Dao;

import Models.Classificacao;
import Models.Veiculo;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2023-07-05T19:05:38", comments="EclipseLink-2.7.10.v20211216-rNA")
@StaticMetamodel(Classificacao.class)
public class Classificacao_ { 

    public static volatile SingularAttribute<Classificacao, Integer> idclassificacao;
    public static volatile ListAttribute<Classificacao, Veiculo> veiculoList;
    public static volatile SingularAttribute<Classificacao, String> clasDescricao;

}