package com.company.devices;

public class BrandApplication extends Application {
    public static Brands supportedBrands;


    public BrandApplication(OS supportedOS, String name, String version, String author, double price,Brands supportedBrands) {
        super(supportedOS, name, version, author, price);
        this.supportedBrands = supportedBrands;
    }
}

