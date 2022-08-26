public class Main {
    public static void main(String[] args) {
        byte bottles = 16;
        byte timeForCycle = 2;
        int workSpeed = bottles / timeForCycle;
        byte example1Time = 20;
        int example1Quantity = workSpeed * example1Time;
        System.out.println("За " + example1Time + " минут машина произвела " + example1Quantity + " бутылок");
        int example2Time = 24 * 60;
        int example2Quantity = workSpeed * example2Time;
        System.out.println("За " + example2Time + " минут(1 сутки) машина произвела " + example2Quantity + " бутылок");
        int example3Time = example2Time * 3;
        int example3Quantity = workSpeed * example3Time;
        System.out.println("За " + example3Time + " минут(3 суток) машина произвела " + example3Quantity + " бутылок");
        int example4Time = example3Time * 10;
        int example4Quantity = workSpeed * example4Time;
        System.out.println("За " + example4Time + " минут(1 месяц) машина произвела " + example4Quantity + " бутылок");
    }
}