package Hospital.Admin;

public class FinancialRecords {
    private int recordID;
    private int patientID;
    private double amountBilled;
    private double amountPaid;

    public FinancialRecords(int recordID, int patientID, double amountBilled, double amountPaid, Admin adm) {
        this.recordID = recordID;
        this.patientID = patientID;
        this.amountBilled = amountBilled;
        this.amountPaid = amountPaid;
        checkAdmin(adm);
    }
    protected double calculateBalance(){
        return amountBilled - amountPaid;
    }
    public  int getPatientID(Admin adm){
        checkAdmin(adm);
        return patientID;
    }
    public double getAmountBilled(Admin adm){
        checkAdmin(adm);
        return amountBilled;
    }
    public double getAmountPaid(Admin adm){
        checkAdmin(adm);
        return amountPaid;
    }
    public double getBalance(Admin adm){
        checkAdmin(adm);
        return calculateBalance();
    }
    public void displayFinancialRecords(Admin adm){
        checkAdmin(adm);
        System.out.println("----------Financial Records-----------");
        System.out.println("Record ID: " + recordID);
        System.out.println("Patient ID: " + patientID);
        System.out.println("Amount Billed: " + amountBilled);
        System.out.println("Amount Paid: " + amountPaid);
        System.out.println("Balance " + calculateBalance());
    }
    private void checkAdmin(Admin adm){
        if(adm == null){
            throw new NullPointerException("Access denied financial records are for admin only");
        }
    }
}
