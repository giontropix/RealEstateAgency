import java.io.*;
import java.util.ArrayList;

public class RealEstateAgency implements Serializable {
    ArrayList<House> houses = new ArrayList<>();
    String path;

    public RealEstateAgency(String path){
        this.path = path;
    }

    public void addHouse(String name, int surface, int distanceFromSea) {
        House house = new House(name, surface, distanceFromSea);
        houses.add(house);
        store();
    }

    private void store() {
        try {
            ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(this.path));
            outputStream.writeObject(houses);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void load() {
        try {
            ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(this.path));
            houses = (ArrayList<House>)inputStream.readObject();
        } catch (ClassNotFoundException | IOException e) {
            e.printStackTrace();
        }
    }
}
