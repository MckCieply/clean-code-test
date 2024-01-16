package org.example;

import java.util.List;

public class Printer implements ParcelLockerPrinter {

    @Override
    public void print(List<Parcel> parcels) {
        for (Parcel parcel : parcels)
            System.out.println(parcel.getCode() + " " + parcel.getSender() + " " + parcel.getWeight());
    }
}
