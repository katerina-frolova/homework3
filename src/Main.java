public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();

    }

    public static void task1 () {
        System.out.println("Задача 1");
         int i=100000;
         System.out.println("Значение переменной i с типом int равно "+i);
         byte b=11;
        System.out.println("Значение переменной b с типом byte равно "+b);
        short s=2061;
        System.out.println("Значение переменной s с типом short равно "+s);
        long l=7312689L;
        System.out.println("Значение переменной l с типом long равно "+l);
        float f=21.17f;
        System.out.println("Значение переменной f с типом float равно "+f);
        double d=3.1415926535;
        System.out.println("Значение переменной d с типом double равно "+d);
    }

    public static void task2 () {
        System.out.println("Задача 2");
        float f=27.12f;
        System.out.println(f+" - float");
        long l=987678965549L;
        System.out.println(l+" - long");
        double d=2.786;
        System.out.println(d+" - double");
        short s=569;
        System.out.println(s+" - short");
        short sh=-159;
        System.out.println(sh+" - short");
        int i=27897;
        System.out.println(i+" - int");
        byte b=67;
        System.out.println(b+" - byte");
    }
    public static void task3 () {
        System.out.println("Задача 3");
        byte LPPupils=23;
        byte ASPupils=27;
        byte EAPupils=30;
        short lists=480;
        byte allPupils= (byte) (LPPupils+ASPupils+EAPupils);
        short onePupil= (short) (lists/allPupils);
        System.out.println("На каждого ученика рассчитано "+onePupil+" листов бумаги");


    }
}