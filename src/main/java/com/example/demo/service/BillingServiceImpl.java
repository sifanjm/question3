package com.example.demo.service;

import com.example.demo.model.Bill;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;



@Service
public class BillingServiceImpl implements BillingService {


    @Override
    public List<Integer> getOutstandingAmount(List<Bill> outstandingBills, Double amount) {

        List<Integer> customerIds = outstandingBills.stream().filter(b ->
                b.getBillAmount() - b.getPaidAmount() != 0 && (b.getBillAmount() - b.getPaidAmount()) == amount
        ).map(c -> c.getCustomerId()).collect(Collectors.toList());
        return customerIds;
    }
}
