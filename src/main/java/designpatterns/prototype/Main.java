package designpatterns.prototype;

public class Main {
    public static void main(String[] args) {
        EmployeeRecord record = new EmployeeRecord("John", 1, 45000.0);
        EmployeeRecord record1 = record.getclone();
        record.showEmployee();
        record1.showEmployee();
    }
}
