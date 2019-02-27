package com.example.lenovo.srijan;

public class DeveloperModel {
    private int imageId;
    private String name;
    private String description;
    private String linkedinUrl;
    private String githubUrl;
    private String instagramUrl;
    private String facebookUrl;

    public DeveloperModel(int imageId, String name, String description, String linkedinUrl, String githubUrl, String instagramUrl, String facebookUrl) {
        this.imageId = imageId;
        this.name = name;
        this.description = description;
        this.linkedinUrl = linkedinUrl;
        this.githubUrl = githubUrl;
        this.instagramUrl = instagramUrl;
        this.facebookUrl = facebookUrl;
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

    public String getLinkedinUrl() {
        return linkedinUrl;
    }

    public String getGithubUrl() {
        return githubUrl;
    }

    public String getInstagramUrl() {
        return instagramUrl;
    }

    public String getFacebookUrl() {
        return facebookUrl;
    }
}
