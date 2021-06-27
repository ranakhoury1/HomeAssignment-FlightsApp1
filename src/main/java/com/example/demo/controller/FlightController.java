package com.example.demo.controller;

import com.example.demo.service.FlightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FlightController {

    @Autowired
    FlightService ticketService;

    @GetMapping("Ticket/ifExists/{id}")
    public boolean isTicketAvailable(@PathVariable(value = "id") Integer ticketId) {
        return ticketService.isTicketAvailable(ticketId);
    }
    @GetMapping("/checkIfCheckedInSucceeded/{DestinationId}/{BaggageId}")
    public boolean HasCheckedInByDestinationIdAndBaggageId(@PathVariable(value = "DestinationId") Integer DestinationId,
                                                           @PathVariable(value = "BaggageId") Integer BaggageId)
    {
        return ticketService.HasCheckedInByDestinationIdAndBaggageId(DestinationId, BaggageId);
    }
    @GetMapping("/ApplyCoupon/{CouponId}/{Price}")
    public String ApplyCoupon(@PathVariable(value = "CouponId") Integer CouponId,
                              @PathVariable(value = "Price")Double Price) {
        return ticketService.ApplyCoupon(CouponId,Price);
    }
}
