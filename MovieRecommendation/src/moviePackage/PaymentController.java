package moviePackage;

public class PaymentController {
	protected int paymentID;
	protected double amount;
	
	public void setPaymentID(int payID) {
		this.paymentID = payID;
	}
	
	public void setAmount(double amt) {
		this.amount = amt;
	}
	
	public boolean buyPlan(Customer cust, int planID) {
		//TODO
		return true;
	}
	
	public void processPayment(Payment pay, String paymentDetails, Customer cust) {
		PaymentService.processPayment(pay, paymentDetails, cust);
	}
	
	public void showPaymentSuccess() {
		//TODO
	}
	
	public void processRefund(Payment pay) {
		PaymentService.processRefund(pay);
	}
	
	public boolean checkAgreementResponse() {
		//TODO
		return true;
	}
}