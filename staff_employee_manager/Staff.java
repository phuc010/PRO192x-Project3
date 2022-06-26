package staff_employee_manager;
public abstract class Staff {
    private String staffId;
    private String name;
    private int age;
    protected double coefficSalary;
    private String startDate;
    private String department;
    private int dayOff;

    // method getter and setter
    public String getStaffId() {
        return staffId;
    }
    public void setStaffId(String staffId) {
        this.staffId = staffId;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public double getCoefficSalary() {
        return coefficSalary;
    }
    public void setCoefficSalary(double coefficSalary) {
        this.coefficSalary = coefficSalary;
    }
    public String getStartDate() {
        return startDate;
    }
    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }
    public String getDepartment() {
        return department;
    }
    public void setDepartment(String department) {
        this.department = department;
    }
    public int getDayOff() {
        return dayOff;
    }
    public void setDayOff(int dayOff) {
        this.dayOff = dayOff;
    }
    //contrucstor
    public Staff(String staffId, String name, int age, double coefficSalary, String startDate, String department,
            int dayOff) {
        this.staffId = staffId;
        this.name = name;
        this.age = age;
        this.coefficSalary = coefficSalary;
        this.startDate = startDate;
        this.department = department;
        this.dayOff = dayOff;
    }
    public Staff() {
    }
    
    public abstract void displayInformation();
}
