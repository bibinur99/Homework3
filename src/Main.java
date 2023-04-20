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

    public static void task1() {
        System.out.println("Task One: give your examples");
        byte klein = 9;
        short mittel = 19000;
        int gross = 390_333;
        long lang = 1_198_789_897;
        float schwim = 3.658f;
        double dupple = 77.342342;
        System.out.println("Значение переменной"+ " "+"klein" +" "+ "с типом" +
                " "+"byte" + " равно:"+  " "+ klein);
        System.out.println("Значение переменной"+ " "+"mittel" +" "+ "с типом" +
                " "+"short" + " равно:"+  " "+ mittel);
        System.out.println("Значение переменной"+ " "+"gross" +" "+ "с типом" +
                " "+"int" + " равно:"+  " "+ gross);
        System.out.println("Значение переменной"+ " "+"lang" +" "+ "с типом" +
                " "+"long" + " равно:"+  " "+ lang);
        System.out.println("Значение переменной"+ " "+"schwim" +" "+ "с типом" +
                " "+"float" + " равно:"+  " "+ schwim);
        System.out.println("Значение переменной"+ " "+"dupple" +" "+ "с типом" +
                " "+"double" + " равно:"+  " "+ dupple);
        System.out.println();
    }

    public static void task2() {
        System.out.println("Task Two: Initialize");
        float num_1 = 27.12f;
        long num_2 = 987_678_965_549L;
        double num_3 = 2.786;
        short num_4 = 569;
        short num_5 = -159;
        int num_6 = 27_897;
        byte num_7 = 67;
        System.out.println();
    }

    public static void task3() {
        System.out.println("Task Three: Paper for Students");
        byte class_1 =  23;
        byte class_2 = 27;
        byte class_3 = 30;
        short totalPaper = 480;
        double paperPerStud = totalPaper / (class_1 + class_2 + class_3);
        System.out.println("На каждого ученика рассчитано"+" "+ paperPerStud+ " "+"листов бумаги");
        System.out.println();
    }

    public static void task4() {
        System.out.println("Task Four: Productivity");
        short capacityQuantity = 16;
        short capacityTime = 2;
        int capacityPerMin = capacityQuantity / capacityTime;
        int capIn20Min = capacityPerMin * 20;
        int capPerDay = capacityPerMin * 60 * 24;
        int capPer3Days = capPerDay * 3;
        int capPerMonth = capPerDay * 31;
        System.out.println("За 20 минут машина произвела" + " " +capIn20Min + " "+"штук бутылок");
        System.out.println("За сутки машина произвела" + " " +capPerDay + " "+"штук бутылок");
        System.out.println("За 3 дня машина произвела" + " " + capPer3Days+ " "+"штук бутылок");
        System.out.println("За 31 день машина произвела" + " " +capPerMonth + " "+"штук бутылок");
        System.out.println();
    }

    public static void task5() {
        System.out.println("Task Five: Paint for School");
        short totalPaintDose = 120;
        short perRoomWhite = 2;
        short perRoomBrown = 4;
        int numbRooms = totalPaintDose / (perRoomWhite + perRoomBrown);
        int totalWhite = perRoomWhite * numbRooms;
        int totalBrown = perRoomBrown * numbRooms;
        System.out.println(" В школе, где"+  " "+  numbRooms+ " "+ "классов, нужно"+" "+ totalWhite+ " "+
                "банок " + "белой краски и" + " " + totalBrown+" " + "банок коричневой краски");
        System.out.println();
    }

    public static void task6() {
        System.out.println("Task Six: Milkshake Breakfast");
        short quantityBanana = 5;
        short weightOneBanana = 80; // grams
        short quantityMilk = 200; // ml
        short weight100Ml  = 105;
        short quantityIceCream = 2;
        short weightOneIceCream = 100;
        short quantityEggs = 4;
        short weightOneEgg = 70;
        int totalWeightBanana = quantityBanana * weightOneBanana;
        double totalWeightMilk = (quantityMilk/100) * weight100Ml;
        int totalWeightIce = quantityIceCream * weightOneIceCream;
        int totalWeightEgg = quantityEggs * weightOneEgg;
        double totalWeightGr = totalWeightBanana + totalWeightMilk + totalWeightIce + totalWeightEgg;
        double totalWeightKg = totalWeightGr / 1000;
        System.out.println("Weight in grams is" + " " + totalWeightGr);
        System.out.println("Weight in kilos is" + " " + totalWeightKg);
        System.out.println();
    }

    public static void task7() {
        System.out.println("Task Seven: Weight loss");
        short weightToLoose = 7; // kilos
        short losPerDayMin = 250;
        short losPerDayMax = 500;
        int daysIfMin = (weightToLoose * 1000) / losPerDayMin;
        int daysIfMax = (weightToLoose * 1000) / losPerDayMax;
        int daysAver = (daysIfMin + daysIfMax) /2;
        System.out.println("Days required with min speed" + " " + daysIfMin);
        System.out.println("Days required with max speed" + " " + daysIfMax);
        System.out.println("Days required with average speed" + " " + daysAver);
        System.out.println();
    }

    public static void task8() {
        System.out.println("Task Eight: Salary");
        int bonusPercent = 10;
        double bonus = (double) bonusPercent / 100;
        int curSalaryMasha = 67760;
        int curSalaryDenis =  83690;
        int curSalaryChristine = 76230;
        double newSalaryMasha = curSalaryMasha * bonus + curSalaryMasha;
        double newSalaryDenis = curSalaryDenis * bonus + curSalaryDenis;
        double newSalaryChristine = curSalaryChristine * bonus + curSalaryChristine;
        double differMasha = (newSalaryMasha - curSalaryMasha) * 12;
        double differDenis = (newSalaryDenis - curSalaryDenis) * 12;
        double differChristine = (newSalaryChristine - curSalaryChristine) * 12;
        System.out.println("Маша теперь получает" + " " + newSalaryMasha + " "+ "рублей. " +
                "Годовой доход вырос на" + " "+ differMasha + " "+ "рублей ");
        System.out.println("Денис теперь получает" + " " + newSalaryDenis + " "+ "рублей. " +
                "Годовой доход вырос на" + " "+ differDenis + " "+ "рублей ");
        System.out.println("Кристина теперь получает" + " " + newSalaryChristine + " "+ "рублей. " +
                "Годовой доход вырос на" + " "+ differChristine + " "+ "рублей ");
        System.out.println();
    }




}