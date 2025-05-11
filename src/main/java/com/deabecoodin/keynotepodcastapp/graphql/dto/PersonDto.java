package com.deabecoodin.keynotepodcastapp.graphql.dto;

import com.deabecoodin.keynotepodcastapp.enums.ContentRole;

import java.util.Objects;
import java.util.UUID;

public class PersonDto implements Human {
    private UUID id;
    private String name;
    private ContentRole role;
    private String url;
    private String imageUrl;

    public PersonDto() {}

    public PersonDto(UUID id, String name, ContentRole role, String url, String imageUrl) {
        this.id = id;
        this.name = name;
        this.role = role;
        this.url = url;
        this.imageUrl = imageUrl;
    }

    @Override
    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ContentRole getRole() {
        return role;
    }

    public void setRole(ContentRole role) {
        this.role = role;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PersonDto personDto = (PersonDto) o;
        return Objects.equals(id, personDto.id) && Objects.equals(name, personDto.name) && role == personDto.role && Objects.equals(url, personDto.url) && Objects.equals(imageUrl, personDto.imageUrl);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, role, url, imageUrl);
    }

    @Override
    public String toString() {
        return "PersonDto{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", role=" + role +
                ", url='" + url + '\'' +
                ", imageUrl='" + imageUrl + '\'' +
                '}';
    }
}
