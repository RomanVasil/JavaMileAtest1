public class Main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();

        int miles1 = service.calculate(10000, 20);
        System.out.println("заработанные мили " + miles1);

        int miles2 = service.calculate(10000, 10);
        System.out.println("заработанные мили " + miles2);

        int miles3 = service.calculate(10000, 100);
        System.out.println("заработанные мили " + miles3);
    }
}
//