

public class StudentStatusChecker {
    public static void main(String[] args) {
        int score = 50;

        do {
            if (score >= 90)System.out.println( score + " -> Is Excellent");
            else if (score >= 70 )System.out.println( score + " -> Is Good");
            else System.out.println( score + " -> Keep Working");
            score+=10;
        } while ( score <= 100);





    }
}
