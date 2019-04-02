import Components.*;
import Outputs.Speaker;
import StereoStuff.Stereo;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SpeakerTest {

    Speaker speaker;
    Radio radio;
    CDplayer cdplayer;
    Stereo stereo;

    @Before
    public void before() {
        speaker = new Speaker();
        radio = new Radio("Sony", "BV 33");
        cdplayer = new CDplayer("Sony", "ST22");
        stereo = new Stereo("Sony", radio, cdplayer);
    }

    @Test
    public void hasVolume() {
        assertEquals("Boom", speaker.connect(stereo));
    }
}
