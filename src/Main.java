import bank.Payment;
import bank.Transfer;

public class Main {
    public static void main(String[] args) {
        Payment auszahlung = new Payment("01.01.2000", 10, "Einzahlung");
        Payment einzahlung = new Payment("01.01.2000", -10, "Einzahlung", 0.05,0.03);
        Payment copy = einzahlung;

        Transfer aNachB = new Transfer("01.01.2000", 10, "Einzahlung");
        Transfer bNachA = new Transfer("01.01.2000", 10, "Einzahlung", "b","a");
        Transfer copyTrans = bNachA;



        System.out.println(auszahlung.toString());
        System.out.println(einzahlung.toString());
        System.out.println(copy.toString());

        System.out.println(aNachB.toString());
        System.out.println(bNachA.toString());
        System.out.println(copyTrans.toString());

    }
}