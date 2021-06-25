package com.company.devices;

public class Application {
    public OS SupportedOS;
    public String Name;
    public String Version;
    public String Author;
    public double Price;

    public Application(OS supportedOS, String name, String version, String author, double price) {
        SupportedOS = supportedOS;
        Name = name;
        Version = version;
        Author = author;
        Price = price;
    }

    public boolean paid(){
        if(Price>0)
            return true;
        return false;
    }
}
