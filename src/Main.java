public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double weight = 95.6;
        double height = 1.75;
        int Bmi = (int) service.calculate(weight, height);
        System.out.println(Bmi);
    }
}