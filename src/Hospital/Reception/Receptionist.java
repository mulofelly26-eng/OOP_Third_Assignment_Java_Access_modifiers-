package Hospital.Reception;

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
}
