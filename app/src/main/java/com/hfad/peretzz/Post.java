package com.hfad.peretzz;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.util.List;

public class Post{

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("date")
    @Expose
    private String date;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("new")
    @Expose
    private Boolean _new;
    @SerializedName("variations")
    @Expose
    private List<Object> variations = null;
    @SerializedName("price")
    @Expose
    private Integer price;
    @SerializedName("image_app")
    @Expose
    private String imageApp;
    @SerializedName("image")
    @Expose
    private String image;
    @SerializedName("sort")
    @Expose
    private Integer sort;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Boolean getNew() {
        return _new;
    }

    public void setNew(Boolean _new) {
        this._new = _new;
    }

    public List<Object> getVariations() {
        return variations;
    }

    public void setVariations(List<Object> variations) {
        this.variations = variations;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public String getImageApp() {
        return imageApp;
    }

    public void setImageApp(String imageApp) {
        this.imageApp = imageApp;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }


}