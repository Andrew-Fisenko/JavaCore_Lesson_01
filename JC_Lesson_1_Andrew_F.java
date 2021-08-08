package com.company;

public class JC_Lesson_1_Andrew_F {

    // 1. Создать пустой проект в IntelliJ IDEA и прописать метод main().

    public static void main(String[] args) {

    }

    // 2. Создать переменные всех пройденных типов данных и инициализировать их значения.

    static void doTack2() {
        byte var1 = -50;
        short var2 = 32000;
        int var3 = 1243000;
        long var4 = 1253582547L;

        float var5 = 1.3F;
        double var6 = 1.234;

        boolean var7 = false;

        char var8 = 165;

        }

    //  3. Написать метод вычисляющий выражение a * (b + (c / d)) и возвращающий результат,
    //  где a, b, c, d – аргументы этого метода, имеющие тип float.

    static float doTask3(float a, float b, float c, float d) {
        return a * (b + (c / d));
    }

    // 4. Написать метод, принимающий на вход два целых числа и проверяющий, что их сумма лежит в пределах
    // от 10 до 20 (включительно), если да – вернуть true, в противном случае – false.

    static boolean doTask4(int a, int b) {
        return (a + b) >= 10 && (a + b) <= 20;
    }

    // 5. Написать метод, которому в качестве параметра передается целое число, метод должен напечатать
    // в консоль, положительное ли число передали или отрицательное. Замечание: ноль считаем положительным числом.

    static void doTask5(int a) {
        if (a >=0){
            System.out.println("The number " + a + "is positive");
        } else {
            System.out.println("The number " + a + "is negative");
        };
    }

    // 6. Написать метод, которому в качестве параметра передается целое число. Метод должен вернуть true,
    // если число отрицательное, и вернуть false если положительное.

    static boolean doTask6(int a) {
        return a<0;
    }
    // 7. Написать метод, которому в качестве параметра передается строка, обозначающая имя. Метод должен вывести
    // в консоль сообщение «Привет, указанное_имя!».

    static void doTask7(String name){
        System.out.println("Hello, " + name + "!");
    }

    // 8. *Написать метод, который определяет, является ли год високосным, и выводит сообщение в консоль.
    // Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.

    // Так я сделал ДО разбора ДЗ, Удалять не стал, но ниже переделал более коротко )))
    static void defineLeapYear(int year){
        if (year % 400 == 0){
            System.out.println("The " + year + " is leap!");
        } else if (year % 100 == 0){
            System.out.println("The " + year + " is not leap!");
        } else if (year % 4 == 0){
            System.out.println("The " + year + " is leap!");
        } else {
            System.out.println("The " + year + " is not leap!");
        }
    }

    // ПОСЛЕ разбора ДЗ переделал )
    static void defineLeapYear2(int year){
        if (year % 400 == 0 || year % 4 == 0 && year % 100 == 0){
            System.out.println("The " + year + " is leap!");
        } else {
            System.out.println("The " + year + " is not leap!");
        }
    }
}