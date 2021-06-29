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

        var application1 = new Application(OS.Android,"TalkApp","1.9.0","Elon Musk",200.0,true);
        var application2 = new Application(OS.Android,"Massanger","1.9.2","Melon Dusk",20.0,true);
        var application3 = new Application(OS.iOS,"Toolkit","2.8.0","Przemek Tytoń",200.0,true);
        var application4 = new Application(OS.Android,"NiceTimes","1.9.1","Elon Musk",0.0,false);
        var application5 = new Application(OS.Android,"Teams","1.8.1","Elon Musk",0.0,false);
        var application6 = new Application(OS.Android,"Skype","2.0.0","Gargamel Ochociński",200.0,true);
        var application7 = new Application(OS.iOS,"Facebook","1.9.0","Someone",2000.0,true);
        var application8 = new Application(OS.iOS,"Iphone Rip-off","2.9.0","Someone Else",200.0,true);
        var application9 = new Application(OS.iOS,"Something","1.7.0","Someone Else",200.0,true);
        var application10 = new Application(OS.iOS,"ThisApp","1.8.0","Someone Else",200.0,true);

        var application11 = new BrandApplication(OS.Android,"NotIphone","1.9.0","Elon Musk",200.0,Brands.Xiaomi,true);
        var application12 = new BrandApplication(OS.Android,"NotIphone","1.9.0","Elon Musk",200.0,Brands.Motorola,true);



        human.installApplication(application1);
        human2.installApplication(application2);
        human2.installApplication(application3);

        phone2.installBrandApplication(application11);
        phone.installBrandApplication(application12);








    }
}
