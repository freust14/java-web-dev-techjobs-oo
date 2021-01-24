package org.launchcode.techjobs_oo.Tests;


import org.junit.Test;
import org.launchcode.techjobs_oo.*;
import org.junit.Before;

import static org.junit.Assert.*;

public class JobTest {
    Job test_job_1;
    Job test_job_2;
    Job test_job;
    Job test_job_identical;
    Job test_job_empty_field;

    @Before
    public void createJobObject(){
        test_job_1 = new Job();
        test_job_2 = new Job();
        test_job = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        test_job_identical = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        test_job_empty_field = test_job_identical = new Job("Product tester", null, new Location("Desert"), null, new CoreCompetency("Persistence"));
    }

    @Test
    public void testSettingJobId(){
        assertEquals(test_job_1.getId(), test_job_2.getId(), 1);
    }

    @Test
    public void testJobConstructorSetsAllFields(){
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

    @Test
    public void testJobsForEquality(){
       assertFalse(test_job.equals(test_job_identical));
    }

    @Test
    public void testToStringMethod(){
        int stringLength = test_job.toString().length();
        assertEquals(test_job.toString().indexOf("\n"), 0);
        assertEquals(test_job.toString().substring(stringLength - 1), "\n");
        assertEquals(test_job.toString(),"\n"
                + "ID: " + test_job.getId() + "\n"
                + "Name: " + test_job.getName() + "\n"
                + "Employer: " + test_job.getEmployer().getValue() + "\n"
                + "Location: " + test_job.getLocation().getValue() + "\n"
                + "Position Type: " + test_job.getPositionType().getValue() + "\n"
                + "Core Competency: " + test_job.getCoreCompetency().getValue() + "\n"
                + "\n");
        assertEquals(test_job_empty_field.toString(), "\n"
                + "ID: " + test_job.getId() + "\n"
                + "Name: " + test_job.getName() + "\n"
                + "Employer: Data not available" + "\n"
                + "Location: " + test_job.getLocation().getValue() + "\n"
                + "Position Type: Data not available" + "\n"
                + "Core Competency: " + test_job.getCoreCompetency().getValue() + "\n"
                + "\n");
    }
}
