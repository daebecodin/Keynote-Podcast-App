package com.deabecoodin.keynotepodcastapp.graphql.dto;


import com.deabecoodin.keynotepodcastapp.enums.CollectionGenreType;
import com.deabecoodin.keynotepodcastapp.enums.CollectionSocialType;

import java.util.List;
import java.util.Objects;
import java.util.UUID;

public class PodcastSeriesCollectionDto implements Collection{
    private UUID id;
    private String title;
    private String subtitle;
    private CollectionGenreType genreType;
    private CollectionSocialType socialStatus;
    private List<PodcastInCollectionDto> podcasts;

    public PodcastSeriesCollectionDto() {}

    public PodcastSeriesCollectionDto(UUID id, String title, String subtitle, CollectionGenreType genreType, CollectionSocialType socialStatus, List<PodcastInCollectionDto> podcasts) {
        this.id = id;
        this.title = title;
        this.subtitle = subtitle;
        this.genreType = genreType;
        this.socialStatus = socialStatus;
        this.podcasts = podcasts;
    }

    @Override
    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    @Override
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    @Override
    public String getSubtitle() {
        return subtitle;
    }

    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle;
    }

    @Override
    public CollectionGenreType getGenreType() {
        return genreType;
    }

    public void setGenreType(CollectionGenreType genreType) {
        this.genreType = genreType;
    }

    @Override
    public CollectionSocialType getSocialStatus() {
        return socialStatus;
    }

    public void setSocialStatus(CollectionSocialType socialStatus) {
        this.socialStatus = socialStatus;
    }

    public List<PodcastInCollectionDto> getPodcastSeries() {
        return podcasts;
    }

    public void setPodcastSeries(List<PodcastInCollectionDto> podcastSeries) {
        this.podcasts = podcastSeries;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PodcastSeriesCollectionDto that = (PodcastSeriesCollectionDto) o;
        return Objects.equals(id, that.id) && Objects.equals(title, that.title) && Objects.equals(subtitle, that.subtitle) && genreType == that.genreType && socialStatus == that.socialStatus && Objects.equals(podcasts, that.podcasts);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, subtitle, genreType, socialStatus, podcasts);
    }

    @Override
    public String toString() {
        return "PodcastSeriesCollectionDto{" +
                "id='" + id + '\'' +
                ", title='" + title + '\'' +
                ", subtitle='" + subtitle + '\'' +
                ", genreType=" + genreType +
                ", socialStatus=" + socialStatus +
                ", podcastSeries=" + podcasts +
                '}';
    }
}
