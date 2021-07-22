public class MultCalculatorArabic {
    static void calcMultiply(String str1) {
        char a = str1.charAt(0);
        char b = str1.charAt(2);
        int e = Integer.parseInt(String.valueOf(a));
        int f = Integer.parseInt(String.valueOf(b));

        if (str1.contains("*") && f >= 1 && f <= 10 && e >= 0 && e <= 10) {
            System.out.println("output");
            System.out.println(e * f);
        }
        else {
            System.out.println("Вычтите из двух чисел (числа должны быть не более 10)");
        }
    }
}
