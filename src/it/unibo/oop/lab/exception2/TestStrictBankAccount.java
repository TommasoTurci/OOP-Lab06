package it.unibo.oop.lab.exception2;

import org.junit.Test;

/**
 * JUnit test to test
 * {@link StrictBankAccount}.
 * 
 */
public final class TestStrictBankAccount {

    /**
     * Used to test Exceptions on {@link StrictBankAccount}.
     */
    @Test
    public void testBankOperations() {
        /*
         * 1) Creare due StrictBankAccountImpl assegnati a due AccountHolder a
         * scelta, con ammontare iniziale pari a 10000 e nMaxATMTransactions=10
         * 
         * 2) Effetture un numero di operazioni a piacere per verificare che le
         * eccezioni create vengano lanciate soltanto quando opportuno, cioè in
         * presenza di un id utente errato, oppure al superamento del numero di
         * operazioni ATM gratuite.
         */
    	AccountHolder Tom = new AccountHolder("Tommaso", "Turci", 15);
    	StrictBankAccount TomAcc = new StrictBankAccount(15, 10000, 10);
    	AccountHolder Paso = new AccountHolder("Pietro", "Pasini", 13);
    	StrictBankAccount PasoAcc = new StrictBankAccount(13, 10000, 10);
    	
    	PasoAcc.deposit(13,1000);
    	PasoAcc.withdraw(13,12000);

    }
}
