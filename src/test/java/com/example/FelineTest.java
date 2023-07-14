package com.example;

import junit.framework.TestCase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;
import org.mockito.stubbing.OngoingStubbing;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class FelineTest extends TestCase {

    @Mock
    Animal animal;

    @Spy
    private Feline feline;


    @Test
    public void eatMeatTest() throws Exception{
        //Arrange
        Feline feline = new Feline();
        Mockito.when(animal.getFood("Хищник")).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        //Act
        List<String> actualResult = feline.eatMeat();
        //Assert
        assertEquals(animal.getFood("Хищник"), actualResult);

    }

    @Test
    public void getFamilyTest() {
        Feline feline = new Feline();
        String actualResult = feline.getFamily();
        assertEquals("Кошачьи", actualResult);
    }

    @Test
    public void getKittensNoParamInvokeGetKittensWith1() {
        feline.getKittens();
        Mockito.verify(feline, Mockito.times(1)).getKittens(1);
    }
}