import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void displayParkingSpace(List<Integer> parkingSpace) {
        System.out.println("==================================");
        System.out.println(" LOT NUMBER\tAVAILABILITY");
        System.out.println("==================================");
        for (int number = 1; number <= 20; number++) {
            int index = number - 1;
            if (parkingSpace.get(index) == 0) {
                System.out.println("\t" + number + "  \tavailable");
            } else {
                System.out.println("\t" + number + "  \t[occupied]");
            }
        }
    }

    public static void main(String[] args) {

        List<Integer> parkingSpace = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            parkingSpace.add(0);
        }

        ParkingLot parkingLot = new ParkingLot();

        String menu = """
             
                CAR PARK SYSTEM
            =======================
            1. Check availability
            2. park car
            3. move car
            ======================
            """;

        int option = -1;
        Scanner scanner = new Scanner(System.in);

        while (option != 0) {
            System.out.println(menu);
            option = scanner.nextInt();

            switch (option) {
                case 1 -> displayParkingSpace(parkingSpace);

                case 2 -> {
                    System.out.println(
                        "Choose from the available parking space\n" +
                        parkingLot.unoccupiedSpace(parkingSpace)
                    );
                    int parkSpace = scanner.nextInt();
                    String parking = parkingLot.bookSlot(parkingSpace, parkSpace - 1);
                    System.out.println(parking);
                }

                case 3 -> {
                    System.out.println(
                        "Enter occupied space Number\n" +
                        parkingLot.occupiedSpace(parkingSpace)
                    );
                    int parkSpace = scanner.nextInt();
                    String parking = parkingLot.unoccupySlot(parkingSpace, parkSpace - 1);
                    System.out.println(parking);
                }
            }
        }
    }
}

