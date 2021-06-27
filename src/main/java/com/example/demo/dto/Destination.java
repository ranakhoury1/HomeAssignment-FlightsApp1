package com.example.demo.dto;

public class Destination {
    private Integer DestinationId;
    private String DestinationName;
    public Destination(Integer id, String Name){
        this.DestinationId = id;
        this.DestinationName = Name;
    }
    public Integer GetDestinationId(){
        return DestinationId;
    }
    public String GetDestinationName(){
        return DestinationName;
    }
}
