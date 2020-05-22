import java.io.Serializable;

public class House implements Serializable {
    String name;
    int surface;
    int distanceFromSea;
    int price;

    public House(String name, int surface, int distanceFromSea) {
        this.name = name;
        this.surface = surface;
        this.distanceFromSea = distanceFromSea;
    }

    public String getName() {
        return name;
    }

    public int getSurface() {
        return surface;
    }

    public int getDistanceFromSea() {
        return distanceFromSea;
    }

    public int setPrice() {
        if(getDistanceFromSea() <= 200)
            return (getSurface() * 2000);
        else if(getDistanceFromSea() <= 1000)
            return (getSurface() * 1500);
        else
            return (getSurface() * 1000);
    }
}
