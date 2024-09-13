public class Multiples {
    public static void main(String[] args) {
        int num_3 = 0;
        int num_5 = 0;
        for (int i = 3; i < 1000; i ++) {
            boolean divide_3 = i % 3 == 0;
            boolean divides_5 = i % 5 == 0;

            if (divide_3) {
                num_3++;
            }
            if (divides_5){
                num_5++;
            }
        }
        System.out.println("There are " + num_3 + " that divides 3, " + num_5 + " that divides 5. ");

    }
}
