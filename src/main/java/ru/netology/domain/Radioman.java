package ru.netology.domain;

public class Radioman {
    private int currentVolume;
    private int currentChannel;
    private int minVolume = 0;
    private int maxVolume = 10;
    private int minChannel = 0;
    private int maxChannel = 9;
    boolean on;

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < this.minVolume)
            return;
        if (currentVolume > this.maxVolume)
            return;
        this.currentVolume = currentVolume;
    }

    public void increaseCurrentVolume() {
        if (currentVolume == this.maxVolume)
            return;
        this.currentVolume ++;
    }

    public void decreaseCurrentVolume() {
        if (currentVolume == this.minVolume)
            return;
        this.currentVolume --;
    }

    public int getCurrentChannel() {
        return currentChannel;
    }

    public void setCurrentChannel(int currentChannel) {
        if (currentChannel < minChannel)
            return;
        if (currentChannel > maxChannel)
            return;
        this.currentChannel = currentChannel;
    }

    public void nextChannel() {
        if (currentChannel == this.maxChannel) {
            currentChannel = minChannel;
        }
        this.currentChannel++;
    }

    public void prevChannel() {
        if (currentChannel == this.minChannel) {
            currentChannel = maxChannel;
        }
        this.currentChannel--;
    }
    public int getMinVolume() {
        return minVolume;
    }

    public void setMinVolume(int minVolume) {
        this.minVolume = minVolume;
    }

    public int getMaxVolume() {
        return maxVolume;
    }

    public void setMaxVolume(int maxVolume) {
        this.maxVolume = maxVolume;
    }

    public int getMinChannel() {
        return minChannel;
    }

    public void setMinChannel(int minChannel) {
        this.minChannel = minChannel;
    }

    public int getMaxChannel() {
        return maxChannel;
    }

    public void setMaxChannel(int maxChannel) {
        this.maxChannel = maxChannel;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }
}
