package staff_employee_manager;
public class Employee extends Staff implements ICalculator {
    private double overTime;
    private long salary;

    // method getter and setter
    public double getOverTime() {
        return overTime;
    }
    public void setOverTime(double overTime) {
        this.overTime = overTime;
    }
    public double getSalary() {
        return salary;
    }
    public void setSalary(long salary) {
        this.salary = salary;
    }
    //contrucstor
    public Employee() {
    }
    public Employee(String staffId, String name, int age, double coefficSalary, String startDate, String department,
            int dayOff, double overTime) {
        super(staffId, name, age, coefficSalary, startDate, department, dayOff);
        this.overTime = overTime;
    }
    /**
     * Employee: salary = coefficSalary * 3,000,000 + overTime * 200,000
     */
    @Override
    public long calculateSalary(){
        return (long) (salary = (long) (getCoefficSalary()* 3000000 + getOverTime() * 200000));
    }
    @Override
    public void displayInformation(){
        System.out.println("NameID \t\t: " + this.getStaffId());
        System.out.println("Name \t\t: " + this.getName());
        System.out.println("Age \t\t: " + this.getAge());
        System.out.println("Coeffic Salary \t: " + this.getCoefficSalary());
        System.out.println("Date Start \t: " + this.getStartDate());
        System.out.println("Department \t: " + this.getDepartment());
        System.out.println("Day Off \t: " + this.getDayOff());
        System.out.println("Over time \t: " + this.getOverTime());
    }
}
