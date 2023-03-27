/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author ahmad
 */
public class StaffTest {

     @Test
    public void testComputePayRoll() {
        // first we create a new Staff object to insert values 
        Staff s1 = new Staff("123", "Dawod", "Ahmadi", 32, "Male", "Clerk", 45.0, 500.0);
        double expectedPay = 1920.0; 
        double actualPay = s1.ComputePayRoll();
        assertEquals(expectedPay, actualPay, 0.0);
        
        Staff s2 = new Staff("345", "ahmad", "smith", 30, "Female", "IT", 30.0, 300.0);
        expectedPay = 1440.0; 
        actualPay = s2.ComputePayRoll();
        assertEquals(expectedPay, actualPay, 0.0);
    }
}
