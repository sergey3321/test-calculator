public class ArabicNum {

    static void arabArithmetic(String str1) {

        if (str1.contains("+")) {
            AddCalculatorArabic.calcAddition(str1);
        }

        if (str1.contains("-")) {
            MinCalculatorArabic.calcMin(str1);
        }

        if (str1.contains("*")) {
            MultCalculatorArabic.calcMultiply(str1);
        }

        if (str1.contains("/")) {
            DivCalculatorArabic.calcDivision(str1);
        }


    }
}

