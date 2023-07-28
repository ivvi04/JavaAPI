package Lesson6.notebook;

public class NoteBook {
    private String model;
    private String cpu;
    private Integer ram;
    private Integer hdd;
    private String gpu;
    private Integer display;
    private String os;
    private String color;
    private Double price;

    public NoteBook(String model, String cpu, Integer ram, Integer hdd, String gpu, String os,
                    Integer display, String color, Double price) {
        this.model = model;
        this.cpu = cpu;
        this.ram = ram;
        this.hdd = hdd;
        this.gpu = gpu;
        this.display = display;
        this.os = os;
        this.color = color;
        this.price = price;
    }

    public NoteBook getNoteBook(){
        return new NoteBook(model, cpu, ram, hdd, gpu, os, display, color, price);
    }

    public String toString() {
        return String.format("model: %s, cpu: %s, ram: %d, hdd: %d, gpu: %s, display: %d, os: %s color: %s, price: %s руб.",
                this.model, this.cpu, this.ram, this.hdd, this.gpu, this.display, this.os, this.color, this.price);
    }
}
