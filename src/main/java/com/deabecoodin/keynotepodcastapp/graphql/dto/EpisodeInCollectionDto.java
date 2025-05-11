package com.deabecoodin.keynotepodcastapp.graphql.dto;

import java.util.List;
import java.util.Objects;

public class EpisodeInCollectionDto {
    private EpisodeDto episode;
    private List<KeynoteDto> keynotes;

    public EpisodeInCollectionDto() {
    }

    public EpisodeInCollectionDto(EpisodeDto episode, List<KeynoteDto> keynotes) {
        this.episode = episode;
        this.keynotes = keynotes;
    }

    public EpisodeDto getEpisode() {
        return episode;
    }

    public void setEpisode(EpisodeDto episode) {
        this.episode = episode;
    }

    public List<KeynoteDto> getKeynotes() {
        return keynotes;
    }

    public void setKeynotes(List<KeynoteDto> keynotes) {
        this.keynotes = keynotes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EpisodeInCollectionDto that = (EpisodeInCollectionDto) o;
        return Objects.equals(episode, that.episode) && Objects.equals(keynotes, that.keynotes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(episode, keynotes);
    }

    @Override
    public String toString() {
        return "EpisodeInCollectionDto{" +
                "episode=" + episode +
                ", keynotes=" + keynotes +
                '}';
    }
}
