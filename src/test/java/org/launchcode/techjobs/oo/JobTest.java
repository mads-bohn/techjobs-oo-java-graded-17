package org.launchcode.techjobs.oo;

import org.junit.Test;

import static org.junit.Assert.*;

public class JobTest {
    //TODO: Create your unit tests here
    @Test
    public void testSettingJobId() {
        Job firstJob = new Job();
        Job secondJob = new Job();
        assertNotEquals(firstJob, secondJob);
    }

    @Test
    public void testJobConstructorSetsAllFields() {
        Job job = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        // assert value and class of name
        assertEquals(job.getName(), "Product tester");
        assertTrue(job.getName() instanceof String);
        // assert value and class of employer
        assertEquals(job.getEmployer().getValue(), "ACME");
        assertTrue(job.getEmployer() instanceof Employer);
        // assert value and class of location
        assertEquals(job.getLocation().getValue(), "Desert");
        assertTrue(job.getLocation() instanceof Location);
        // assert value and class of positionType
        assertEquals(job.getPositionType().getValue(), "Quality control");
        assertTrue(job.getPositionType() instanceof PositionType);
        // assert value and class of coreCompetency
        assertEquals(job.getCoreCompetency().getValue(), "Persistence");
        assertTrue(job.getCoreCompetency() instanceof CoreCompetency);
    }

    @Test
    public void testJobsForEquality() {
        Job firstJob = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Job secondJob = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertNotEquals(firstJob, secondJob);
    }

    @Test
    public void testToStringStartsAndEndsWithNewLine() {
        Job job = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        String testString = job.toString();
        String firstChar = Character.toString(job.toString().charAt(0));
        String lastChar = Character.toString(testString.charAt(testString.length() - 1));
        assertEquals(firstChar, System.lineSeparator());
        assertEquals(lastChar, System.lineSeparator());
    }

    @Test
    public void testToStringContainsCorrectLabelsAndData() {
        Job job = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        String expectedString = System.lineSeparator() +
                "ID: 1" + System.lineSeparator() +
                "Name: Product tester" + System.lineSeparator() +
                "Employer: ACME" + System.lineSeparator() +
                "Location: Desert" + System.lineSeparator() +
                "Position Type: Quality control" + System.lineSeparator() +
                "Core Competency: Persistence" + System.lineSeparator();
        String actualString = job.toString();
        assertEquals(expectedString, actualString);
    }

    @Test
    public void testToStringHandlesEmptyField() {

    }
}
