package com.example.demo.service;

import org.springframework.stereotype.Service;

public interface FlightService {

    boolean isTicketAvailable(Integer id);
    boolean HasCheckedInByDestinationIdAndBaggageId(Integer DestinationId, Integer BaggageId);
    String ApplyCoupon(Integer CouponId,Double Price);
}
