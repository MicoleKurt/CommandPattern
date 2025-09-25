package SoftEng;

public class Thermostat implements SmartDevice {
    private int temperature;
   private boolean isOn;
   private String deviceName;
    
    public Thermostat(String name) {
        this.deviceName = name;
     this.temperature = 22;
  this.isOn = false;
    }
    
   
    public void turnOn() {
    isOn = true;
   System.out.println(deviceName + " is turned ON, maintaining temperature at " + temperature + "°C");
    }
    
   
  public void turnOff() {
    isOn = false;
  System.out.println(deviceName + " is turned OFF");
    }
    
   
    public String getDeviceName() {
    return deviceName;
    }
    
    
    public String getStatus() {
  return deviceName + " - " + (isOn ? "ON (Temperature: " + temperature + "°C)" : "OFF");
    }
    
    public void setTemperature(int temperature) {
     if (isOn && temperature >= 16 && temperature <= 30) {
      this.temperature = temperature;
      System.out.println(deviceName + " temperature set to " + temperature + "°C");
        }
    }
    
  public int getTemperature() {
      return temperature;
    }
}
