package com.company;

import com.company.devices.*;

public class Main {

    public static void main(String[] args) {
        var phone = new Phone();
        phone.setOperatingSystem(OS.Android);
        phone.setBrand(Brands.Motorola);

        var phone2 = new Phone();
        phone2.setOperatingSystem(OS.iOS);


        var human = new Human();
        human.setDevice(phone);
        human.setCash(10000.0);

        var human2 = new Human();
        human2.setDevice(phone2);
        human2.setCash(20.0);

        var application1 = new Application(OS.Android,"NotIphone","1.9.0","Elon Musk",200.0);
        var application2 = new Application(OS.Android,"AndroidPhone","1.9.2","Melon Dusk",20.0);
        var application3 = new Application(OS.iOS,"Iphone 255","2.8.0","Przemek Tytoń",200.0);
        var application4 = new Application(OS.Android,"NotIphone2","1.9.1","Elon Musk",100.0);
        var application5 = new Application(OS.Android,"NotIphone","1.9.0","Elon Musk",200.0);
        var application6 = new Application(OS.Android,"NotIphone","1.9.0","Elon Musk",200.0);
        var application7 = new Application(OS.Android,"NotIphone","1.9.0","Elon Musk",200.0);
        var application8 = new Application(OS.Android,"NotIphone","1.9.0","Elon Musk",200.0);
        var application9 = new Application(OS.Android,"NotIphone","1.9.0","Elon Musk",200.0);
        var application10 = new Application(OS.Android,"NotIphone","1.9.0","Elon Musk",200.0);

        var application11 = new BrandApplication(OS.Android,"NotIphone","1.9.0","Elon Musk",200.0,Brands.Xiaomi);
        var application12 = new BrandApplication(OS.Android,"NotIphone","1.9.0","Elon Musk",200.0,Brands.Motorola);



        human.installApplication(application1);
        human2.installApplication(application2);
        human2.installApplication(application3);

        phone2.installBrandApplication(application11);
        phone.installBrandApplication(application12);








    }
}
