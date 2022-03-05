package com.softwaredeva.plugins.camerapro;

public enum CameraProVideoSource {
    PROMPT("PROMPT"),
    CAMERA("CAMERA"),
    LIBRARY("LIBRARY");

    private String source;

    CameraProVideoSource(String source) {
        this.source = source;
    }

    public String getSource() {
        return this.source;
    }
}
