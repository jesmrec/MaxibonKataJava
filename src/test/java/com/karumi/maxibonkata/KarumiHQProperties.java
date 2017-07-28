package com.karumi.maxibonkata;

import com.pholser.junit.quickcheck.Property;
import com.pholser.junit.quickcheck.runner.JUnitQuickcheck;
import org.junit.runner.RunWith;
import com.pholser.junit.quickcheck.From;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Created by jesus on 28/07/2017.
 */

@RunWith(JUnitQuickcheck.class) public class KarumiHQProperties {

    @Property
    public void theNumberOfMaxibonsIsAlwaysGreaterThanTwo(
            @From(DevelopersGenerator.class) Developer developer){
        KarumiHQs karumihq = new KarumiHQs();
        karumihq.openFridge(developer);
        System.out.println("--->"+karumihq.getMaxibonsLeft());
        assertTrue(karumihq.getMaxibonsLeft() > 2);
    }
}
