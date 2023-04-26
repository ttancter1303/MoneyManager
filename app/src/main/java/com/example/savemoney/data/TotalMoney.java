package com.example.savemoney.data;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class TotalMoney {
    private double totalMoney;
    private double totalIncome;
    private double totalLoss;
    private double[] income;
    private double[] lost;
    private double savedMoney;
    private ArrayList<Bottle> bottles;

    public TotalMoney(double totalMoney, double totalIncome, double totalLoss, double[] income, double[] lost, double savedMoney, ArrayList<Bottle> bottles) {
        this.totalMoney = totalMoney;
        this.totalIncome = totalIncome;
        this.totalLoss = totalLoss;
        this.income = income;
        this.lost = lost;
        this.savedMoney = savedMoney;
        this.bottles = bottles;
    }

    public double getTotalMoney() {
        return totalMoney;
    }

    public void setTotalMoney(double totalMoney) {
        this.totalMoney = totalMoney;
    }

    public double getTotalIncome() {
        return totalIncome;
    }

    public void setTotalIncome(double totalIncome) {
        this.totalIncome = totalIncome;
    }

    public double getTotalLoss() {
        return totalLoss;
    }

    public void setTotalLoss(double totalLoss) {
        this.totalLoss = totalLoss;
    }

    public double[] getIncome() {
        return income;
    }

    public void setIncome(double[] income) {
        this.income = income;
    }

    public double[] getLost() {
        return lost;
    }

    public void setLost(double[] lost) {
        this.lost = lost;
    }

    public double getSavedMoney() {
        return savedMoney;
    }

    public void setSavedMoney(double savedMoney) {
        this.savedMoney = savedMoney;
    }

    public ArrayList<Bottle> getBottles() {
        return bottles;
    }

    public void setBottles(ArrayList<Bottle> bottles) {
        this.bottles = bottles;
    }
}
