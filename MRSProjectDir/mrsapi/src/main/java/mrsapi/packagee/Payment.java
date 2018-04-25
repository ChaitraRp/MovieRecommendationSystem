package mrsapi.packagee;

import java.util.Date;

public class Payment {
    private String paymentId;
    private String customerId;
    private String paymentMethod;
    private Date dateOfTransaction;
    private double amount;
    
    public String getPaymentId(){
        return paymentId;
    }
    
    public void setPaymentId(String paymentId){
        this.paymentId = paymentId;
    }
    
    public String getCustomerId(){
        return customerId;
    }
    
    public void setCustomerId(String customerId){
        this.customerId = customerId;
    }
    
    public String getPaymentMethod(){
        return paymentMethod;
    }
    
    public void setPaymentMethod(String paymentMethod){
        this.paymentMethod = paymentMethod;
    } 
    
    public Date getDateOfTransaction(){
        return dateOfTransaction;
    }
    
    public void setRating(Date dateOfTransaction){
        this.dateOfTransaction = dateOfTransaction;
    }
    
    public double getAmount(){
        return amount;
    }
    
    public void setAmount(double amount){
        this.amount = amount;
    }
}
