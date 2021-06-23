package OOP.Subpackage.Inheritance;

public class Engineer extends Employee {
    private String mDepartment;

    public Engineer(String fullName, long date, long salary, String department) {
        super(fullName, date, salary);
        mDepartment = department;
    }
}