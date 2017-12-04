package co.edu.sena.adsi.jpa.entities;

import co.edu.sena.adsi.jpa.entities.Cuentas;
import co.edu.sena.adsi.jpa.entities.TiposMovimiento;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-12-04T12:05:41")
@StaticMetamodel(Movimiento.class)
public class Movimiento_ { 

    public static volatile SingularAttribute<Movimiento, String> fecha;
    public static volatile SingularAttribute<Movimiento, String> valor;
    public static volatile SingularAttribute<Movimiento, Integer> id;
    public static volatile SingularAttribute<Movimiento, TiposMovimiento> tipoMovimientoId;
    public static volatile SingularAttribute<Movimiento, Double> saldoTotal;
    public static volatile SingularAttribute<Movimiento, Cuentas> cuentasId;

}