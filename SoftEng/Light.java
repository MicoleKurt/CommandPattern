package SoftEng;

public class Light implements SmartDevice {
    private int brightness;
   private boolean isOn;
  private String deviceName;
    
    public Light(String name) {
      this.deviceName = name;
       this.brightness = 50;
     this.isOn = false;
    }
    
   
    public void turnOn() {
       isOn = true;
      brightness = 80;
     System.out.println(deviceName + " is turned ON with brightness " + brightness + "%");
    }
    
    
    public void turnOff() {
        isOn = false;
   brightness = 0;
       System.out.println(deviceName + " is turned OFF");
    }
    
  
    public String getDeviceName() {
     return deviceName;
    }
    
    
    public String getStatus() {
      return deviceName + " - " + (isOn ? "ON (Brightness: " + brightness + "%)" : "OFF");
    }
    
    public void setBrightness(int brightness) {
     if (isOn && brightness >= 0 && brightness <= 100) {
         this.brightness = brightness;
       System.out.println(deviceName + " brightness set to " + brightness + "%");
        }
    }
    
    public int getBrightness() {
       return brightness;
    }
}
