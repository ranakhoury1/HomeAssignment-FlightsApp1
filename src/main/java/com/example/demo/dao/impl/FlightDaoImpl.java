package com.example.demo.dao.impl;
import java.util.logging.Level;
import java.util.logging.Logger;
import com.example.demo.dao.FlightDao;
import com.example.demo.dto.Ticket;
import com.example.demo.dto.Airplane;
import com.example.demo.dto.Flight;
import com.example.demo.dto.Destination;
import com.example.demo.dto.Baggage;
import com.example.demo.dto.Coupon;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class FlightDaoImpl implements FlightDao {

    private final Map<Integer, Ticket> Tickets = new HashMap<>();
    private final Map<Integer, Airplane> Airplanes =  new HashMap();
    private final Map<Integer, Flight> Flights =  new HashMap();
    private final Map<Integer, Destination> Destinations =  new HashMap();
    private final Map<Integer, Baggage> Baggages = new HashMap();
    private final Map<Integer, Coupon> Coupons = new HashMap();
    Logger logger = Logger.getLogger(FlightDaoImpl.class.getName());

    public FlightDaoImpl() {
        init();
    }

    private void init() {
        Tickets.put(1, new Ticket(1,1,1,7,"18/07/2018","13:00 PM","17:00 PM",590));
        Tickets.put(2, new Ticket(2,1,2,7,"18/07/2018","13:00 PM","17:00 PM",610));
        Tickets.put(3, new Ticket(3,1,3,7,"18/07/2018","13:00 PM","17:00 PM",540));
        Flights.put(1,new Flight(1,30,"13:00 PM","17:00 PM","18/07/2018",7) );
        Flights.put(2,new Flight(2,91,"09:00 PM","13:40 PM","06/07/2016",11) );
        Flights.put(3,new Flight(3,61,"21:00 PM","03:00 AM","21/12/2019",15) );
        Destinations.put(7,new Destination(7, "Rome"));
        Destinations.put(11,new Destination(11, "Spain"));
        Destinations.put(15,new Destination(15,"India"));
        Baggages.put(100, new Baggage(100,"A",1,1,1,1,7,true));
        Baggages.put(101, new Baggage(101,"B",2,2,1,1,11,false));
        Baggages.put(102,new Baggage(102,"C",3,3,1,1,15,true));

    }

    @Override
    public Ticket findTicketById(Integer id) {
        return Tickets.getOrDefault(id, null);
    }

    @Override
    public Boolean findCheckIn(Integer DestinationId, Integer BaggageId){
        try {
            Baggage baggage = Baggages.get(BaggageId);
            Ticket ticket = Tickets.get(baggage.getTicketId());
            Flight flight = Flights.get(ticket.getFlightId());
            Destination destination = Destinations.get(flight.getDestinationId());

            return Baggages.containsKey(BaggageId) && Baggages.get(BaggageId).IsCheckedIn() && destination.GetDestinationId() == DestinationId;
        }
        catch (Exception e){
            logger.log(Level.SEVERE, String.format("Exception : %s", e));
            return false;
        }
    }

    @Override
    public String CheckCoupon(Integer CouponId, Double price){
        if(!Coupons.containsKey(CouponId)){
            logger.log(Level.INFO, String.format("Coupon ID = %d does not exist", CouponId));
            return String.format("{Price: %f, response:'Coupon does not exist'}",price);
        }
        Coupon coupon = Coupons.get(CouponId);
        double dis = (double)price*coupon.GetDiscount();
        logger.log(Level.INFO, String.format("Coupon ID = %d Got %.2f Discount ", CouponId, dis));
        return String.format("{Price: %.2f, response:'Coupon discount = %.2f '}", dis, coupon.GetDiscount());
    }
}
