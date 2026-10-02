package Hospital.Records;

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
}
