package org.example;
public class MainApp
{
    public static void main( String[] args )
    {
        Parcel first = new Parcel("John", "TXXX-0000", 1.5);
        Parcel second = new Parcel("Jack", "TXXX-0000", 2.5);
        Parcel third = new Parcel("Jane", "TXXX-6969", 3.5);
        Parcel fourth = new Parcel("Jill", "TXXX-6969", 4.5);
        Parcel fifth = new Parcel("Jill", "TXXX-6969", 4.5);
        Parcel sixth = new Parcel("Jill", "TXXX-6969", 4.5);

        ParcelLocker parcelLocker = new ParcelLocker();
        Printer printer = new Printer();
        parcelLocker.setPrinter(printer);
        parcelLocker.addParcel(first);
        parcelLocker.addParcel(second);
        parcelLocker.addParcel(third);
        parcelLocker.addParcel(fourth);
        parcelLocker.addParcel(fifth);
        parcelLocker.addParcel(sixth);
        parcelLocker.printParcels();
        System.out.println("Remove parcel");
        parcelLocker.removeParcel("TXXX-0000");
        parcelLocker.printParcels();
        System.out.println("Find parcel");
        Parcel foundParcel = parcelLocker.findParcel("TXXX-6969");
        System.out.println(foundParcel.getCode() + " " + foundParcel.getSender() + " " + foundParcel.getWeight());
        System.out.println(parcelLocker.parcelsCount());
        System.out.println("Remove all parcels");
        parcelLocker.removeParcels();
        parcelLocker.printParcels();

    }
}
