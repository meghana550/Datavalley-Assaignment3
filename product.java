import java.io.*;

class Product implements Serializable {
    private int id;
    private String name;
    private String category;
    private double price;
    
    // Constructor
    public Product(int id, String name, String category, double price) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.price = price;
    }
    
    // Getter methods
    public int getId() {
        return id;
    }
    
    public String getName() {
        return name;
    }
    
    public String getCategory() {
        return category;
    }
    
    public double getPrice() {
        return price;
    }
}

public class Main {
    public static void main(String[] args) {
        // Serialize object
        serializeObject();
        
        // Deserialize object
        Product product = deserializeObject();
        
        // Display deserialized object details
        System.out.println("Deserialized Product Details:");
        System.out.println("ID: " + product.getId());
        System.out.println("Name: " + product.getName());
        System.out.println("Category: " + product.getCategory());
        System.out.println("Price: " + product.getPrice());
    }
    
    // Method to serialize object
    private static void serializeObject() {
        try {
            Product product = new Product(1, "Product1", "Category1", 10.99);
            FileOutputStream fileOut = new FileOutputStream("product.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(product);
            out.close();
            fileOut.close();
            System.out.println("Serialized data is saved in product.ser");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    // Method to deserialize object
    private static Product deserializeObject() {
        Product product = null;
        try {
            FileInputStream fileIn = new FileInputStream("product.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            product = (Product) in.readObject();
            in.close();
            fileIn.close();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return product;
    }
}