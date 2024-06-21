package org.ylab.dao;

import org.ylab.resourses.ConferenceRoom;

import java.util.ArrayList;
import java.util.List;

public class DaoConferenceRoom {
    List<ConferenceRoom> listRooms=new ArrayList<>();

    public void addRooms() {

        for (int i = 1; i < 10; i++) {
            listRooms.add(new ConferenceRoom(""+i));
        }
    }

    public void showRooms(){
        addRooms();
        System.out.println("Вот список конференц-залов");
        listRooms.forEach(System.out::println);
    }
}
