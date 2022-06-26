import java.util.*;
import staff_employee_manager.*;
public class HumanResources {
    
    public static Scanner sc = new Scanner(System.in);
    public static ArrayList<Staff> staffList = new ArrayList<>();
    public static ArrayList<Department> departmentsList = new ArrayList<>();
            static Department slObj = new Department("001SL", "SALE", 0);
            static Department hrObj = new Department("002HR", "HR", 0);
            static Department itObj = new Department("003IT", "IT", 0);
            static Department mkObj = new Department("004MK", "MAKETING", 0);
            
    public static String staffId;
    public static String name;
    public static int age;
    public static double coefficSalary ;
    public static String startDate;
    public static String department;
    public static int dayOff;
    public static int inputNumberCase4;
    public static void main(String[] args) {
    addDepartmentList();
    boolean flag = true;
    do {
        System.out.println("---------------------------------------");
        System.out.println("This program Human Resources Management");
        System.out.println("---------------------------------------");
        System.out.println("------------------MENU-----------------");
        System.out.println("What are you want doing?");
        System.out.println("\t1: View Staff's List.");
        System.out.println("\t2: View Departments's List.");
        System.out.println("\t3: View Staff list of each Departments.");
        System.out.println("\t4: Add new Staff.");
        System.out.println("\t5: Search a Staff");
        System.out.println("\t6: View Staff Payroll");
        System.out.println("\t7: Exit");
        System.out.print("Enter you choice: ");
        int choiceNumber = sc.nextInt();

        if (choiceNumber == 7) {
            flag = false;
        }
        switch (choiceNumber) {
            case 1:
                showStaffList();
            break;
            case 2:
                showDepartmentList();
            break;
            case 3:
                showStaffListEachDeptm();
            break;
            case 4:
                do {
                    addStaff();
                } while (inputNumberCase4 == 2);
            break;
            case 5: 
                searchStaff();
            break;
            case 6: 
                showStaffPayroll();
            break;
            default:
                flag = false;
            break;
        }
    } while (flag == true);
}

//add department in arraylist
public static void addDepartmentList(){
    departmentsList.add(slObj);
    departmentsList.add(hrObj);
    departmentsList.add(itObj);
    departmentsList.add(mkObj);
}
//Confirm before exiting
public static void esc(){
    System.out.print("Press Any NumberKey return to MENU ");
        sc.nextInt();
}

//case 1: Show the list of staffs in the company
public static void showStaffList() {
    System.out.println();
    System.out.println("STAFF LIST: ");
    for (int i = 0; i < staffList.size(); i++) {
        System.out.println("Staff: " + (i+1) );
        staffList.get(i).displayInformation();
        System.out.println("----------------");
    }
    esc();
}
/**-------------------------------------
case 2: Show the list of departments in the company */
public static void showDepartmentList() {
    System.out.println();
    System.out.println("DEPARTMENTS LIST: ");
    
    for (int i = 0; i < departmentsList.size(); i++) {
        System.out.println(departmentsList.get(i).toString()); 
    }
    esc();
}
/**-------------------------------------
case 3: Show staffs by department */
public static void showStaffListEachDeptm() {
    System.out.println();
    System.out.println("STAFF LIST EACH DEPARTMENT: ");
    System.out.print("What department? 1-SALE 2-HR 3-IT 4-MARKETING: ");
    String choose = sc.next();
    switch (choose) {
        case "1":
        for ( int i = 0; i < staffList.size(); i++) {
            if (staffList.get(i).getDepartment().equals("SALE")) {
                staffList.get(i).displayInformation();
                System.out.println("----------------");
            }
        }
        esc();
            break;
        case "2":
        for ( int i = 0; i < staffList.size(); i++) {
            if (staffList.get(i).getDepartment().equals("HR")) {
                staffList.get(i).displayInformation();
                System.out.println("----------------");
            }
        }
        esc();
            break;
        case "3":
        for ( int i = 0; i < staffList.size(); i++) {
            if (staffList.get(i).getDepartment().equals("IT")) {
                staffList.get(i).displayInformation();
                System.out.println("----------------");
            }
        }
        esc();
            break;
        default:
        for ( int i = 0; i < staffList.size(); i++) {
            if (staffList.get(i).getDepartment().equals("MARKETING")) {
                staffList.get(i).displayInformation();
                System.out.println("----------------");
            }
        }
        esc();
            break;
    }
}
/**-------------------------------------
case 4: add Staff */
public static void addStaff() {
    System.out.println("---------------------------------------");
    System.out.print("Who do you want to add?: 1-Employee 2-Manager? ");
    int choose = sc.nextInt();
    switch (choose) {
        case 1:
            addGeneralInfor();
            System.out.print("Enter Overtime \t: ");
            int overTime = sc.nextInt();

            Employee employeeObj = new Employee(staffId, name, age, coefficSalary, startDate, department, dayOff, overTime);

            staffList.add(employeeObj);
            //notification
            System.out.println("Data has been successfully imported");
            System.out.print("Press key to continue: 1-Return MENU  2-Add other Staff: ");
            inputNumberCase4 = sc.nextInt();
        break;
        default:
            addGeneralInfor();
            System.out.print("Enter position manager: 1-Business Leader  2-Project Leader  3-Technical Leader: ");
            String choice = sc.next();
            String position;
            switch (choice) {
                case "1":
                position = "Business Leader";
                break;
                case "2":
                position = "Project Leader";
                break;
                default:
                position = "Technical Leader";
                break;
            };
            //creat managerObj save information Manager, add arrlist
            Manager managerObj = new Manager(staffId, name, age, coefficSalary, startDate, department, dayOff, position);
            staffList.add(managerObj);
            //notification
            System.out.println("Data has been successfully imported");
            System.out.print("Press key to continue: 1-Return MENU  2-Add other Staff: ");
            inputNumberCase4 = sc.nextInt();
        break;
    }
}
    //case4.1 add general information Staff
    public static void addGeneralInfor(){
        System.out.print("NameID \t\t: " );
        staffId = sc.next();
        System.out.print("Name \t\t: " );
        name = sc.next(); sc.nextLine();
        System.out.print("Age \t\t: " );
        age = sc.nextInt();
        System.out.print("Coeffic Salary \t: " );
        coefficSalary = sc.nextDouble();
        System.out.print("Date Start \t: ");
        startDate = sc.next();
        System.out.print("Enter Department: 1-SALE 2-HR 3-IT 4-MARKETING: " );
        int choose = sc.nextInt();
        switch (choose) {
            case 1:
            addSl();
            department = "SALE";
                break;
            case 2:
            addHr();
            department = "HR";
                break;
            case 3:
            addIt();
            department = "IT";
                break;
            default:
            addMK();
            department = "MARKETING";
                break;
        }
        System.out.print("Day Off \t: " );
        dayOff = sc.nextInt();
    }

    public static void addSl(){
        slObj.addStaffDepartment();
    }
    public static void addHr(){
        hrObj.addStaffDepartment();
    }
    public static void addIt(){
        itObj.addStaffDepartment();
    }
    public static void addMK(){
        mkObj.addStaffDepartment();
    }
/**-------------------------------------
case 5: Search a staff information by name or nameID  */
public static void searchStaff() {
    System.out.println();
    System.out.println("SEARCH STAFF: ");
    System.out.print("Enter name or name ID: ");
    String search = sc.next();
    for (int i = 0; i < staffList.size(); i++) {
        if ((staffList.get(i).getName()).equalsIgnoreCase(search) || (staffList.get(i).getStaffId()).equalsIgnoreCase(search)  ) {
            staffList.get(i).displayInformation();
        }
    }
    esc();
}
/**-------------------------------------
case 6: show StaffPayroll */
public static void showStaffPayroll() {
    System.out.println();
    System.out.println("STAFF PAYROLL: ");
    for (int i = 0; i < staffList.size(); i++) {
        System.out.println("Staff \t: " + (i+1) );
        System.out.println("NameID \t: " + staffList.get(i).getStaffId());
        System.out.println("Name \t: " + staffList.get(i).getName());
        //if error Employee then do Manager
        try {
            System.out.println("Salary \t: " + ((Employee) staffList.get(i)).calculateSalary());
        } catch (Exception e) {
            System.out.println("Salary \t: " + ((Manager) staffList.get(i)).calculateSalary());
        }
        System.out.println("----------------");
    }
    esc();
}
}