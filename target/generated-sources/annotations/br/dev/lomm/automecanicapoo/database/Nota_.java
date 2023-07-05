package br.dev.lomm.automecanicapoo.database;

import Dao.Nota;
import Dao.Estoque;
import Dao.Fornecedor;
import java.util.Date;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2023-07-05T19:01:06", comments="EclipseLink-2.7.10.v20211216-rNA")
@StaticMetamodel(Nota.class)
public class Nota_ { 

    public static volatile SingularAttribute<Nota, Date> notaDatacompra;
    public static volatile ListAttribute<Nota, Estoque> estoqueList;
    public static volatile SingularAttribute<Nota, Date> notaDataentrada;
    public static volatile SingularAttribute<Nota, Integer> idnota;
    public static volatile SingularAttribute<Nota, Fornecedor> notaIdfornecedor;

}