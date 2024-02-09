package basetask;

public class Souce {
    private String name;
    private String color;

    public Souce(String newName, String newColor) {
        this.name = newName;
        this.color = newColor;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void printSouceDetails() {
        System.out.println("Это соус " + name +  " " + color + " цвета");
    }
}
