package br.edu.ifpb.padroes.service.payment;

public class PaymentService {

	  public void doPayment(PaymentStrategy payment) throws Exception {
	        payment.pay();
	    }
}
