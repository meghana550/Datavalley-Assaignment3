class Organization implements Cloneable {
    private int organizationCode;
    private String organizationName;
    private String organizationAddress;
    
    public Organization(int code, String name, String address) {
        this.organizationCode = code;
        this.organizationName = name;
        this.organizationAddress = address;
    }
    
    // Method to print object details
    public void printDetails() {
        System.out.println("Organization Code: " + organizationCode);
        System.out.println("Organization Name: " + organizationName);
        System.out.println("Organization Address: " + organizationAddress);
    }
    
    // Overriding clone() method to support cloning
    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

public class Main {
    public static void main(String[] args) {
        Organization org1 = new Organization(1, "Org1", "Address1");
        
        try {
            // Cloning org1
            Organization org2 = (Organization) org1.clone();
            
            // Printing details of both org1 and its clone org2
            System.out.println("Details of org1:");
            org1.printDetails();
            System.out.println("\nDetails of cloned org2:");
            org2.printDetails();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}