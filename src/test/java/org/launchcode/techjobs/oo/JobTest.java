package org.launchcode.techjobs.oo;

import org.junit.Test;

import static org.junit.Assert.*;

public class JobTest {
    //TODO: Create your unit tests here

    Job acmeJob = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

    @Test
    public void testSettingJobId() {
        Job firstJob = new Job();
        Job secondJob = new Job();
        assertNotEquals(firstJob, secondJob);
    }

    @Test
    public void testJobConstructorSetsAllFields() {
        // assert value and class of name
        assertEquals(acmeJob.getName(), "Product tester");
        assertTrue(acmeJob.getName() instanceof String);
        // assert value and class of employer
        assertEquals(acmeJob.getEmployer().getValue(), "ACME");
        assertTrue(acmeJob.getEmployer() instanceof Employer);
        // assert value and class of location
        assertEquals(acmeJob.getLocation().getValue(), "Desert");
        assertTrue(acmeJob.getLocation() instanceof Location);
        // assert value and class of positionType
        assertEquals(acmeJob.getPositionType().getValue(), "Quality control");
        assertTrue(acmeJob.getPositionType() instanceof PositionType);
        // assert value and class of coreCompetency
        assertEquals(acmeJob.getCoreCompetency().getValue(), "Persistence");
        assertTrue(acmeJob.getCoreCompetency() instanceof CoreCompetency);
    }

    @Test
    public void testJobsForEquality() {
        Job firstJob = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Job secondJob = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertNotEquals(firstJob, secondJob);
    }

    @Test
    public void testToStringStartsAndEndsWithNewLine() {
        String testString = acmeJob.toString();
        String firstChar = Character.toString(acmeJob.toString().charAt(0));
        String lastChar = Character.toString(testString.charAt(testString.length() - 1));
        assertEquals(firstChar, System.lineSeparator());
        assertEquals(lastChar, System.lineSeparator());
    }

    @Test
    public void testToStringContainsCorrectLabelsAndData() {
        String expectedString = System.lineSeparator() +
                "ID: 6" + System.lineSeparator() +
                "Name: Product tester" + System.lineSeparator() +
                "Employer: ACME" + System.lineSeparator() +
                "Location: Desert" + System.lineSeparator() +
                "Position Type: Quality control" + System.lineSeparator() +
                "Core Competency: Persistence" + System.lineSeparator();
        String actualString = acmeJob.toString();
        assertEquals(expectedString, actualString);
    }

    @Test
    public void testToStringHandlesEmptyField() {
        Job job = new Job("Product tester", new Employer("ACME"), new Location(""), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        String expectedString = System.lineSeparator() +
                "ID: 5" + System.lineSeparator() +
                "Name: Product tester" + System.lineSeparator() +
                "Employer: ACME" + System.lineSeparator() +
                "Location: Data not available" + System.lineSeparator() +
                "Position Type: Quality control" + System.lineSeparator() +
                "Core Competency: Persistence" + System.lineSeparator();
        String actualString = job.toString();
        assertEquals(expectedString, actualString);
    }
}
