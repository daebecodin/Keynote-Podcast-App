package com.deabecoodin.keynotepodcastapp.graphql.dto;

import com.deabecoodin.keynotepodcastapp.enums.CollectionGenreType;
import com.deabecoodin.keynotepodcastapp.enums.CollectionSocialType;

import java.util.List;
import java.util.Objects;
import java.util.UUID;

public class KeynoteCollectionDto implements Collection {
    private UUID id;
    private String title;
    private String subtitle;
    private CollectionGenreType genreType;
    private CollectionSocialType socialStatus;
    private String name;
    List<KeynoteDto> keynotes;

    public KeynoteCollectionDto() {}

    public KeynoteCollectionDto(UUID id, String title, String subtitle, CollectionGenreType genreType, CollectionSocialType socialStatus, String name, List<KeynoteDto> keynotes) {
        this.id = id;
        this.title = title;
        this.subtitle = subtitle;
        this.genreType = genreType;
        this.socialStatus = socialStatus;
        this.name = name;
        this.keynotes = keynotes;
    }

    @Override
    public UUID getId() {
        return id;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public String getSubtitle() {
        return subtitle;
    }

    @Override
    public CollectionGenreType getGenreType() {
        return genreType;
    }

    public CollectionSocialType getSocialStatus() {
        return socialStatus;
    }

    public String getName() {
        return name;
    }


    public List<KeynoteDto> getKeynotes() {
        return keynotes;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle;
    }

    public void setGenreType(CollectionGenreType genreType) {
        this.genreType = genreType;
    }

    public void setSocialStatus(CollectionSocialType socialStatus) {
        this.socialStatus = socialStatus;
    }

    public void setName(String name) {
        this.name = name;
    }


    public void setKeynotes(List<KeynoteDto> keynotes) {
        this.keynotes = keynotes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        KeynoteCollectionDto that = (KeynoteCollectionDto) o;
        return Objects.equals(id, that.id) && Objects.equals(title, that.title) && Objects.equals(subtitle, that.subtitle) && genreType == that.genreType && socialStatus == that.socialStatus && Objects.equals(name, that.name) && Objects.equals(keynotes, that.keynotes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, subtitle, genreType, socialStatus, name, keynotes);
    }

    @Override
    public String toString() {
        return "KeynoteCollectionDto{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", subtitle='" + subtitle + '\'' +
                ", genreType=" + genreType +
                ", socialStatus=" + socialStatus +
                ", name='" + name + '\'' +
                ", keynotes=" + keynotes +
                '}';
    }
}
