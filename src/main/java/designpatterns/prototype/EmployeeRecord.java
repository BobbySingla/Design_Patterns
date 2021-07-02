package designpatterns.prototype;

public class EmployeeRecord implements Prototype {
    private String userName;
    private int id;
    private Double salary;

    public EmployeeRecord(String userName, int id, Double salary) {
        this();
        this.userName = userName;
        this.id = id;
        this.salary = salary;
    }

    public EmployeeRecord() {
        System.out.println("EmployeRecord class called");
    }

    public void showEmployee() {
        System.out.println("name " + userName + " id " + id + " salary " + salary);
    }

    @Override
    public EmployeeRecord getclone() {
        return new EmployeeRecord(userName, id, salary);
    }
}
