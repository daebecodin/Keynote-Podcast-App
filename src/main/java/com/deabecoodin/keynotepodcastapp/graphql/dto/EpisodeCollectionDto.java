package com.deabecoodin.keynotepodcastapp.graphql.dto;

import com.deabecoodin.keynotepodcastapp.enums.CollectionGenreType;
import com.deabecoodin.keynotepodcastapp.enums.CollectionSocialType;

import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.UUID;

public class EpisodeCollectionDto implements Collection {
    private UUID id;
    private String title;
    private String subtitle;
    private CollectionGenreType genreType;
    private CollectionSocialType socialStatus;
    private List<EpisodeDto> episodes;

    public EpisodeCollectionDto() {}

    public EpisodeCollectionDto(UUID id, String title, String subtitle, CollectionGenreType genreType, CollectionSocialType socialStatus, List<EpisodeDto> episodes) {
        this.id = id;
        this.title = title;
        this.subtitle = subtitle;
        this.genreType = genreType;
        this.socialStatus = socialStatus;
        this.episodes = episodes;
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

    public List<EpisodeDto> getEpisodes() {
        return episodes;
    }

    public void setEpisodes(List<EpisodeDto> episodes) {
        this.episodes = episodes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EpisodeCollectionDto that = (EpisodeCollectionDto) o;
        return Objects.equals(id, that.id) && Objects.equals(title, that.title) && Objects.equals(subtitle, that.subtitle) && genreType == that.genreType && socialStatus == that.socialStatus && Objects.equals(episodes, that.episodes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, subtitle, genreType, socialStatus, episodes);
    }

    @Override
    public String toString() {
        return "EpisodeCollectionDto{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", subtitle='" + subtitle + '\'' +
                ", genreType=" + genreType +
                ", socialStatus=" + socialStatus +
                ", episodes=" + episodes +
                '}';
    }
}
