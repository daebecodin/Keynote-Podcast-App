package com.deabecoodin.keynotepodcastapp.graphql.dto;

import java.util.Objects;
import java.util.UUID;

public class TranscriptItemDto {
    private UUID id;
    private String text;
    private String speaker;
    private Long startTimecode;
    private Long endTimecode;

    public TranscriptItemDto() {}

    public TranscriptItemDto(UUID id, String text, String speaker, Long startTimecode, Long endTimecode) {
        this.id = id;
        this.text = text;
        this.speaker = speaker;
        this.startTimecode = startTimecode;
        this.endTimecode = endTimecode;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getSpeaker() {
        return speaker;
    }

    public void setSpeaker(String speaker) {
        this.speaker = speaker;
    }

    public Long getStartTimecode() {
        return startTimecode;
    }

    public void setStartTimecode(Long startTimecode) {
        this.startTimecode = startTimecode;
    }

    public Long getEndTimecode() {
        return endTimecode;
    }

    public void setEndTimecode(Long endTimecode) {
        this.endTimecode = endTimecode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TranscriptItemDto that = (TranscriptItemDto) o;
        return Objects.equals(id, that.id) && Objects.equals(text, that.text) && Objects.equals(speaker, that.speaker) && Objects.equals(startTimecode, that.startTimecode) && Objects.equals(endTimecode, that.endTimecode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, text, speaker, startTimecode, endTimecode);
    }

    @Override
    public String toString() {
        return "TranscriptItemDto{" +
                "id=" + id +
                ", text='" + text + '\'' +
                ", speaker='" + speaker + '\'' +
                ", startTimecode=" + startTimecode +
                ", endTimecode=" + endTimecode +
                '}';
    }
}
