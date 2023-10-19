package com.SHRAVAN.HotelManagement.controller;

import com.SHRAVAN.HotelManagement.Model.Guest;
import com.SHRAVAN.HotelManagement.Model.Room;
import com.SHRAVAN.HotelManagement.service.GuestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GuestController {
    @Autowired
    GuestService guestService;

    @PostMapping("Guest")
    public String AddGuest(@RequestBody Guest newGuest){
        return guestService.AddGuest(newGuest);
    }

}
