package com.hillel.homeworks.hw3;

public class Task_00 {
    public static void main(String[] args) {
        String input = "Some text to capitalize";
        String[] splitString = input.split(" ");
        for (int i = 0; i < splitString.length; i++) {
            splitString[i] = splitString[i].substring(0, 1).toUpperCase() + splitString[i].substring(1);
        }

        String result = String.join(" ", splitString);
        System.out.println(result);

        System.out.println("--------------------------------");

        String st1 = "Java";
        String st2 = "Java";
        System.out.println(st1 == st2);
        System.out.println(st1.equals(st2));

        System.out.println("--------------------------------");

        String st3 = new String("Java");
        String st4 = "Java";
        System.out.println(st3 == st4);
        System.out.println(st3.equals(st4));

        System.out.println("--------------------------------");

        String st5 = new String("Java");
        st5 = st5.intern();
        String st6 = "Java";
        System.out.println(st5 == st6);
        System.out.println(st5.equals(st6));

        System.out.println("--------------------------------");

        Object o = null;
        if(o != null && o.toString() != "jsoiuhr"){
            System.out.println("o = " + o);
        }
        System.out.println("o = " + o);

        System.out.println("--------------------------------");

        String s = "Java";
        s = s.replace("J", "T");
        System.out.println(s);

        System.out.println("--------------------------------");

        //операторы - пример1
        int chinaPopulation = 1360000000;
        int indiaPopulation = 1240000000;

        int total = chinaPopulation+indiaPopulation;
        System.out.println(total);

        byte b1 = 1;
        byte b2 = 2;
        //byte b3 = b1 + b2;
        byte b3 = (byte) (b1 + b2);
        System.out.println(b3);

        System.out.println("--------------------------------");

        //операторы - пример2
        int i = 123456789;
        float f = i;
        double d = i;
        short sh = (short) i;
        System.out.println("i = " + i);
        System.out.println("f = " + f);
        System.out.println("d = " + d);
        System.out.println("sh = " + sh);

        System.out.println("--------------------------------");

        //операторы - пример3
        try {
            int aA=1;
            int bB=0;
            int cC=aA/bB;
            System.out.println(cC);
        } catch (ArithmeticException e){
            System.out.println(e);
        }



        System.out.println("--------------------------------");

        //операторы - пример4
        double a1=1;
        double g=0;
        double c1=a1/g;
        System.out.println(c1);
        System.out.println("c+1 = " + (c1 + 1));
        System.out.println("+0.0 == -0.0 : " + (0.0 == -0.0));
        System.out.println("a/(+0.0) = " + (a1/(+0.0)));
        System.out.println("a/(-0.0) = " + (a1/(-0.0)));

        System.out.println("--------------------------------");

        //операторы - пример5
        double a2=0;
        double r=0;
        double c2=a2/r;
        System.out.println("c =" + c2);
        System.out.println("c+0 =" + (c2 + 0));
        System.out.println("c<0 =" + (c2 < 0));
        System.out.println("c>0 =" + (c2 > 0));
        System.out.println("c==0 =" + (c2 == 0));
        System.out.println("c!=0 =" + (c2 != 0));
        System.out.println("c==c =" + (c2 == c2)); // :)
        System.out.println("c!=c =" + (c2 != c2)); // :)

        System.out.println("c == NaN: " + (c2 == Double. NaN)); // :)))
        System.out.println("c is NaN: " + Double.isNaN(c2));

        System.out.println("--------------------------------");
        // вычисление суммы первых 20 чисел, кроме числа 13
        int s1=0;
        for (int i1=1; i1<=20; i1++) {
            if (i1 == 13)
                continue;
            s1 = s1 + i1;
        }
        System.out.println(s1);

        System.out.println("--------------------------------");
        // Управление потоком выполнения - break

        int i2=0;
        while (true) { // Вечный цикл
            System.out.println("Hello, World! - break" );
            i2++;
            if (i2>5)
                break; // Досрочный выход из цикла
        }
        System.out.println(i2);



        System.out.println("--------------------------------");
        // Управление потоком выполнения - do while
        int i3=0;
        do {
            System.out.println("Hello World - do while");
            i3++;
        } while (i3 < 10);


        System.out.println("--------------------------------");
        // Управление потоком выполнения - for
        for (int i4 = 0; i4 < 10; i4++) {
            System.out.println("Hello, World! - for");
        }
        for (int i4=0, j=10; i4<=10; i4++, j--){
            System.out.println(i4 + " " + j + " - for");
        }

        System.out.println("--------------------------------");
        // Управление потоком выполнения - switch
        String season = "winter";

        switch (season) {
            case "winter":
                System.out.println("winter" + " - switch");
                break;
            case "spring":
                System.out.println("spring");
                break;
            default:
                System.out.println("no results");
                break;
        }

    }
}
