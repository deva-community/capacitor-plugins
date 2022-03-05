package com.softwaredeva.plugins.camerapro;

public enum CameraProSource {
    PROMPT("PROMPT"),
    CAMERA("CAMERA"),
    PHOTOS("PHOTOS");

    private String source;

    CameraProSource(String source) {
        this.source = source;
    }

    public String getSource() {
        return this.source;
    }
}
