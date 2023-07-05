package Dao;

import Models.Endereco;
import Models.Bairro;
import Models.Cidade;
import Models.Logradouro;
import Models.Pessoa;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2023-07-05T19:05:40", comments="EclipseLink-2.7.10.v20211216-rNA")
@StaticMetamodel(Endereco.class)
public class Endereco_ { 

    public static volatile SingularAttribute<Endereco, String> endCep;
    public static volatile SingularAttribute<Endereco, Cidade> endIdcidade;
    public static volatile SingularAttribute<Endereco, Logradouro> endIdlogradouro;
    public static volatile SingularAttribute<Endereco, Bairro> endIdbairro;
    public static volatile SingularAttribute<Endereco, String> endNumero;
    public static volatile SingularAttribute<Endereco, Integer> idendereco;
    public static volatile ListAttribute<Endereco, Pessoa> pessoaList;

}