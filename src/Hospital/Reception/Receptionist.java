package Hospital.Reception;
import Hospital.Records.PatientRecords;
public class Receptionist {
    private String receptionistID;
    private String name;

    public Receptionist(String receptionistID, String name) {
        this.receptionistID = receptionistID;
        this.name = name;
    }
    public String getReceptionistID() {return receptionistID;}
    public String getName() {return name;}

    public void displayReceptionistInfo(){
        System.out.println("-------Receptionist information-----");
        System.out.println("Receptionist ID: " + receptionistID);
        System.out.println("Name: " + name);
    }
    protected void logAction(String action) {
        System.out.println("receptinist " + name + ": " + action);
    }
    String formatVisit(PatientRecords pt){
        return pt.getName() + " - appointment on " + pt.getAppointmentdate();
    }
    public void viewPatientBasicInfo(PatientRecords pt){
        logAction("viewPatientBasicInfo");
        System.out.println("Visit " + formatVisit(pt));
        pt.displayPatientBasicsInfo();
    }
}
