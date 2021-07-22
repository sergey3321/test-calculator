

public class RomanNum {

    static void calcRomanArithmetic(String strRim) {

        if (strRim.length() == 3 && strRim.charAt(1) == '+' && strRim.charAt(0) != '1' && strRim.charAt(2) != '1') {
                            char a = strRim.charAt(0);
                            char b = strRim.charAt(2);
                            String a1 = String.valueOf(a);
                            String a2 = String.valueOf(b);
                            String[] putToRoman = {a1, a2};
                            int b1 = 0;
                            int c1;
                            for (int i = 0; i <= 1; i++) {
                                b1 += Roman.decode(putToRoman[i]);
                            }
                            c1 = b1;
                            System.out.println("output");
                            System.out.println(Numeral.test(c1));

        }


        if (strRim.length() == 4 && strRim.charAt(1) == '+') {
            char a = strRim.charAt(0);
            char b = strRim.charAt(2);
            char c = strRim.charAt(3);
            String a1 = String.valueOf(a);
            String a2 = String.valueOf(b);
            String a3 = String.valueOf(c);
            String a4 = a2 + a3;
            String[] putToRoman = {a4, a1};
            int b1 = 0;
            int c1;
            for (int i = 0; i <= 1; i++) {
                b1 += Roman.decode(putToRoman[i]);
            }
            c1 = b1;
            System.out.println("output");
            System.out.println(Numeral.test(c1));
        }

        if (strRim.length() == 5 && strRim.charAt(1) == '+') {
            char a = strRim.charAt(0);
            char b = strRim.charAt(2);
            char c = strRim.charAt(3);
            char d = strRim.charAt(4);

            String a1 = String.valueOf(a);
            String a2 = String.valueOf(b);
            String a3 = String.valueOf(c);
            String a4 = String.valueOf(d);
            String a5 = a1;
            String a6 = a2 + a3 + a4;

            String [] putToRoman = {a5, a6};
            int b1 = 0;
            int c1;
            for (int i = 0; i <= 1; i++) {
                b1 += Roman.decode(putToRoman[i]);
            }
            c1 = b1;
            System.out.println("output");
            System.out.println(Numeral.test(c1));
        }

        if (strRim.length() == 6 && strRim.charAt(1) == '+') {
            char a = strRim.charAt(0);
            char b = strRim.charAt(2);
            char c = strRim.charAt(3);
            char d = strRim.charAt(4);
            char e = strRim.charAt(5);

            String a1 = String.valueOf(a);
            String a2 = String.valueOf(b);
            String a3 = String.valueOf(c);
            String a4 = String.valueOf(d);
            String a5 = String.valueOf(e);
            String a6 = a1;
            String a7 = a2 + a3 + a4 + a5;

            String [] putToRoman = {a6, a7};
            int b1 = 0;
            int c1;
            for (int i = 0; i <= 1; i++) {
                b1 += Roman.decode(putToRoman[i]);
            }
            c1 = b1;
            System.out.println("output");
            System.out.println(Numeral.test(c1));
        }

        if (strRim.length() == 4 && strRim.charAt(2) == '+') {
            char a = strRim.charAt(0);
            char b = strRim.charAt(1);
            char c = strRim.charAt(3);
            String a1 = String.valueOf(a);
            String a2 = String.valueOf(b);
            String a3 = String.valueOf(c);
            String a4 = a1 + a2;
            String a5 = a3;

            String[] putToRoman = {a4, a5};
            int b1 = 0;
            int c1;
            for (int i = 0; i <= 1; i++) {
                b1 += Roman.decode(putToRoman[i]);
            }
            c1 = b1;
            System.out.println("output");
            System.out.println(Numeral.test(c1));
        }

        if (strRim.length() == 5 && strRim.charAt(2) == '+') {
            char a = strRim.charAt(0);
            char b = strRim.charAt(1);
            char c = strRim.charAt(3);
            char d = strRim.charAt(4);
            String a1 = String.valueOf(a);
            String a2 = String.valueOf(b);
            String a3 = String.valueOf(c);
            String a4 = String.valueOf(d);
            String a5 = a1 + a2;
            String a6 = a3 + a4;

            String[] putToRoman = {a5, a6};
            int b1 = 0;
            int c1;
            for (int i = 0; i <= 1; i++) {
                b1 += Roman.decode(putToRoman[i]);
            }
            c1 = b1;
            System.out.println("output");
            System.out.println(Numeral.test(c1));
        }

        if (strRim.length() == 6 && strRim.charAt(2) == '+') {
            char a = strRim.charAt(0);
            char b = strRim.charAt(1);
            char c = strRim.charAt(3);
            char d = strRim.charAt(4);
            char e = strRim.charAt(5);
            String a1 = String.valueOf(a);
            String a2 = String.valueOf(b);
            String a3 = String.valueOf(c);
            String a4 = String.valueOf(d);
            String a5 = String.valueOf(e);
            String a6 = a1 + a2;
            String a7 = a3 + a4 + a5;

            String[] putToRoman = {a6, a7};
            int b1 = 0;
            int c1;
            for (int i = 0; i <= 1; i++) {
                b1 += Roman.decode(putToRoman[i]);
            }
            c1 = b1;
            System.out.println("output");
            System.out.println(Numeral.test(c1));
        }

        if (strRim.length() == 7 && strRim.charAt(2) == '+') {
            char a = strRim.charAt(0);
            char b = strRim.charAt(1);
            char c = strRim.charAt(3);
            char d = strRim.charAt(4);
            char e = strRim.charAt(5);
            char f = strRim.charAt(6);
            String a1 = String.valueOf(a);
            String a2 = String.valueOf(b);
            String a3 = String.valueOf(c);
            String a4 = String.valueOf(d);
            String a5 = String.valueOf(e);
            String a6 = String.valueOf(f);
            String a7 = a1 + a2;
            String a8 = a3 + a4 + a5 + a6;

            String[] putToRoman = {a7, a8};
            int b1 = 0;
            int c1;
            for (int i = 0; i <= 1; i++) {
                b1 += Roman.decode(putToRoman[i]);
            }
            c1 = b1;
            System.out.println("output");
            System.out.println(Numeral.test(c1));
        }

        if (strRim.length() == 5 && strRim.charAt(3) == '+') {
            char a = strRim.charAt(0);
            char b = strRim.charAt(1);
            char c = strRim.charAt(2);
            char d = strRim.charAt(4);

            String a1 = String.valueOf(a);
            String a2 = String.valueOf(b);
            String a3 = String.valueOf(c);
            String a4 = String.valueOf(d);
            String a6 = a1 + a2 + a3;
            String a7 = a4;

            String[] putToRoman = {a6, a7};
            int b1 = 0;
            int c1;
            for (int i = 0; i <= 1; i++) {
                b1 += Roman.decode(putToRoman[i]);
            }
            c1 = b1;
            System.out.println("output");
            System.out.println(Numeral.test(c1));
        }

        if (strRim.length() == 6 && strRim.charAt(3) == '+') {
            char a = strRim.charAt(0);
            char b = strRim.charAt(1);
            char c = strRim.charAt(2);
            char d = strRim.charAt(4);
            char e = strRim.charAt(5);

            String a1 = String.valueOf(a);
            String a2 = String.valueOf(b);
            String a3 = String.valueOf(c);
            String a4 = String.valueOf(d);
            String a5 = String.valueOf(e);
            String a6 = a1 + a2 + a3;
            String a7 = a4 + a5;

            String[] putToRoman = {a6, a7};
            int b1 = 0;
            int c1;
            for (int i = 0; i <= 1; i++) {
                b1 += Roman.decode(putToRoman[i]);
            }
            c1 = b1;
            System.out.println("output");
            System.out.println(Numeral.test(c1));
        }

        if (strRim.length() == 7 && strRim.charAt(3) == '+') {
            char a = strRim.charAt(0);
            char b = strRim.charAt(1);
            char c = strRim.charAt(2);
            char d = strRim.charAt(4);
            char e = strRim.charAt(5);
            char f = strRim.charAt(6);

            String a1 = String.valueOf(a);
            String a2 = String.valueOf(b);
            String a3 = String.valueOf(c);
            String a4 = String.valueOf(d);
            String a5 = String.valueOf(e);
            String a6 = String.valueOf(f);
            String a7 = a1 + a2 + a3;
            String a8 = a4 + a5 + a6;

            String[] putToRoman = {a7, a8};
            int b1 = 0;
            int c1;
            for (int i = 0; i <= 1; i++) {
                b1 += Roman.decode(putToRoman[i]);
            }
            c1 = b1;
            System.out.println("output");
            System.out.println(Numeral.test(c1));
        }

        if (strRim.length() == 8 && strRim.charAt(3) == '+') {
            char a = strRim.charAt(0);
            char b = strRim.charAt(1);
            char c = strRim.charAt(2);
            char d = strRim.charAt(4);
            char e = strRim.charAt(5);
            char f = strRim.charAt(6);
            char j = strRim.charAt(7);

            String a1 = String.valueOf(a);
            String a2 = String.valueOf(b);
            String a3 = String.valueOf(c);
            String a4 = String.valueOf(d);
            String a5 = String.valueOf(e);
            String a6 = String.valueOf(f);
            String a7 = String.valueOf(j);
            String a8 = a1 + a2 + a3;
            String a9 = a4 + a5 + a6 + a7;

            String[] putToRoman = {a8, a9};
            int b1 = 0;
            int c1;
            for (int i = 0; i <= 1; i++) {
                b1 += Roman.decode(putToRoman[i]);
            }
            c1 = b1;
            System.out.println("output");
            System.out.println(Numeral.test(c1));
        }

        if (strRim.length() == 6 && strRim.charAt(4) == '+') {
            char a = strRim.charAt(0);
            char b = strRim.charAt(1);
            char c = strRim.charAt(2);
            char d = strRim.charAt(3);
            char e = strRim.charAt(5);

            String a1 = String.valueOf(a);
            String a2 = String.valueOf(b);
            String a3 = String.valueOf(c);
            String a4 = String.valueOf(d);
            String a5 = String.valueOf(e);
            String a6 = a1 + a2 + a3 + a4;
            String a7 = a5;

            String[] putToRoman = {a6, a7};
            int b1 = 0;
            int c1;
            for (int i = 0; i <= 1; i++) {
                b1 += Roman.decode(putToRoman[i]);
            }
            c1 = b1;
            System.out.println("output");
            System.out.println(Numeral.test(c1));
        }

        if (strRim.length() == 7 && strRim.charAt(4) == '+') {
            char a = strRim.charAt(0);
            char b = strRim.charAt(1);
            char c = strRim.charAt(2);
            char d = strRim.charAt(3);
            char e = strRim.charAt(5);
            char f = strRim.charAt(6);

            String a1 = String.valueOf(a);
            String a2 = String.valueOf(b);
            String a3 = String.valueOf(c);
            String a4 = String.valueOf(d);
            String a5 = String.valueOf(e);
            String a6 = String.valueOf(f);
            String a7 = a1 + a2 + a3 + a4;
            String a8 = a5 + a6;

            String[] putToRoman = {a7, a8};
            int b1 = 0;
            int c1;
            for (int i = 0; i <= 1; i++) {
                b1 += Roman.decode(putToRoman[i]);
            }
            c1 = b1;
            System.out.println("output");
            System.out.println(Numeral.test(c1));
        }

        if (strRim.length() == 8 && strRim.charAt(4) == '+') {
            char a = strRim.charAt(0);
            char b = strRim.charAt(1);
            char c = strRim.charAt(2);
            char d = strRim.charAt(3);
            char e = strRim.charAt(5);
            char f = strRim.charAt(6);
            char j = strRim.charAt(7);

            String a1 = String.valueOf(a);
            String a2 = String.valueOf(b);
            String a3 = String.valueOf(c);
            String a4 = String.valueOf(d);
            String a5 = String.valueOf(e);
            String a6 = String.valueOf(f);
            String a7 = String.valueOf(j);
            String a8 = a1 + a2 + a3 + a4;
            String a9 = a5 + a6 + a7;

            String[] putToRoman = {a8, a9};
            int b1 = 0;
            int c1;
            for (int i = 0; i <= 1; i++) {
                b1 += Roman.decode(putToRoman[i]);
            }
            c1 = b1;
            System.out.println("output");
            System.out.println(Numeral.test(c1));
        }

        if (strRim.length() == 9 && strRim.charAt(4) == '+') {
            char a = strRim.charAt(0);
            char b = strRim.charAt(1);
            char c = strRim.charAt(2);
            char d = strRim.charAt(3);
            char e = strRim.charAt(5);
            char f = strRim.charAt(6);
            char j = strRim.charAt(7);
            char k = strRim.charAt(8);

            String a1 = String.valueOf(a);
            String a2 = String.valueOf(b);
            String a3 = String.valueOf(c);
            String a4 = String.valueOf(d);
            String a5 = String.valueOf(e);
            String a6 = String.valueOf(f);
            String a7 = String.valueOf(j);
            String a8 = String.valueOf(k);
            String a9 = a1 + a2 + a3 + a4;
            String a10 = a5 + a6 + a7 + a8;

            String[] putToRoman = {a9, a10};
            int b1 = 0;
            int c1;
            for (int i = 0; i <= 1; i++) {
                b1 += Roman.decode(putToRoman[i]);
            }
            c1 = b1;
            System.out.println("output");
            System.out.println(Numeral.test(c1));
        }

        if (strRim.length() == 3 && strRim.charAt(1) == '-') {
            char a = strRim.charAt(0);
            char b = strRim.charAt(2);
            String a1 = String.valueOf(a);
            String a2 = String.valueOf(b);
            String[] putToRoman = {a1, a2};
            int b1;
            b1 = Roman.decode(putToRoman[0]);
            b1 -= Roman.decode(putToRoman[1]);
            System.out.println("output");
            System.out.println(Numeral.test(b1));
        }

        if (strRim.length() == 4 && strRim.charAt(1) == '-') {
            char a = strRim.charAt(0);
            char b = strRim.charAt(2);
            char c = strRim.charAt(3);
            String a1 = String.valueOf(a);
            String a2 = String.valueOf(b);
            String a3 = String.valueOf(c);
            String a4 = a2 + a3;
            String[] putToRoman = {a1, a4};
            int b1;
            b1 = Roman.decode(putToRoman[0]);
            b1 -= Roman.decode(putToRoman[1]);
            System.out.println("output");
            System.out.println(Numeral.test(b1));
        }

        if (strRim.length() == 5 && strRim.charAt(1) == '-') {
            char a = strRim.charAt(0);
            char b = strRim.charAt(2);
            char c = strRim.charAt(3);
            char d = strRim.charAt(4);

            String a1 = String.valueOf(a);
            String a2 = String.valueOf(b);
            String a3 = String.valueOf(c);
            String a4 = String.valueOf(d);
            String a5 = a1;
            String a6 = a2 + a3 + a4;

            String [] putToRoman = {a5, a6};
            int b1;
            b1 = Roman.decode(putToRoman[0]);
            b1 -= Roman.decode(putToRoman[1]);
            System.out.println("output");
            System.out.println(Numeral.test(b1));
        }

        if (strRim.length() == 6 && strRim.charAt(1) == '-') {
            char a = strRim.charAt(0);
            char b = strRim.charAt(2);
            char c = strRim.charAt(3);
            char d = strRim.charAt(4);
            char e = strRim.charAt(5);

            String a1 = String.valueOf(a);
            String a2 = String.valueOf(b);
            String a3 = String.valueOf(c);
            String a4 = String.valueOf(d);
            String a5 = String.valueOf(e);
            String a6 = a1;
            String a7 = a2 + a3 + a4 + a5;

            String [] putToRoman = {a6, a7};
            int b1;
            b1 = Roman.decode(putToRoman[0]);
            b1 -= Roman.decode(putToRoman[1]);
            System.out.println("output");
            System.out.println(Numeral.test(b1));
        }

        if (strRim.length() == 4 && strRim.charAt(2) == '-') {
            char a = strRim.charAt(0);
            char b = strRim.charAt(1);
            char c = strRim.charAt(3);
            String a1 = String.valueOf(a);
            String a2 = String.valueOf(b);
            String a3 = String.valueOf(c);
            String a4 = a1 + a2;
            String a5 = a3;

            String[] putToRoman = {a4, a5};
            int b1;
            b1 = Roman.decode(putToRoman[0]);
            b1 -= Roman.decode(putToRoman[1]);
            System.out.println("output");
            System.out.println(Numeral.test(b1));
        }

        if (strRim.length() == 5 && strRim.charAt(2) == '-') {
            char a = strRim.charAt(0);
            char b = strRim.charAt(1);
            char c = strRim.charAt(3);
            char d = strRim.charAt(4);
            String a1 = String.valueOf(a);
            String a2 = String.valueOf(b);
            String a3 = String.valueOf(c);
            String a4 = String.valueOf(d);
            String a5 = a1 + a2;
            String a6 = a3 + a4;

            String[] putToRoman = {a5, a6};
            int b1;
            b1 = Roman.decode(putToRoman[0]);
            b1 -= Roman.decode(putToRoman[1]);
            System.out.println("output");
            System.out.println(Numeral.test(b1));
        }

        if (strRim.length() == 6 && strRim.charAt(2) == '-') {
            char a = strRim.charAt(0);
            char b = strRim.charAt(1);
            char c = strRim.charAt(3);
            char d = strRim.charAt(4);
            char e = strRim.charAt(5);
            String a1 = String.valueOf(a);
            String a2 = String.valueOf(b);
            String a3 = String.valueOf(c);
            String a4 = String.valueOf(d);
            String a5 = String.valueOf(e);
            String a6 = a1 + a2;
            String a7 = a3 + a4 + a5;

            String[] putToRoman = {a6, a7};
            int b1;
            b1 = Roman.decode(putToRoman[0]);
            b1 -= Roman.decode(putToRoman[1]);
            System.out.println("output");
            System.out.println(Numeral.test(b1));
        }

        if (strRim.length() == 7 && strRim.charAt(2) == '-') {
            char a = strRim.charAt(0);
            char b = strRim.charAt(1);
            char c = strRim.charAt(3);
            char d = strRim.charAt(4);
            char e = strRim.charAt(5);
            char f = strRim.charAt(6);
            String a1 = String.valueOf(a);
            String a2 = String.valueOf(b);
            String a3 = String.valueOf(c);
            String a4 = String.valueOf(d);
            String a5 = String.valueOf(e);
            String a6 = String.valueOf(f);
            String a7 = a1 + a2;
            String a8 = a3 + a4 + a5 + a6;

            String[] putToRoman = {a7, a8};
            int b1;
            b1 = Roman.decode(putToRoman[0]);
            b1 -= Roman.decode(putToRoman[1]);
            System.out.println("output");
            System.out.println(Numeral.test(b1));
        }

        if (strRim.length() == 5 && strRim.charAt(3) == '-') {
            char a = strRim.charAt(0);
            char b = strRim.charAt(1);
            char c = strRim.charAt(2);
            char d = strRim.charAt(4);

            String a1 = String.valueOf(a);
            String a2 = String.valueOf(b);
            String a3 = String.valueOf(c);
            String a4 = String.valueOf(d);
            String a6 = a1 + a2 + a3;
            String a7 = a4;

            String[] putToRoman = {a6, a7};
            int b1;
            b1 = Roman.decode(putToRoman[0]);
            b1 -= Roman.decode(putToRoman[1]);
            System.out.println("output");
            System.out.println(Numeral.test(b1));
        }

        if (strRim.length() == 6 && strRim.charAt(3) == '-') {
            char a = strRim.charAt(0);
            char b = strRim.charAt(1);
            char c = strRim.charAt(2);
            char d = strRim.charAt(4);
            char e = strRim.charAt(5);

            String a1 = String.valueOf(a);
            String a2 = String.valueOf(b);
            String a3 = String.valueOf(c);
            String a4 = String.valueOf(d);
            String a5 = String.valueOf(e);
            String a6 = a1 + a2 + a3;
            String a7 = a4 + a5;

            String[] putToRoman = {a6, a7};
            int b1;
            b1 = Roman.decode(putToRoman[0]);
            b1 -= Roman.decode(putToRoman[1]);
            System.out.println("output");
            System.out.println(Numeral.test(b1));
        }

        if (strRim.length() == 7 && strRim.charAt(3) == '-') {
            char a = strRim.charAt(0);
            char b = strRim.charAt(1);
            char c = strRim.charAt(2);
            char d = strRim.charAt(4);
            char e = strRim.charAt(5);
            char f = strRim.charAt(6);

            String a1 = String.valueOf(a);
            String a2 = String.valueOf(b);
            String a3 = String.valueOf(c);
            String a4 = String.valueOf(d);
            String a5 = String.valueOf(e);
            String a6 = String.valueOf(f);
            String a7 = a1 + a2 + a3;
            String a8 = a4 + a5 + a6;

            String[] putToRoman = {a7, a8};
            int b1;
            b1 = Roman.decode(putToRoman[0]);
            b1 -= Roman.decode(putToRoman[1]);
            System.out.println("output");
            System.out.println(Numeral.test(b1));
        }

        if (strRim.length() == 8 && strRim.charAt(3) == '-') {
            char a = strRim.charAt(0);
            char b = strRim.charAt(1);
            char c = strRim.charAt(2);
            char d = strRim.charAt(4);
            char e = strRim.charAt(5);
            char f = strRim.charAt(6);
            char j = strRim.charAt(7);

            String a1 = String.valueOf(a);
            String a2 = String.valueOf(b);
            String a3 = String.valueOf(c);
            String a4 = String.valueOf(d);
            String a5 = String.valueOf(e);
            String a6 = String.valueOf(f);
            String a7 = String.valueOf(j);
            String a8 = a1 + a2 + a3;
            String a9 = a4 + a5 + a6 + a7;

            String[] putToRoman = {a8, a9};
            int b1;
            b1 = Roman.decode(putToRoman[0]);
            b1 -= Roman.decode(putToRoman[1]);
            System.out.println("output");
            System.out.println(Numeral.test(b1));
        }

        if (strRim.length() == 6 && strRim.charAt(4) == '-') {
            char a = strRim.charAt(0);
            char b = strRim.charAt(1);
            char c = strRim.charAt(2);
            char d = strRim.charAt(3);
            char e = strRim.charAt(5);

            String a1 = String.valueOf(a);
            String a2 = String.valueOf(b);
            String a3 = String.valueOf(c);
            String a4 = String.valueOf(d);
            String a5 = String.valueOf(e);
            String a6 = a1 + a2 + a3 + a4;
            String a7 = a5;

            String[] putToRoman = {a6, a7};
            int b1;
            b1 = Roman.decode(putToRoman[0]);
            b1 -= Roman.decode(putToRoman[1]);
            System.out.println("output");
            System.out.println(Numeral.test(b1));
        }

        if (strRim.length() == 7 && strRim.charAt(4) == '-') {
            char a = strRim.charAt(0);
            char b = strRim.charAt(1);
            char c = strRim.charAt(2);
            char d = strRim.charAt(3);
            char e = strRim.charAt(5);
            char f = strRim.charAt(6);

            String a1 = String.valueOf(a);
            String a2 = String.valueOf(b);
            String a3 = String.valueOf(c);
            String a4 = String.valueOf(d);
            String a5 = String.valueOf(e);
            String a6 = String.valueOf(f);
            String a7 = a1 + a2 + a3 + a4;
            String a8 = a5 + a6;

            String[] putToRoman = {a7, a8};
            int b1;
            b1 = Roman.decode(putToRoman[0]);
            b1 -= Roman.decode(putToRoman[1]);
            System.out.println("output");
            System.out.println(Numeral.test(b1));
        }

        if (strRim.length() == 8 && strRim.charAt(4) == '-') {
            char a = strRim.charAt(0);
            char b = strRim.charAt(1);
            char c = strRim.charAt(2);
            char d = strRim.charAt(3);
            char e = strRim.charAt(5);
            char f = strRim.charAt(6);
            char j = strRim.charAt(7);

            String a1 = String.valueOf(a);
            String a2 = String.valueOf(b);
            String a3 = String.valueOf(c);
            String a4 = String.valueOf(d);
            String a5 = String.valueOf(e);
            String a6 = String.valueOf(f);
            String a7 = String.valueOf(j);
            String a8 = a1 + a2 + a3 + a4;
            String a9 = a5 + a6 + a7;

            String[] putToRoman = {a8, a9};
            int b1;
            b1 = Roman.decode(putToRoman[0]);
            b1 -= Roman.decode(putToRoman[1]);
            System.out.println("output");
            System.out.println(Numeral.test(b1));
        }

        if (strRim.length() == 9 && strRim.charAt(4) == '-') {
            char a = strRim.charAt(0);
            char b = strRim.charAt(1);
            char c = strRim.charAt(2);
            char d = strRim.charAt(3);
            char e = strRim.charAt(5);
            char f = strRim.charAt(6);
            char j = strRim.charAt(7);
            char k = strRim.charAt(8);

            String a1 = String.valueOf(a);
            String a2 = String.valueOf(b);
            String a3 = String.valueOf(c);
            String a4 = String.valueOf(d);
            String a5 = String.valueOf(e);
            String a6 = String.valueOf(f);
            String a7 = String.valueOf(j);
            String a8 = String.valueOf(k);
            String a9 = a1 + a2 + a3 + a4;
            String a10 = a5 + a6 + a7 + a8;

            String[] putToRoman = {a9, a10};
            int b1;
            b1 = Roman.decode(putToRoman[0]);
            b1 -= Roman.decode(putToRoman[1]);
            System.out.println("output");
            System.out.println(Numeral.test(b1));
        }

        if (strRim.length() == 3 && strRim.charAt(1) == '*') {
            char a = strRim.charAt(0);
            char b = strRim.charAt(2);
            String a1 = String.valueOf(a);
            String a2 = String.valueOf(b);
            String[] putToRoman = {a1, a2};
            int b1;
            b1 = Roman.decode(putToRoman[0]);
            b1 *= Roman.decode(putToRoman[1]);
            System.out.println("output");
            System.out.println(Numeral.test(b1));
        }

        if (strRim.length() == 4 && strRim.charAt(1) == '*') {
            char a = strRim.charAt(0);
            char b = strRim.charAt(2);
            char c = strRim.charAt(3);
            String a1 = String.valueOf(a);
            String a2 = String.valueOf(b);
            String a3 = String.valueOf(c);
            String a4 = a2 + a3;
            String[] putToRoman = {a1, a4};
            int b1;
            b1 = Roman.decode(putToRoman[0]);
            b1 *= Roman.decode(putToRoman[1]);
            System.out.println("output");
            System.out.println(Numeral.test(b1));
        }

        if (strRim.length() == 5 && strRim.charAt(1) == '*') {
            char a = strRim.charAt(0);
            char b = strRim.charAt(2);
            char c = strRim.charAt(3);
            char d = strRim.charAt(4);

            String a1 = String.valueOf(a);
            String a2 = String.valueOf(b);
            String a3 = String.valueOf(c);
            String a4 = String.valueOf(d);
            String a5 = a1;
            String a6 = a2 + a3 + a4;

            String [] putToRoman = {a5, a6};
            int b1;
            b1 = Roman.decode(putToRoman[0]);
            b1 *= Roman.decode(putToRoman[1]);
            System.out.println("output");
            System.out.println(Numeral.test(b1));
        }

        if (strRim.length() == 6 && strRim.charAt(1) == '*') {
            char a = strRim.charAt(0);
            char b = strRim.charAt(2);
            char c = strRim.charAt(3);
            char d = strRim.charAt(4);
            char e = strRim.charAt(5);

            String a1 = String.valueOf(a);
            String a2 = String.valueOf(b);
            String a3 = String.valueOf(c);
            String a4 = String.valueOf(d);
            String a5 = String.valueOf(e);
            String a6 = a1;
            String a7 = a2 + a3 + a4 + a5;

            String [] putToRoman = {a6, a7};
            int b1;
            b1 = Roman.decode(putToRoman[0]);
            b1 *= Roman.decode(putToRoman[1]);
            System.out.println("output");
            System.out.println(Numeral.test(b1));
        }

        if (strRim.length() == 4 && strRim.charAt(2) == '*') {
            char a = strRim.charAt(0);
            char b = strRim.charAt(1);
            char c = strRim.charAt(3);
            String a1 = String.valueOf(a);
            String a2 = String.valueOf(b);
            String a3 = String.valueOf(c);
            String a4 = a1 + a2;
            String a5 = a3;

            String[] putToRoman = {a4, a5};
            int b1;
            b1 = Roman.decode(putToRoman[0]);
            b1 *= Roman.decode(putToRoman[1]);
            System.out.println("output");
            System.out.println(Numeral.test(b1));
        }

        if (strRim.length() == 5 && strRim.charAt(2) == '*') {
            char a = strRim.charAt(0);
            char b = strRim.charAt(1);
            char c = strRim.charAt(3);
            char d = strRim.charAt(4);
            String a1 = String.valueOf(a);
            String a2 = String.valueOf(b);
            String a3 = String.valueOf(c);
            String a4 = String.valueOf(d);
            String a5 = a1 + a2;
            String a6 = a3 + a4;

            String[] putToRoman = {a5, a6};
            int b1;
            b1 = Roman.decode(putToRoman[0]);
            b1 *= Roman.decode(putToRoman[1]);
            System.out.println("output");
            System.out.println(Numeral.test(b1));
        }

        if (strRim.length() == 6 && strRim.charAt(2) == '*') {
            char a = strRim.charAt(0);
            char b = strRim.charAt(1);
            char c = strRim.charAt(3);
            char d = strRim.charAt(4);
            char e = strRim.charAt(5);
            String a1 = String.valueOf(a);
            String a2 = String.valueOf(b);
            String a3 = String.valueOf(c);
            String a4 = String.valueOf(d);
            String a5 = String.valueOf(e);
            String a6 = a1 + a2;
            String a7 = a3 + a4 + a5;

            String[] putToRoman = {a6, a7};
            int b1;
            b1 = Roman.decode(putToRoman[0]);
            b1 *= Roman.decode(putToRoman[1]);
            System.out.println("output");
            System.out.println(Numeral.test(b1));
        }

        if (strRim.length() == 7 && strRim.charAt(2) == '*') {
            char a = strRim.charAt(0);
            char b = strRim.charAt(1);
            char c = strRim.charAt(3);
            char d = strRim.charAt(4);
            char e = strRim.charAt(5);
            char f = strRim.charAt(6);
            String a1 = String.valueOf(a);
            String a2 = String.valueOf(b);
            String a3 = String.valueOf(c);
            String a4 = String.valueOf(d);
            String a5 = String.valueOf(e);
            String a6 = String.valueOf(f);
            String a7 = a1 + a2;
            String a8 = a3 + a4 + a5 + a6;

            String[] putToRoman = {a7, a8};
            int b1;
            b1 = Roman.decode(putToRoman[0]);
            b1 *= Roman.decode(putToRoman[1]);
            System.out.println("output");
            System.out.println(Numeral.test(b1));
        }

        if (strRim.length() == 5 && strRim.charAt(3) == '*') {
            char a = strRim.charAt(0);
            char b = strRim.charAt(1);
            char c = strRim.charAt(2);
            char d = strRim.charAt(4);

            String a1 = String.valueOf(a);
            String a2 = String.valueOf(b);
            String a3 = String.valueOf(c);
            String a4 = String.valueOf(d);
            String a6 = a1 + a2 + a3;
            String a7 = a4;

            String[] putToRoman = {a6, a7};
            int b1;
            b1 = Roman.decode(putToRoman[0]);
            b1 *= Roman.decode(putToRoman[1]);
            System.out.println("output");
            System.out.println(Numeral.test(b1));
        }

        if (strRim.length() == 6 && strRim.charAt(3) == '*') {
            char a = strRim.charAt(0);
            char b = strRim.charAt(1);
            char c = strRim.charAt(2);
            char d = strRim.charAt(4);
            char e = strRim.charAt(5);

            String a1 = String.valueOf(a);
            String a2 = String.valueOf(b);
            String a3 = String.valueOf(c);
            String a4 = String.valueOf(d);
            String a5 = String.valueOf(e);
            String a6 = a1 + a2 + a3;
            String a7 = a4 + a5;

            String[] putToRoman = {a6, a7};
            int b1;
            b1 = Roman.decode(putToRoman[0]);
            b1 *= Roman.decode(putToRoman[1]);
            System.out.println("output");
            System.out.println(Numeral.test(b1));
        }

        if (strRim.length() == 7 && strRim.charAt(3) == '*') {
            char a = strRim.charAt(0);
            char b = strRim.charAt(1);
            char c = strRim.charAt(2);
            char d = strRim.charAt(4);
            char e = strRim.charAt(5);
            char f = strRim.charAt(6);

            String a1 = String.valueOf(a);
            String a2 = String.valueOf(b);
            String a3 = String.valueOf(c);
            String a4 = String.valueOf(d);
            String a5 = String.valueOf(e);
            String a6 = String.valueOf(f);
            String a7 = a1 + a2 + a3;
            String a8 = a4 + a5 + a6;

            String[] putToRoman = {a7, a8};
            int b1;
            b1 = Roman.decode(putToRoman[0]);
            b1 *= Roman.decode(putToRoman[1]);
            System.out.println("output");
            System.out.println(Numeral.test(b1));
        }

        if (strRim.length() == 8 && strRim.charAt(3) == '*') {
            char a = strRim.charAt(0);
            char b = strRim.charAt(1);
            char c = strRim.charAt(2);
            char d = strRim.charAt(4);
            char e = strRim.charAt(5);
            char f = strRim.charAt(6);
            char j = strRim.charAt(7);

            String a1 = String.valueOf(a);
            String a2 = String.valueOf(b);
            String a3 = String.valueOf(c);
            String a4 = String.valueOf(d);
            String a5 = String.valueOf(e);
            String a6 = String.valueOf(f);
            String a7 = String.valueOf(j);
            String a8 = a1 + a2 + a3;
            String a9 = a4 + a5 + a6 + a7;

            String[] putToRoman = {a8, a9};
            int b1;
            b1 = Roman.decode(putToRoman[0]);
            b1 *= Roman.decode(putToRoman[1]);
            System.out.println("output");
            System.out.println(Numeral.test(b1));
        }

        if (strRim.length() == 6 && strRim.charAt(4) == '*') {
            char a = strRim.charAt(0);
            char b = strRim.charAt(1);
            char c = strRim.charAt(2);
            char d = strRim.charAt(3);
            char e = strRim.charAt(5);

            String a1 = String.valueOf(a);
            String a2 = String.valueOf(b);
            String a3 = String.valueOf(c);
            String a4 = String.valueOf(d);
            String a5 = String.valueOf(e);
            String a6 = a1 + a2 + a3 + a4;
            String a7 = a5;

            String[] putToRoman = {a6, a7};
            int b1;
            b1 = Roman.decode(putToRoman[0]);
            b1 *= Roman.decode(putToRoman[1]);
            System.out.println("output");
            System.out.println(Numeral.test(b1));
        }

        if (strRim.length() == 7 && strRim.charAt(4) == '*') {
            char a = strRim.charAt(0);
            char b = strRim.charAt(1);
            char c = strRim.charAt(2);
            char d = strRim.charAt(3);
            char e = strRim.charAt(5);
            char f = strRim.charAt(6);

            String a1 = String.valueOf(a);
            String a2 = String.valueOf(b);
            String a3 = String.valueOf(c);
            String a4 = String.valueOf(d);
            String a5 = String.valueOf(e);
            String a6 = String.valueOf(f);
            String a7 = a1 + a2 + a3 + a4;
            String a8 = a5 + a6;

            String[] putToRoman = {a7, a8};
            int b1;
            b1 = Roman.decode(putToRoman[0]);
            b1 *= Roman.decode(putToRoman[1]);
            System.out.println("output");
            System.out.println(Numeral.test(b1));
        }

        if (strRim.length() == 8 && strRim.charAt(4) == '*') {
            char a = strRim.charAt(0);
            char b = strRim.charAt(1);
            char c = strRim.charAt(2);
            char d = strRim.charAt(3);
            char e = strRim.charAt(5);
            char f = strRim.charAt(6);
            char j = strRim.charAt(7);

            String a1 = String.valueOf(a);
            String a2 = String.valueOf(b);
            String a3 = String.valueOf(c);
            String a4 = String.valueOf(d);
            String a5 = String.valueOf(e);
            String a6 = String.valueOf(f);
            String a7 = String.valueOf(j);
            String a8 = a1 + a2 + a3 + a4;
            String a9 = a5 + a6 + a7;

            String[] putToRoman = {a8, a9};
            int b1;
            b1 = Roman.decode(putToRoman[0]);
            b1 *= Roman.decode(putToRoman[1]);
            System.out.println("output");
            System.out.println(Numeral.test(b1));
        }

        if (strRim.length() == 9 && strRim.charAt(4) == '*') {
            char a = strRim.charAt(0);
            char b = strRim.charAt(1);
            char c = strRim.charAt(2);
            char d = strRim.charAt(3);
            char e = strRim.charAt(5);
            char f = strRim.charAt(6);
            char j = strRim.charAt(7);
            char k = strRim.charAt(8);

            String a1 = String.valueOf(a);
            String a2 = String.valueOf(b);
            String a3 = String.valueOf(c);
            String a4 = String.valueOf(d);
            String a5 = String.valueOf(e);
            String a6 = String.valueOf(f);
            String a7 = String.valueOf(j);
            String a8 = String.valueOf(k);
            String a9 = a1 + a2 + a3 + a4;
            String a10 = a5 + a6 + a7 + a8;

            String[] putToRoman = {a9, a10};
            int b1;
            b1 = Roman.decode(putToRoman[0]);
            b1 *= Roman.decode(putToRoman[1]);
            System.out.println("output");
            System.out.println(Numeral.test(b1));
        }

        if (strRim.length() == 3 && strRim.charAt(1) == '/') {
            char a = strRim.charAt(0);
            char b = strRim.charAt(2);
            String a1 = String.valueOf(a);
            String a2 = String.valueOf(b);
            String[] putToRoman = {a1, a2};
            int b1;
            b1 = Roman.decode(putToRoman[0]);
            b1 /= Roman.decode(putToRoman[1]);
            System.out.println("output");
            System.out.println(Numeral.test(b1));
        }

        if (strRim.length() == 4 && strRim.charAt(1) == '/') {
            char a = strRim.charAt(0);
            char b = strRim.charAt(2);
            char c = strRim.charAt(3);
            String a1 = String.valueOf(a);
            String a2 = String.valueOf(b);
            String a3 = String.valueOf(c);
            String a4 = a2 + a3;
            String[] putToRoman = {a1, a4};
            int b1;
            b1 = Roman.decode(putToRoman[0]);
            b1 /= Roman.decode(putToRoman[1]);
            System.out.println("output");
            System.out.println(Numeral.test(b1));
        }

        if (strRim.length() == 5 && strRim.charAt(1) == '/') {
            char a = strRim.charAt(0);
            char b = strRim.charAt(2);
            char c = strRim.charAt(3);
            char d = strRim.charAt(4);

            String a1 = String.valueOf(a);
            String a2 = String.valueOf(b);
            String a3 = String.valueOf(c);
            String a4 = String.valueOf(d);
            String a5 = a1;
            String a6 = a2 + a3 + a4;

            String [] putToRoman = {a5, a6};
            int b1;
            b1 = Roman.decode(putToRoman[0]);
            b1 /= Roman.decode(putToRoman[1]);
            System.out.println("output");
            System.out.println(Numeral.test(b1));
        }

        if (strRim.length() == 6 && strRim.charAt(1) == '/') {
            char a = strRim.charAt(0);
            char b = strRim.charAt(2);
            char c = strRim.charAt(3);
            char d = strRim.charAt(4);
            char e = strRim.charAt(5);

            String a1 = String.valueOf(a);
            String a2 = String.valueOf(b);
            String a3 = String.valueOf(c);
            String a4 = String.valueOf(d);
            String a5 = String.valueOf(e);
            String a6 = a1;
            String a7 = a2 + a3 + a4 + a5;

            String [] putToRoman = {a6, a7};
            int b1;
            b1 = Roman.decode(putToRoman[0]);
            b1 /= Roman.decode(putToRoman[1]);
            System.out.println("output");
            System.out.println(Numeral.test(b1));
        }

        if (strRim.length() == 4 && strRim.charAt(2) == '/') {
            char a = strRim.charAt(0);
            char b = strRim.charAt(1);
            char c = strRim.charAt(3);
            String a1 = String.valueOf(a);
            String a2 = String.valueOf(b);
            String a3 = String.valueOf(c);
            String a4 = a1 + a2;
            String a5 = a3;

            String[] putToRoman = {a4, a5};
            int b1;
            b1 = Roman.decode(putToRoman[0]);
            b1 /= Roman.decode(putToRoman[1]);
            System.out.println("output");
            System.out.println(Numeral.test(b1));
        }

        if (strRim.length() == 5 && strRim.charAt(2) == '/') {
            char a = strRim.charAt(0);
            char b = strRim.charAt(1);
            char c = strRim.charAt(3);
            char d = strRim.charAt(4);
            String a1 = String.valueOf(a);
            String a2 = String.valueOf(b);
            String a3 = String.valueOf(c);
            String a4 = String.valueOf(d);
            String a5 = a1 + a2;
            String a6 = a3 + a4;

            String[] putToRoman = {a5, a6};
            int b1;
            b1 = Roman.decode(putToRoman[0]);
            b1 /= Roman.decode(putToRoman[1]);
            System.out.println("output");
            System.out.println(Numeral.test(b1));
        }

        if (strRim.length() == 6 && strRim.charAt(2) == '/') {
            char a = strRim.charAt(0);
            char b = strRim.charAt(1);
            char c = strRim.charAt(3);
            char d = strRim.charAt(4);
            char e = strRim.charAt(5);
            String a1 = String.valueOf(a);
            String a2 = String.valueOf(b);
            String a3 = String.valueOf(c);
            String a4 = String.valueOf(d);
            String a5 = String.valueOf(e);
            String a6 = a1 + a2;
            String a7 = a3 + a4 + a5;

            String[] putToRoman = {a6, a7};
            int b1;
            b1 = Roman.decode(putToRoman[0]);
            b1 /= Roman.decode(putToRoman[1]);
            System.out.println("output");
            System.out.println(Numeral.test(b1));
        }

        if (strRim.length() == 7 && strRim.charAt(2) == '/') {
            char a = strRim.charAt(0);
            char b = strRim.charAt(1);
            char c = strRim.charAt(3);
            char d = strRim.charAt(4);
            char e = strRim.charAt(5);
            char f = strRim.charAt(6);
            String a1 = String.valueOf(a);
            String a2 = String.valueOf(b);
            String a3 = String.valueOf(c);
            String a4 = String.valueOf(d);
            String a5 = String.valueOf(e);
            String a6 = String.valueOf(f);
            String a7 = a1 + a2;
            String a8 = a3 + a4 + a5 + a6;

            String[] putToRoman = {a7, a8};
            int b1;
            b1 = Roman.decode(putToRoman[0]);
            b1 /= Roman.decode(putToRoman[1]);
            System.out.println("output");
            System.out.println(Numeral.test(b1));
        }

        if (strRim.length() == 5 && strRim.charAt(3) == '/') {
            char a = strRim.charAt(0);
            char b = strRim.charAt(1);
            char c = strRim.charAt(2);
            char d = strRim.charAt(4);

            String a1 = String.valueOf(a);
            String a2 = String.valueOf(b);
            String a3 = String.valueOf(c);
            String a4 = String.valueOf(d);
            String a6 = a1 + a2 + a3;
            String a7 = a4;

            String[] putToRoman = {a6, a7};
            int b1;
            b1 = Roman.decode(putToRoman[0]);
            b1 /= Roman.decode(putToRoman[1]);
            System.out.println("output");
            System.out.println(Numeral.test(b1));
        }

        if (strRim.length() == 6 && strRim.charAt(3) == '/') {
            char a = strRim.charAt(0);
            char b = strRim.charAt(1);
            char c = strRim.charAt(2);
            char d = strRim.charAt(4);
            char e = strRim.charAt(5);

            String a1 = String.valueOf(a);
            String a2 = String.valueOf(b);
            String a3 = String.valueOf(c);
            String a4 = String.valueOf(d);
            String a5 = String.valueOf(e);
            String a6 = a1 + a2 + a3;
            String a7 = a4 + a5;

            String[] putToRoman = {a6, a7};
            int b1;
            b1 = Roman.decode(putToRoman[0]);
            b1 /= Roman.decode(putToRoman[1]);
            System.out.println("output");
            System.out.println(Numeral.test(b1));
        }

        if (strRim.length() == 7 && strRim.charAt(3) == '/') {
            char a = strRim.charAt(0);
            char b = strRim.charAt(1);
            char c = strRim.charAt(2);
            char d = strRim.charAt(4);
            char e = strRim.charAt(5);
            char f = strRim.charAt(6);

            String a1 = String.valueOf(a);
            String a2 = String.valueOf(b);
            String a3 = String.valueOf(c);
            String a4 = String.valueOf(d);
            String a5 = String.valueOf(e);
            String a6 = String.valueOf(f);
            String a7 = a1 + a2 + a3;
            String a8 = a4 + a5 + a6;

            String[] putToRoman = {a7, a8};
            int b1;
            b1 = Roman.decode(putToRoman[0]);
            b1 /= Roman.decode(putToRoman[1]);
            System.out.println("output");
            System.out.println(Numeral.test(b1));
        }

        if (strRim.length() == 8 && strRim.charAt(3) == '/') {
            char a = strRim.charAt(0);
            char b = strRim.charAt(1);
            char c = strRim.charAt(2);
            char d = strRim.charAt(4);
            char e = strRim.charAt(5);
            char f = strRim.charAt(6);
            char j = strRim.charAt(7);

            String a1 = String.valueOf(a);
            String a2 = String.valueOf(b);
            String a3 = String.valueOf(c);
            String a4 = String.valueOf(d);
            String a5 = String.valueOf(e);
            String a6 = String.valueOf(f);
            String a7 = String.valueOf(j);
            String a8 = a1 + a2 + a3;
            String a9 = a4 + a5 + a6 + a7;

            String[] putToRoman = {a8, a9};
            int b1;
            b1 = Roman.decode(putToRoman[0]);
            b1 /= Roman.decode(putToRoman[1]);
            System.out.println("output");
            System.out.println(Numeral.test(b1));
        }

        if (strRim.length() == 6 && strRim.charAt(4) == '/') {
            char a = strRim.charAt(0);
            char b = strRim.charAt(1);
            char c = strRim.charAt(2);
            char d = strRim.charAt(3);
            char e = strRim.charAt(5);

            String a1 = String.valueOf(a);
            String a2 = String.valueOf(b);
            String a3 = String.valueOf(c);
            String a4 = String.valueOf(d);
            String a5 = String.valueOf(e);
            String a6 = a1 + a2 + a3 + a4;
            String a7 = a5;

            String[] putToRoman = {a6, a7};
            int b1;
            b1 = Roman.decode(putToRoman[0]);
            b1 /= Roman.decode(putToRoman[1]);
            System.out.println("output");
            System.out.println(Numeral.test(b1));
        }

        if (strRim.length() == 7 && strRim.charAt(4) == '/') {
            char a = strRim.charAt(0);
            char b = strRim.charAt(1);
            char c = strRim.charAt(2);
            char d = strRim.charAt(3);
            char e = strRim.charAt(5);
            char f = strRim.charAt(6);

            String a1 = String.valueOf(a);
            String a2 = String.valueOf(b);
            String a3 = String.valueOf(c);
            String a4 = String.valueOf(d);
            String a5 = String.valueOf(e);
            String a6 = String.valueOf(f);
            String a7 = a1 + a2 + a3 + a4;
            String a8 = a5 + a6;

            String[] putToRoman = {a7, a8};
            int b1;
            b1 = Roman.decode(putToRoman[0]);
            b1 /= Roman.decode(putToRoman[1]);
            System.out.println("output");
            System.out.println(Numeral.test(b1));
        }

        if (strRim.length() == 8 && strRim.charAt(4) == '/') {
            char a = strRim.charAt(0);
            char b = strRim.charAt(1);
            char c = strRim.charAt(2);
            char d = strRim.charAt(3);
            char e = strRim.charAt(5);
            char f = strRim.charAt(6);
            char j = strRim.charAt(7);

            String a1 = String.valueOf(a);
            String a2 = String.valueOf(b);
            String a3 = String.valueOf(c);
            String a4 = String.valueOf(d);
            String a5 = String.valueOf(e);
            String a6 = String.valueOf(f);
            String a7 = String.valueOf(j);
            String a8 = a1 + a2 + a3 + a4;
            String a9 = a5 + a6 + a7;

            String[] putToRoman = {a8, a9};
            int b1;
            b1 = Roman.decode(putToRoman[0]);
            b1 /= Roman.decode(putToRoman[1]);
            System.out.println("output");
            System.out.println(Numeral.test(b1));
        }

        if (strRim.length() == 9 && strRim.charAt(4) == '/') {
            char a = strRim.charAt(0);
            char b = strRim.charAt(1);
            char c = strRim.charAt(2);
            char d = strRim.charAt(3);
            char e = strRim.charAt(5);
            char f = strRim.charAt(6);
            char j = strRim.charAt(7);
            char k = strRim.charAt(8);

            String a1 = String.valueOf(a);
            String a2 = String.valueOf(b);
            String a3 = String.valueOf(c);
            String a4 = String.valueOf(d);
            String a5 = String.valueOf(e);
            String a6 = String.valueOf(f);
            String a7 = String.valueOf(j);
            String a8 = String.valueOf(k);
            String a9 = a1 + a2 + a3 + a4;
            String a10 = a5 + a6 + a7 + a8;

            String[] putToRoman = {a9, a10};
            int b1;
            b1 = Roman.decode(putToRoman[0]);
            b1 /= Roman.decode(putToRoman[1]);
            System.out.println("output");
            System.out.println(Numeral.test(b1));
        }

        }

    }








//        if (strRim.contains("Ⅰ") && strRim.contains("+") && strRim.contains("Ⅰ")) {
//            System.out.println("output");
//            System.out.println(rome[1]);
//        }
//        if (strRim.contains("Ⅰ") && strRim.contains("+") && strRim.contains("Ⅱ")) {
//            System.out.println("output");
//            System.out.println(rome[2]);
//        }
//        if (strRim.contains("Ⅰ") && strRim.contains("+") && strRim.contains("Ⅲ")) {
//            System.out.println("output");
//            System.out.println(rome[3]);
//        }
//        if (strRim.contains("Ⅰ") && strRim.contains("+") && strRim.contains("Ⅳ")) {
//            System.out.println("output");
//            System.out.println(rome[4]);
//        }
//        if (strRim.contains("Ⅰ") && strRim.contains("+") && strRim.contains("Ⅴ")) {
//            System.out.println("output");
//            System.out.println(rome[5]);
//        }
//        if (strRim.contains("Ⅰ") && strRim.contains("+") && strRim.contains("Ⅵ")) {
//            System.out.println("output");
//            System.out.println(rome[6]);
//        }
//        if (strRim.contains("Ⅰ") && strRim.contains("+") && strRim.contains("Ⅶ")) {
//            System.out.println("output");
//            System.out.println(rome[7]);
//        }
//        if (strRim.contains("Ⅰ") && strRim.contains("+") && strRim.contains("Ⅷ")) {
//            System.out.println("output");
//            System.out.println(rome[8]);
//        }
//        if (strRim.contains("Ⅰ") && strRim.contains("+") && strRim.contains("Ⅸ")) {
//            System.out.println("output");
//            System.out.println(rome[9]);
//        }
//        if (strRim.contains("Ⅰ") && strRim.contains("+") && strRim.contains("Ⅹ")) {
//            System.out.println("output");
//            System.out.println(rome[10]);
//        }
////  --------------------------------------------------------------------------------------------------------------
//
//        if (strRim.contains("Ⅱ") && strRim.contains("+") && strRim.contains("Ⅱ")) {
//            System.out.println("output");
//            System.out.println(rome[3]);
//        }
//        if (strRim.contains("Ⅱ") && strRim.contains("+") && strRim.contains("Ⅲ")) {
//            System.out.println("output");
//            System.out.println(rome[4]);
//        }
//        if (strRim.contains("Ⅱ") && strRim.contains("+") && strRim.contains("Ⅳ")) {
//            System.out.println("output");
//            System.out.println(rome[5]);
//        }
//        if (strRim.contains("Ⅱ") && strRim.contains("+") && strRim.contains("Ⅴ")) {
//            System.out.println("output");
//            System.out.println(rome[6]);
//        }
//        if (strRim.contains("Ⅱ") && strRim.contains("+") && strRim.contains("Ⅵ")) {
//            System.out.println("output");
//            System.out.println(rome[7]);
//        }
//        if (strRim.contains("Ⅱ") && strRim.contains("+") && strRim.contains("Ⅶ")) {
//            System.out.println("output");
//            System.out.println(rome[8]);
//        }
//        if (strRim.contains("Ⅱ") && strRim.contains("+") && strRim.contains("Ⅷ")) {
//            System.out.println("output");
//            System.out.println(rome[9]);
//        }
//        if (strRim.contains("Ⅱ") && strRim.contains("+") && strRim.contains("Ⅸ")) {
//            System.out.println("output");
//            System.out.println(rome[10]);
//        }
//        if (strRim.contains("Ⅱ") && strRim.contains("+") && strRim.contains("Ⅹ")) {
//            System.out.println("output");
//            System.out.println(rome[11]);
//        }
//
////  --------------------------------------------------------------------------------------------------------------
//
//        if (strRim.contains("Ⅲ") && strRim.contains("+") && strRim.contains("Ⅲ")) {
//            System.out.println("output");
//            System.out.println(rome[6]);
//        }
//        if (strRim.contains("Ⅲ") && strRim.contains("+") && strRim.contains("Ⅳ")) {
//            System.out.println("output");
//            System.out.println(rome[7]);
//        }
//        if (strRim.contains("Ⅲ") && strRim.contains("+") && strRim.contains("Ⅴ")) {
//            System.out.println("output");
//            System.out.println(rome[8]);
//        }
//        if (strRim.contains("Ⅲ") && strRim.contains("+") && strRim.contains("Ⅵ")) {
//            System.out.println("output");
//            System.out.println(rome[9]);
//        }
//        if (strRim.contains("Ⅲ") && strRim.contains("+") && strRim.contains("Ⅶ")) {
//            System.out.println("output");
//            System.out.println(rome[10]);
//        }
//        if (strRim.contains("Ⅲ") && strRim.contains("+") && strRim.contains("Ⅷ")) {
//            System.out.println("output");
//            System.out.println(rome[11]);
//        }
//        if (strRim.contains("Ⅲ") && strRim.contains("+") && strRim.contains("Ⅸ")) {
//            System.out.println("output");
//            System.out.println(rome[12]);
//        }
//        if (strRim.contains("Ⅲ") && strRim.contains("+") && strRim.contains("Ⅹ")) {
//            System.out.println("output");
//            System.out.println(rome[13]);
//        }
//
//        //  --------------------------------------------------------------------------------------------------------------
//
//        if (strRim.contains("Ⅳ") && strRim.contains("+") && strRim.contains("Ⅳ")) {
//            System.out.println("output");
//            System.out.println(rome[8]);
//        }
//        if (strRim.contains("Ⅳ") && strRim.contains("+") && strRim.contains("Ⅴ")) {
//            System.out.println("output");
//            System.out.println(rome[9]);
//        }
//        if (strRim.contains("Ⅳ") && strRim.contains("+") && strRim.contains("Ⅵ")) {
//            System.out.println("output");
//            System.out.println(rome[10]);
//        }
//        if (strRim.contains("Ⅳ") && strRim.contains("+") && strRim.contains("Ⅶ")) {
//            System.out.println("output");
//            System.out.println(rome[11]);
//        }
//        if (strRim.contains("Ⅳ") && strRim.contains("+") && strRim.contains("Ⅷ")) {
//            System.out.println("output");
//            System.out.println(rome[12]);
//        }
//        if (strRim.contains("Ⅳ") && strRim.contains("+") && strRim.contains("Ⅸ")) {
//            System.out.println("output");
//            System.out.println(rome[13]);
//        }
//        if (strRim.contains("Ⅳ") && strRim.contains("+") && strRim.contains("Ⅹ")) {
//            System.out.println("output");
//            System.out.println(rome[14]);
//        }




















