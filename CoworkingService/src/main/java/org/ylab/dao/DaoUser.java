package org.ylab.dao;


import org.ylab.model.User;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DaoUser {
    private final DaoWorkPlace workPlace=new DaoWorkPlace();
    DaoConferenceRoom conferenceRoom=new DaoConferenceRoom();
    boolean isAut=true;
    Map<String, User> users = new HashMap<>();

    Scanner scanner = new Scanner(System.in);

    public void switchControl() {
        switch (scanner.nextInt()) {
            case 1:
                userRegistration();
                break;
            case 2:
                authorization();
                break;
        }
    }


    public void authorization() {
        System.out.println("Введите телефон");
        String phone = scanner.next();
        System.out.println("Введите пароль");
        String password = scanner.next();
        if (users.containsKey(phone) && users.containsKey(password)) {
            System.out.println("Авторизация прошла успешно");
            workPlace.printListWorkPlace();
            conferenceRoom.showRooms();


        } else {
            System.out.println("Авторизация не  прошла");
            isAut = false;
        }
    }

    public void userRegistration() {
        System.out.println("Введите Фамилию: ");
        String family = scanner.next();
        System.out.println("Введите  Имя: ");
        String name = scanner.next();
        System.out.println("Введите  пароль: ");
        String password = scanner.next();
        System.out.println("Введите  телефон: ");
        String phone = scanner.next();
        User user = new User(family, name, password, phone);
        if (!users.containsKey(user.phoneID())) {
            users.put(user.phoneID(), user);
            System.out.println("Пользователь " + user.firstName() + " " + user.lastName() + " успешно создан");
            authorization();
        } else {
            System.out.println("Пользователь  с такими данными уже существует");
        }


    }

    public void printListUsers() {
        System.out.println("Список Пользователей");
        System.out.println(users.entrySet().iterator().next());
    }
}