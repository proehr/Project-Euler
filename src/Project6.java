public class Project6 {
    public long solution() {
        long sumofsquares = 0;
        long squareofsum = 0;
        for (int i = 1; i <= 100; i++) {
            sumofsquares += i * i;
            squareofsum += i;
        }
        squareofsum *= squareofsum;
        return squareofsum - sumofsquares;
    }
}
