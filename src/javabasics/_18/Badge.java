package javabasics._18;

import java.util.Random;

class Badge {
    private static int totalNumberOfEmployees = 0;
    private String badgeIdCode;
    public Employee employee;

    private static void keepTrackOfEmployeesNumber() {
        totalNumberOfEmployees++;
    }

    private String generateBadgeIdCode() {
        Random random = new Random();
        String code1 = "XYZ";
        String code2 = "ZYX";
        return code1 + employee.getName() + employee.getSurname() + code2;
    }

    public void showBadgeDetails() {
        System.out.println("Total number of employees tracked by badges: " + totalNumberOfEmployees);
        System.out.println("Employee Details:\n" + employee.getEmployeeDetails());
        System.out.println("Badge ID Code: " + badgeIdCode);
    }

    public Badge(Employee employeeThatNeedsBadge) {
        keepTrackOfEmployeesNumber();
        employee = employeeThatNeedsBadge;
        badgeIdCode = generateBadgeIdCode();
    }
}



