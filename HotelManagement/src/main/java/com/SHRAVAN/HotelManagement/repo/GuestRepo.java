package com.SHRAVAN.HotelManagement.repo;

import com.SHRAVAN.HotelManagement.Model.Guest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GuestRepo extends JpaRepository<Guest,Long> {
}
