public class Main {
    public static void main(String[] args) {
    int totalWeightLoss = 7 * 1000;
    short minWeightLoss = 250;
    short maxWeightLoss = 500;
    int meanWeightLoss = (minWeightLoss + maxWeightLoss)/2;
    int daysWithMin = totalWeightLoss / minWeightLoss;
    System.out.println(daysWithMin + " - дней понадобится спорстмену для похудения, если он будет терять " + minWeightLoss + " грамм в день.");
    int daysWithMax = totalWeightLoss / maxWeightLoss;
    System.out.println(daysWithMax + " - дней понадобится спорстмену для похудения, если он будет терять " + maxWeightLoss + " грамм в день.");
    int daysWithMean = totalWeightLoss / meanWeightLoss;
        System.out.println(daysWithMean + " - дней понадобится спорстмену для похудения, если он будет терять " + meanWeightLoss + " грамм в день.");
    }
}