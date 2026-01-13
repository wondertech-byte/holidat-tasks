import java.util.ArrayList;
import java.util.List;

public class ParkingLot {

    public boolean isOccupied(List<Integer> parkingSpace, int index) {
        if (parkingSpace.get(index) == 1) {
            return true;
        }
        return false;
    }

    public String bookSlot(List<Integer> parkingSpace, int index) {
        if (!isOccupied(parkingSpace, index)) {
            parkingSpace.set(index, 1);
            return String.format(" slot%d Booked successfully", index + 1).toUpperCase();
        }
        return "already Occupied".toUpperCase();
    }

    public String unoccupySlot(List<Integer> parkingSpace, int index) {
        if (isOccupied(parkingSpace, index)) {
            parkingSpace.set(index, 0);
            return String.format("SLOT%d UNOCCUPIED SUCCESSFULLy", index + 1);
        }
        return String.format("SLOT%d NEVER OCCUPIED", index + 1);
    }

    public List<Integer> occupiedSpace(List<Integer> parkingSpace) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < parkingSpace.size(); i++) {
            if (parkingSpace.get(i) == 1) {
                result.add(i + 1);
            }
        }
        return result;
    }

    public List<Integer> unoccupiedSpace(List<Integer> parkingSpace) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < parkingSpace.size(); i++) {
            if (parkingSpace.get(i) == 0) {
                result.add(i + 1);
            }
        }
        return result;
    }
}

