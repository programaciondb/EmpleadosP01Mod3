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
public class TestEliminar {

    public TestEliminar() {
    }

    @Test
    public void testEliminar() {
        System.out.println("Eliminar");
        String rut = "22222222";
        BussEmpleado instance = new BussEmpleado();     
        boolean esperado = true;
        boolean obtenido = instance.Eliminar(rut);
        Assert.assertEquals(esperado, obtenido);
    }
}
