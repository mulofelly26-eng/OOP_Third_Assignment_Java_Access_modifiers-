package Hospital.Clinical;

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
}
