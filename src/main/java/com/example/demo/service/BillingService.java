package com.example.demo.service;

import com.example.demo.model.Bill;
import com.example.demo.model.Customer;

import java.math.BigDecimal;
import java.util.List;

public interface BillingService {

     List<Integer> getOutstandingAmount(List<Bill> outstandingBills, Double amount);
}
