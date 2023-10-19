package com.SHRAVAN.HotelManagement.service;

import com.SHRAVAN.HotelManagement.Model.Room;
import com.SHRAVAN.HotelManagement.repo.Roomrepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoomService {
    @Autowired
    Roomrepo roomrepo;

    public String AddRoom(Room newRoom) {
        roomrepo.save(newRoom);
        return "RoomADD";
    }
}
