import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CDplayerTest {

    CDplayer cdplayer;

    @Before
    public void before() {
        cdplayer = new CDplayer("BomBox", "ST67");
    }

    @Test
    public void hasModel() {
        assertEquals("ST67", cdplayer.getModel());
    }

    @Test
    public void hasMake() {
        assertEquals("BomBox", cdplayer.getMake());
    }

    @Test
    public void canChangeModel() {
        cdplayer.setModel("BV 66");
        assertEquals("BV 66", cdplayer.getModel());
    }

    @Test
    public void canChangeMake() {
        cdplayer.setMake("Kawasaki");
        assertEquals("Kawasaki", cdplayer.getMake());
    }

    @Test
    public void canPlay() {
        assertEquals("press one of the buttons to choose a song", cdplayer.play());
    }

}
