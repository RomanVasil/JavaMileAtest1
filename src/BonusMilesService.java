public class BonusMilesService {

    public int calculate(int prise) {
        int cost = 20;

        int miles = prise / cost;

        return miles;
    }
}
