package Day16;

public class EVM {
    public static void main(String[] args) {
        char[] votes = {'a', 'b', 'a', 'c', 'a', 'c', 'b', 'a', 'a'};
        int aCount = 0;
        int bCount = 0;
        int cCount = 0;

        // Count votes correctly using if-else-if
        for (char i : votes) {
            if (i == 'a') {
                aCount += 1;
            } else if (i == 'b') {
                bCount += 1;
            } else if (i == 'c') {
                cCount += 1;
            }
        }

        // Print vote count
        System.out.println("Votes for A: " + aCount);
        System.out.println("Votes for B: " + bCount);
        System.out.println("Votes for C: " + cCount);

        // Determine winner
        char win = ((aCount > bCount) && (aCount > cCount)) ? 'a' :
                   ((bCount > aCount) && (bCount > cCount)) ? 'b' : 'c';

        System.out.println("Winner is: " + win);
    }
}
