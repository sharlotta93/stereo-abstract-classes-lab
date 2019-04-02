import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StereoTest {

    Stereo stereo;
    Radio radio;
    CDplayer cdplayer;

    @Before
    public void before() {
        radio = new Radio("Sony", "BV 33");
        cdplayer = new CDplayer("Sony", "ST22");
        stereo = new Stereo("Sony", radio, cdplayer);
    }

    @Test
    public void hasName() {
        assertEquals("Sony", stereo.getName());
    }

    @Test
    public void hasRadioMake() {
        assertEquals("Sony", stereo.getRadioMake());
    }

    @Test
    public void hasCDPlayerMake() {
        assertEquals("Sony", stereo.getCDplayerMake());
    }

    @Test
    public void canTuneRadio() {
        assertEquals("You are tuned to Radio 2", stereo.tuneRadio("2"));
    }

    @Test
    public void canPlayCDPlayer() {
        assertEquals("press one of the buttons to choose a song", stereo.playCDplayer());
    }

}
