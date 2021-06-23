package OOP.Subpackage.Inheritance;

public class Employee {

    private String mFullNAme;
    private long mEmploymentDate;
    private long mSalary;


    public Employee (String fullName, long date, long salary){
        mFullNAme = fullName;
        mEmploymentDate = date;
        mSalary = salary;
    }
   public double getSalaryUah (){
        return mSalary / 100f;

   }

    public void setId(Integer id) {
    }
}
