package com.SHRAVAN.HotelManagement.repo;

import com.SHRAVAN.HotelManagement.Model.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReservationRepo extends JpaRepository<Reservation,Long> {
}
