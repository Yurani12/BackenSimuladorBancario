package co.edu.sena.adsi.jpa.entities;

import co.edu.sena.adsi.jpa.entities.Movimiento;
import co.edu.sena.adsi.jpa.entities.TiposCuentas;
import co.edu.sena.adsi.jpa.entities.Usuarios;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-12-04T12:05:41")
@StaticMetamodel(Cuentas.class)
public class Cuentas_ { 

    public static volatile SingularAttribute<Cuentas, Date> fecha;
    public static volatile SingularAttribute<Cuentas, String> caracter;
    public static volatile ListAttribute<Cuentas, Movimiento> movimientoList;
    public static volatile SingularAttribute<Cuentas, Usuarios> usuariosId;
    public static volatile SingularAttribute<Cuentas, String> numeroCuenta;
    public static volatile SingularAttribute<Cuentas, Integer> id;
    public static volatile SingularAttribute<Cuentas, TiposCuentas> tiposCuentasId;

}