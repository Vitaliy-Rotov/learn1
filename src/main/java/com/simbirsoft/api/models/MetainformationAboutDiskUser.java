package com.simbirsoft.api.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class MetainformationAboutDiskUser {

    @SerializedName("max_file_size")
    @Expose
    private Long maxFileSize;
    @SerializedName("unlimited_autoupload_enabled")
    @Expose
    private Boolean unlimitedAutouploadEnabled;
    @SerializedName("total_space")
    @Expose
    private Long totalSpace;
    @SerializedName("trash_size")
    @Expose
    private Long trashSize;
    @SerializedName("is_paid")
    @Expose
    private Boolean isPaid;
    @SerializedName("used_space")
    @Expose
    private Long usedSpace;
    @SerializedName("system_folders")
    @Expose
    private SystemFolders systemFolders;
    @SerializedName("user")
    @Expose
    private User user;
    @SerializedName("revision")
    @Expose
    private Long revision;

    public Long getMaxFileSize() {
        return maxFileSize;
    }

    public void setMaxFileSize(Long maxFileSize) {
        this.maxFileSize = maxFileSize;
    }

    public Boolean getUnlimitedAutouploadEnabled() {
        return unlimitedAutouploadEnabled;
    }

    public void setUnlimitedAutouploadEnabled(Boolean unlimitedAutouploadEnabled) {
        this.unlimitedAutouploadEnabled = unlimitedAutouploadEnabled;
    }

    public Long getTotalSpace() {
        return totalSpace;
    }

    public void setTotalSpace(Long totalSpace) {
        this.totalSpace = totalSpace;
    }

    public Long getTrashSize() {
        return trashSize;
    }

    public void setTrashSize(Long trashSize) {
        this.trashSize = trashSize;
    }

    public Boolean getIsPaid() {
        return isPaid;
    }

    public void setIsPaid(Boolean isPaid) {
        this.isPaid = isPaid;
    }

    public Long getUsedSpace() {
        return usedSpace;
    }

    public void setUsedSpace(Long usedSpace) {
        this.usedSpace = usedSpace;
    }

    public SystemFolders getSystemFolders() {
        return systemFolders;
    }

    public void setSystemFolders(SystemFolders systemFolders) {
        this.systemFolders = systemFolders;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Long getRevision() {
        return revision;
    }

    public void setRevision(Long revision) {
        this.revision = revision;
    }

}