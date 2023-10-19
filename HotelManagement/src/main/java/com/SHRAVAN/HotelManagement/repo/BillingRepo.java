package com.SHRAVAN.HotelManagement.repo;

import com.SHRAVAN.HotelManagement.Model.Billing;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BillingRepo extends JpaRepository<Billing,Long> {
}
