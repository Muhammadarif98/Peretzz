package com.hfad.peretzz;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Post {
    @SerializedName("id") // date name description new variations price image_app image sort
    @Expose
    private  int id;
    @SerializedName("date")
    @Expose
    private  int date;
    @SerializedName("name")
    @Expose
    private  int name;
    @SerializedName("description")
    @Expose
    private  int description;
    @SerializedName("new")
    @Expose
    private  int nnew;
    @SerializedName("variations")
    @Expose
    private  int variations;
    @SerializedName("price")
    @Expose
    private  int price;
    @SerializedName("image_app")
    @Expose
    private  int image_app;
    @SerializedName("image")
    @Expose
    private  int image;
    @SerializedName("sort")
    @Expose
    private  int sort;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getDate() {
        return date;
    }

    public int getDescription() {
        return description;
    }

    public int getImage() {
        return image;
    }

    public int getImage_app() {
        return image_app;
    }

    public int getName() {
        return name;
    }

    public int getNnew() {
        return nnew;
    }

    public int getPrice() {
        return price;
    }

    public int getVariations() {
        return variations;
    }

    public int getSort() {
        return sort;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public void setDescription(int description) {
        this.description = description;
    }

    public void setImage_app(int image_app) {
        this.image_app = image_app;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public void setName(int name) {
        this.name = name;
    }

    public void setNnew(int nnew) {
        this.nnew = nnew;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setSort(int sort) {
        this.sort = sort;
    }

    public void setVariations(int variations) {
        this.variations = variations;
    }

}

