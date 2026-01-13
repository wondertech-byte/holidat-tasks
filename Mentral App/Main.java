import java.time.LocalDate;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter last period month (1 - 12): ");
        int month = scanner.nextInt();

        System.out.print("Enter last period day: ");
        int day = scanner.nextInt();

        System.out.print("Enter cycle length (days): ");
        int cycleLength = scanner.nextInt();

        System.out.print("Enter menstruation days: ");
        int periodDays = scanner.nextInt();

        int year = LocalDate.now().getYear();
        LocalDate lastPeriodDate = LocalDate.of(year, month, day);

        LocalDate ovulation = MenstralApp.ovulationDate(lastPeriodDate, cycleLength);
        LocalDate cycleEndDate = lastPeriodDate.plusDays(cycleLength - 1);

        System.out.println("\nMENSTRUAL CYCLE SUMMARY");
        System.out.println("======================");

        MenstralApp.menstrualPhase(lastPeriodDate, periodDays);
        MenstralApp.follicularPhase(lastPeriodDate, periodDays, ovulation);
        MenstralApp.ovulationPhase(ovulation);
        MenstralApp.lutealPhase(ovulation);
        MenstralApp.safePeriod(ovulation, cycleEndDate);
    }
}

