package com.simbirsoft.api.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class SystemFolders {

    @SerializedName("odnoklassniki")
    @Expose
    private String odnoklassniki;
    @SerializedName("google")
    @Expose
    private String google;
    @SerializedName("instagram")
    @Expose
    private String instagram;
    @SerializedName("vkontakte")
    @Expose
    private String vkontakte;
    @SerializedName("mailru")
    @Expose
    private String mailru;
    @SerializedName("downloads")
    @Expose
    private String downloads;
    @SerializedName("applications")
    @Expose
    private String applications;
    @SerializedName("facebook")
    @Expose
    private String facebook;
    @SerializedName("social")
    @Expose
    private String social;
    @SerializedName("screenshots")
    @Expose
    private String screenshots;
    @SerializedName("photostream")
    @Expose
    private String photostream;

    public String getOdnoklassniki() {
        return odnoklassniki;
    }

    public void setOdnoklassniki(String odnoklassniki) {
        this.odnoklassniki = odnoklassniki;
    }

    public String getGoogle() {
        return google;
    }

    public void setGoogle(String google) {
        this.google = google;
    }

    public String getInstagram() {
        return instagram;
    }

    public void setInstagram(String instagram) {
        this.instagram = instagram;
    }

    public String getVkontakte() {
        return vkontakte;
    }

    public void setVkontakte(String vkontakte) {
        this.vkontakte = vkontakte;
    }

    public String getMailru() {
        return mailru;
    }

    public void setMailru(String mailru) {
        this.mailru = mailru;
    }

    public String getDownloads() {
        return downloads;
    }

    public void setDownloads(String downloads) {
        this.downloads = downloads;
    }

    public String getApplications() {
        return applications;
    }

    public void setApplications(String applications) {
        this.applications = applications;
    }

    public String getFacebook() {
        return facebook;
    }

    public void setFacebook(String facebook) {
        this.facebook = facebook;
    }

    public String getSocial() {
        return social;
    }

    public void setSocial(String social) {
        this.social = social;
    }

    public String getScreenshots() {
        return screenshots;
    }

    public void setScreenshots(String screenshots) {
        this.screenshots = screenshots;
    }

    public String getPhotostream() {
        return photostream;
    }

    public void setPhotostream(String photostream) {
        this.photostream = photostream;
    }

}