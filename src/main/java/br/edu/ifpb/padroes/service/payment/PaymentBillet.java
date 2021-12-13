package br.edu.ifpb.padroes.service.payment;

public class PaymentBillet implements PaymentStrategy {
	
	@Override
    public String pay() {
        String order = "Compra finalizada no Boleto";
        return order;
    }
	
}
