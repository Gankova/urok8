package com.company;

public class User {
    public int id;
    public String name;

    // переопределение конструктора по умолчанию

    //конструктор по умолчанию - это конструктор, который не принимает входных аргументов
    public User() {
        System.out.println("new User created");
    }
    // при совпадении имени аргумента метода и названия свойства класса, при обращении
    //приоритет будет отдаваться аргументу метода
    public User (int id, String name) {
        // вызов конструктора из другого конструктора должен происходить перед остальным телом конструктора
        //this(); //вызов конструктора public User()
        //this -это ссылка на текущий экземпляр объекта класса

        this.id = id;
        this.name = name;

        User.this.name = name; // this.name = name;
        System.out.println(User.this);
    }
    public void printInfo(){
        System.out.print("ID:  ");
        System.out.print(this.id);
        System.out.print(" ,  Name:   ");
        System.out.println(this.name);

    }
}
