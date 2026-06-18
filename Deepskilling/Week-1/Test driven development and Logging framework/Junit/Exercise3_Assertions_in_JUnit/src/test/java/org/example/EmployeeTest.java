package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class EmployeeTest {

    @Test
    public void testEmployee() {

        Employee emp = new Employee();

        assertEquals("John",emp.getName());
        assertEquals(50000,emp.getSalary());
        assertTrue(emp.isPermanent());
        assertFalse(emp.getSalary()<30000);
        assertNull(emp.getDepartment());
        assertNotNull(emp.getName());
    }
}