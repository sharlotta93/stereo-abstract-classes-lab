import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RadioTest {

    Radio radio;

    @Before
    public void before() {
        radio = new Radio("Huwei", "BV 33");
    }

    @Test
    public void hasModel() {
        assertEquals("BV 33", radio.getModel());
    }

    @Test
    public void hasMake() {
        assertEquals("Huwei", radio.getMake());
    }

    @Test
    public void canChangeModel() {
        radio.setModel("BV 66");
        assertEquals("BV 66", radio.getModel());
    }

    @Test
    public void canChangeMake() {
        radio.setMake("Kawasaki");
        assertEquals("Kawasaki", radio.getMake());
    }

    @Test
    public void canTune() {
        assertEquals("You are tuned to Radio 1", radio.tune("1"));
    }
}
