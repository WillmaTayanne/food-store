package br.edu.ifpb.padroes.service.payment;

public class PaymentPayPal implements PaymentStrategy {

	 @Override
	    public String pay() {
	        String order = "Compra finalizada no PayPal";
	        return order;
	    }
	
}


