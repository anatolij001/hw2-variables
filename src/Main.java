public class Main {
    public static void main(String[] args) {
        // Задача 1
        System.out.println("---   Задача 1 - создание и инициализация переменных:");
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper+"\n");

        //Задача 2
        System.out.println("---   Задача 2 - увеличение значений переменных на 4:");
        dog += 4;
        cat += 4;
        paper += 4;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper+"\n");

        //Задача 3
        System.out.println("---   Задача 3 - уменьшение значений переменных:");
        dog -= 3.5;
        cat -= 1.6;
        paper -= 7639;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper+"\n");

        //Задача 4
        System.out.println("---   Задача 4 - новая переменная friend:");
        var friend = 19;
        System.out.println("Новая переменная friend = " + friend);
        friend += 2;
        System.out.println("Значение переменной friend увеличиваем на 2 = " + friend);
        friend /= 7;
        System.out.println("Значение переменной friend делим на 7 = " + friend+"\n");

        //Задача 5
        System.out.println("---   Задача 5 - новая переменная frog:");
        var frog = 3.5;
        System.out.println("Новая переменная frog = " + frog);
        frog *= 10;
        System.out.println("Значение переменной frog увеличиваем в 10 раз = " + frog);
        frog /= 3.5;
        System.out.println("Значение переменной frog делим на 3,5 = " + frog);
        frog += 4;
        System.out.println("Значение переменной frog увеличиваем на 4 = " + frog+"\n");

        //Задача 6
        System.out.println("---   Задача 6 - взвешивание боксеров:");
        var boxerWeight1 = 78.2;
        var boxerWeight2 = 82.7;
        var sumWeight = boxerWeight1 + boxerWeight2;
        var weightDiff = boxerWeight2 - boxerWeight1;
        System.out.println("Вес первого боксера = " + boxerWeight1 + " кг.");
        System.out.println("Вес второго боксера = " + boxerWeight2 + " кг.");
        System.out.println("Суммарный вес обоих боксеров = " + sumWeight + " кг.");
        System.out.println("Разница в весе боксеров = " + weightDiff + " кг."+"\n");

        //Задача 7
        System.out.println("---   Задача 7 - разница масс спортсменов:");
        var weightDiff1 = boxerWeight2 - boxerWeight1;
        var weightDiff2 = boxerWeight2 % boxerWeight1;
        System.out.println("Разница масс (операция вычитания)  = " + weightDiff1 + " кг.");
        System.out.println("Разница масс (операция остаток от деления)  = " + weightDiff2 + " кг."+"\n");

        //Задача 8
        var staffCount = 640 / 8;
        System.out.println("---   Задача 8.1 - сколько человек в компании?");
        System.out.println(staffCount + " человек." + "\n");
        staffCount += 94;
        var wrokingHours = 640 / staffCount;
        System.out.println("---   Задача 8.2 - сколько часов будет на 1 сотрудника, если в компании на 94 человека больше?");
        System.out.println("Если в компании работает " + staffCount+" человек, то всего "+wrokingHours+" часов работы может быть поделено между сотрудниками.");


    }
}