package br.edu.ifpb.padroes.service.payment;

public class PaymentDebit implements PaymentStrategy {

	@Override
    public String pay() {
        String order = "Compra finalizada no Cart�o de D�bito";
        return order;
    }
	
}
