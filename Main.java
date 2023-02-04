import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//       byte c = 1;
//        short b = 3;
//        char yanEvgenevic = 'L';
//        long HelloWorld = 29124211;
//        double casualgame = 1.2412312;
//        long f = 3 ;
//        int a = 10;
//        float x = 12341.4F;
        //  String s = "+";
        //char c = '+';
        // System.out.println(s);
        // System.out.println(c);
//        System.out.println(c);
//        System.out.println(b);
//        System.out.println(yanEvgenevic);
//        System.out.println(HelloWorld);
//        System.out.println(casualgame);
//        System.out.println(f);
//        System.out.println(a);
//        System.out.println(x);
        //                    CALCULATOR
//        System.out.println("***\t Calculator\t ***");
//        System.out.println("введите первое число " + ":");
//        double a = new Scanner(System.in).nextDouble();
//        System.out.println("введите воторое число" + ":");
//        double b = new Scanner(System.in).nextDouble();
//        System.out.println(a+ "+" + b + "=" + (a+b) );
//        System.out.println(a+ "-" + b + "=" + (a-b) );
//        System.out.println(a+ "*" + b + "=" + (a*b) );
//        System.out.println(a+ "/" + b + "=" + (a/b) );

        //                    ГРАДУСНИК
        // расчитывается по форуде (F = C * 1.8 + 32).
        System.out.println("введите гадусы цельсия");
        double C = new Scanner(System.in).nextDouble();
        System.out.println("F" + "=" + (C * 1.8 + 32));

//                        Конвертер валют
        // расчитывается: 1 доллар = 67 рублей
        //                1 евро = 73 рубля
        System.out.println("введите количество долларов");
        double $ = new Scanner(System.in).nextDouble();
        System.out.println("P"+"="+($*67));
        System.out.println("введите количество евро");
        double E = new Scanner(System.in).nextDouble();
        System.out.println("P"+"="+(E*73));
    }
}
