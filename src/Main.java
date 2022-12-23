public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();



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
    public static void task4 () {
        System.out.println("Задача 4");
        byte bottlesIn2Min=16;
        System.out.println("За 2 минуты машина произвела "+bottlesIn2Min+" штук бутылок");
        byte bottlesInMin=(byte)(bottlesIn2Min/2);
        short bottlesIn20Min=(short)(bottlesInMin*20);
        System.out.println("За 20 минут машина произвела "+bottlesIn20Min+" штук бутылок");
        short bottlesInHour=(short)(bottlesInMin*60);
        short bottlesInDay=(short)(bottlesInHour*24);
        System.out.println("За сутки машина произвела "+bottlesInDay+" штук бутылок");
        System.out.println("За 3 дня машина произвела "+bottlesInDay*3+" штук бутылок");
        int bottlesInMonth=bottlesInDay*31;
        System.out.println("За месяц(например, декабрь) машина произвела "+bottlesInMonth+" штук бутылок");

    }
    public static void task5 () {
        System.out.println("Задача 5");
       byte whitePaint=2;
       byte brownPaint=4;
       byte paint=(byte)(whitePaint+brownPaint);
       byte allPaint=120;
       byte classrooms=(byte)(allPaint/paint);
       whitePaint=(byte)(whitePaint*classrooms);
       brownPaint=(byte)(brownPaint*classrooms);
        System.out.println("В школе, где "+classrooms+" классов, нужно "+whitePaint+" банок белой краски и "+brownPaint+" банок коричневой краски");

    }
    public static void task6 () {
        System.out.println("Задача 6");
        int banana=80;
        int milk=105;
        int icecream=100;
        int egg=70;
        double breakfast=banana*5+milk*2+icecream*2+egg*4;
        System.out.println("Вес спортзавтрака составил "+breakfast+" грамм");
        double breakfastKg=breakfast/1000;
        System.out.println("Вес спортзавтрака составил "+breakfastKg+" килограмм");

    }
    public static void task7 () {
        System.out.println("Задача 7");
        double purpose=7.0;
        double diet1=0.25;
        double diet2=0.5;
        int days1=(int)(purpose/diet1);
        int days2=(int)(purpose/diet2);
        System.out.println(days1+" дней уйдет на похудение, если спортсмен будет терять по 250г в день");
        System.out.println(days2+" дней уйдет на похудение, если спортсмен будет терять по 500г в день");
        int days=(int)(days1+days2)/2;
        System.out.println(days+" день в средем уйдет на похудение");

    }
    public static void task8 () {
        System.out.println("Задача 8");
        int mashaSalary1=67760;
        int mashaRise=mashaSalary1/10;
        int mashaSalary2=mashaSalary1+mashaRise;
        int mashaYearRise=mashaRise*12;
        System.out.println("Маша теперь получает "+mashaSalary2+" рублей. Годовой доход вырос на "+mashaYearRise+" рублей");
        int denisSalary1=83690;
        int denisRise=denisSalary1/10;
        int denisSalary2=denisSalary1+denisRise;
        int denisYearRise=denisRise*12;
        System.out.println("Денис теперь получает "+denisSalary2+" рублей. Годовой доход вырос на "+denisYearRise+" рублей");
        int christinaSalary1=76230;
        int christinaRise=christinaSalary1/10;
        int christinaSalary2=christinaSalary1+christinaRise;
        int christinaYearRise=christinaRise*12;
        System.out.println("Кристина теперь получает "+christinaSalary2+" рублей. Годовой доход вырос на "+christinaYearRise+" рублей");



    }

}