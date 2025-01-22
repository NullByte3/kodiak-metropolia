package club.nullbyte3.kodiak.module2;

public class Television {
    private boolean isOn;
    private int channel;

    public Television() {
        isOn = false;
        channel = 1;
    }

    public void pressOnOff() {
        isOn = !isOn;
    }

    public boolean isOn() {
        return isOn;
    }

    public int getChannel() {
        return channel;
    }

    public void setChannel(int newChannel) {
        if (newChannel < 1) return;
        channel = (newChannel - 1) % 10 + 1;
    }
}
