package org.ylab.resourses;

import lombok.Data;

import java.util.List;

@Data
public class ConferenceRoom {
    private String conferenceRoomName;
    public ConferenceRoom(String conferenceRoomName) {
        this.conferenceRoomName = conferenceRoomName;
    }
}
