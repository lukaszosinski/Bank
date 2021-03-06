//package BankProduct;
//
//import Bank.Client;
//import BankOperation.BankOperationInterface;
//import BankOperation.BankOperationTransfer;
//import BankOperation.BankOperationWithdraw;
//import BankProduct.Decorators.BankProductAccountWithDebit;
//import Interest.Interest;
//import org.junit.jupiter.api.BeforeAll;
//import org.junit.jupiter.api.Test;
//
//import static org.junit.jupiter.api.Assertions.assertEquals;
//import static org.junit.jupiter.api.Assertions.assertNotNull;
//import static org.mockito.Mockito.*;
//
//public class BankProductAccountWithoutDebitTest {
//    BankOperationInterface operation;
//    static BankProductAccount account;
//    static Interest interest;
//    static Client client;
//
//    public void testFirstForExcerciseJunitAndMockito() {
//        interest = mock(Interest.InterestZero.class);
//        when(interest.calculateInterest(account)).thenReturn(30.0f);
//
//        assertNotNull(account);
//        assertEquals(2, 2);
//        // assertTrue(2 > 2);
//        float x = interest.calculateInterest(account);
//        assertEquals(x, 30.0f);
//    }
//
//
//    @BeforeAll
//    static void initAll() {
//        client = new Client("Lukasz", "Osinski");
//        interest = new Interest.InterestZero();
//        account = new BankProductAccountWithoutDebit(client, interest);
//    }
//
//    @Test
//    public void testWithdrawSimple () throws BankOperationInterface.DoubleExecutionException, BankProductAccountWithDebit.NotEnoughMoneyException {
//        account.setBalance(100.0f);
//        operation = new BankOperationWithdraw(account, 30.0f);
//        operation.execute();
//        assertEquals(account.getBalance(), 70.0f);
//    }
//
//
//    @Test
//    public void testTransferSimple() throws BankOperationInterface.DoubleExecutionException, BankProductAccountWithDebit.NotEnoughMoneyException {
//        account.setBalance(50.0f);
//        BankProductAccount destination = new BankProductAccountWithoutDebit(new Client("Mateusz", "Lewandowski"), interest);
//        operation = new BankOperationTransfer(account, destination.getNumber(), 30.0f);
//        operation.execute();
//        assertEquals(30.0f, destination.getBalance());
//        assertEquals(20.0f, account.getBalance());
//    }
//}
