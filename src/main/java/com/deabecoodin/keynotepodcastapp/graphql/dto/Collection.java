package com.deabecoodin.keynotepodcastapp.graphql.dto;


import com.deabecoodin.keynotepodcastapp.enums.CollectionGenreType;
import com.deabecoodin.keynotepodcastapp.enums.CollectionSocialType;

import java.util.UUID;
public interface Collection {
    UUID getId();
    String getTitle();
    String getSubtitle();
    CollectionGenreType getGenreType();
    CollectionSocialType getSocialStatus();

}
