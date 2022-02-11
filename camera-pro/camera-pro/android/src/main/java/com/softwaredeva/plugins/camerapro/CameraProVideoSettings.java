package com.softwaredeva.plugins.camerapro;

public class CameraProVideoSettings {

    public static final boolean DEFAULT_QUALITY = false;
    public static final boolean DEFAULT_SAVE_VIDEO_TO_GALLERY = false;
    public static final int DEFAULT_DURATION = 0;

    private boolean highquality = DEFAULT_QUALITY;
    private boolean saveToGallery = DEFAULT_SAVE_VIDEO_TO_GALLERY;
    private CameraProSource source = CameraProSource.PROMPT;
    private int duration = DEFAULT_DURATION;

    public boolean getHighquality() {
        return highquality;
    }

    public void setHighquality(boolean highquality) {
        this.highquality = highquality;
    }

    public boolean isSaveToGallery() {
        return saveToGallery;
    }

    public void setSaveToGallery(boolean saveToGallery) {
        this.saveToGallery = saveToGallery;
    }

    public CameraProSource getSource() {
        return source;
    }

    public void setSource(CameraProSource source) {
        this.source = source;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }
}
