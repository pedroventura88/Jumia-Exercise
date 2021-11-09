package com.pxp.SQLite.demo.dao;

import com.pxp.SQLite.demo.entity.Customer;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CustomerDao {

    JdbcTemplate jdbcTemplate;

    public CustomerDao(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public List<Customer> listAllCustomers() {
        String sql = "SELECT * FROM customer";
        List<Customer> pn = jdbcTemplate.query(
                sql,
                new BeanPropertyRowMapper(Customer.class));
        return pn;
    }
}
