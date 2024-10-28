public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double weight = 111.3;
        double height = 1.75;
        int Bmi = service.calculate(weight, height);
        System.out.println(Bmi);
    }
}