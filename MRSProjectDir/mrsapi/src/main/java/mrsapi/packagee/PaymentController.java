package mrsapi.packagee;

import org.springframework.web.bind.annotation.RestController;

@RestController("/PaymentController")
public class PaymentController {
	public Boolean buyPlan(Customer customer, int planID) {
		//TODO
		return null;
	}
	
	public void processPayment(Payment pay, String paymentDetails, Customer cust) {
		//TODO
	}
	
	public void showPaymentSuccess() {
		//TODO
	}
	
	public void processRefund(Payment pay) {
		//TODO
	}
	
	public Boolean checkAgreementResponse() {
		//TODO
		return null;
	}
}