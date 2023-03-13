package bank;

public class Payment extends Transaction {
    /**
     * Dieses Attribut gibt die Zinsen bei einer Einzahlung an
     */
    private double incomingInterest = 0;

    /**
     * Dieses Attribut gibt die Zinsen bei einer Auszahlung an
     */
    private double outgoingInterest = 0;

    /**
     * @param date        Dieses Attribut soll den Zeitpunkt einer Überweisung darstellen. Das Datumsformat soll als DD.MM.YYYY angegeben werden
     * @param amount      Dieses Attribut soll die Geldmenge einer Überweisung darstellen
     * @param description Dieses Attribut erlaubt eine zusätzliche Beschreibung des Vorgangs.
     */
    public Payment(String date, double amount, String description) {
        super(date, amount, description);
    }

    /**
     * @param date             Dieses Attribut soll den Zeitpunkt einer Überweisung darstellen. Das Datumsformat soll als DD.MM.YYYY angegeben werden
     * @param amount           Dieses Attribut soll die Geldmenge einer Überweisung darstellen
     * @param description      Dieses Attribut erlaubt eine zusätzliche Beschreibung des Vorgangs.
     * @param incomingInterest Dieses Attribut gibt die Zinsen bei einer Einzahlung an
     * @param outgoingInterest Dieses Attribut gibt die Zinsen bei einer Auszahlung an
     */
    public Payment(String date, double amount, String description, double incomingInterest, double outgoingInterest) {
        this(date, amount, description);
        setIncomingInterest(incomingInterest);
        setOutgoingInterest(outgoingInterest);
    }

    /**
     * @param payment Objekt Copy Konstruktors
     */
    public Payment(Payment payment) {
        new Payment(payment.date, payment.amount, payment.description, payment.incomingInterest, payment.outgoingInterest);
    }

    /**
     * Gibt alle Werte der Klasse in der Console aus
     */
    @Override
    public String toString() {
        return getObjectAsString() + " incomingInterest: " + this.incomingInterest + " outgoingInterest: " + this.outgoingInterest;
    }


    /**
     * Bekomme die Zinsen die bei einer Einzahlung anfallen
     *
     * @return Zinsen
     */
    public double getIncomingInterest() {
        return incomingInterest;
    }

    /**
     * Setzte die Zinsen die bei einer Einzahlung anfallen
     *
     * @param incomingInterest Neue Einzahlung Zinsen
     */
    public void setIncomingInterest(double incomingInterest) {
        if (incomingInterest > 0 && incomingInterest < 1) {
            this.incomingInterest = incomingInterest;

        } else {
            System.out.println("Fehler: incomingInterest ist nicht zwichen 0 und 1");
        }
    }

    /**
     * Bekomme die Zinsen die bei einer Auszahlung anfallen
     *
     * @return Zinsen
     */
    public double getOutgoingInterest() {
        return outgoingInterest;
    }

    /**
     * Setzte die Zinsen die bei einer Auszahlung anfallen
     *
     * @param outgoingInterest Neue Auszahlung Zinsen
     */
    public void setOutgoingInterest(double outgoingInterest) {
        if (outgoingInterest > 0 && outgoingInterest < 1) {
            this.outgoingInterest = outgoingInterest;

        } else {
            System.out.println("Fehler: outgoingInterest ist nicht zwichen 0 und 1");
        }
    }

    /**
     * @return Gibt den an den Zinsen berechneten Wert zurück?
     */
    @Override
    public double calculate() {
        if (amount > 0) {
            // Einzahlung
            return amount - (amount * incomingInterest);
        } else {
            return amount + (amount * outgoingInterest);

        }
    }
    /**
     * @param payment Objekt mit dem Verglichen wird
     * @return Ob beide Objekt gleiche Werte besitzen
     */
    public boolean equals(Payment payment){
       return isEqualToComparedObject(payment) && payment.incomingInterest == incomingInterest && outgoingInterest == payment.outgoingInterest;
    }

}
