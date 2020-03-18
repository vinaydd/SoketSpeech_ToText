package com.google.cloud.android.speech.model;

import java.io.Serializable;

public class ConfigModel implements Serializable {
    private String language_code;
    private boolean profanity_filter;
    private int sample_rate_hertz;
    private boolean word_confidence;
    private int alternative_languages;
    private String alternative_languages_code;

    public MetadataModel getMetadata() {
        return metadata;
    }

    public void setMetadata(MetadataModel metadata) {
        this.metadata = metadata;
    }

    private   MetadataModel metadata;

    public String getLanguage_code() {
        return language_code;
    }

    public void setLanguage_code(String language_code) {
        this.language_code = language_code;
    }

    public boolean isProfanity_filter() {
        return profanity_filter;
    }

    public void setProfanity_filter(boolean profanity_filter) {
        this.profanity_filter = profanity_filter;
    }

    public int getSample_rate_hertz() {
        return sample_rate_hertz;
    }

    public void setSample_rate_hertz(int sample_rate_hertz) {
        this.sample_rate_hertz = sample_rate_hertz;
    }

    public boolean isWord_confidence() {
        return word_confidence;
    }

    public void setWord_confidence(boolean word_confidence) {
        this.word_confidence = word_confidence;
    }

    public int getAlternative_languages() {
        return alternative_languages;
    }

    public void setAlternative_languages(int alternative_languages) {
        this.alternative_languages = alternative_languages;
    }

    public String getAlternative_languages_code() {
        return alternative_languages_code;
    }

    public void setAlternative_languages_code(String alternative_languages_code) {
        this.alternative_languages_code = alternative_languages_code;
    }



}
