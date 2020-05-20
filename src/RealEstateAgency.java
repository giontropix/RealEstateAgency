import java.io.*;
import java.util.ArrayList;

public class RealEstateAgency implements Serializable {
    ArrayList<House> houses = new ArrayList();
    String path;

    public RealEstateAgency(String path){
        this.path = path;
    }

    public House addHouse(String name, int surface, int distanceFromSea) {
        House house = new House(name, surface, distanceFromSea);
        houses.add(house);
        store();
        return house;
    }

    private void store() {
        try {
            FileOutputStream fos = new FileOutputStream(this.path);
            ObjectOutputStream oos = new ObjectOutputStream( fos );
            oos.writeObject(houses);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void load() {
        try {
            FileInputStream fis = new FileInputStream(path);
            ObjectInputStream ois = new ObjectInputStream( fis );
            houses = (ArrayList<House>)ois.readObject();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
