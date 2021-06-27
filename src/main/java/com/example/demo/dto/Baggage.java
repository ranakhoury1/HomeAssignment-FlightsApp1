package com.example.demo.dto;

public class Baggage {
    private Integer BaggageId;
    private String Gate;
    private Integer FlightId;
    private Integer AirplaneId;
    private Integer PassengerId;
    private Integer TicketId;
    private Integer DestinationId;
    private  Boolean IsCheckedIn;

    public Baggage(Integer BID, String gate,Integer FID, Integer AID, Integer PID, Integer TID, Integer DID,Boolean isCheckedIn)
{
    this.BaggageId = BID;
    this.Gate = gate;
    this.FlightId = FID;
    this.AirplaneId = AID;
    this.PassengerId = PID;
    this.TicketId = TID;
    this.DestinationId = DID;
    this.IsCheckedIn = isCheckedIn;
}
public Integer getBaggageId(){
    return BaggageId;
}
public String getGate(){
    return Gate;
}
public Integer getFlightId(){
    return FlightId;
}
public Integer getAirplaneId(){
    return AirplaneId;
}
public Integer getPassengerId(){
    return PassengerId;
}
public Integer getTicketId(){
    return TicketId;
}
public Integer GetDestinationId(){
        return DestinationId;
    }
public Boolean IsCheckedIn(){return IsCheckedIn;}
}
