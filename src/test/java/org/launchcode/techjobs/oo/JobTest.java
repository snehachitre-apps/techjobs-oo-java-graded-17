package org.launchcode.techjobs.oo;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions.*;

//import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;
//import static org.junit.Assert.*;

public class JobTest {
    //TODO: Create your unit tests here


    @Test
    public void testSettingJobId(){
        Job test_job1=new Job();
        Job test_job2=new Job();
        assertNotEquals(test_job1.getId(),test_job2.getId());
    }

    @Test
    public void testJobConstructorSetsAllFields(){
        Job test_job3= new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

        assertTrue(test_job3.getEmployer() instanceof Employer, "ACME should be instance of Employer");
        assertTrue(test_job3.getLocation() instanceof Location,"Desert should be instance of Location");
        assertTrue(test_job3.getPositionType() instanceof PositionType,"Quality control should be instance of PositionType");
        assertTrue(test_job3.getCoreCompetency() instanceof CoreCompetency,"Persistence should be instance of CoreCompetency");
        assertTrue(test_job3 instanceof Job,"Product Tester object shpuld be instance of Job");

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

        assertNotEquals(test_job4.getId(), test_job5.getId());
    }

    @Test
    public void testToStringStartsAndEndsWithNewLine(){

        Job test_job6= new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        String newLine= System.lineSeparator();

        String string=test_job6.toString();

        boolean first= string.startsWith(newLine);
        boolean last=string.endsWith(newLine);
        assertTrue(first, "String Starts with new line");
        assertTrue(last, "String ends with new line");

    }

    @Test
    public void testToStringContainsCorrectLabelsAndData(){
        Job test_job7= new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        String newLine= System.lineSeparator();

//        String string=test_job7.toString();

        String expected= newLine +"ID: " + test_job7.getId()+  newLine+
        "Name: Product tester" + newLine +
        "Employer: ACME" + newLine +
        "Location: Desert" + newLine +
        "Position Type: Quality control" + newLine +
        "Core Competency: Persistence" + newLine;

        String actual=test_job7.toString();

        assertEquals(expected,actual,"toString returns correct labels and data.");
    }

    @Test
    public void testToStringHandlesEmptyField(){
        Job test_job8= new Job("Product tester", new Employer("ACME"), new Location(""), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        String newLine= System.lineSeparator();

//        String string=test_job8.toString();

        String expected= newLine +"ID: " + test_job8.getId()+  newLine+
                "Name: Product tester" + newLine +
                "Employer: ACME" + newLine +
                "Location: Data not available" + newLine +
                "Position Type: Quality control" + newLine +
                "Core Competency: Persistence" + newLine;

        String actual=test_job8.toString();

        assertEquals(expected,actual,"toString handles empty fields");

    }

    @Test
    public void testToStringHandlesAllEmptyFieldExceptID(){
        Job test_job9= new Job();
//        String newLine= System.lineSeparator();

        String string=test_job9.toString();

        String expected= "OOPS! This job does not seem to exist";

        String actual=test_job9.toString();

        assertEquals(expected,actual,"toString handles all empty fields except ID");

    }
}
