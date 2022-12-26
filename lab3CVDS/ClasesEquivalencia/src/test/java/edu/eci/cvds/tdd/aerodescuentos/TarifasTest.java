package edu.eci.cvds.tdd.aerodescuentos;

import org.junit.Assert;
import org.junit.Test;

public class TarifasTest {
    private double tarifaBase = 20000;
    private double descuentoFinal = 0;

    //Los casos invalidos los esta pasando

//    @Test
//    public void validarExcepcion(){
//        double tarifaBase = 500;
//        double descuentoFinal = 0;
//        CalculadorDescuentos.calculoTarifa(tarifaBase,-4,-4);
//        Assert.assertEquals(0.0,descuentoFinal,0.1);
//    }

    @Test
    public void validarSinDescuento(){
        descuentoFinal = CalculadorDescuentos.calculoTarifa(tarifaBase,13,23);
        Assert.assertEquals(20000,descuentoFinal,0.01);
    }

    @Test
    public void validarDescuento5PorCiento(){
        descuentoFinal = CalculadorDescuentos.calculoTarifa(tarifaBase,14,13);
        //System.out.println(descuentoFinal);
        Assert.assertEquals(19000,descuentoFinal,0.01);
    }
    @Test
    public void validarDescuento8PorCiento(){
        descuentoFinal = CalculadorDescuentos.calculoTarifa(tarifaBase,11,68);
        //System.out.println(descuentoFinal);
        Assert.assertEquals(18400.0,descuentoFinal,0.01);
    }
    @Test
    public void validarDescuento15PorCiento(){
        descuentoFinal = CalculadorDescuentos.calculoTarifa(tarifaBase,21,20);
        //System.out.println(descuentoFinal);
        Assert.assertEquals(17000.0,descuentoFinal,0.01);
    }

    @Test
    public void validarDescuento20PorCiento(){
        descuentoFinal = CalculadorDescuentos.calculoTarifa(tarifaBase,22,16);
        Assert.assertEquals(16000,descuentoFinal,0.01);
    }

    @Test
    public void validarDescuento23PorCiento(){
        descuentoFinal = CalculadorDescuentos.calculoTarifa(tarifaBase,22,70);
        Assert.assertEquals(15400,descuentoFinal,0.01);
    }


}
