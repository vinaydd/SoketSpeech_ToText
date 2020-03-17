package com.google.cloud.android.speech.model;

import java.io.Serializable;

public class MetadataModel implements Serializable {
    private String interactionType;
    private String microphoneDistance;
    private String recordingDeviceType;
    private String originalMediaType;

    public String getInteractionType() {
        return interactionType;
    }

    public void setInteractionType(String interactionType) {
        this.interactionType = interactionType;
    }

    public String getMicrophoneDistance() {
        return microphoneDistance;
    }

    public void setMicrophoneDistance(String microphoneDistance) {
        this.microphoneDistance = microphoneDistance;
    }

    public String getRecordingDeviceType() {
        return recordingDeviceType;
    }

    public void setRecordingDeviceType(String recordingDeviceType) {
        this.recordingDeviceType = recordingDeviceType;
    }

    public String getOriginalMediaType() {
        return originalMediaType;
    }

    public void setOriginalMediaType(String originalMediaType) {
        this.originalMediaType = originalMediaType;
    }






}
