package com.company.devices;

public class BrandApplication extends Application {
    public static Brands supportedBrands;


    public BrandApplication(OS supportedOS, String name, String version, String author, double price,Brands supportedBrands,boolean paid) {
        super(supportedOS, name, version, author, price,paid);
        this.supportedBrands = supportedBrands;
    }
}

