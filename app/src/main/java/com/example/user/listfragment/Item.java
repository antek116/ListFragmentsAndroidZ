package com.example.user.listfragment;

/**
 * Created by user on 09.03.2016.
 */
public class Item {
    private String description;
    private String imageId;

    public void Item(String description, String imageId){
        this.description = description;
        this.imageId = imageId;
    }

    public String getImageId() {
        return imageId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setImageId(String imageId) {
        this.imageId = imageId;
    }
}
