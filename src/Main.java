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
        System.out.println("task 1");
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
    }

    public static void task2() {
        System.out.println("task 2");
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

    }

    public static void task3() {
        System.out.println("task 3");
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

    }

    public static void task4() {
        System.out.println("task 4");
        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);

    }

    public static void task5() {
        System.out.println("task 5");
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);

    }

    public static void task6() {
        System.out.println("task 6");
        var boxer1 = 78.2;
        var boxer2 = 82.7;
        var totalWeight = boxer1 + boxer2;
        var weightDifference = boxer2 - boxer1;

        System.out.println("total weight " + totalWeight);
        System.out.println("weight difference " + weightDifference);


    }

    public static void task7() {
        System.out.println("task 7");
        var boxer1 = 78.2;
        var boxer2 = 82.7;
        var weightDifference = boxer2 - boxer1;
        var weightDifference1 = boxer2 % boxer1;

        System.out.println("weight difference " + weightDifference);
        System.out.println("weight difference 1 " + weightDifference1);
    }
    public static void task8() {
        System.out.println("task 8");
        var totalTime = 640;
        var EmployeesWorkingHours = 8;
        var TotalEmployees = totalTime/8;
        var upTotalEmployees = TotalEmployees +94;
        var TimeWorking = upTotalEmployees  * EmployeesWorkingHours;


        System.out.println("Всего работников в компании — " + TotalEmployees + " человек.");
        System.out.println("Если в компании работает " + upTotalEmployees + " человек,то всего " + TimeWorking + " часов работы может быть поделено между сотрудниками.");

    }
}