import java.io.*;
import java.util.ArrayList;

public class RealEstateAgency implements Serializable {
    private ArrayList<House> houses = new ArrayList<>();
    private final String path;

    public RealEstateAgency(String path){
        this.path = path;
    }

    public ArrayList<House> getHouses() {
        return houses;
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
            outputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void load() {
        try {
            ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(this.path));
            houses = (ArrayList<House>) inputStream.readObject();
        } catch (EOFException eofException) {
            System.out.println("Fine della lettura del file");
        } catch (ClassNotFoundException | IOException e) {
            e.printStackTrace();
        }
    }
}
