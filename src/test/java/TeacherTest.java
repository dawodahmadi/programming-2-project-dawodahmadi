/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TeacherTest {

    @Test
    public void testComputePayroll() {
        // create a new teacher object with the following details
        Teacher teacher = new Teacher("abc", "Dawod", "ahmadi", 32, "Male",
                                      "Math", "PhD", true, 0.0, "Active");

        // We will call the method ComputePayroll with the mentioned hours.
        double payroll = teacher.ComputePayRoll(40);

        
        double expectedSalary = (32 * 112 * 2) * 0.85;

        // We will assert the values to check the expected vs the assterd values
        assertEquals(expectedSalary, payroll, 0.001);
    }

    @Test
    public void testDegreeRate() {
        // create a new teacher object with the following parameters
        Teacher teacher = new Teacher("1234", "John", "Doe", 35, "Male",
                                      "Math", "PhD", true, 0.0, "Active");

       
        double phdRate = teacher.degreeRate("PhD");
        double masterRate = teacher.degreeRate("Master");
        double bachelorRate = teacher.degreeRate("Bachelor");

        
        assertEquals(112, phdRate, 0.001);
        assertEquals(82, masterRate, 0.001);
        assertEquals(42, bachelorRate, 0.001);
    }
}
