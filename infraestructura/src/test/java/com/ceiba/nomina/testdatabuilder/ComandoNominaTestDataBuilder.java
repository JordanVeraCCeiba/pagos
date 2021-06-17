package com.ceiba.nomina.testdatabuilder;

import com.ceiba.empleado.comando.ComandoEmpleado;
import com.ceiba.nomina.comando.ComandoNomina;

public class ComandoNominaTestDataBuilder {

    private Long id;
    private Long idEmpleado;
    private String fechaPago;
    private Double pagoEmpleado;
    private Double salud;
    private Double pension;

    public ComandoNominaTestDataBuilder() {
        idEmpleado = 1L;
        fechaPago = "26/06/2021";
        pagoEmpleado = 200000D;
        salud = 80000D;
        pension = 80000D;
    }

    public ComandoNominaTestDataBuilder conFechaPago(String fecha) {
        this.fechaPago = fecha;
        return this;
    }

    public ComandoNomina build() {
        return new ComandoNomina(id,idEmpleado, fechaPago,pagoEmpleado,salud,pension);
    }
}
