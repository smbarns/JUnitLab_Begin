package csc131.junit;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;
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
		 String display = "Remaining Balance : 50.00";

		 issuingStore = 1337;
		 balance = 100.00;
		 card = new GiftCard(issuingStore, balance);

		 assertEquals("deduct()", display, card.deduct(50.00));
	 }
	 
	 @Test
	 public void deduct_Increase()
	 {
		 double balance;
		 GiftCard card;
		 int issuingStore;
		 String display = "Invalid Transaction"; 

		 issuingStore = 1337;
		 balance = 100.00;
		 card = new GiftCard(issuingStore, balance);

		 assertEquals("deduct()", display, card.deduct(-1));
	 }

	 @Test
	 public void deduct_NoChange()
	 {
		 double balance;
		 GiftCard card;
		 int issuingStore;
		 String display = "Amount Due: 10.00";

		 issuingStore = 1337;
		 balance = 100.00;
		 card = new GiftCard(issuingStore, balance);

		 assertEquals("deduct()", display, card.deduct(110));
	 }
	
	 @Test 
	 public void testExep()
	 {
		assertThrows(IllegalArgumentException.class, () -> {new GiftCard(1,-100.00);});
	 }
	 
	 @Test
	 public void constructor_IncorrectID()
	 {
		assertThrows(IllegalArgumentException.class, () -> {new GiftCard(-1,100.00);});
	 }
	 
	 @Test
	 public void constructor_IncorrectID_High()
	 {
		assertThrows(IllegalArgumentException.class, () -> {new GiftCard(10000,100.00);});
	 }
}

