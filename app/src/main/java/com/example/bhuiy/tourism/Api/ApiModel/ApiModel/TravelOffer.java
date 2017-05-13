
package com.example.bhuiy.tourism.Api.ApiModel.ApiModel;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class TravelOffer {

    @SerializedName("Id")
    @Expose
    private Integer id;
    @SerializedName("TravelName")
    @Expose
    private String travelName;
    @SerializedName("Status")
    @Expose
    private String status;
    @SerializedName("Destination")
    @Expose
    private String destination;
    @SerializedName("Days")
    @Expose
    private Integer days;
    @SerializedName("Nights")
    @Expose
    private Integer nights;
    @SerializedName("Budget")
    @Expose
    private Double budget;
    @SerializedName("Type")
    @Expose
    private String type;
    @SerializedName("TripCode")
    @Expose
    private String tripCode;
    @SerializedName("TrekDays")
    @Expose
    private String trekDays;
    @SerializedName("Transportation")
    @Expose
    private String transportation;
    @SerializedName("Overview")
    @Expose
    private String overview;
    @SerializedName("PhotoId")
    @Expose
    private String photoId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTravelName() {
        return travelName;
    }

    public void setTravelName(String travelName) {
        this.travelName = travelName;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public Integer getDays() {
        return days;
    }

    public void setDays(Integer days) {
        this.days = days;
    }

    public Integer getNights() {
        return nights;
    }

    public void setNights(Integer nights) {
        this.nights = nights;
    }

    public Double getBudget() {
        return budget;
    }

    public void setBudget(Double budget) {
        this.budget = budget;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTripCode() {
        return tripCode;
    }

    public void setTripCode(String tripCode) {
        this.tripCode = tripCode;
    }

    public String getTrekDays() {
        return trekDays;
    }

    public void setTrekDays(String trekDays) {
        this.trekDays = trekDays;
    }

    public String getTransportation() {
        return transportation;
    }

    public void setTransportation(String transportation) {
        this.transportation = transportation;
    }

    public String getOverview() {
        return overview;
    }

    public void setOverview(String overview) {
        this.overview = overview;
    }

    public String getPhotoId() {
        return photoId;
    }

    public void setPhotoId(String photoId) {
        this.photoId = photoId;
    }

}
