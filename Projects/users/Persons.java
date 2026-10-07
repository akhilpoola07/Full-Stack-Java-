package Projects.users;

import java.util.ArrayList;
import java.util.Scanner;

public class Persons {
    String name;
    String contact;
    String email;
    String address;
    int id;
    String password;
    String role;

    public Persons(String name, String contact, String email, String address, int id, String password, String role) {
        this.name = name;
        this.contact = contact;
        this.email = email;
        this.address = address;
        this.id = id;
        this.password = password;
        this.role = role;
    }

    public String toString() {
        return "Persons{name='" + this.name + "', contact='" + this.contact + "', email='" + this.email + "', address='" + this.address + "', id=" + this.id + ", role='" + this.role + "'}";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the details of the person");
        System.out.print("Enter the name of the person: ");
        String name = sc.nextLine();
        System.out.print("Enter the contact of the person: ");
        String contact = sc.nextLine();
        System.out.print("Enter the email of the person: ");
        String email = sc.nextLine();
        System.out.print("Enter the address of the person: ");
        String address = sc.nextLine();
        System.out.print("Enter the id of the person: ");
        int id = sc.nextInt();
        sc.nextLine(); // consume leftover newline after nextInt()
        System.out.print("Enter the password of the person: ");
        String password = sc.nextLine();
        System.out.print("Enter the role of the person: ");
        String role = sc.nextLine();
        ArrayList<Persons> p = new ArrayList<>();
        p.add(new Persons(name, contact, email, address, id, password, role));
        for(int i=0;i<p.size();i++){
            System.out.println(p.get(i));
        }
        System.out.println(p);
        sc.close();
    }
}

