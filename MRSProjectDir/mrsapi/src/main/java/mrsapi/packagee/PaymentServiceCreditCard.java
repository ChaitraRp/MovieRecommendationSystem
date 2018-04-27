package mrsapi.packagee;

import org.springframework.stereotype.Service;

@Service
public class PaymentServiceCreditCard extends PaymentService{
	//done
	@Override
	protected boolean processPayment(Payment pay) {
		if(isPaymentValid(pay))
			return true;
		else
			return false;
	}

	//done
	@Override
	protected boolean isPaymentValid(Payment pay) {
		//paymentDetails[] = "Discover-Chaitra Ramachandra-6000700080009000-123-12-2021"
		String paymentDetails[] = pay.getPaymentDetails().split("-");
		String creditCardType = paymentDetails[0];
		String cardHolderName = paymentDetails[1];
		long cardNumber = Long.valueOf(paymentDetails[2]);
		int cvv = Integer.valueOf(paymentDetails[3]);
		int cardMonth = Integer.valueOf(paymentDetails[4]);
		int cardYear = Integer.valueOf(paymentDetails[5]);
		double amount = pay.getAmount();
		
		//test card values hard coded
		String testCardType = "Discover";
		String testName = "Chaitra Ramachandra";
		long testCardNumber = 6000700080009000L;
		int testCvv = 123;
		int testCardMonth = 12;
		int testCardYear = 2021;
		double testAmount = 99.99;
		
		//check for validity
		if(creditCardType.equals(testCardType) && cardHolderName.equals(testName) && cardNumber == testCardNumber 
				&& cvv == testCvv && cardMonth == testCardMonth && cardYear == testCardYear && amount == testAmount) {
			return true;
		}
		else
			return false;
	}

	@Override
	protected boolean processRefund(Payment pay) {
		// TODO Auto-generated method stub
		return false;
	}	
}
