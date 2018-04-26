package mrsapi.packagee;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Scanner;

@SpringBootApplication
@RestController
@RequestMapping("/PremiumController")
public class PaymentController {
	
	@RequestMapping(method=RequestMethod.POST, value="/buyPlan")
	public boolean buyPlan(Customer customer, int planID) {
		boolean isResponseValid;
		Payment pay = new Payment();
		
		isResponseValid= checkAgreementResponse();
		if(isResponseValid) {
			boolean isPaymentProcessed = processPayment(pay, customer); //from where does this pay come from?
			if(isPaymentProcessed)
				return true;
			else
				return false;
		}
		else {
			System.out.println("Agreement rejected. Cannot proceed further");
			return false;
		}
	}
	
	public boolean processPayment(Payment pay, Customer customer) {
		String paymentType = pay.getPaymentMethod();
		PaymentService.processPayment(pay, paymentType, customer);
		return false;
	}
	
	public void showPaymentSuccess() {
		//TODO
	}
	
	public void processRefund(Payment pay) {
		//TODO
	}
	
	public boolean checkAgreementResponse() {
		while(true) {
			Scanner scanner = new Scanner(System.in);
			System.out.print("I agree to the terms and conditions [y/n]: ");
			String userAnswer = scanner.nextLine();
			scanner.close();
			if(userAnswer.toLowerCase() == "y")
				return true;
			else if(userAnswer == "n")
				return false;
			else
				System.out.println("Invalid choice. Please enter y/n");
		}
	}
}