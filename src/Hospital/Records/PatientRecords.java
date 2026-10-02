package Hospital.Records;
import Hospital.Clinical.Doctor;
public class PatientRecords {
    private int patientID;
    private String name;
    private String appointmentdate;


    private String illness;
    private String typeOfTreatment;

    public PatientRecords(int patientID, String name, String appointmentdate, String illness, String typeOfTreatment) {
        this.patientID = patientID;
        this.name = name;
        this.appointmentdate = appointmentdate;
        this.illness = illness;
        this.typeOfTreatment = typeOfTreatment;
    }
    public int getPatientID() {return patientID;}
    public String getName() {return name;}
    public String getAppointmentdate() {return appointmentdate;}

    public void displayPatientBasicsInfo(){
        System.out.println("============ PATIENT INFO ============");
        System.out.println("Patient ID: " + this.patientID);
        System.out.println("Name: " + this.name);
        System.out.println("Appointment date: " + this.appointmentdate);

    }

    public String getIllness(Doctor dr) {
        CheckDoctor(dr);
        return illness;
    }
    public String getTypeOfTreatment(Doctor dr) {
        CheckDoctor(dr);
        return typeOfTreatment;
    }


    public void SetIlleness(Doctor dr, String illness) {
        CheckDoctor(dr);
        this.illness = illness;
    }
    public void  SetTypeOfTreatment(Doctor dr, String TypeOfTreatment) {
        CheckDoctor(dr);
        this.typeOfTreatment = TypeOfTreatment;
    }
    public void displayPatientFullInfo(Doctor dr){
        CheckDoctor(dr);
        System.out.println("============ PATIENT FULL ============");
        displayPatientBasicsInfo();
        System.out.println("Illness: " + this.illness);
        System.out.println("TypeOfTreatment: " + this.typeOfTreatment);

    }
    private void CheckDoctor(Doctor dr) {
        if(dr == null){
            throw new NullPointerException("Access denied: only doctors can be access !");
        }
    }
}
