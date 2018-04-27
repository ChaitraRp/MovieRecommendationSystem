package mrsapi.packagee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/PremiumController")
public class PaymentController {
	@Autowired
	private PaymentService paymentService;
	
	//done
	@RequestMapping(method=RequestMethod.POST, value="/updateToPremium/{userAnswer}")
	public String buyPlan(@RequestBody Customer customer, @PathVariable String userAnswer) {
		boolean isResponseValid = paymentService.checkAgreementResponse(userAnswer);
		if(isResponseValid)
			return "Agreement Accepted";
		else
			return "You need to accept the agreement to proceed";
	}
	
	//done here
	@RequestMapping(method=RequestMethod.POST, value="/buyPlan/processPayment")
	public void processPayment(@RequestBody Payment payment) {
		boolean isPaymentProcessed = paymentService.checkPaymentType(payment);
		if(isPaymentProcessed)
			this.showPaymentSuccess();
	}
	
	//done
	public String showPaymentSuccess() {
		return "Payment is successful";
	}
	
	public void processRefund(Payment pay) {
		//TODO
	}
}