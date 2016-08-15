package it.morfoza.test;

import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;
import static org.assertj.core.api.Assertions.assertThat;
import static org.hamcrest.CoreMatchers.equalTo;
//import static org.junit.Assert.assertThat;

/**
 * Created by ahann on 12/08/2016.
 */
public class AssertTest2 {

    @Test
    public void should(){

        long a = 7;
        long b = 7;
        Assert.assertEquals(a, b);
        Assert.assertFalse(7==5);
        Assert.assertTrue("seven is greater than five, no?", 7>5);
        Assert.assertFalse("seven is greater than five, no?", 7<5);
        Assert.assertNotEquals("Costam", 7.8, 7.9, 0.1);


    }

    public void should2() {
        long a = 10;
        long b = 10;
        Assert.assertTrue(true);
        Assert.assertFalse(false);
        Assert.assertEquals(a, b);
        Assert.assertNotEquals(12, b);
        Assert.assertNotNull("", b);
        Assert.assertNotSame("", a);

        String x = "trala";
        String z = "tra";

        if(true) {
            z = z + "la";

        }
//        assertEquals(x, z);
//        Assert.fail();assertThat(x, equalTo(z));
        Assert.assertTrue(x.equals(z));
        Assert.assertThat(x, CoreMatchers.not(equalTo(z)));

    }

//    public void testWithAssertJ(){
//
//        String ab = "111.1111sss";
//        assertThat(ab).containsOnlyDigits();
//       assertThat(ab).doesNotStartWith("1111");
//    }


}
