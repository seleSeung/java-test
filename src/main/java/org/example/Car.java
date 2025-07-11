package org.example;

public class Car {
    private String brand ;

    private String model;

    private int year;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void move() {
        System.out.println("자동차가 움직입니다.");
    }

    public void stop() {
        System.out.println("자동차가 멈춥니다.");
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return this.brand;
    }

    public Car() {
        // 기본 생성자
    }

    public Car(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    public Car(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public static void main(String[] args) {

        Car myCar = new Car();
        myCar.setBrand("kia");
        myCar.setModel("K5");
        myCar.setYear(2023);

        System.out.println("브랜드: " + myCar.getBrand());
        System.out.println("모델: " + myCar.getModel());
        System.out.println("연도: " + myCar.getYear());

        myCar.move();
        myCar.stop();
    }



}







