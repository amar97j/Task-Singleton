public class IPhoneSettings {
    private static IPhoneSettings instance; // Create a static instance
    private int brightness;
    private boolean wifiOn = true;

    private IPhoneSettings() {
        // Private constructor

    }

    public static IPhoneSettings getInstence() {
        if (instance == null) {
            instance = new IPhoneSettings();

        }
        return instance;

    } // Provide a public Static Method for accessing the instance

    public void setBrightness(int brightness) {
        this.brightness = brightness;
    }

    public int getBrightness() {
        return brightness;
    }

    public void setWifi(boolean wifiOn) {
        this.wifiOn = wifiOn;

    }

    public boolean getWifi() {
        return wifiOn;
    }

}
