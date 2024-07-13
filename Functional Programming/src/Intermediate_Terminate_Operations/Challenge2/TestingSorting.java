package Intermediate_Terminate_Operations.Challenge2;

import java.util.Comparator;
import java.util.List;

public class TestingSorting {
    public static void main(String[] args) {

        List<Employee> employees = List.of(
                new Employee("Namit",40000),
                new Employee("Pooja",55000),
                new Employee("Om",25000),
                new Employee("Hary",150),
                new Employee("Meera",1000)
        );

//        sorted(Comparator.comparingInt(Employee::getSalary))
        employees.stream()
                .sorted((emp1 , emp2) -> emp1.getSalary() -emp2.getSalary())
                .forEach(System.out::println);
    }
}
