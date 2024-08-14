package src;

public class Main {
    public static void main(String[] args) {

        Employee employee = Employee.builder()
                .id(5L)
                .firstName("Felipe")
                .lastName("Costa")
                .email("felipe@gmail.com")
                .build();
    }
}