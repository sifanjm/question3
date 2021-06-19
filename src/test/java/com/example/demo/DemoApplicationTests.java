package com.example.demo;

import com.example.demo.model.Bill;
import com.example.demo.model.Customer;
import com.example.demo.service.BillingService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

import java.util.Arrays;
import java.util.List;

@SpringBootTest
class DemoApplicationTests {


    @Autowired
    private BillingService billingService;

    @Test
    void testOutstandingBill(){
        List<Integer> customerId = billingService.getOutstandingAmount(getListOfBills(), 500.0);
        Assert.isTrue(customerId.get(0)==12,"True");
    }

  private List<Bill> getListOfBills(){

      Bill bill1 = new Bill();
      bill1.setId(1);
      bill1.setCustomerId(12);
      bill1.setBillAmount(1000.0);
      bill1.setPaidAmount(500.0);


      Bill bill2 = new Bill();
      bill2.setId(2);
      bill2.setCustomerId(12);
      bill2.setBillAmount(400.0);
      bill2.setPaidAmount(200.0);

      List<Bill> bills = Arrays.asList(
              bill1,bill2
      );

      Customer customer = new Customer();
      customer.setId(12);
      customer.setName("Sifan");
      customer.setBills(bills);

      return bills;
  }
}
