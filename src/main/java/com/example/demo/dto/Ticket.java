package com.example.demo.dto;

public class Ticket {
    private Integer TicketId;
    private Integer FlightId;
    private Integer PassengerId;
    private Integer DestinationId;
    private String Date;
    private String DepartureTime;
    private String ArrivalTime;
    private Double Price;

    public Ticket(Integer TID, Integer FID, Integer PID,Integer DID,String date, String time1, String time2, double price)
    {
        this.TicketId = TID;
        this.FlightId = FID;
        this.PassengerId = PID;
        this.DestinationId = DID;
        this.Date = date;
        this.DepartureTime = time1;
        this.ArrivalTime = time2;
        this.Price = price;
    }

    public Integer getTicketId(){
        return TicketId;
    }
    public Integer getFlightId(){
        return FlightId;
    }

    public Integer getPassengerId() {
        return PassengerId;
    }
    public Integer GetDestinationId(){ return DestinationId;}
    public String GetDate(){
        return Date;
    }
    public String GetDepartureTime(){
        return DepartureTime;
    }
    public String GetArrivalTime(){
        return ArrivalTime;
    }
    public Double getPrice() {
        return Price;
    }

}