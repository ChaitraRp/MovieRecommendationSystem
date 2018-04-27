package mrsapi.packagee;

import org.springframework.stereotype.Service;

@Service
public class PaymentServicePaypal extends PaymentService {
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
		//paymentDetails[] = "chaitra-1234"
		String paymentDetails[] = pay.getPaymentDetails().split("-");
		String username = paymentDetails[0];
		String password = paymentDetails[1];
		double amount = pay.getAmount();
		
		//test card values hard coded
		String testUN = "chaitra";
		String testPwd = "1234";
		double testAmount = 99.99;
		
		//check for validity
		if(username.equals(testUN) && password.equals(testPwd) && amount == testAmount) {
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
