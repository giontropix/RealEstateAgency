import java.util.ArrayList;

public class RealEstateAgency {
    ArrayList<House> houses = new ArrayList();

    public House addHouse(String name, int surface, int distanceFromSea) {
        House house = new House(name, surface, distanceFromSea);
        houses.add(house);
        return house;
    }
}
