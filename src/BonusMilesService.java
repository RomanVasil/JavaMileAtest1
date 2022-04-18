public class BonusMilesService {
    int price = 10_000;
    public int calculate(int cost) {

        int miles = price / cost;

        return miles;

    }
}
