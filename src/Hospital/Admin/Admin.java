package Hospital.Admin;

public class Admin {
    private String adminID;
    private String department;
    private int receiptCounter = 0;

    public Admin(String adminID, String department){
        this.adminID = adminID;
        this.department = department;
    }

    public String getAdminID() {return adminID;}
    public String getAdmDept() {return department;}
    protected void lofAction(String action){
        System.out.println("Admin " + adminID + ": " + action);
    }
    String generateReceiptNumber(){
        return adminID + "-RCPT" + (++receiptCounter);
    }
    public FinancialRecords CreateFinancialRecords(int recordID, int patientID, double amountBilled, double amountPaid){
        lofAction("Creating financial record " + recordID);
        return new FinancialRecords(recordID, patientID, amountBilled, amountPaid, this);
    }
    public void  viewFinancialRecords(FinancialRecords records){
        lofAction("view financial records");
        records.displayFinancialRecords(this);
    }
    public  void receivePayment(FinancialRecords records, double amount){
        records.addPayment(this, amount);
        lofAction("Payment of " + amount + " received. Receipt: " +  generateReceiptNumber());
    }

    public void displayAdminInfo(){
        System.out.println("Admin Info");
        System.out.println("Admin ID: " + adminID);
        System.out.println("Department ID: " + department);
    }
}
