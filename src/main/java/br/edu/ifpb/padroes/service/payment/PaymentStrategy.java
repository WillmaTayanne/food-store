package br.edu.ifpb.padroes.service.payment;

// Padr�o Strategy

public interface PaymentStrategy  {
	
	default String pay(){
        return "";
    }
	
}
