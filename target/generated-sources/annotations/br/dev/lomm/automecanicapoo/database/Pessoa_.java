package br.dev.lomm.automecanicapoo.database;

import br.dev.lomm.automecanicapoo.database.Cliente;
import br.dev.lomm.automecanicapoo.database.Endereco;
import br.dev.lomm.automecanicapoo.database.Funcionario;
import br.dev.lomm.automecanicapoo.database.Telefone;
import java.util.Date;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2023-07-05T19:01:06", comments="EclipseLink-2.7.10.v20211216-rNA")
@StaticMetamodel(Pessoa.class)
public class Pessoa_ { 

    public static volatile ListAttribute<Pessoa, Cliente> clienteList;
    public static volatile ListAttribute<Pessoa, Telefone> telefoneList;
    public static volatile ListAttribute<Pessoa, Funcionario> funcionarioList;
    public static volatile SingularAttribute<Pessoa, Date> pesDatanasc;
    public static volatile SingularAttribute<Pessoa, String> pesCpf;
    public static volatile SingularAttribute<Pessoa, String> pesNome;
    public static volatile SingularAttribute<Pessoa, String> pesEmail;
    public static volatile SingularAttribute<Pessoa, Integer> idpessoa;
    public static volatile SingularAttribute<Pessoa, Endereco> pesIdendereco;

}