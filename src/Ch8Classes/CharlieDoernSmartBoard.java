package Ch8Classes;

public class CharlieDoernSmartBoard {
    private boolean on;
    private boolean usingPen;
    private String penColor;
    private boolean usingEraser;
    private boolean speakersOn;
    private int speakerVolume;

    public CharlieDoernSmartBoard(boolean on, boolean usingPen, String penColor, boolean usingEraser, boolean speakersOn, int speakerVolume) {
        this.on = on;
        this.usingPen = usingPen;
        this.penColor = penColor;
        this.usingEraser = usingEraser;
        this.speakersOn = speakersOn;
        this.speakerVolume = speakerVolume;
    }

    public boolean isOn() {
        return on;
    }

    public boolean isUsingPen() {
        return usingPen;
    }

    public String getPenColor() {
        return penColor;
    }

    public boolean isUsingEraser() {
        return usingEraser;
    }

    public boolean isSpeakersOn() {
        return speakersOn;
    }

    public int getSpeakerVolume() {
        return speakerVolume;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public void setUsingPen(boolean usingPen) {
        this.usingPen = usingPen;
        this.usingEraser = false;
    }

    public void setPenColor(String penColor) {
        this.penColor = penColor;
    }

    public void setUsingEraser(boolean usingEraser) {
        this.usingPen = false;
        this.usingEraser = usingEraser;
    }

    public void setSpeakersOn(boolean speakersOn) {
        this.speakersOn = speakersOn;
    }

    public void setSpeakerVolume(int speakerVolume) {
        this.speakerVolume = speakerVolume;
    }
    @Override
    public String toString() {
        return "SmartBoard{" +
                "on=" + on +
                ", usingPen=" + usingPen +
                ", penColor='" + penColor + '\'' +
                ", usingEraser=" + usingEraser +
                ", speakersOn=" + speakersOn +
                ", speakerVolume=" + speakerVolume +
                '}';
    }
}