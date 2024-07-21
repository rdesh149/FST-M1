import org.junit.jupiter.api.AssertionsKt;
import org.junit.jupiter.api.Test;
//import static org.junit.jupiter.api.Assertions.assertThrows;
//import static org.junit.jupiter.api.AssertionsKt.*;
import static org.junit.jupiter.api.Assertions.*;

public class Activity2 {

    @Test
    void notEnoughFunds(){
        BankAccount bankaccount = new BankAccount(9);
        assertThrows(NotEnoughFundsException.class, () -> bankaccount.withdraw(10));
    }

    @Test
    void enoughFunds(){
        BankAccount bankaccount = new BankAccount(100);
        assertDoesNotThrow(() -> bankaccount.withdraw(20));
    }
}