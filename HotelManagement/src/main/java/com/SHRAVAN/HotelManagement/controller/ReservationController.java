package com.SHRAVAN.HotelManagement.controller;

import com.SHRAVAN.HotelManagement.Model.Reservation;
import com.SHRAVAN.HotelManagement.service.ReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ReservationController {
    @Autowired
    ReservationService reservationService;

    @PostMapping("REservation")
    public String AddReservation(@RequestBody Reservation newRes){
        return reservationService.AddReservation(newRes);
    }
}
