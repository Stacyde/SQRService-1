public class Main {
    public static void main (String[] args) {
        int a = 100;
        int b = 200;
        int count = 0;


        for (int i = 10; i <= 99; i++) {
            if ((i * i >= a) & (i * i <= b)) {
                count += 1;
            }
        }
        System.out.println(count);
    }
}
