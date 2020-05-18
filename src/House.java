public class House {
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
            price = (getSurface() * 2000);
        else if(getDistanceFromSea() <= 1000)
            price = (getSurface() * 1500);
        else
            price = (getSurface() * 1000);
        return price;
    }
}
