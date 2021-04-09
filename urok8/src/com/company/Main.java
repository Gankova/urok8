package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String []args) {
        //User - вызов конструктора класса User
        //конструктор - метод класса , который вызывается автоматически при создании объекта класса.
        // если у класса явно не задан конструктор,
        // то для него будет создан конструктор по умолчанию
        //User u = new User();
        User u2 = new User(5, "ggg");

        Admin a =new Admin(5,"Ger","qwerty");
        a.printInfo();

        // чтение данных с клавиатуры
        Scanner sc = new Scanner(System.in);
        int n = 0;
        while (n != 3) {
            System.out.println("1. Приготовить эспрессо");
            System.out.println("2. Приготовить американо");
            System.out.println("3. Выход");
            System.out.println("Введите номeр меню");
            n = sc.nextInt();
            switch (n) {
                case 1:
                    //делаем эспрессо
                    break;
                case 2:
                    // делаем капучино
                    break;
            }
        }

    }
}
