import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MP3Test {

    MP3 mp3;
    Stereo stereo;
    Radio radio;
    CDplayer cdplayer;

    @Before
    public void before() {
        mp3 = new MP3("Mini", "ST67");
        radio = new Radio("Sony", "BV 33");
        cdplayer = new CDplayer("Sony", "ST22");
        stereo = new Stereo("Sony", radio, cdplayer);
    }

    @Test
    public void hasModel() {
        assertEquals("ST67", mp3.getModel());
    }

    @Test
    public void hasMake() {
        assertEquals("Mini", mp3.getMake());
    }

    @Test
    public void canChangeModel() {
        mp3.setModel("BV 66");
        assertEquals("BV 66", mp3.getModel());
    }

    @Test
    public void canChangeMake() {
        mp3.setMake("Kawasaki");
        assertEquals("Kawasaki", mp3.getMake());
    }

    @Test
    public void canPlay() {
        assertEquals("connect to stereo", mp3.play());
    }

    @Test
    public void canConnectToStereo() {
        assertEquals("Sony", mp3.connect(stereo));
    }
}
