package com.company;

public class Admin extends User {

    private String login;

    public Admin (int id, String name, String login) {
        // super -это ссылка на родительский экземпляр объекта
        //super используется , если нет дефолтного конструктора или обрращаются к дрогому конструктору род.класса
        super(id, name);//=> вызов конструктора класса User
        this.login = login;
        //System.out.println("admin cr");
    }
    @Override
    public void printInfo(){
        //..
        super.printInfo();//вызываем метод printInfo из класса User
        System.out.print("Login:");
        System.out.println(this.login);
    }
}
