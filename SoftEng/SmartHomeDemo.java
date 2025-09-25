package SoftEng;
import java.util.Scanner;

public class SmartHomeDemo {
  public static void main(String[] args) {
 Scanner s = new Scanner(System.in);
    SmartHomeHub hub = new SmartHomeHub();
        
       
  Light livingRoomLight = new Light("Living Room Light");
        Light bedroomLight = new Light("Bedroom Light");
        Thermostat mainThermostat = new Thermostat("Main Thermostat");
  MusicPlayer soundSystem = new MusicPlayer("Sound System");
      
        hub.addDevice(livingRoomLight);
    hub.addDevice(bedroomLight);
  hub.addDevice(mainThermostat);
     hub.addDevice(soundSystem);
        
      System.out.println("");
        System.out.println("Welcome to the Smart Testing of Home Control Hub by Gonda, Micole Kurt T.");
        System.out.println("");
        while (true) {
      System.out.println("\nOptions:");
    System.out.println("1. List all devices");
      System.out.println("2. Turn ON device");
    System.out.println("3. Turn OFF device");
      System.out.println("4. Device settings");
     System.out.println("5. Exit");
     System.out.print("Choose option: ");
            
      int choice = s.nextInt();
            
            switch (choice) {
                case 1:
                    hub.listDevices();
                    break;
                    
                case 2:
                    hub.listDevices();
                    System.out.print("Select device number to turn ON: ");
                    int onIndex = s.nextInt() - 1;
                    SmartDevice onDevice = hub.getDevice(onIndex);
                    if (onDevice != null) {
                        Command turnOn = new TurnOnCommand(onDevice);
                        hub.executeCommand(turnOn);
                    } else {
                        System.out.println("Invalid device number!");
                    }
                    break;
                    
                case 3:
                    hub.listDevices();
                    System.out.print("Select device number to turn OFF: ");
                    int offIndex = s.nextInt() - 1;
                    SmartDevice offDevice = hub.getDevice(offIndex);
                    if (offDevice != null) {
                        Command turnOff = new TurnOffCommand(offDevice);
                        hub.executeCommand(turnOff);
                    } else {
                        System.out.println("Invalid device number!");
                    }
                    break;
                    
                case 4:
                    hub.listDevices();
                    System.out.print("Select device number for settings: ");
                    int settingsIndex = s.nextInt() - 1;
                    SmartDevice settingsDevice = hub.getDevice(settingsIndex);
                    if (settingsDevice != null) {
                        handleDeviceSettings(settingsDevice, s);
                    } else {
                        System.out.println("Invalid device number!");
                    }
                    break;
                    
                case 5:
                    System.out.println("Smart Home System shutting down. Goodbye!");
                    s.close();
                    return;
                    
                default:
                    System.out.println("Invalid option! Please choose 1-5.");
            }
        }
    }
    
    private static void handleDeviceSettings(SmartDevice device, Scanner s) {
        if (device instanceof Light) {
      Light light = (Light) device;
            System.out.print("Set brightness (0-100): ");
int brightness = s.nextInt();
            light.setBrightness(brightness);
        } else if (device instanceof Thermostat) {
            Thermostat thermostat = (Thermostat) device;
        System.out.print("Set temperature (16-30°C): ");
        int temperature = s.nextInt();
            thermostat.setTemperature(temperature);
        } else if (device instanceof MusicPlayer) {
            MusicPlayer player = (MusicPlayer) device;
            System.out.print("Set volume (0-100): ");
    int volume = s.nextInt();
            player.setVolume(volume);
        }
    }
}

