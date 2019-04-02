public class MP3 extends Component implements IPlay, IConnect {

    public MP3(String make, String model) {
        super(make, model);
    }

    public String play() {
        return "connect to stereo";
    }

    public String connect(Stereo stereo) {
        return stereo.getName();
    }
}
