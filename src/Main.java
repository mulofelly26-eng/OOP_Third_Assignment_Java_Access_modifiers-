import Hospital.Admin.Admin;
import Hospital.Clinical.Doctor;
import Hospital.Reception.Receptionist;
import Hospital.Records.PatientRecords;
import Hospital.Admin.FinancialRecords;
public class Main {
    public static void main(String[] args) {
        Admin adm = new Admin("ADM-12", "Emergency");
        Doctor dr = new Doctor("DR 3024", "Neurologist");
        PatientRecords pt = new PatientRecords(1013, "John", "28th dec 2026", "Malaria", "P. vivax");
        Receptionist rc = new Receptionist("Rec 202", "Maria");

        System.out.println("=========== 1. ADMIN ===========");
        adm.displayAdminInfo();
        System.out.println("getAdminID(): " + adm.getAdminID());
        System.out.println("getAdmDept(): " + adm.getAdmDept());

        System.out.println("\n=========== 2. DOCTOR ===========");
        dr.displayDoctorInfo();
        System.out.println("getDoctorID(): " + dr.getDoctorID());
        System.out.println("getSpecialization(): " + dr.getSpecialization());
        System.out.println("-- Doctor views the patient (before update)");
        dr.viewPatient(pt);
        System.out.println("-- Doctor updates illness and treatment");
        dr.SetPatientiIllness(pt, "Severe malaria");
        dr.SetPatientTypeOfTreatment(pt, "Artesunate IV");
        System.out.println("-- Doctor views the patient (after update)");
        dr.viewPatient(pt);

        System.out.println("\n=========== 3. PATIENT RECORDS ===========");
        System.out.println("getPatientID(): " + pt.getPatientID());
        System.out.println("getName(): " + pt.getName());
        System.out.println("getAppointmentdate(): " + pt.getAppointmentdate());
        System.out.println("getIllness(dr): " + pt.getIllness(dr));
        System.out.println("getTypeOfTreatment(dr): " + pt.getTypeOfTreatment(dr));
        pt.displayPatientBasicsInfo();

        System.out.println("\n=========== 4. RECEPTIONIST ===========");
        rc.displayReceptionistInfo();
        System.out.println("getReceptionistID(): " + rc.getReceptionistID());
        System.out.println("getName(): " + rc.getName());
        rc.viewPatientBasicInfo(pt);
        FinancialRecords fina = new FinancialRecords(001, pt.getPatientID(), 2000.0, 0, adm);
        System.out.println("\n=========== 5. FINANCIAL RECORDS ===========");
        adm.viewFinancialRecords(fina);
        System.out.println("getPatientID(adm): " + fina.getPatientID(adm));
        System.out.println("getAmountBilled(adm): " + fina.getAmountBilled(adm));
        System.out.println("getAmountPaid(adm): " + fina.getAmountPaid(adm));
        System.out.println("getBalance(adm): " + fina.getBalance(adm));
        System.out.println("-- Admin receives a payment of 500");
        adm.receivePayment(fina, 500);
        System.out.println("-- Invalid payment of -100 (should be rejected)");
        fina.addPayment(adm, -100);
        fina.displayFinancialRecords(adm);
        System.out.println("-- Admin creates a second record");
        FinancialRecords fina2 = adm.CreateFinancialRecords(2, pt.getPatientID(), 3000.0, 500.0);
        fina2.displayFinancialRecords(adm);

        System.out.println("\n=========== 6. UNAUTHORIZED ACCESS ===========");
        try { pt.getIllness(null); }
        catch (NullPointerException e) { System.out.println("Blocked: " + e.getMessage()); }
        try { pt.displayPatientFullInfo(null); }
        catch (NullPointerException e) { System.out.println("Blocked: " + e.getMessage()); }
        try { fina.getBalance(null); }
        catch (NullPointerException e) { System.out.println("Blocked: " + e.getMessage()); }
        try { new FinancialRecords(9, 1, 100, 0, null); }
        catch (NullPointerException e) { System.out.println("Blocked: " + e.getMessage()); }

    }
}
