package staff_employee_manager;
public class Manager extends Staff implements ICalculator{
    private String position;
    private long salary;
    // method getter and setter
    public double getSalary() {
        return salary;
    }
    public void setSalary(long salary) {
        this.salary = salary;
    }
    public String getPosition() {
        return position;
    }
    public void setPosition(String position) {
        this.position = position;
    }
    //contructor
    public Manager(String staffId, String name, int age, double coefficSalary, String startDate, String department,
            int dayOff, String position) {
        super(staffId, name, age, coefficSalary, startDate, department, dayOff);
        this.position = position;
    }
    public Manager() {
    }

    @Override
    public long calculateSalary() {
        long responSalary;
        if ( getPosition().equals("Business Leader")) {
            responSalary = 8000000;
        } else if (getPosition().equals("Project Leader")){
            responSalary = 5000000;
        } else {
            responSalary = 6000000;
        }
        return salary = (long) (coefficSalary * 5000000 + responSalary);
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
        System.out.println("Position \t: " + this.getPosition());
    }
}
