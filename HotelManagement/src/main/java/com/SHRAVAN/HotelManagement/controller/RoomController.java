package com.SHRAVAN.HotelManagement.controller;

import com.SHRAVAN.HotelManagement.Model.Room;
import com.SHRAVAN.HotelManagement.service.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RoomController {
    @Autowired
    RoomService roomService;
    @PostMapping("Rooms")
    public String AddRoom(@RequestBody Room newRoom){
    return roomService.AddRoom(newRoom);
    }
}
