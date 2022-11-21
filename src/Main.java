public class Main {
    public static void main(String[] args) { task1(); task2(); task3(); task4(); task5(); task6(); task7(); }
        public static void task1() {
            System.out.println("Homework5");
            //Задание 1.1
            System.out.println(" ");
            System.out.println("Задание 1.1");
            for(int i = 1; i <= 10; i++) {
                System.out.println(i);
            }
        }

        public static void task2() {
            //Задание 1.2
            System.out.println(" ");
            System.out.println("Задание 1.2");
            for(int i = 10; i >= 1; i--) {
                System.out.println(i);
            }
        }
        public static void task3() {
            //Задание 1.3
            System.out.println(" ");
            System.out.println("Задание 1.3");
            for(int i = 0; i <= 17; i += 2) {
                System.out.println(i);
            }
        }
    public static void task4() {
        //Задание 1.4
        System.out.println(" ");
        System.out.println("Задание 1.4");
        for(int i = 10; i >= -10; i--) {
            System.out.println(i);
        }
    }
    public static void task5() {
        //Задание 2.1
        System.out.println(" ");
        System.out.println("Задание 2.1");
        for(int i = 1904; i <= 2096; i += 4) {
            System.out.println(i + " год является високосным");
        }
    }
    public static void task6() {
        //Задание 2.2
        System.out.println(" ");
        System.out.println("Задание 2.2");
        for(int i = 7; i <= 98; i += 7) {
            System.out.println(i);
        }
    }
    public static void task7() {
        //Задание 2.3
        System.out.println(" ");
        System.out.println("Задание 2.3");
        for(int i = 1; i <= 512; i *= 2) {
            System.out.println(i);
        }
    }
   }