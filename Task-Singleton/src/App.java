public class App {
    public static void main(String[] args) throws Exception {
        // System.out.println("Hello, World!");

        IPhoneSettings iphoneSett = IPhoneSettings.getInstence();

        iphoneSett.setBrightness(12);
        System.out.println("Brightness:" + "  " + iphoneSett.getBrightness());

        iphoneSett.getWifi();
        System.out.println("Wifi Status:" + "  " + iphoneSett.getWifi());

    }
}
