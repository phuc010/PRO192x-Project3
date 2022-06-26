package staff_employee_manager;

public class Department{
    private String departmentID;
    private String departmentName;
    private int totalStaf;

    public int getTotalStaf() {
        return totalStaf;
    }
    public void setTotalStaf(int totalStaf) {
        this.totalStaf = totalStaf;
    }
    //getter and setter
    public String getDepartmentID() {
        return departmentID;
    }
    public void setDepartmentID(String departmentID) {
        this.departmentID = departmentID;
    }
    public String getDepartmentName() {
        return departmentName;
    }
    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }
    //contructor
    public Department() {
    }
    public Department(String departmentID, String departmentName, int totalStaf) {
        this.departmentID = departmentID;
        this.departmentName = departmentName;
        this.totalStaf = totalStaf;
    }

    public void addStaffDepartment(){
        this.totalStaf = totalStaf+1;
    }
    public String toString(){
        return "Department ID \t: " + this.getDepartmentID() + "\nDepartment Name : " +  this.getDepartmentName() + "\nTotal Staff \t: " + this.getTotalStaf() + "\n------------------" ;
    }
}