package Hospital.Clinical;
import Hospital.Records.PatientRecords;

public class Doctor {
    private String doctorID;
    private String specialization;

    public Doctor(String doctorID, String specialization) {
        this.doctorID = doctorID;
        this.specialization = specialization;
    }
    public String getDoctorID() {return this.doctorID;}
    public String getSpecialization() {return this.specialization;}

    public void displayDoctorInfo(){
        System.out.println("======= Doctor Information =======");
        System.out.println("Doctor ID: " + doctorID);
        System.out.println("Specialization: " + specialization);
    }
    public void SetPatientiIllness(PatientRecords pt, String NewIllness ){
        pt.SetIlleness(this, NewIllness);
    }
    public void SetPatientTypeOfTreatment(PatientRecords pt, String NewTreatment ){
        pt.SetTypeOfTreatment(this, NewTreatment);
    }
    public void viewPatient(PatientRecords pt){
        pt.displayPatientFullInfo(this);
    }
}
