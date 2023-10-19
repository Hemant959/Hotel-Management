package com.SHRAVAN.HotelManagement.service;

import com.SHRAVAN.HotelManagement.Model.Billing;
import com.SHRAVAN.HotelManagement.repo.BillingRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BillingService {
    @Autowired
    BillingRepo billingRepo;

    public String AddBilling(Billing newBilling) {
        billingRepo.save(newBilling);
        return "AddBilling";
    }
}
