package Models;

import Models.Nota;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2023-07-06T00:15:17", comments="EclipseLink-2.7.10.v20211216-rNA")
@StaticMetamodel(Fornecedor.class)
public class Fornecedor_ { 

    public static volatile SingularAttribute<Fornecedor, Integer> idfornecedor;
    public static volatile SingularAttribute<Fornecedor, String> forCnpj;
    public static volatile SingularAttribute<Fornecedor, String> forRazaosocial;
    public static volatile SingularAttribute<Fornecedor, String> forNomefantasia;
    public static volatile SingularAttribute<Fornecedor, String> forInscricaoestadual;
    public static volatile ListAttribute<Fornecedor, Nota> notaList;

}