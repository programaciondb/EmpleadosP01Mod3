/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.duoc;

import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author davidbousquet
 */
public class TestModificar {

    public TestModificar() {
    }

    @Test
    public void testModificar() {
        System.out.println("Modificar");
        BussEmpleado instance = new BussEmpleado();
        Empleado empleadoModificado = instance.Buscar("11111111");
        empleadoModificado.setNombre("NombreCambiado");
        boolean esperado = true;
        boolean obtenido = instance.Modificar(empleadoModificado);
        Assert.assertEquals(esperado, obtenido);
    }

}
