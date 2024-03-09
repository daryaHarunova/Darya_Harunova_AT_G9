package homework.day8.classes;

import java.util.Objects;

public class Sand {
    private int mass;
    private String name;

    public Sand (int mass, String name){
        this.mass = mass;
        this.name = name;
    }

    public int getMass(){
        return mass;
    }
    public String getName(){
        return name;
    }

    public void setMass(int mass){
        this.mass=mass;
    }
    public void setName(String name){
        this.name=name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Sand sand = (Sand) o;
        return mass == sand.mass && Objects.equals(name, sand.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(mass, name);
    }

    @Override
    public String toString() {
        return "Sand{" +
                "mass=" + mass +
                ", name='" + name + '\'' +
                '}';
    }
}

