package mrsapi.packagee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public abstract class PaymentService {
	
	@Autowired
	private PaymentRepository paymentRepository;
	
	//final template method
	public final void templateMethods(Payment pay) {
		processPayment(pay);
		isPaymentValid(pay);
		processRefund(pay);
	}
	
	//Template methods
	protected abstract boolean processPayment(Payment pay);
	protected abstract boolean isPaymentValid(Payment pay);
	protected abstract boolean processRefund(Payment pay);
	
	//All other concrete methods goes here	
	//done
	public boolean checkAgreementResponse(String userAnswer) {
		if(userAnswer.toLowerCase() == "y")
			return true;
		else
			return false;
	}
	
	//done
	public boolean updatePaymentInDb(Payment pay) {
		try {
			paymentRepository.save(pay);
			return true;
		}
		catch (Exception e) {
			System.out.println("Error in adding Customer through Admin: " + e.getMessage());
			return false;
		}
	}
	
	public void customerMonthlyPayment(Payment payment) {
		/*
		 * make database connection.
		 * call processPayment() and isPaymentValid() methods from here
		 * update these values into the database
		 */
	}
}