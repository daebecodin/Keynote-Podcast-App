package com.deabecoodin.keynotepodcastapp.graphql.dto;

import com.deabecoodin.keynotepodcastapp.enums.PopularityRank;

import java.util.List;
import java.util.Objects;
import java.util.UUID;

public class PodcastSeriesDto {
    private UUID uuid;
    private String name;
    private String authorName;
    private Long datePublished;
    private String description;
    private String imageUrl;
    private List<ItunesInfoDto> iTunesInfo;
    private String websiteUrl;
    private String hash;
    private String childrenHash;
    private Boolean isCompleted;
    private PopularityRank popularityRank;
    private Boolean isExplicitContent;

    public PodcastSeriesDto() {}

    public PodcastSeriesDto(UUID uuid, String name, String authorName, Long datePublished, String description, String imageUrl, List<ItunesInfoDto> iTunesInfo, String websiteUrl, String hash, String childrenHash, Boolean isCompleted, PopularityRank popularityRank, Boolean isExplicitContent) {
        this.uuid = uuid;
        this.name = name;
        this.authorName = authorName;
        this.datePublished = datePublished;
        this.description = description;
        this.imageUrl = imageUrl;
        this.iTunesInfo = iTunesInfo;
        this.websiteUrl = websiteUrl;
        this.hash = hash;
        this.childrenHash = childrenHash;
        this.isCompleted = isCompleted;
        this.popularityRank = popularityRank;
        this.isExplicitContent = isExplicitContent;
    }

    public UUID getUuid() {
        return uuid;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public Long getDatePublished() {
        return datePublished;
    }

    public void setDatePublished(Long datePublished) {
        this.datePublished = datePublished;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public List<ItunesInfoDto> getiTunesInfo() {
        return iTunesInfo;
    }

    public void setiTunesInfo(List<ItunesInfoDto> iTunesInfo) {
        this.iTunesInfo = iTunesInfo;
    }

    public String getWebsiteUrl() {
        return websiteUrl;
    }

    public void setWebsiteUrl(String websiteUrl) {
        this.websiteUrl = websiteUrl;
    }

    public String getHash() {
        return hash;
    }

    public void setHash(String hash) {
        this.hash = hash;
    }

    public String getChildrenHash() {
        return childrenHash;
    }

    public void setChildrenHash(String childrenHash) {
        this.childrenHash = childrenHash;
    }

    public Boolean getCompleted() {
        return isCompleted;
    }

    public void setCompleted(Boolean completed) {
        isCompleted = completed;
    }

    public PopularityRank getPopularityRank() {
        return popularityRank;
    }

    public void setPopularityRank(PopularityRank popularityRank) {
        this.popularityRank = popularityRank;
    }

    public Boolean getExplicitContent() {
        return isExplicitContent;
    }

    public void setExplicitContent(Boolean explicitContent) {
        isExplicitContent = explicitContent;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PodcastSeriesDto that = (PodcastSeriesDto) o;
        return Objects.equals(uuid, that.uuid) && Objects.equals(name, that.name) && Objects.equals(authorName, that.authorName) && Objects.equals(datePublished, that.datePublished) && Objects.equals(description, that.description) && Objects.equals(imageUrl, that.imageUrl) && Objects.equals(iTunesInfo, that.iTunesInfo) && Objects.equals(websiteUrl, that.websiteUrl) && Objects.equals(hash, that.hash) && Objects.equals(childrenHash, that.childrenHash) && Objects.equals(isCompleted, that.isCompleted) && popularityRank == that.popularityRank && Objects.equals(isExplicitContent, that.isExplicitContent);
    }

    @Override
    public int hashCode() {
        return Objects.hash(uuid, name, authorName, datePublished, description, imageUrl, iTunesInfo, websiteUrl, hash, childrenHash, isCompleted, popularityRank, isExplicitContent);
    }

    @Override
    public String toString() {
        return "PodcastSeriesDto{" +
                "uuid=" + uuid +
                ", name='" + name + '\'' +
                ", authorName='" + authorName + '\'' +
                ", datePublished=" + datePublished +
                ", description='" + description + '\'' +
                ", imageUrl='" + imageUrl + '\'' +
                ", iTunesInfo=" + iTunesInfo +
                ", websiteUrl='" + websiteUrl + '\'' +
                ", hash='" + hash + '\'' +
                ", childrenHash='" + childrenHash + '\'' +
                ", isCompleted=" + isCompleted +
                ", popularityRank=" + popularityRank +
                ", isExplicitContent=" + isExplicitContent +
                '}';
    }
}
