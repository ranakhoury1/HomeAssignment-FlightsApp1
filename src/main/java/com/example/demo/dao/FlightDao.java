package com.example.demo.dao;

import com.example.demo.dto.Ticket;

public interface FlightDao {
    Ticket findTicketById(Integer id);
    Boolean findCheckIn(Integer DestinationId, Integer BaggageId);
    String CheckCoupon(Integer CouponId, Double price);

    }
