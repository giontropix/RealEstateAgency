import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        RealEstateAgency seller = new RealEstateAgency("C:\\Users\\giont\\Desktop\\Steve Jobs Academy\\Programmazione\\RealEstate\\text.txt");
        int choice = 0;
        while (choice != 3) {
            System.out.println("\nBenvenuto in REMAX Platinum, i professionisti del vendere casa!\n");
            System.out.println(" - Inserisci 1 per aggiungere una nuova casa.\n - Inserisci 2 per vedere i prezzi delle case.\n - Inserisci 3 per uscire.");
            Scanner scan = new Scanner(System.in);
            choice = scan.nextInt();
            switch (choice) {
                case 1:
                    Scanner scan2 = new Scanner(System.in);
                    System.out.println("Inserisci il nome della casa");
                    String name = scan2.nextLine();
                    System.out.println("Inserisci la superfice totale");
                    int surface = scan2.nextInt();
                    System.out.println("Inserisci la distanza dal mare");
                    int distanceFromSea = scan2.nextInt();
                    seller.addHouse(name, surface, distanceFromSea);
                break;
                case 2:
                    seller.load();
                    if (seller.houses.size() == 0)
                        System.out.println("Ancora non sono presenti case in elenco, aggiungi la prima!");
                    else
                        for (int i = 0; i < seller.houses.size(); i++) {
                            System.out.println("Il prezzo della casa " + seller.houses.get(i).getName() + " di "
                                    + seller.houses.get(i).getSurface() + " mq" + " a "
                                    + seller.houses.get(i).getDistanceFromSea() + " metri dal mare è di: "
                                    + seller.houses.get(i).setPrice() + "€");
                        }
                break;
            }
        }
    }
}
