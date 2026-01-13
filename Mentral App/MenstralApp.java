import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class MenstralApp {

    private static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMM dd, yyyy");

    public static LocalDate ovulationDate(LocalDate lastPeriodDate, int cycleLength) {
        return lastPeriodDate.plusDays(cycleLength - 14);
    }

    public static void menstrualPhase(LocalDate startDate, int periodDays) {
        LocalDate endDate = startDate.plusDays(periodDays - 1);
        System.out.printf("%-20s : %s to %s%n", "Menstrual Phase", startDate.format(formatter), endDate.format(formatter));
    }

    public static void follicularPhase(LocalDate startDate, int periodDays, LocalDate ovulationDate) {
        LocalDate start = startDate.plusDays(periodDays);
        LocalDate end = ovulationDate.minusDays(1);
        System.out.printf("%-20s : %s to %s%n", "Follicular Phase", start.format(formatter), end.format(formatter));
    }

    public static void ovulationPhase(LocalDate ovulationDate) {
        System.out.printf("%-20s : %s%n", "Ovulation Day", ovulationDate.format(formatter));
    }

    public static void lutealPhase(LocalDate ovulationDate) {
        LocalDate start = ovulationDate.plusDays(1);
        LocalDate end = ovulationDate.plusDays(14);
        System.out.printf("%-20s : %s to %s%n", "Luteal Phase", start.format(formatter), end.format(formatter));
    }

    public static void safePeriod(LocalDate ovulationDate, LocalDate cycleEndDate) {
        LocalDate fertileStart = ovulationDate.minusDays(5);
        LocalDate fertileEnd = ovulationDate.plusDays(1);

        System.out.println("\nSafe Periods:");
        System.out.printf("Before fertile window : %s to %s%n",cycleEndDate.minusDays(cycleEndDate.lengthOfMonth()).format(formatter),fertileStart.minusDays(1).format(formatter));
        System.out.printf("After fertile window  : %s to %s%n", fertileEnd.plusDays(1).format(formatter), cycleEndDate.format(formatter));
    }
}

