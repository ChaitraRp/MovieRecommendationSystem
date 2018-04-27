package mrsapi.packagee;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Payment {
	
	@Id
	private String customerId;
	private String paymentId;
    private String paymentMethod;
    private String paymentDetails;
    private Date dateOfTransaction;
    private double amount;
    
    public Payment(String customerId, String paymentId, String paymentMethod, String paymentDetails,
			Date dateOfTransaction, double amount) {
		super();
		this.customerId = customerId;
		this.paymentId = paymentId;
		this.paymentMethod = paymentMethod;
		this.paymentDetails = paymentDetails;
		this.dateOfTransaction = dateOfTransaction;
		this.amount = amount;
	}
    
	public Payment() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getCustomerId() {
		return customerId;
	}
	
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
	
	public String getPaymentId() {
		return paymentId;
	}
	
	public void setPaymentId(String paymentId) {
		this.paymentId = paymentId;
	}
	
	public String getPaymentMethod() {
		return paymentMethod;
	}
	
	public void setPaymentMethod(String paymentMethod) {
		this.paymentMethod = paymentMethod;
	}
	
	public String getPaymentDetails() {
		return paymentDetails;
	}
	
	public void setPaymentDetails(String paymentDetails) {
		this.paymentDetails = paymentDetails;
	}
	
	public Date getDateOfTransaction() {
		return dateOfTransaction;
	}
	
	public void setDateOfTransaction(Date dateOfTransaction) {
		this.dateOfTransaction = dateOfTransaction;
	}
	
	public double getAmount() {
		return amount;
	}
	
	public void setAmount(double amount) {
		this.amount = amount;
	}
}
