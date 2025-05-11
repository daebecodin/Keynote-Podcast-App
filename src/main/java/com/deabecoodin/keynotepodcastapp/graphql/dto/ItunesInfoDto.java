package com.deabecoodin.keynotepodcastapp.graphql.dto;

import com.deabecoodin.keynotepodcastapp.enums.Country;

import java.util.Objects;
import java.util.UUID;

public class ItunesInfoDto {
    private UUID uuid;
    private String summary;
    private String baseArtworkUrl;
    private Long publisherId;
    private String publisherName;
    private Country country;

    public ItunesInfoDto() {}

    public ItunesInfoDto(UUID uuid, String summary, String baseArtworkUrl, Long publisherId, String publisherName, Country country) {
        this.uuid = uuid;
        this.summary = summary;
        this.baseArtworkUrl = baseArtworkUrl;
        this.publisherId = publisherId;
        this.publisherName = publisherName;
        this.country = country;
    }

    public UUID getUuid() {
        return uuid;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getBaseArtworkUrl() {
        return baseArtworkUrl;
    }

    public void setBaseArtworkUrl(String baseArtworkUrl) {
        this.baseArtworkUrl = baseArtworkUrl;
    }

    public Long getPublisherId() {
        return publisherId;
    }

    public void setPublisherId(Long publisherId) {
        this.publisherId = publisherId;
    }

    public String getPublisherName() {
        return publisherName;
    }

    public void setPublisherName(String publisherName) {
        this.publisherName = publisherName;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ItunesInfoDto that = (ItunesInfoDto) o;
        return Objects.equals(uuid, that.uuid) && Objects.equals(summary, that.summary) && Objects.equals(baseArtworkUrl, that.baseArtworkUrl) && Objects.equals(publisherId, that.publisherId) && Objects.equals(publisherName, that.publisherName) && country == that.country;
    }

    @Override
    public int hashCode() {
        return Objects.hash(uuid, summary, baseArtworkUrl, publisherId, publisherName, country);
    }

    @Override
    public String toString() {
        return "ItunesInfoDto{" +
                "uuid=" + uuid +
                ", summary='" + summary + '\'' +
                ", baseArtworkUrl='" + baseArtworkUrl + '\'' +
                ", publisherId=" + publisherId +
                ", publisherName='" + publisherName + '\'' +
                ", country=" + country +
                '}';
    }
}
