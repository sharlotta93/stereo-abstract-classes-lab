package StereoStuff;

import Components.*;

public class Stereo {

    private String name;
    private Radio radio;
    private CDplayer cdplayer;
    private int volume;

    public Stereo(String name, Radio radio, CDplayer cdplayer) {
        this.name = name;
        this.cdplayer = cdplayer;
        this.radio = radio;
        this.volume = 0;
    }

    public String getName() {
        return name;
    }

    public String getRadioMake() {
        return radio.getMake();
    }

    public String getCDplayerMake() {
        return cdplayer.getMake();
    }

    public String tuneRadio(String radioStation) {
       return radio.tune(radioStation);
    }

    public String playCDplayer() {
        return cdplayer.play();
    }

    public void volumeUp() {
        if (this.volume < 10) {
            this.volume += 1;
        }
    }

    public void volumeDown() {
        if (this.volume > 0) {
            this.volume -= 1;
        }
    }

    public int currentVolume() {
       return this.volume;
    }
}
