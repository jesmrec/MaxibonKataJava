package com.karumi.maxibonkata;


import com.pholser.junit.quickcheck.Property;
import com.pholser.junit.quickcheck.runner.JUnitQuickcheck;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Created by jesus on 28/07/2017.
 */

@RunWith(JUnitQuickcheck.class) public class DeveloperProperties {

    private static final String ANY_NAME = "Pedro";
    private static final int ANY_NUMBER_OF_MAXIBONS = 1;

    @Property public void theNumberOfMaxibonAssignedIsPositiveOrZero(int numberOfMaxibons){
        System.out.println("------------>" + numberOfMaxibons);
        Developer developer = new Developer(ANY_NAME, numberOfMaxibons);
        assertTrue(developer.getNumberOfMaxibonsToGrab() >= 0);
    }

    @Property public void theNameOfTheDeveloperIsTheSameEver(String name){
        Developer developer =  new Developer(name, ANY_NUMBER_OF_MAXIBONS);
        System.out.println ("--->"+name+ " "+ developer.getName());
        assertEquals(name, developer.getName());
    }

    @Property public void theNameOfTheDeveloperIsTheSameEverAndMaxibonsArePositive(String name, int maxiBons){
        Developer developer =  new Developer(name, maxiBons);
        System.out.println ("--->"+developer.getName()+ " " + developer.getNumberOfMaxibonsToGrab());
        assertEquals(name, developer.getName());
        assertTrue(developer.getNumberOfMaxibonsToGrab() >= 0);

    }

}
