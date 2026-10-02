package Hospital.Admin;

public class Admin {
    private String adminID;
    private String department;

    public Admin(String adminID, String department){
        this.adminID = adminID;
        this.department = department;
    }

    public String getAdminID() {return adminID;}
    public String getAdmDept() {return department;}

    public void displayAdminInfo(){
        System.out.println("Admin Info");
        System.out.println("Admin ID: " + adminID);
        System.out.println("Department ID: " + department);
    }
}
