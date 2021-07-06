import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Calculator {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

//        char uni1 = '\u2160';
//        char uni2 = '\u2161';
//        char uni3 = '\u2162';
//        char uni4 = '\u2163';
//        char uni5 = '\u2164';
//        char uni6 = '\u2165';
//        char uni7 = '\u2166';
//        char uni8 = '\u2167';
//        char uni9 = '\u2168';
//        char uni10 = '\u2169';
//        RomanNumerals.calcRomanNum(uni1,uni2); - не успел доделать ввод и арифметичемкие действия с римскими символами



        System.out.println("input");
        String str = reader.readLine();





        if (str.contains("+")) {
            SumCalculator.calcSum(str);
        }
        else {
            System.out.println("Введите арифметическое действие со знаком +");
        }

        if (str.contains("-")) {
            MinCalculator.calcSum(str);
        }
        else {
            System.out.println("Введите арифметическое действие со знаком -");
        }

        if (str.contains("*")) {
            MultCalculator.calcMultiply(str);
        }
        else {
            System.out.println("Введите арифметическое действие со знаком *");
        }

        if (str.contains("/")) {
            DivCalculator.calcDivision(str);
        }
        else {
            System.out.println("Введите арифметическое действие со знаком /");
        }







    }
}
