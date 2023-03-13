package bank;

import java.util.Objects;

public abstract class Transaction implements CalculateBill {
    /**
     * Dieses Attribut soll den Zeitpunkt einer Transaktion darstellen. Das Datumsformat soll als DD.MM.YYYY angegeben werden
     */
    protected String date = null;
    /**
     * Dieses Attribut soll die Geldmenge einer Transaktion darstellen
     */
    protected double amount = 0;

    /**
     * Dieses Attribut erlaubt eine zusätzliche Beschreibung des Vorgangs.
     */
    protected String description = null;

    public Transaction() {
    }

    public Transaction(String date, double amount, String description) {
        this.date = date;
        this.amount = amount;
        this.description = description;
    }


    /**
     * @return Gibt das Datum der Transaktion zurück
     */
    public String getDate() {
        return date;
    }

    /**
     * Setzt ein neues Datum für die Transaktion
     *
     * @param date Neues Datum
     */
    public void setDate(String date) {
        this.date = date;
    }


    /**
     * @return Gibt die Geldmenge der Transaktion zurück
     */
    public double getAmount() {
        return amount;
    }


    /**
     * Setzte die Geldmenge der Ein- oder Auszahlung
     *
     * @param amount Neue Geldmenge
     */
    public void setAmount(double amount) {
        this.amount = amount;
    }

    /**
     * @return Gibt die Beschreibung der Transaktion zurück
     */
    public String getDescription() {
        return description;
    }

    /**
     * Setzt eine neue Beschreibung
     *
     * @param description Neue Beschreibung
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return Gibt alle Werte der Methode als String zurück
     */
    protected String getObjectAsString() {
        return "Date: " + this.date + " Amount: " + calculate() + " Description: " + this.description;

    }

    /**
     * @return Gibt alle Wert der Methode als String zurück (Startmethode)
     */
    public String toString() {
        return getObjectAsString();
    }

    /**
     * @return Gibt alle Werte der Methode als String zurück
     */
    protected boolean isEqualToComparedObject(Transaction trans) {
        return (Objects.equals(date, trans.date) && amount == trans.amount && Objects.equals(description, trans.description));

    }

    /**
     * @param trans Objekt mit dem Verglichen wird
     * @return Ob beide Objekt gleiche Werte besitzen
     */
    public boolean equals(Transaction trans) {


        return isEqualToComparedObject(trans);
    }


}



