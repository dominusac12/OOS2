package bank;

import java.util.Objects;

public class Transfer extends Transaction{

    /**
     * Dieses Attribut gibt an, wer der Sender ist.
     */
    private String sender = null;

    /**
     * Dieses Attribut gibt an, wer der Empfänger ist.
     */
    private String recipient = null;

    /**
     * @param date Dieses Attribut soll den Zeitpunkt einer Überweisung darstellen. Das Datumsformat soll als DD.MM.YYYY angegeben werden
     * @param amount Dieses Attribut soll die Geldmenge einer Überweisung darstellen
     * @param description Dieses Attribut erlaubt eine zusätzliche Beschreibung des Vorgangs.
     */
    public Transfer(String date, double amount, String description){

        this.date = date;
        setAmount(amount);
        this.description = description;
    }

    /**
     * @param date Dieses Attribut soll den Zeitpunkt einer Überweisung darstellen. Das Datumsformat soll als DD.MM.YYYY angegeben werden
     * @param amount Dieses Attribut soll die Geldmenge einer Überweisung darstellen
     * @param description Dieses Attribut erlaubt eine zusätzliche Beschreibung des Vorgangs.
     * @param sender  Dieses Attribut gibt an, wer der Sender ist.
     * @param recipient Dieses Attribut gibt an, wer der Empfänger ist.
     */
    public Transfer(String date, double amount, String description, String sender, String recipient){
        this(date, amount, description);
        this.sender = sender;
        this.recipient = recipient;
    }

    /**
     * @param trans Objekt des Copy Konstruktors
     */
    public Transfer(Transfer trans){
        new Transfer(trans.date, trans.amount, trans.description, trans.sender, trans.recipient);
    }

    /**
     * Gibt alle Werte der Klasse in der Console aus
     */
    @Override
    public String toString() {
        return getObjectAsString() + " recipient: " + this.recipient + " sender: " + this.sender;
    }


    /**
     * Setzt eine neue Geldmenge
     * @param amount Neue Geldmenge (muss größer Null sein)
     */
    @Override
    public void setAmount(double amount) {
        if(amount > 0){
            this.amount = amount;

        }else{
            System.out.println("Fehler: Amount ist nicht größer 0");
        }
    }

    /**
     * @return Gibt den Sender der Transaktion zurück
     */
    public String getSender() {
        return sender;
    }

    /**
     * Setzt einen neuen Sender für die Transaktion
     * @param sender Neue Sender
     */
    public void setSender(String sender) {
        this.sender = sender;
    }

    /**
     * @return Gibt den Empfänger der Transaktion zurück
     */
    public String getRecipient() {
        return recipient;
    }

    /**
     * Setzt einen neuen Empfänger
     * @param recipient Neue Empfänger
     */
    public void setRecipient(String recipient) {
        this.recipient = recipient;
    }

    /**
     * @return Gibt den an den Zinsen berechneten Wert zurück?
     */
    @Override
    public double calculate() {
        return amount;
    }


    /**
     * @param transfer Objekt mit dem Verglichen wird
     * @return Ob beide Objekt gleiche Werte besitzen
     */
    public boolean equals(Transfer transfer){
        System.out.println("as");
        return isEqualToComparedObject(transfer) && Objects.equals(transfer.sender, sender) && Objects.equals(transfer.recipient, recipient);
    }
}

