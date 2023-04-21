package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws PersonNotFoundEx_Exception {
        PersonService_Service pService = new PersonService_Service();
        PersonService pServiceProxy = pService.getPersonServiceImplPort();

        var answer = -1;
        var scanner = new Scanner(System.in);
        while (answer < 7) {
            printMenu();
            try {
                answer = scanner.nextInt();
            } catch (InputMismatchException e) {
                answer = 7;
            }
            switch (answer) {
                case 1 -> {
                    System.out.print("    Person ID: ");
                    var personId = scanner.nextInt();
                    var person = pServiceProxy.getPerson(personId);
                    printPerson(person);
                }
                case 2 -> {
                    var persons = pServiceProxy.getAllPersons();
                    persons.forEach(Main::printPerson);
                }
                case 3 -> {
                    var personsCount = pServiceProxy.countPersons();
                    System.out.println("      There are " + personsCount + " person(s) in the database");
                }
                case 4 -> {
                    System.out.print("    Person ID: ");
                    var personId = scanner.nextInt();
                    System.out.print("    Person name: ");
                    var personName = scanner.next();
                    System.out.print("    Person age: ");
                    var personAge = scanner.nextInt();
                    try {
                        var person = pServiceProxy.addPerson(personId, personName, personAge);
                        printPerson(person);
                    } catch (PersonExistsEx_Exception e) {
                        System.out.println("      ERROR: This ID is already in use");
                    }
                }
                case 5 -> {
                    System.out.print("    Person ID: ");
                    var personId = scanner.nextInt();
                    System.out.print("    Person name: ");
                    var personName = scanner.next();
                    System.out.print("    Person age: ");
                    var personAge = scanner.nextInt();
                    try {
                        var person = pServiceProxy.updatePerson(personId, personName, personAge);
                        printPerson(person);
                    } catch (PersonNotFoundEx_Exception e) {
                        System.out.println("      ERROR: Person with this ID does not exist");
                    }
                }
                case 6 -> {
                    System.out.print("    Person ID: ");
                    var personId = scanner.nextInt();
                    try {
                        pServiceProxy.deletePerson(personId);
                    } catch (PersonNotFoundEx_Exception e) {
                        System.out.println("      ERROR: Person with this ID does not exist");
                    }
                }
            }
        }
        System.out.println(".");
        System.out.println(".");
        System.out.println("      Client done. Thank you!");
    }

    private static void printMenu() {
        System.out.println(".");
        System.out.println(".");
        System.out.println("==== SELECT OPTION ===== ");
        System.out.println("  1. Get person");
        System.out.println("  2. Get all persons");
        System.out.println("  3. Get persons count");
        System.out.println("  4. Create person");
        System.out.println("  5. Update person");
        System.out.println("  6. Delete person");
        System.out.println("  *. Exit");
        System.out.print("  ");
    }

    private static void printPerson(Person person) {
        System.out.println("      Person { id = " + person.id + ", name = " + person.firstName + ", age = " + person.age + " }");
    }
}