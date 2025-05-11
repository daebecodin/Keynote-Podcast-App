package com.deabecoodin.keynotepodcastapp.graphql.dto;

import java.util.Objects;
import java.util.UUID;

public class ChapterDto {
   private UUID id;
   private String title;
   private Long startTimecode;

    public ChapterDto() {}

    public ChapterDto(UUID id, String title, Long startTimecode) {
        this.id = id;
        this.title = title;
        this.startTimecode = startTimecode;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Long getStartTimecode() {
        return startTimecode;
    }

    public void setStartTimecode(Long startTimecode) {
        this.startTimecode = startTimecode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ChapterDto that = (ChapterDto) o;
        return Objects.equals(id, that.id) && Objects.equals(title, that.title) && Objects.equals(startTimecode, that.startTimecode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, startTimecode);
    }

    @Override
    public String toString() {
        return "ChapterDto{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", startTimecode=" + startTimecode +
                '}';
    }
}
