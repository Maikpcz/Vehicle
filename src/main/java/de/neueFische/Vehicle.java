package de.neueFische;

public abstract class  Vehicle implements Accelerateble{

    private String id ;
    private String Name;
    private int velocity;

    @Override
    public String toString() {
        return "Vehicle{" +
                "id='" + id + '\'' +
                ", Name='" + Name + '\'' +
                ", velocity=" + velocity +
                '}';
    }

    public Vehicle() {
    }

    public Vehicle(String id, String name, int velocity) {
        this.id = id;
        Name = name;
        this.velocity = velocity;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getVelocity() {
        return velocity;
    }

    public void setVelocity(int velocity) {
        this.velocity = velocity;
    }
}
