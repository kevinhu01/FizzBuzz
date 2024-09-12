public class Reduce {
    public static void main(String[] args) {
        int i = 0;
        int num = 100;
        while (num != 0) {
            i++;
            boolean divisibleBy2 = num % 2 == 0;
            if (divisibleBy2) {
                num = num / 2;
            }
            else {
                num--;
            }
        }
        System.out.println(i);
    }
}