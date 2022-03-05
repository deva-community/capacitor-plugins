package com.softwaredeva.plugins.camerapro;

public enum CameraProResultType {
    BASE64("base64"),
    URI("uri"),
    DATAURL("dataUrl");

    private String type;

    CameraProResultType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
