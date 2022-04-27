public class BonusMilesService {

    public int calculate(int cost) {
        int price = 10_000;
        int miles = price / cost;

        return miles;
    }
}
