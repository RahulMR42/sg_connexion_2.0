package repository;

public class EmployeeRepository {

    public String getName() {
        return this.name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public String getDesignation() {
        return this.designation;
    }

    public void setDesignation(final String designation) {
        this.designation = designation;
    }

    public String getLocation() {
        return this.location;
    }

    public void setLocation(final String location) {
        this.location = location;
    }

    public double getSalary() {
        return this.salary;
    }

    public void setSalary(final double salary) {
        this.salary = salary;
    }

    public boolean isFrontEnd() {
        return this.frontEnd;
    }

    public void setFrontEnd(final boolean frontEnd) {
        this.frontEnd = frontEnd;
    }

    public boolean isBackend() {
        return this.backend;
    }

    public void setBackend(final boolean backend) {
        this.backend = backend;
    }

    private String name;

    private String designation;

    private String location;

    private double salary;

    private boolean frontEnd;

    private boolean backend;

}
