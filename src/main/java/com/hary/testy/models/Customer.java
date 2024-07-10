package com.hary.testy.models;

public class Customer {

    String name;
    String number;
    String text;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Customer() {
    }

    public Customer(String name, String number, String text) {
        this.name = name;
        this.number = number;
        this.text = text;
    }

    @Override
    public String toString() {
        return
                "Имя: " + name + '\n'+
                        "Номер телефона: " + number + '\n' +
                        "Комментарий к заявке: " + text + '\n';

    }
}
