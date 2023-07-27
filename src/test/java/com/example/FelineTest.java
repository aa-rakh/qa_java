package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class FelineTest {

    private Feline feline;

    @Test
    public void eatMeatTest() throws Exception{
        Feline feline = new Feline();
        List<String> actualResult = feline.eatMeat();
        assertEquals(feline.getFood("Хищник"), actualResult);
    }

    @Test
    public void getFamilyTest() {
        Feline feline = new Feline();
        String actualResult = feline.getFamily();
        assertEquals("Кошачьи", actualResult);
    }

    @Test
    public void getKittensNoParamInvokeGetKittensWith1() {
        Feline feline = new Feline();
        assertEquals(1, feline.getKittens());
    }

    @Test
    public void getKittensWithParams() {
        Feline feline = new Feline();
        assertEquals(3, feline.getKittens(3));
    }
}