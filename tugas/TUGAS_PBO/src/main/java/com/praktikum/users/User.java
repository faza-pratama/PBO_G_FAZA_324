package main.java.com.praktikum.users;

public abstract class User {
    protected String name;
    public User(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
}