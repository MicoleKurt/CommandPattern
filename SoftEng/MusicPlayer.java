package SoftEng;

public class MusicPlayer implements SmartDevice {
    private int volume;
    private boolean isPlaying;
    private String deviceName;
    
    public MusicPlayer(String name) {
     this.deviceName = name;
  this.volume = 30;
    this.isPlaying = false;
    }
    
    public void turnOn() {
        isPlaying = true;
        System.out.println(deviceName + " started playing music at volume " + volume);
    } 
    public void turnOff() {
        isPlaying = false;
        System.out.println(deviceName + " stopped playing music");
    }

    public String getDeviceName() {
        return deviceName;
    }
 
    public String getStatus() {
        return deviceName + " - " + (isPlaying ? "PLAYING (Volume: " + volume + ")" : "STOPPED");
    }
    public void setVolume(int volume) {
        if (volume >= 0 && volume <= 100) {
            this.volume = volume;
            System.out.println(deviceName + " volume set to " + volume);
        }
    }
    public int getVolume() {
        return volume;
    }
}
