package com.example.demo.dto;
public class Flight {
    private Integer FlightId;
    private Integer AirplaneId;
    private String DepartureTime;
    private String ArrivalTime;
    private String Date;
    private Integer DestinationId;
    public Flight(Integer FID, Integer AID, String departureTime, String arrivalTime, String date, Integer destinationId)
    {
        this.FlightId = FID;
        this.AirplaneId = AID;
        this.DepartureTime = departureTime;
        this.ArrivalTime = arrivalTime;
        this.Date = date;
        this.DestinationId = destinationId;
    }

    public Integer getFlightId(){
        return FlightId;
    }
    public Integer getAirplaneId(){
        return AirplaneId;
    }
    public Integer getDestinationId(){
        return DestinationId;
    }
    public String getDepartureTime(){
        return DepartureTime;
    }
    public String getArrivalTime(){
        return ArrivalTime;
    }
    public String getDate(){
        return Date;
    }
}
