public class Main {
    public static void main(String[] args) {
        System.out.println("HomeWork3");
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }
    public static void task1 (){
        System.out.println("Задача 1");
        int apple = 199946;
        System.out.println("Значение переменной apple с типом int равно " +apple);
        byte orange = 102;
        System.out.println("Значение переменной orange с типом byte равно " +orange);
        short banan = 13762;
        System.out.println("Значение переменной banan с типом short равно " +banan);
        long tune = 928374652;
        System.out.println("Значение переменной tune с типом long равно " +tune);
        float cucumber = 192.34f;
        System.out.println("Значение переменной cucumber с типом float равно " +cucumber);
        double avocado = 98273.5874;
        System.out.println("Значение переменной avocado с типом double равно " +avocado);
    }
    public static void task2(){
        System.out.println("Задача 2");
        float a = 27.12f;
        System.out.println("Переменная a имеет тип float и равна " +a);
        long b = 987678965549L;
        System.out.println("Переменная b имеет тип long и равна " +b);
        float c = 2.786f;
        System.out.println("Переменная c имеет тип float и равна " +c);
        short d = 569;
        System.out.println("Переменная d имеет тип short и равна " +d);
        short e = -159;
        System.out.println("Переменная e имеет тип short и равна " +e);
        int f = 27897;
        System.out.println("Переменная f имеет тип int и равна " +f);
        byte g = 67;
        System.out.println("Переменная g имеет тип byte и равна " +g);
    }
    public static void task3(){
        System.out.println("Задача 3");
        short studentsOfLudmilaPavlovna = 23;
        short studentsOfAnnaSergeevna = 27;
        short studentsOfEkaterinaAndreevna = 30;
        short allPaper = 480;
        short allStudents = (short) (studentsOfAnnaSergeevna + studentsOfEkaterinaAndreevna + studentsOfLudmilaPavlovna);
        short paperToOneStudent = (short) (allPaper/allStudents);
        System.out.println("На каждого ученика рассчитано "+paperToOneStudent+" листов бумаги");
    }
    public static void task4(){
        System.out.println("Задача 4");
        byte bottleInTwoMinutes = 16;
        int bottlesIn20Minutes = bottleInTwoMinutes*20/2;
        System.out.println("За 20 минут машина произвела "+bottlesIn20Minutes+" бутылок");
        int bottlesInDay = bottleInTwoMinutes*24*60/2;
        System.out.println("За сутки машина произвела "+bottlesInDay+" бутылок");
        int bottlesIn3Day = bottlesInDay*3;
        System.out.println("За три дня машина произвела "+bottlesIn3Day+" бутылок");
        int bottlesInMonth28 = bottlesInDay*28;
        System.out.println("За месяц, если в нем 28 дней машина произвела "+bottlesInMonth28+" бутылок");
        int bottlesInMonth30 = bottlesInDay*30;
        System.out.println("За месяц, если в нем 30 дней машина произвела "+bottlesInMonth30+" бутылок");
        int bottlesInMonth31 = bottlesInDay*31;
        System.out.println("За месяц, если в нем 31 дней машина произвела "+bottlesInMonth31+" бутылок");
    }
    public static void task5(){
        System.out.println("Задача 5");
        byte allTipsOfPaint = 120;
        byte tipsWhitePaintToOneClass = 2;
        byte tipsBrownPaintToOneClass = 4;
        int allClass = allTipsOfPaint/(tipsWhitePaintToOneClass+tipsBrownPaintToOneClass);
        int allTipsOfWhitePaint = allClass*tipsWhitePaintToOneClass;
        int allTipsOfBrownPaint = allClass*tipsBrownPaintToOneClass;
        System.out.println("В школе, где "+allClass+" классов, нужно "+allTipsOfWhitePaint+" банок белой краски и "+allTipsOfBrownPaint+" банок коричневой краски");
    }
    public static void task6(){
        System.out.println("Задача 6");
        int oneBanan = 80;
        int allBananas = oneBanan*5;
        int MilkInMl = 200;
        int milkInGramm = MilkInMl*105/100;
        int oneIceCream = 100;
        int allIceCream = oneIceCream*2;
        int oneEgg = 80;
        int allEgg = oneEgg*4;
        float allWeightf = allBananas+milkInGramm+allIceCream+allEgg;
        System.out.println("Вес такого спортзавтрака "+allWeightf+" гр или "+allWeightf/1000+" кг");
    }
    public static void task7(){
        System.out.println("Задача 7");
        float exessWeight = 7;
        int lostWeightInDay1 = 250;
        int lostWeightInDay2 = 500;
        double lostWeightIn250PerDay = exessWeight*1000/lostWeightInDay1;
        double lostWeightIn500PerDay = exessWeight*1000/lostWeightInDay2;
        double averageWeightLoss = (lostWeightIn250PerDay+lostWeightIn500PerDay)/2;
        System.out.println("Если спортсмен будет худеть на 250 гр в день, то сбросит 7 кг за "+lostWeightIn250PerDay+" дней");
        System.out.println("Если спортсмен будет худеть на 500 гр в день, то сбросит 7 кг за "+lostWeightIn500PerDay+" дней");
System.out.println("В среднем на похудение спортсмену необходимо "+averageWeightLoss+" дней");
    }
    public static void task8(){
        System.out.println("Задача 8");
        int salaryOfMasha = 67760;
        int salaryOfDenis = 83690;
        int salaryOfKristina = 76230;
        int futureSalaryOfMasha = salaryOfMasha+salaryOfMasha/10;
        int futureSalaryOfDenis = salaryOfDenis+salaryOfDenis/10;
        int futureSalaryOfKristina = salaryOfKristina+ salaryOfKristina/10;
        int salaryIncreaseInYearOfMasha = (futureSalaryOfMasha-salaryOfMasha)*12;
        int salaryIncreaseInYearOfDenis = (futureSalaryOfDenis-salaryOfDenis)*12;
        int salaryIncreaseInYearOfKristina = (futureSalaryOfKristina-salaryOfKristina)*12;
        System.out.println("Маша теперь получает "+futureSalaryOfMasha+" рублей. Годовой доход вырос на "
                +salaryIncreaseInYearOfMasha+" рублей в год.");
        System.out.println("Денис теперь получает "+futureSalaryOfDenis+" рублей. Годовой доход вырос на "
                +salaryIncreaseInYearOfDenis+" рублей в год.");
        System.out.println("Кристина теперь получает "+futureSalaryOfKristina+" рублей. Годовой доход вырос на "
                +salaryIncreaseInYearOfKristina+" рублей в год.");
    }
}
