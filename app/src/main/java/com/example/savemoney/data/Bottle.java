package com.example.savemoney.data;

public class Bottle {
    private double totalMoney;
    private double perfectMoney;
    private double realMoney;
    private double totalLoss;
    private double totalIncome;
    private double[] loss;
    private double[] income;

    public Bottle(double totalMoney, double perfectMoney, double realMoney, double totalLoss, double totalIncome, double[] loss, double[] income) {
        this.totalMoney = totalMoney;
        this.perfectMoney = perfectMoney;
        this.realMoney = realMoney;
        this.totalLoss = totalLoss;
        this.totalIncome = totalIncome;
        this.loss = loss;
        this.income = income;
    }

    public double getTotalMoney() {
        return totalMoney;
    }

    public void setTotalMoney(double totalMoney) {
        this.totalMoney = totalMoney;
    }

    public double getPerfectMoney() {
        return perfectMoney;
    }

    public void setPerfectMoney(double perfectMoney) {
        this.perfectMoney = perfectMoney;
    }

    public double getRealMoney() {
        return realMoney;
    }

    public void setRealMoney(double realMoney) {
        this.realMoney = realMoney;
    }

    public double getTotalLoss() {
        return totalLoss;
    }

    public void setTotalLoss(double totalLoss) {
        this.totalLoss = totalLoss;
    }

    public double getTotalIncome() {
        return totalIncome;
    }

    public void setTotalIncome(double totalIncome) {
        this.totalIncome = totalIncome;
    }

    public double[] getLoss() {
        return loss;
    }

    public void setLoss(double[] loss) {
        this.loss = loss;
    }

    public double[] getIncome() {
        return income;
    }

    public void setIncome(double[] income) {
        this.income = income;
    }
}
