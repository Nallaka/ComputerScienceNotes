package me.nallaka.OOPDemo.CellphoneDemo;

public class Cellphone {
    //Provider brand, storage, wireless charging
    String provider;
    String brand;
    int storage;
    boolean wirelessCharging;

    public String getProvider() {
        return provider;
    }

    public void setProvider(String provider) {
        this.provider = provider;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getStorage() {
        return storage;
    }

    public void setStorage(int storage) {
        this.storage = storage;
    }

    public boolean isWirelessCharging() {
        return wirelessCharging;
    }

    public void setWirelessCharging(boolean wirelessCharging) {
        this.wirelessCharging = wirelessCharging;
    }

    public static void main(String[] args) {
        Cellphone cellphoneOne = new Cellphone();
        cellphoneOne.toString();
    }
}
