import org.junit.Assert;
import org.junit.Test;

public class AccountTest {
    private double epsilon = 1e-6;


    @Test
    public void testDepositWithNegativeNumber() {
        Account account = new Account(100);
        boolean result = account.deposit(-50);
        Assert.assertFalse(result);
        Assert.assertEquals(0, account.getBalance(), epsilon);
    }

    @Test
    public void testWithdrawWithNegativeNumber() {
        Account account = new Account(100);
        account.deposit(50);
        boolean result = account.withdraw(-50);
        Assert.assertFalse(result);
        Assert.assertEquals(50, account.getBalance(), epsilon);
    }

    @Test
    public void testOverdraftLimit() {
        Account account = new Account(100);
        account.deposit(50);
        boolean result = account.withdraw(151);
        Assert.assertFalse(result);
        Assert.assertEquals(50, account.getBalance(), epsilon);
    }

    @Test
    public void testCorrectDepositAmount() {
        Account account = new Account(100);
        boolean result = account.deposit(50);
        Assert.assertTrue(result);
        Assert.assertEquals(50, account.getBalance(), epsilon);
    }

    @Test
    public void testCorrectWithdrawAmount() {
        Account account = new Account(100);
        account.deposit(50);
        boolean result = account.withdraw(25);
        Assert.assertTrue(result);
        Assert.assertEquals(25, account.getBalance(), epsilon);
    }
}