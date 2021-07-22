public class DivCalculatorArabic {

    static void calcDivision(String str1) {

        char a = str1.charAt(0);
        char b = str1.charAt(2);
        double e = Double.parseDouble(String.valueOf(a));
        double f = Double.parseDouble(String.valueOf(b));

        if (str1.contains("/") && f >= 1 && f <= 10 && e >= 0 && e <= 10) {
            System.out.println("output");
            System.out.println(e / f);
        } else {
            System.out.println("Вычтите из двух чисел (числа должны быть не более 10)");
        }
    }
}
