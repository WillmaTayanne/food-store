package br.edu.ifpb.padroes.service.payment;

public class PaymentCrediCard implements PaymentStrategy {
	
	@Override
    public String pay() {
        String order = "Compra finalizada no Cartão de Credito";
        return order;
    }
	
	
}
