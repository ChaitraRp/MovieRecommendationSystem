package moviePackage;

public class PaymentService {
	public boolean isPaymentValid(Payment pay) {
		/*
		 * make database connection.
		 * if Payment goes through then it is termed as valid
		 * if payment was successful, return true, else return false
		 */
		return true;
	}
	
	public static boolean processPayment(Payment pay, String paymentDetails, Customer cust) {
		/*
		 * make database connection.
		 * take required values from payment class, and club it with paymentDetails 
		 * customer details can be fetched from customer class
		 * re-direct to payment channel chosen and expect a return successful/unsuccessful
		 * if payment is successful then return true, else return false
		 */
		return true;
	}
	
	public static boolean processRefund(Payment pay) {
		/*
		 * make database connection.
		 * in case the payment was unsuccessful for some reason and the user did not get the
		 * service but his amount was deducted, he needs to be refunded the amount
		 * fetch payment details from the database and refund the amount
		 * use paymentid for verifying which is the failed transaction
		 * if refund is successful, return true, else return false
		 */
		return true;
	}
	
	public void customerMonthlyPayment(Payment pay) {
		/*
		 * make database connection.
		 * call processPayment() and isPaymentValid() methods from here
		 * update these values into the database
		 */
	}
	
	public boolean updatePaymentInDb(Payment pay) {
		/*
		 * make database connection.
		 * take values from the Payment class and push them into database
		 * if update was successful, return true, else return false
		 */
		return true;
	}
}