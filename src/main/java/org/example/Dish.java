package org.example;

public class Dish {
    String dish_name;
    String type;
    String price;
    String id;

    Dish(String id,String dish_name,String price,String type){
        this.id = id;
        this.dish_name = dish_name;
        this.type = type;
        this.price = price;
    }


    public String getid(){
        return id;
    }

    @Override
    public String toString() {
        return "Dish{" +
                "dishName='" + dish_name + '\'' +
                ", restroId=" + id +
                ", dishPrice=" + price +
                '}';
    }
}