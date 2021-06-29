package com.company.devices;

public class Application {
    public OS SupportedOS;
    public String Name;
    public String Version;
    public String Author;
    public double Price;
    public boolean Paid;

    public Application(OS supportedOS, String name, String version, String author, double price,boolean paid) {
        SupportedOS = supportedOS;
        Name = name;
        Version = version;
        Author = author;
        Price = price;
        Paid = paid;
    }
}


   /* public boolean paid(){
        if(Price>0) {
            System.out.println("application is paid");
            return true;
        }
        System.out.println("application is not paid");
        return false;
    }
}*/
