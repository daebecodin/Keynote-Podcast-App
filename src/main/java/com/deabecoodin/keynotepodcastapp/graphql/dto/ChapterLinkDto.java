package com.deabecoodin.keynotepodcastapp.graphql.dto;

import java.util.Objects;

public class ChapterLinkDto {
    private String url;
    private String type;
    private Boolean isTaddyExclusive;

    public ChapterLinkDto() {}

    public ChapterLinkDto(String url, String type, Boolean isTaddyExclusive) {
        this.url = url;
        this.type = type;
        this.isTaddyExclusive = isTaddyExclusive;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Boolean getTaddyExclusive() {
        return isTaddyExclusive;
    }

    public void setTaddyExclusive(Boolean taddyExclusive) {
        isTaddyExclusive = taddyExclusive;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ChapterLinkDto that = (ChapterLinkDto) o;
        return Objects.equals(url, that.url) && Objects.equals(type, that.type) && Objects.equals(isTaddyExclusive, that.isTaddyExclusive);
    }

    @Override
    public int hashCode() {
        return Objects.hash(url, type, isTaddyExclusive);
    }

    @Override
    public String toString() {
        return "ChapterLinksDto{" +
                "url='" + url + '\'' +
                ", type='" + type + '\'' +
                ", isTaddyExclusive=" + isTaddyExclusive +
                '}';
    }
}
