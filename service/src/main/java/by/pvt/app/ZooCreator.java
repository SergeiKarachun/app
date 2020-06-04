package by.pvt.app;

public class ZooCreator {
    public Zoo createNewZoo() {
        Zoo zoo = new Zoo();
        zoo.setName("Central");
        Dog sharik = new Dog();
        sharik.setAge(8);
        sharik.setName("Sharik");
        Cat vaska = new Cat();
        vaska.setAge(3);
        vaska.setName("Vaska");
        zoo.setCat(vaska);
        zoo.setDog(sharik);
        //zoo.getZoo().add(sharik);
        //zoo.getZoo().add(vaska);
        return zoo;
    }
}
