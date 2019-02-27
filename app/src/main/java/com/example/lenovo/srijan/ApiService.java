package com.example.lenovo.srijan;

import retrofit2.Call;
import retrofit2.http.GET;


public interface ApiService {


    @GET("feed?fields=full_picture,id,link,story,created_time,message&access_token=EAADrJr33qyIBADcItbxLev06Om2FeNlLsZAtsn7FKAcgVcA71CdXEZBAWn8ZBqIIfhDPaUa9yqvy7Qtp0y0fab3jdhZC44p4kwt1xj6mtt6qy8ZCFVhkOPKIyWXCHnVZAzeLMZBnpKc0ulx6KTBPBZAxfW9e03kKCrgZD&limit=20")
    Call<com.example.lenovo.srijan.ContactList> getMyJSON();
}

