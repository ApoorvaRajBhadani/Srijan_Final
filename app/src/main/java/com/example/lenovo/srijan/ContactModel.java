package com.example.lenovo.srijan;

public class ContactModel {
    private int imageId;
    private String name;
    private String description;
    private String phone;

    public ContactModel(int imageId, String name, String description, String phone) {
        this.imageId = imageId;
        this.name = name;
        this.description = description;
        this.phone = phone;
    }

    public int getImageId() {
        return imageId;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getPhone() {
        return phone;
    }
}
