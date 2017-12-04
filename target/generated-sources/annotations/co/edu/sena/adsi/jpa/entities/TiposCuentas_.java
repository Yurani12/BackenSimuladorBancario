package co.edu.sena.adsi.jpa.entities;

import co.edu.sena.adsi.jpa.entities.Cuentas;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-12-04T12:05:41")
@StaticMetamodel(TiposCuentas.class)
public class TiposCuentas_ { 

    public static volatile SingularAttribute<TiposCuentas, String> descripcion;
    public static volatile SingularAttribute<TiposCuentas, Integer> id;
    public static volatile SingularAttribute<TiposCuentas, String> nombre;
    public static volatile ListAttribute<TiposCuentas, Cuentas> cuentasList;
    public static volatile SingularAttribute<TiposCuentas, Boolean> activo;

}