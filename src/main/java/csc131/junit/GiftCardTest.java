package csc131.junit;

import static org.junit.Assert.assertEquals;
import org.junit.rules.ExpectedException;
import org.junit.jupiter.api.Test;

class GiftCardTest {

	@Test
	public void getIssuintStore()
	{	double		balance;
		GiftCard	card;
		int			issuingStore;
		
		issuingStore = 1337;
		balance 	 = 100.00;
		card = new GiftCard(issuingStore, balance);
		
		assertEquals("getIssuingStore()", issuingStore,
					  card.getIssuingStore());
	}
	
	 @Test
	 public void getBalance()
	 {
		 double balance;
		 GiftCard card;
		 int issuingStore;

		 issuingStore = 1337;
		 balance = 100.00;
		 card = new GiftCard(issuingStore, balance);
		 
		 assertEquals("getBalance()",balance,
				 	   card.getBalance(), 0.001);
	 }
	 
	 @Test
	 public void deduct_RemainingBalance()
	 {
		 double balance;
		 GiftCard card;
		 int issuingStore;
		 String display;

		 issuingStore = 1337;
		 balance = 100.00;
		 card = new GiftCard(issuingStore, balance);

		 display = "Remaining Balance: " + String.format("%6.2f", 90.00);
		 System.out.println(display);
		 assertEquals("deduct()", display, card.deduct(10.00));
	 }

}

