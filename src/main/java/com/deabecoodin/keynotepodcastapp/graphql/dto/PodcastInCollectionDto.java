package com.deabecoodin.keynotepodcastapp.graphql.dto;

import java.util.List;
import java.util.Objects;

public class PodcastInCollectionDto {
    private PodcastSeriesDto podcastSeries;
    private List<EpisodeInCollectionDto> episodes;

    public PodcastInCollectionDto() {
    }
    public PodcastInCollectionDto(PodcastSeriesDto podcastSeries, List<EpisodeInCollectionDto> episodes) {
        this.podcastSeries = podcastSeries;
        this.episodes = episodes;
    }

    public PodcastSeriesDto getPodcastSeries() {
        return podcastSeries;
    }

    public void setPodcastSeries(PodcastSeriesDto podcastSeries) {
        this.podcastSeries = podcastSeries;
    }

    public List<EpisodeInCollectionDto> getEpisodes() {
        return episodes;
    }

    public void setEpisodes(List<EpisodeInCollectionDto> episodes) {
        this.episodes = episodes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PodcastInCollectionDto that = (PodcastInCollectionDto) o;
        return Objects.equals(podcastSeries, that.podcastSeries) && Objects.equals(episodes, that.episodes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(podcastSeries, episodes);
    }
    @Override
    public String toString() {
        return "PodcastInCollectionDto{" +
                "podcastSeries=" + podcastSeries +
                ", episodes=" + episodes +
                '}';
    }
}
