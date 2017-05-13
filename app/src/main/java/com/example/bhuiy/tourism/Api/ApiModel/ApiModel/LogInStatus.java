
package com.example.bhuiy.tourism.Api.ApiModel.ApiModel;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class LogInStatus {

    @SerializedName("Id")
    @Expose
    private Integer id;
    @SerializedName("StatusName")
    @Expose
    private String statusName;
    @SerializedName("StatusCode")
    @Expose
    private Integer statusCode;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStatusName() {
        return statusName;
    }

    public void setStatusName(String statusName) {
        this.statusName = statusName;
    }

    public Integer getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
    }


}
