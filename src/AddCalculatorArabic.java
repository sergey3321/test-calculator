public class AddCalculatorArabic {

    public static void calcAddition(String str1) {
        try {
            char a = str1.charAt(0);
            char b = str1.charAt(2);
            int e = Integer.parseInt(String.valueOf(a));
            int f = Integer.parseInt(String.valueOf(b));

            if (str1.contains("+") && f >= 1 && f <= 10 && e >= 0 && e <= 10) {
                System.out.println("output");
                System.out.println(f + e);
            } else {
                System.out.println("Сложите 2 числа не больше 10");
            }
        } catch (NumberFormatException e) {
            System.out.println("Калькулятор умеет работать только с арабскими или римскими цифрами от 1 до 10");
        }
    }
}
