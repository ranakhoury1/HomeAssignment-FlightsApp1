package com.example.demo.dto;

public class Airplane {
    private  Integer AirplaneId;
    private  Integer ManufactureYear;
    private  String Manufacturer;
    private  Integer Capacity;
    public Airplane(Integer AID, Integer year, String manufacturer, Integer capacity)
    {
        this.AirplaneId=AID;
        this.ManufactureYear = year;
        this.Manufacturer = manufacturer;
        this.Capacity = capacity;
    }
    public Integer getAirplaneId(){
        return AirplaneId;
    }
    public Integer getManufactureYear(){
        return ManufactureYear;
    }
    public String getManufacturer(){
        return Manufacturer;
    }
    public Integer getCapacity(){
        return Capacity;
    }

}
