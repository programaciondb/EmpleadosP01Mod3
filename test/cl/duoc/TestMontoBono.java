/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.duoc;

import static org.junit.Assert.assertTrue;
import org.junit.Test;

/**
 *
 * @author davidbousquet
 */
public class TestMontoBono {

    public TestMontoBono() {
    }

    @Test
    public void testSubTotal() {
        System.out.println("montoBono");
        BussEmpleado instance = new BussEmpleado();
        Empleado empleado = instance.Buscar("44444444");
        assertTrue(empleado.montoBono() == 400000);
    }
}
