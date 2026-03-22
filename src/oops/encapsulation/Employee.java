package oops.encapsulation;

public class Employee {
    private String userName;
    private int id;
    private String salary;
    private String role;
    private String dname;

    public Employee(String userName, int id, String salary, String role, String dname) {
        this.userName = userName;
        this.id = id;
        this.salary = salary;
        this.role = role;
        this.dname = dname;

    }

    public String getUserName() {
        return userName;
    }

    public int getId() {
        return id;
    }

    public String getSalary() {
        return salary;
    }

    public String getRole() {
        return role;
    }

    public String getDname() {
        return dname;
    }

    public void setUserName(String userName) {
        this.userName = userName;

    }

    public void setEmail(int id) {
        this.id = id;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public void setRole(String role) {
        this.salary = salary;

    }

    public void setDname(String dname) {
        this.salary = salary;
    }
}

