package com.example.lenovo.srijan;

public class cards {

    public int sidecolor;
    public String titletext;
    public String titledesciption;
    public int logos ;
    public  String stars;

    public String getStars() {
        return stars;
    }

    public void setStars(String stars) {
        this.stars = stars;
    }

    public cards(int sidecolor, String titletext, String titledesciption, int logos) {
        this.sidecolor = sidecolor;
        this.titletext = titletext;
        this.titledesciption = titledesciption;
        this.logos = logos;
    }
    public cards(int sidecolor, String titletext, String titledesciption, int logos,String stars) {
        this.sidecolor = sidecolor;
        this.titletext = titletext;
        this.titledesciption = titledesciption;
        this.logos = logos;
        this.stars = stars;
    }
    public cards(int sidecolor, String titletext,  int logos) {
        this.sidecolor = sidecolor;
        this.titletext = titletext;
        this.logos = logos;
    }

    public int getSidecolor() {
        return sidecolor;
    }

    public void setSidecolor(int sidecolor) {
        this.sidecolor = sidecolor;
    }

    public String getTitletext() {
        return titletext;
    }

    public void setTitletext(String titletext) {
        this.titletext = titletext;
    }

    public String getTitledesciption() {
        return titledesciption;
    }

    public void setTitledesciption(String titledesciption) {
        this.titledesciption = titledesciption;
    }

    public int getLogos() {
        return logos;
    }

    public void setLogos(int logos) {
        this.logos = logos;
    }
}
