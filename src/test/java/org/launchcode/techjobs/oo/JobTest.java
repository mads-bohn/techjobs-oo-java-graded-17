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
}
