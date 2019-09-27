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
public class TestCrear {
        public TestCrear() {
    }

    @Test
    public void testCrear() {
        System.out.println("Crear");
        Empleado empleado = new Empleado("18172729-2", "David Bousquet", 26, 5);
        BussEmpleado instance = new BussEmpleado();
        boolean esperado = true;
        boolean obtenido= instance.Crear(empleado);
        Assert.assertEquals(esperado, obtenido);
    }
}
