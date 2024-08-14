package src;

public class Employee{

    private Long id;
    private String firstName;
    private String lastName;
    private String email;

    private Employee(EmployeeBuilder employeeBuilder){

        this.id = employeeBuilder.id;
        this.firstName = employeeBuilder.firstName;
        this.lastName = employeeBuilder.lastName;
        this.email = employeeBuilder.email;
    }

    public static EmployeeBuilder builder() {
        return new EmployeeBuilder();
    }

    //TODO: GETTERS e SETTERS...


    public static class EmployeeBuilder {

        private Long id;
        private String firstName;
        private String lastName;
        private String email;

        public EmployeeBuilder id(Long id){
            this.id = id;
            return this;
        }

        public EmployeeBuilder firstName(String firstName){
            this.firstName = firstName;
            return this;
        }

        public EmployeeBuilder lastName(String lastName){
            this.lastName = lastName;
            return this;
        }

        public EmployeeBuilder email(String email){
            this.email = email;
            return this;
        }

        public Employee build (){
            return new Employee(this);
        }
    }
}