package it.morfoza.test;

import it.morfoza.BudgetConsole;
import org.junit.Assert;
import org.junit.Test;



public class AssertionTest {

    @Test
    public void should(){
        //Given
        Grupa grupa = new Grupa();

        grupa.dodajobregoUcznia();
        grupa.dodajZlegoUcznia();

        //when
        int [] faktyczneOceny = grupa.ocenUczniow();

        //then
        int[] oczekiwaneOceny = {5, 2};
        Assert.assertArrayEquals("oceny się różnią!", oczekiwaneOceny, faktyczneOceny);


        Assert.assertTrue(true);
        Assert.assertFalse(false);

        int[] tablica1 = new int[5];
        int[] tablica2 = new int[5];
        Assert.assertArrayEquals(tablica1, tablica2);
        }

    }

