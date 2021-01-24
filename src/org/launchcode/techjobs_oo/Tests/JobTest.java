package org.launchcode.techjobs_oo.Tests;


import org.junit.Test;
import org.launchcode.techjobs_oo.Job;
import org.junit.Before;

import static org.junit.Assert.assertEquals;

public class JobTest {
    Job test_car1;
    Job test_car2;

    @Before
    public void createJobObject(){
        test_car1 = new Job();
        test_car2 = new Job();
    }

    @Test
    public void testSettingJobId(){
        assertEquals(test_car1.getId(), test_car2.getId(), 1);
    }

}
