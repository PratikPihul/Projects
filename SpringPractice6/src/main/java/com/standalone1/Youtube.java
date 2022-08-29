package com.standalone1;

import java.util.List;

public class Youtube {
     private List<String> youtubeChannels;

    public List<String> getYoutubeChannels() {
        return youtubeChannels;
    }

    public void setYoutubeChannels(List<String> youtubeChannels) {
        this.youtubeChannels = youtubeChannels;
    }

    @Override
    public String toString() {
        return "Youtube{" +
                "youtubeChannels=" + youtubeChannels +
                '}';
    }
}
