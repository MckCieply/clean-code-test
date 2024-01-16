package org.example;

public class Parcel {

    public Parcel(String sender, String code, double weight) {
        setSender(sender);
        setCode(code);
        setWeight(weight);
    }

    private String sender;
    private String code;
    private double weight;

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        if(sender == null || sender.isEmpty())
            throw new IllegalArgumentException("Sender cannot be null or empty");
        this.sender = sender;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        if(code == null || code.isEmpty())
            throw new IllegalArgumentException("Code cannot be null or empty");

        if(!code.matches("T[A-Za-z]{3}-[0-9]{4}"))
            throw new IllegalArgumentException("Code must be in format XXXX-0000");

        this.code = code;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
