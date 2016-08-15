package it.morfoza.test;

import it.morfoza.Destination;
import it.morfoza.Grazynka;
import org.junit.Test;

import java.util.List;

import static junit.framework.TestCase.assertTrue;

/**
 * Created by ahann on 12/08/2016.
 */
public class GrazynkaTest {

    Destination destination1 = new Destination("Majorka", 170, 900);
    Destination destination2 = new Destination("Majorka", 170, 900);
    Destination destination3 = new Destination("Malediwy", 600, 4500);

    @Test
    public void testEquals(){
        assertTrue(destination1.equals(destination2));




    }
}
