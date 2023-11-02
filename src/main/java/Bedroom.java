import java.util.ArrayList;

public class Bedroom extends Room {

    private int roomNumber;

    public Bedroom(int roomNumber, BedroomType bedroomType) {
        super(bedroomType.getCapacity());
        this.roomNumber = roomNumber;
    }

    public int getRoomNumber() {
        return roomNumber;
    }
}
