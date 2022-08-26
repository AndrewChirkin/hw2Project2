public class Main {
    public static void main(String[] args) {
        int salaryMasha = 67760;
        int salaryDenis = 83690;
        int salaryKristina = 76230;
        double newSalaryMasha = salaryMasha * 1.1;
        double newSalaryDenis = salaryDenis * 1.1;
        double newSalaryKristina = salaryKristina * 1.1;
        int yearEarningsMashaBefore = salaryMasha * 12;
        int yearEarningsDenisBefore = salaryDenis * 12;
        int yearEarningsKristinaBefore = salaryKristina * 12;
        double yearEarningsMashaAfter = newSalaryMasha * 12;
        double yearEarningsDenisAfter = newSalaryDenis * 12;
        double yearEarningsKristinaAfter = newSalaryKristina * 12;
        double differenceMasha = yearEarningsMashaAfter - yearEarningsMashaBefore;
        double differenceDenis = yearEarningsDenisAfter - yearEarningsDenisBefore;
        double differenceKristina = yearEarningsKristinaAfter - yearEarningsKristinaBefore;
        System.out.println("Маша теперь получает " + newSalaryMasha + " рублей. Годовой доход вырос на " + differenceMasha + " рублей");
        System.out.println("Денис теперь получает " + newSalaryDenis + " рублей. Годовой доход вырос на " + differenceDenis + " рублей");
        System.out.println("Кристина теперь получает " + newSalaryKristina + " рублей. Годовой доход вырос на " + differenceKristina + " рублей");






    }
}