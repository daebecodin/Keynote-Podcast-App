package com.deabecoodin.keynotepodcastapp.graphql.dto;

import com.deabecoodin.keynotepodcastapp.enums.PodcastEpisodeType;

import java.util.List;
import java.util.Objects;

public class EpisodeDto {
    private String uuid;
    private Integer datePublished;
    private String name;
    private String description;
    private List<String> descriptionLinks;
    private String subtitle;
    private String imageUrl;
    private String hash;
    private String audioUrl;
    private String videoUrl;
    private List<String> transcript;
    private Integer fileLength;
    private Integer duration;
    private PodcastEpisodeType episodeType;
    private Integer seasonNumber;
    private Integer episodeNumber;
    private String websiteUrl;
    private Boolean isExplicitContent;
    private PodcastSeriesDto podcastSeries;
    private List<PersonDto> persons;
    private List<String> transcriptsUrls;
    private List<TranscriptLinkDto> transcriptsUrlsWithDetails;
    private List<TranscriptItemDto> transcriptWithSpeakersAndTimecodes;
    private List<ChapterDto> chapters;
    private List<ChapterLinkDto> chaptersUrlsWithDetails;

    public EpisodeDto() {}

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public Integer getDatePublished() {
        return datePublished;
    }

    public void setDatePublished(Integer datePublished) {
        this.datePublished = datePublished;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<String> getDescriptionLinks() {
        return descriptionLinks;
    }

    public void setDescriptionLinks(List<String> descriptionLinks) {
        this.descriptionLinks = descriptionLinks;
    }

    public String getSubtitle() {
        return subtitle;
    }

    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getHash() {
        return hash;
    }

    public void setHash(String hash) {
        this.hash = hash;
    }

    public String getAudioUrl() {
        return audioUrl;
    }

    public void setAudioUrl(String audioUrl) {
        this.audioUrl = audioUrl;
    }

    public String getVideoUrl() {
        return videoUrl;
    }

    public void setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl;
    }

    public List<String> getTranscript() {
        return transcript;
    }

    public void setTranscript(List<String> transcript) {
        this.transcript = transcript;
    }

    public Integer getFileLength() {
        return fileLength;
    }

    public void setFileLength(Integer fileLength) {
        this.fileLength = fileLength;
    }

    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public PodcastEpisodeType getEpisodeType() {
        return episodeType;
    }

    public void setEpisodeType(PodcastEpisodeType episodeType) {
        this.episodeType = episodeType;
    }

    public Integer getSeasonNumber() {
        return seasonNumber;
    }

    public void setSeasonNumber(Integer seasonNumber) {
        this.seasonNumber = seasonNumber;
    }

    public Integer getEpisodeNumber() {
        return episodeNumber;
    }

    public void setEpisodeNumber(Integer episodeNumber) {
        this.episodeNumber = episodeNumber;
    }

    public String getWebsiteUrl() {
        return websiteUrl;
    }

    public void setWebsiteUrl(String websiteUrl) {
        this.websiteUrl = websiteUrl;
    }

    public Boolean getExplicitContent() {
        return isExplicitContent;
    }

    public void setExplicitContent(Boolean explicitContent) {
        isExplicitContent = explicitContent;
    }

    public PodcastSeriesDto getPodcastSeries() {
        return podcastSeries;
    }

    public void setPodcastSeries(PodcastSeriesDto podcastSeries) {
        this.podcastSeries = podcastSeries;
    }

    public List<PersonDto> getPersons() {
        return persons;
    }

    public void setPersons(List<PersonDto> persons) {
        this.persons = persons;
    }

    public List<String> getTranscriptsUrls() {
        return transcriptsUrls;
    }

    public void setTranscriptsUrls(List<String> transcriptsUrls) {
        this.transcriptsUrls = transcriptsUrls;
    }

    public List<TranscriptLinkDto> getTranscriptsUrlsWithDetails() {
        return transcriptsUrlsWithDetails;
    }

    public void setTranscriptsUrlsWithDetails(List<TranscriptLinkDto> transcriptsUrlsWithDetails) {
        this.transcriptsUrlsWithDetails = transcriptsUrlsWithDetails;
    }

    public List<TranscriptItemDto> getTranscriptWithSpeakersAndTimecodes() {
        return transcriptWithSpeakersAndTimecodes;
    }

    public void setTranscriptWithSpeakersAndTimecodes(List<TranscriptItemDto> transcriptWithSpeakersAndTimecodes) {
        this.transcriptWithSpeakersAndTimecodes = transcriptWithSpeakersAndTimecodes;
    }

    public List<ChapterDto> getChapters() {
        return chapters;
    }

    public void setChapters(List<ChapterDto> chapters) {
        this.chapters = chapters;
    }

    public List<ChapterLinkDto> getChaptersUrlsWithDetails() {
        return chaptersUrlsWithDetails;
    }

    public void setChaptersUrlsWithDetails(List<ChapterLinkDto> chaptersUrlsWithDetails) {
        this.chaptersUrlsWithDetails = chaptersUrlsWithDetails;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EpisodeDto that = (EpisodeDto) o;
        return Objects.equals(uuid, that.uuid) && Objects.equals(datePublished, that.datePublished) && Objects.equals(name, that.name) && Objects.equals(description, that.description) && Objects.equals(descriptionLinks, that.descriptionLinks) && Objects.equals(subtitle, that.subtitle) && Objects.equals(imageUrl, that.imageUrl) && Objects.equals(hash, that.hash) && Objects.equals(audioUrl, that.audioUrl) && Objects.equals(videoUrl, that.videoUrl) && Objects.equals(transcript, that.transcript) && Objects.equals(fileLength, that.fileLength) && Objects.equals(duration, that.duration) && episodeType == that.episodeType && Objects.equals(seasonNumber, that.seasonNumber) && Objects.equals(episodeNumber, that.episodeNumber) && Objects.equals(websiteUrl, that.websiteUrl) && Objects.equals(isExplicitContent, that.isExplicitContent) && Objects.equals(podcastSeries, that.podcastSeries) && Objects.equals(persons, that.persons) && Objects.equals(transcriptsUrls, that.transcriptsUrls) && Objects.equals(transcriptsUrlsWithDetails, that.transcriptsUrlsWithDetails) && Objects.equals(transcriptWithSpeakersAndTimecodes, that.transcriptWithSpeakersAndTimecodes) && Objects.equals(chapters, that.chapters) && Objects.equals(chaptersUrlsWithDetails, that.chaptersUrlsWithDetails);
    }

    @Override
    public int hashCode() {
        return Objects.hash(uuid, datePublished, name, description, descriptionLinks, subtitle, imageUrl, hash, audioUrl, videoUrl, transcript, fileLength, duration, episodeType, seasonNumber, episodeNumber, websiteUrl, isExplicitContent, podcastSeries, persons, transcriptsUrls, transcriptsUrlsWithDetails, transcriptWithSpeakersAndTimecodes, chapters, chaptersUrlsWithDetails);
    }

    @Override
    public String toString() {
        return "EpisodeDto{" +
                "uuid='" + uuid + '\'' +
                ", datePublished=" + datePublished +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", descriptionLinks=" + descriptionLinks +
                ", subtitle='" + subtitle + '\'' +
                ", imageUrl='" + imageUrl + '\'' +
                ", hash='" + hash + '\'' +
                ", audioUrl='" + audioUrl + '\'' +
                ", videoUrl='" + videoUrl + '\'' +
                ", transcript=" + transcript +
                ", fileLength=" + fileLength +
                ", duration=" + duration +
                ", episodeType=" + episodeType +
                ", seasonNumber=" + seasonNumber +
                ", episodeNumber=" + episodeNumber +
                ", websiteUrl='" + websiteUrl + '\'' +
                ", isExplicitContent=" + isExplicitContent +
                ", podcastSeries=" + podcastSeries +
                ", persons=" + persons +
                ", transcriptsUrls=" + transcriptsUrls +
                ", transcriptsUrlsWithDetails=" + transcriptsUrlsWithDetails +
                ", transcriptWithSpeakersAndTimecodes=" + transcriptWithSpeakersAndTimecodes +
                ", chapters=" + chapters +
                ", chaptersUrlsWithDetails=" + chaptersUrlsWithDetails +
                '}';
    }
}
