package com.SHRAVAN.HotelManagement.service;

import com.SHRAVAN.HotelManagement.Model.Guest;
import com.SHRAVAN.HotelManagement.repo.GuestRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GuestService {
    @Autowired
    GuestRepo guestRepo;

    public String AddGuest(Guest newGuest) {
        guestRepo.save(newGuest);
        return "Guest Added";
    }
}
