package org.launchcode.techjobs.oo;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions.*;

//import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;
//import static org.junit.Assert.*;

public class JobTest {
    //TODO: Create your unit tests here
    //empty test
    @Test
    public void emptyTest(){
        assertTrue(true);
    }

    Job test_job1=new Job();
    Job test_job2=new Job();

    @Test
    public void testTwoJobObjectsNotEqual(){

        assertNotEquals(test_job1.getId(),test_job2.getId());
    }

    @Test
    public void testJobConstructorSetsAllFields(){
        Job test_job3= new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertTrue(test_job3.getEmployer() instanceof Employer);
        assertTrue(test_job3.getLocation() instanceof Location);
        assertTrue(test_job3.getPositionType() instanceof PositionType);
        assertTrue(test_job3.getCoreCompetency() instanceof CoreCompetency);

        assertEquals("Product tester",test_job3.getName());
        assertEquals("ACME",test_job3.getEmployer().getValue());
        assertEquals("Desert",test_job3.getLocation().getValue());
        assertEquals("Quality control",test_job3.getPositionType().getValue());
        assertEquals("Persistence",test_job3.getCoreCompetency().getValue());

    }

    @Test
    public void testJobsForEquality(){
        Job test_job4= new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Job test_job5= new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

        assertFalse(test_job4.equals(test_job5));
    }
//
//    // constructor sets name properly
//    @Test
//    public void testJobConstructorSetsValuesCorrectly(){
////        createInitialFieldsObjects();
//        assertEquals("Junior Data Analyst", test_job.getName());
//        assertEquals("Lockerdome",test_job.getEmployer().getValue());
//    }
//
//    //test if the Employer id inrements
//    @Test
//    public void testEmployerIdIncrements(){
//    Employer test_employer2=new Employer("LaunchCode");
//    assertEquals(1,test_employer.getId());
//    assertEquals(2,test_employer2.getId());
//
//    }

}
