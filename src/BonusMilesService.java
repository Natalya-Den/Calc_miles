public class BonusMilesService {
    public int calculate (int ticket) {

        byte rubles = 20;
        int miles = ticket / rubles;
        return miles;
    }
}
