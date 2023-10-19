package com.SHRAVAN.HotelManagement.controller;

import com.SHRAVAN.HotelManagement.Model.Billing;
import com.SHRAVAN.HotelManagement.service.BillingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BillingController {
    @Autowired
    BillingService billingService;

    @PostMapping("Biling")
    public String AddBilling(@RequestBody Billing newBilling){
        return billingService.AddBilling(newBilling);
    }

}
