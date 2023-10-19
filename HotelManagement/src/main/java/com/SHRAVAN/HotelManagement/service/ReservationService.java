package com.SHRAVAN.HotelManagement.service;

import com.SHRAVAN.HotelManagement.Model.Reservation;
import com.SHRAVAN.HotelManagement.repo.ReservationRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReservationService {
    @Autowired
    ReservationRepo reservationRepo;

    public String AddReservation(Reservation newRes) {
        reservationRepo.save(newRes);
        return "Add Reservation";
    }
}
