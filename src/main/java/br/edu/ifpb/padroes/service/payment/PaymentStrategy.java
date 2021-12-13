package br.edu.ifpb.padroes.service.payment;

// Padrão Strategy

public interface PaymentStrategy  {
	
	default String pay(){
        return "";
    }
	
}
