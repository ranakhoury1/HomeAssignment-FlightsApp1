package com.example.demo.dto;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
public class Coupon {
    private Integer CouponId;
    private  Double Price;
    private Double Discount;
    private boolean Valid;
    public Coupon(Integer id, Double price) {
        this.CouponId = id;
        this.Price = price;
        this.Discount = SetDiscount();
    }
    public boolean GetValid(){
        return Valid;
    }
    public Integer GetCouponId(){
        return CouponId;
    }
    public Double GetDiscount(){return Discount;}

    public void SetValid(boolean valid) {
        this.Valid = valid;
    }

    private Double SetDiscount(){
        List<Double> Discounts = Arrays.asList(0.1, 0.5, 0.6);
        Random random1 = new Random();
        Discount = Discounts.get(random1.nextInt(Discounts.size()));
        return Discount;
    }
    private void UpdatePrice(){
        SetDiscount();
        this.Price = Price - (Price*Discount);
    }
}
