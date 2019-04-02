public class Stereo {

    private String name;
    private Radio radio;
    private CDplayer cdplayer;

    public Stereo(String name, Radio radio, CDplayer cdplayer) {
        this.name = name;
        this.cdplayer = cdplayer;
        this.radio = radio;
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

}
