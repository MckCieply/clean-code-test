package org.example;

import java.util.ArrayList;
import java.util.List;

public class ParcelLocker {

    private int lockerCapacity = 5;
    private List<Parcel> parcels = new ArrayList<Parcel>();
    private Printer printer;

    public void setPrinter(Printer printer) {
        this.printer = printer;
    }

    public void addParcel(Parcel parcel) {
        if (parcels.size() >= lockerCapacity)
            throw new IllegalArgumentException("Locker is full");
        parcels.add(parcel);
    }

    public void printParcels() {
        printer.print(parcels);
//        double totalWeight = 0;
//        for (Parcel parcel : parcels) {
//            System.out.println(parcel.getCode() + " " + parcel.getSender() + " " + parcel.getWeight());
//            totalWeight += parcel.getWeight();
//        }
//        System.out.println("Total weight: " + totalWeight);
    }
    public void removeParcels(){
        parcels.clear();
    }

    public void removeParcel(String code){
        for (Parcel parcel : parcels) {
            if(parcel.getCode().equals(code)){
                parcels.remove(parcel);
                return;
            }
        }
        throw new IllegalArgumentException("Parcel with code " + code + " not found");
    }

    public Parcel findParcel(String code){
        for (Parcel parcel : parcels) {
            if(parcel.getCode().equals(code)){
                return parcel;
            }
        }
        throw new IllegalArgumentException("Parcel with code " + code + " not found");
    }

    public int parcelsCount(){
        return parcels.size();
    }
}
