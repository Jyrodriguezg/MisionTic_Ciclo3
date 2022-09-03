package com.Ciclo3.Developers_CAR.Project3;

import com.Ciclo3.Developers_CAR.Project3.entity.Empleado;
import com.Ciclo3.Developers_CAR.Project3.entity.Empresa;
import com.Ciclo3.Developers_CAR.Project3.entity.MovimientoDinero;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public abstract class Project3Application {

	public static void main(String[] args) {
		SpringApplication.run(Project3Application.class, args);
		Empresa empresa = new Empresa();
		Empleado empleado = new Empleado();
		MovimientoDinero movimientodinero = new MovimientoDinero();
		empresa.setDireccionEmpresa("Calle falsa 123");
		empresa.setNombreEmpresa("DevelopersCar");
		empresa.setTelefonoEmpresa("60156489732");
		empresa.setNitEmpresa("4123456789");
		System.out.println("el nombre de la empresa es:" + empresa.getNombreEmpresa());
		System.out.println("La direccion de la empresa es: " + empresa.getDireccionEmpresa());
		System.out.println("El telefono de la empresa es: " + empresa.getTelefonoEmpresa());
		System.out.println("El nit de la empresa es: " + empresa.getNitEmpresa());
		empleado.setNombreEmpleado("Jan sultano");
		empleado.setCorreoEmpleado("jsultano@Developerscar.com");

		System.out.println("el nombre del empleado es:" + empleado.getNombreEmpleado());
		System.out.println("El correo del empleado es: " + empleado.getCorreoEmpleado());

		movimientodinero.setConcepto("facturas de maquinaria nueva");
		movimientodinero.setMontoDinero(1000000);
		System.out.println("El concepto del pago es: " + movimientodinero.getConcepto());
		System.out.println("El monto pagado es : $" + movimientodinero.getMontoDinero() + " Dolares");
	}
}
