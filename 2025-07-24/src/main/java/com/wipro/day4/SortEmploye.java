package com.wipro.day4;

import java.util.*;

class EmployeeSort {
    String empId;
    String empName;
    int empAge;

    public EmployeeSort(String empId, String empName, int empAge) {
        this.empId = empId;
        this.empName = empName;
        this.empAge = empAge;
    }

    public String toString() {
        return empId + " - " + empName + " - " + empAge;
    }
}

class SortByEmpId implements Comparator<EmployeeSort> {
    public int compare(EmployeeSort e1, EmployeeSort e2) {
        return e1.empId.compareTo(e2.empId);
    }
}

class SortByEmpName implements Comparator<EmployeeSort> {
    public int compare(EmployeeSort e1, EmployeeSort e2) {
        return e1.empName.compareTo(e2.empName);
    }
}

class SortByEmpAge implements Comparator<EmployeeSort> {
    public int compare(EmployeeSort e1, EmployeeSort e2) {
        return Integer.compare(e1.empAge, e2.empAge);
    }
}

public class SortEmploye {
    public static void main(String[] args) {
        List<EmployeeSort> employees = new ArrayList<>();
        employees.add(new EmployeeSort("E103", "Alice", 30));
        employees.add(new EmployeeSort("E101", "Bob", 25));
        employees.add(new EmployeeSort("E102", "Charlie", 28));

        System.out.println("Original List:");
        for (EmployeeSort e : employees) {
            System.out.println(e);
        }

        Collections.sort(employees, new SortByEmpId());
        System.out.println("\nSorted by empId:");
        for (EmployeeSort e : employees) {
            System.out.println(e);
        }

        Collections.sort(employees, new SortByEmpName());
        System.out.println("\nSorted by empName:");
        for (EmployeeSort e : employees) {
            System.out.println(e);
        }

        Collections.sort(employees, new SortByEmpAge());
        System.out.println("\nSorted by empAge:");
        for (EmployeeSort e : employees) {
            System.out.println(e);
        }
    }
}