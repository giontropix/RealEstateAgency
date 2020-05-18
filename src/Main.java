import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        RealEstateAgency seller = new RealEstateAgency();
        do {
            System.out.println("\nBenvenuto in REMAX Platinum, i professionisti del vendere casa!\n");
            System.out.println(" - Inserisci 1 per aggiungere una nuova casa.\n - Inserisci 2 per vedere i prezzi delle case.");
            int choice = scan.nextInt();
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
                    if(seller.houses.size() == 0)
                        System.out.println("Ancora non sono presenti case in elenco, aggiungi la prima!");
                    else
                        for (int i = 0; i < seller.houses.size(); i++) {
                            System.out.println("Il prezzo della casa " + seller.houses.get(i).getName() + " è: " + seller.houses.get(i).setPrice() + "€");
                        }
            }
        }while(true);

    }
}
