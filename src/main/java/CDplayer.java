public class CDplayer extends Component implements IPlay {

    public CDplayer(String make, String model) {
        super(make, model);
    }

    public String play() {
        return "press one of the buttons to choose a song";
    }

}
