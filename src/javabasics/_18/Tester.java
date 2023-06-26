package javabasics._18;
public class Tester {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Anna", "Rossi", "via Torino 10");
        Employee employee2 = new Employee("Luca ", "Bianchi", "via Roma 20");

        Badge badge1 = new Badge(employee1);
        Badge badge2 = new Badge(employee2);

        badge1.showBadgeDetails();
        System.out.println();
        badge2.showBadgeDetails();
    }
}

