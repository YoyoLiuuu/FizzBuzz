public class Reduce {
    public static void main(String[] args) {
        int initial = 100;
        int steps = 0;
        boolean done = false;
        while (!done) {
            boolean even = initial % 2 == 0;
            if (even) {
                initial = initial / 2;
            }
            else {
                initial = initial - 1;
            }
            steps++;
            done = initial == 0;
        }
        System.out.println(steps);
    }
}
