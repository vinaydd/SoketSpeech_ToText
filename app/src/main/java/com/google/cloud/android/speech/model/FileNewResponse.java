package com.google.cloud.android.speech.model;

import java.io.PrintStream;
import java.io.Serializable;

public class FileNewResponse {

    public ConfigModel getRecognition_Config() {
        return Recognition_Config;
    }

    public void setRecognition_Config(ConfigModel recognition_Config) {
        Recognition_Config = recognition_Config;
    }

    private  ConfigModel  Recognition_Config;
}
