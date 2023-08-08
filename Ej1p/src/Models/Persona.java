package Models;

public class Persona {
    private String name;
    private String surname;
    private int age;
    private int id;
    private Perro pet;

    public Persona() {
    }

    public Persona(String name, String surname, int age, int id, Perro pet) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.id = id;
        this.pet = pet;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public Perro getPet() {
        return pet;
    }
    public void setPet(Perro pet) {
        this.pet = pet;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", id=" + id +
                ", pet=" + pet.toString() +
                '}';
    }
}
