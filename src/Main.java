public class Main {
    public static void main(String[] args) {
    byte studentsLP = 23;
    byte studentsAS = 27;
    byte studentsEA = 30;
    short totalPaper = 480;
    int paperForEverybody = totalPaper / (studentsAS + studentsEA + studentsLP);
    System.out.println("На каждого ученика рассчитано " + paperForEverybody + " листов бумаги");
    }
}