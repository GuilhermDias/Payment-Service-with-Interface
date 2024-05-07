package services;

public interface OnlinePaymentService {

	public Double paymentFree(double amount);
	
	public Double interest(double amount, int months);
}
