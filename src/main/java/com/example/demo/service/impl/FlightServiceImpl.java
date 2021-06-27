package com.example.demo.service.impl;

import com.example.demo.dao.FlightDao;
import com.example.demo.dto.Baggage;
import com.example.demo.dto.Ticket;
import com.example.demo.dto.Coupon;
import com.example.demo.service.FlightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.logging.Level;
import java.util.logging.Logger;

@Service
public class FlightServiceImpl implements FlightService {
    Logger logger = Logger.getLogger(FlightServiceImpl.class.getName());

    @Autowired
    FlightDao ticketDao;
    FlightDao baggageDao;
    FlightDao couponDao;

    @Override
    public boolean isTicketAvailable(Integer TicketId) {
        logger.log(Level.INFO, String.format("Check if ticket number %d exists ",TicketId));
        Ticket ticket = ticketDao.findTicketById(TicketId);
        if(ticket != null) {
            logger.log(Level.INFO, String.format("TicketId : %d exists", TicketId));
            return true;
        }
        logger.log(Level.INFO, String.format("TicketId : %d does not exists",TicketId));
        return false;
    }

    @Override
    public boolean HasCheckedInByDestinationIdAndBaggageId(Integer DestinationId, Integer BaggageId) {
        logger.log(Level.INFO, String.format("Check whether Checkin succeeded for Destination id %d and Baggage id %d", DestinationId, BaggageId));
        Boolean baggage = baggageDao.findCheckIn(DestinationId, BaggageId);
        if(baggage != null) {
            logger.log(Level.INFO, String.format("Checkin succeeded for Destination id %d and Baggage id %d", DestinationId, BaggageId));
            return true;
        }
        return false;
    }
    @Override
    public String ApplyCoupon(Integer CouponId, Double Price) {
        logger.log(Level.INFO, String.format("Trying to apply coupon number: %d price: %f", CouponId, Price));
//        String result = couponDao.CheckCoupon(CouponId, Price);
//        logger.log(Level.INFO, String.format("Checking Coupon if valid %s", couponDao.valid));
        return couponDao.CheckCoupon(CouponId, Price);
    }
}
