package org.launchcode.techjobs_oo.Tests;


import org.junit.Test;
import org.launchcode.techjobs_oo.*;
import org.junit.Before;

import static org.junit.Assert.*;

public class JobTest {
    Job test_job_1;
    Job test_job_2;

    @Before
    public void createJobObject(){
        test_job_1 = new Job();
        test_job_2 = new Job();
    }

    @Test
    public void testSettingJobId(){
        assertEquals(test_job_1.getId(), test_job_2.getId(), 1);
    }

    @Test
    public void testJobConstructorSetsAllFields(){
       Job test_job =  new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
       assertTrue(test_job.getEmployer() instanceof Employer);
       assertTrue(test_job.getLocation() instanceof Location);
       assertTrue(test_job.getPositionType() instanceof PositionType);
       assertTrue(test_job.getCoreCompetency() instanceof CoreCompetency);
       assertEquals(test_job.getName(), "Product tester");
       assertEquals(test_job.getEmployer().getValue(), "ACME");
       assertEquals(test_job.getLocation().getValue(), "Desert");
       assertEquals(test_job.getPositionType().getValue(), "Quality control");
       assertEquals(test_job.getCoreCompetency().getValue(), "Persistence");

    }
}
