package com.pxp.SQLite.demo.service;

import com.pxp.SQLite.demo.dao.CustomerDao;
import com.pxp.SQLite.demo.entity.Customer;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {

    private CustomerDao customerDao;

    public CustomerServiceImpl(CustomerDao customerDao) {
        this.customerDao = customerDao;
    }

    @Override
    public List<Customer> getCustomers() {
        List<Customer> customers = customerDao.listAllCustomers();
        return customers;
    }

}
