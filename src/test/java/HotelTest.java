import org.junit.Before;

public class HotelTest {

    Hotel hotel;
    Bedroom bedroom1;
    Bedroom bedroom2;
    Bedroom bedroom3;
    ConferenceRoom conferenceRoom1;


    @Before
    public void before(){
        bedroom1 = new Bedroom(1, BedroomType.FAMILY);
        bedroom2 = new Bedroom(2, BedroomType.DOUBLE);
        bedroom3 = new Bedroom(3, BedroomType.SINGLE);

//        hotel = new Hotel("Fawlty Towers", )
    }
}
