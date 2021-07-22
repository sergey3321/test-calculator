import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RunCalculator {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("input");
        String str = reader.readLine();

        try {
            if (str.contains("I") || str.contains("II") || str.contains("III") || str.contains("IV") || str.contains("V") || str.contains("VI") || str.contains("VII") || str.contains("VIII") || str.contains("IX") || str.contains("X") ) {
                RomanNum.calcRomanArithmetic(str);
            }
        } catch (ArithmeticException e) {
            System.out.println("Делить на ноль нельзя");
        } catch (NumberFormatException e) {
            System.out.println("Калькулятор умеет работать только с арабскими или римскими цифрами одновременно");
        } catch (IllegalArgumentException e) {
            System.out.println("0");
        }


        if (str.contains("1") || str.contains("2") || str.contains("3") || str.contains("4") || str.contains("5") || str.contains("6") || str.contains("7") || str.contains("8") || str.contains("9") || str.contains("10")) {
            ArabicNum.arabArithmetic(str);
        }



    }
}
