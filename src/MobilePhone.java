public class MobilePhone {
    private String brand, model, color;
    private int storage, RAM, batteryCapacity;

    public MobilePhone(String brand, String model, String color, int storage, int RAM, int batteryCapacity) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.storage = storage;
        this.RAM = RAM;
        this.batteryCapacity = batteryCapacity;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getStorage() {
        return storage;
    }

    public void setStorage(int storage) {
        this.storage = storage;
    }

    public int getRAM() {
        return RAM;
    }

    public void setRAM(int RAM) {
        this.RAM = RAM;
    }

    public int getBatteryCapacity() {
        return batteryCapacity;
    }

    public void setBatteryCapacity(int batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    public static void main(String[] args) {
        MobilePhone samsungPhone = new MobilePhone("Samsung", "Galaxy S21", "Phantom Black", 128, 8, 4000);

        System.out.println("Бренд телефона: " + samsungPhone.getBrand());
        System.out.println("Модель телефона: " + samsungPhone.getModel());
        System.out.println("Цвет телефона: " + samsungPhone.getColor());
        System.out.println("Объем памяти телефона: " + samsungPhone.getStorage() + " ГБ");
        System.out.println("Оперативная память телефона: " + samsungPhone.getRAM() + " ГБ");
        System.out.println("Емкость батареи телефона: " + samsungPhone.getBatteryCapacity() + " мАч");

        samsungPhone.setColor("Phantom Silver");
        samsungPhone.setStorage(256);

        System.out.println("Новый цвет телефона: " + samsungPhone.getColor());
        System.out.println("Новый объем памяти телефона: " + samsungPhone.getStorage() + " ГБ");
    }
}