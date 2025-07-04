public class Compound {
    public static void main(String[] args) {
        double p = 2000;// principal
        double r = 10;// rate(interest)
        double t = 2;// Time
        double amount = p * Math.pow(1 + r / 100, t) - p;
        System.out.println("Compound interest : " + amount);
    }
}
