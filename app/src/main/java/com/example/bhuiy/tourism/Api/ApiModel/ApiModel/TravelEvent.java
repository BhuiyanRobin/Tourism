
package com.example.bhuiy.tourism.Api.ApiModel.ApiModel;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class TravelEvent {

    @SerializedName("TravelOffer")
    @Expose
    private TravelOffer travelOffer;
    @SerializedName("Id")
    @Expose
    private Integer id;
    @SerializedName("TravelDes")
    @Expose
    private String travelDes;
    @SerializedName("TravelCost")
    @Expose
    private Double travelCost;
    @SerializedName("OthersCost")
    @Expose
    private Double othersCost;
    @SerializedName("FromDate")
    @Expose
    private String fromDate;
    @SerializedName("ToDate")
    @Expose
    private String toDate;
    @SerializedName("IsSync")
    @Expose
    private Boolean isSync;
    @SerializedName("Type")
    @Expose
    private String type;
    @SerializedName("Location")
    @Expose
    private String location;
    @SerializedName("TravelOfferId")
    @Expose
    private Integer travelOfferId;
    @SerializedName("Email")
    @Expose
    private String email;

    public TravelOffer getTravelOffer() {
        return travelOffer;
    }

    public void setTravelOffer(TravelOffer travelOffer) {
        this.travelOffer = travelOffer;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTravelDes() {
        return travelDes;
    }

    public void setTravelDes(String travelDes) {
        this.travelDes = travelDes;
    }

    public Double getTravelCost() {
        return travelCost;
    }

    public void setTravelCost(Double travelCost) {
        this.travelCost = travelCost;
    }

    public Double getOthersCost() {
        return othersCost;
    }

    public void setOthersCost(Double othersCost) {
        this.othersCost = othersCost;
    }

    public String getFromDate() {
        return fromDate;
    }

    public void setFromDate(String fromDate) {
        this.fromDate = fromDate;
    }

    public String getToDate() {
        return toDate;
    }

    public void setToDate(String toDate) {
        this.toDate = toDate;
    }

    public Boolean getIsSync() {
        return isSync;
    }

    public void setIsSync(Boolean isSync) {
        this.isSync = isSync;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Integer getTravelOfferId() {
        return travelOfferId;
    }

    public void setTravelOfferId(Integer travelOfferId) {
        this.travelOfferId = travelOfferId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
