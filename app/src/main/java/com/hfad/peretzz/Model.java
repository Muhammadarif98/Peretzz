package com.hfad.peretzz;

import java.util.List;

public class Model {

       public String title, description, price;
       private int img;

       public String getTitle () {
           return title;
       }

       public void setTitle (String title){
           this.title = title;
       }

       public String getDescription () {
           return description;
       }

       public void setDescription (String description){
           this.description = description;
       }

       public int getImg () {
           return img;
       }

       public void setImg ( int img){
           this.img = img;
       }

       public String getPrice () {
           return price;
       }

       public void setPrice (String price){
           this.price = price;
       }

}
