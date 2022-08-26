public class Main {
    public static void main(String[] args) {
        byte whiteDye = 2;
        byte brownDye = 4;
        byte totalDye = 120;
        int dyeForClass = whiteDye + brownDye;
        int totalClasses = totalDye / dyeForClass;
        int totalWhiteDye = whiteDye * totalClasses;
        int totalBrownDye = totalDye - totalWhiteDye;
        System.out.println("В школе, где " + totalClasses + " классов, нужно " + totalWhiteDye + " банок белой краски и " + totalBrownDye + " банок коричневой краски");
    }
}