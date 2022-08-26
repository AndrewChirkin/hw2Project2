public class Main {
    public static void main(String[] args) {
        byte bananaWeight = 80;
        byte milkWeight = 105;
        byte iceCreamWeight = 100;
        byte eggWeight = 70;
        int breakfastWeightInGramms = bananaWeight * 5
                + milkWeight * 2 + iceCreamWeight * 2 + eggWeight * 4;
        int breakfastWeightInKg = breakfastWeightInGramms / 1000;
        System.out.println("Завтрак спортмена весит " + breakfastWeightInKg + " килограмм");



    }
}