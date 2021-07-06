import java.io.IOException;

public class SumCalculator extends Calculator {

    static void calcSum(String str1) {

        char a = str1.charAt(0);
        char b = str1.charAt(2);
        int e = Integer.parseInt(String.valueOf(a));
        int f = Integer.parseInt(String.valueOf(b));

        if (str1.contains("+") && f >= 1 && f <= 10 && e >= 0 && e <= 10) {
            System.out.println("output");
            System.out.println(f + e);
        }
        else {
            System.out.println("Сложите 2 числа не больше 10");
        }
    }
}

