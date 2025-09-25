package SoftEng;
import java.util.*;

public class SmartHomeHub {
    private List<SmartDevice> devices;
    
    public SmartHomeHub() {
        devices = new ArrayList<>();
    }
    
    public void addDevice(SmartDevice device) {
        devices.add(device);
        System.out.println("Device added: " + device.getDeviceName());
    }
    
    public void executeCommand(Command command) {
        command.execute();
    }
    
    public void listDevices() {
        System.out.println("\n=== Connected Devices ===");
        for (int i = 0; i < devices.size(); i++) {
            System.out.println((i + 1) + ". " + devices.get(i).getStatus());
        }
        System.out.println("========================");
    }
    
    public SmartDevice getDevice(int index) {
        if (index >= 0 && index < devices.size()) {
            return devices.get(index);
        }
        return null;
    }
    
    public int getDeviceCount() {
        return devices.size();
    }
}
