package com.example.demodrools;


import org.openjdk.jmh.annotations.Benchmark;

public class Order {

    private String name;
    private String cardType;
    private int discount;
    private int price;
    private int prepayment;
    private String profile;
    private double score;

    public int getPrepayment() {
        return prepayment;
    }

    public void setPrepayment(int prepayment) {
        this.prepayment = prepayment;
    }

    public String getProfile() {
        return profile;
    }

    public void setProfile(String profile) {
        this.profile = profile;
    }

    public Double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }


   public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCardType() {
        return cardType;
    }

    public void setCardType(String cardType) {
        this.cardType = cardType;
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }



}
