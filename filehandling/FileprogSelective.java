package filehandling;

import java.io.*;


class Cricketer2 implements Serializable {

    String name;
    String country;
    int runs;
    int wickets; 
    transient int matches;

    public Cricketer2(String name, String country, int runs,
                     int wickets, int matches) {
    	super();
        this.name = name;
        this.country = country;
        this.runs = runs;
        this.wickets = wickets;
        this.matches = matches;
    }

    void display() {
        System.out.println("Name = " + name);
        System.out.println("Country = " + country);
        System.out.println("Runs = " + runs);
        System.out.println("Wickets = " + wickets);
        System.out.println("Matches = " + matches);
    }


public class SelectiveSerialization {

    public static void main(String[] args)
            throws IOException, ClassNotFoundException {

        // Creating object
        Cricketer2 c1 = new Cricketer2(
                "Virat Kohli",
                "India",
                26000,
                4,
                550);

        // Serialization
        FileOutputStream fos =
                new FileOutputStream("Cricketer2.ser");
        ObjectOutputStream oos =
                new ObjectOutputStream(fos);

        oos.writeObject(c1);

        oos.close();
        fos.close();

      

        // Deserialization
        FileInputStream fis =
                new FileInputStream("Cricketer2.ser");
        ObjectInputStream ois =
                new ObjectInputStream(fis);

        Cricketer2 c3 = (Cricketer2) ois.readObject();

       
        c3.display();

        ois.close();
        fis.close();
    }
}
}


