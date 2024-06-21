package org.ylab.dao;

import org.ylab.model.WorkPlace;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DaoWorkPlace {

    Map<LocalDate, WorkPlace> listWorkPlace = new HashMap<>();


    public  void setListWorkPlace() {

        for (int i = 1; i <= 10; i++) {
            listWorkPlace.put(LocalDate.of(2024, 12, i), new WorkPlace(i, true));
        }
    }
    public  void printListWorkPlace(){
        setListWorkPlace();
        System.out.println("Вот список рабочих мест");
        listWorkPlace.entrySet().forEach(System.out::println);
    }
    public  void choiceWorkPlace(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Выберите номер места");
        int placeNumber=scanner.nextInt();

    }
}
