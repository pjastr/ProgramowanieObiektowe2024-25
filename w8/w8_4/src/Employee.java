import java.util.Objects;

class Employee extends Person {
    private String department;

    public Employee(String name, int age, String department) {
        super(name, age);
        this.department = department;
    }

    @Override
    public boolean equals(Object obj) {
        // Sprawdzenie równości z perspektywy klasy bazowej
        if (!super.equals(obj)) return false;

        // Rzutowanie obj do typu Employee
        Employee employee = (Employee) obj;

        // Porównanie dodatkowego pola
        return department != null ? department.equals(employee.department) : employee.department == null;
    }

    // Gettery, settery, hashCode(), toString() itp.


    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + Objects.hashCode(department);
        return result;
    }
}