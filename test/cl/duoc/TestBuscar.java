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
public class TestBuscar {

    public TestBuscar() {
    }

    @Test
    public void testBuscar() {
        System.out.println("Buscar");
        String rut = "11111111";
        BussEmpleado instance = new BussEmpleado();
        String rutEsperado = rut;
        String rutObtenido = instance.Buscar(rut).getRut();
        Assert.assertEquals(rutEsperado, rutObtenido);
    }

}
