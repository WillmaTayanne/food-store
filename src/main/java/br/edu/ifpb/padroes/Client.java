package br.edu.ifpb.padroes;

import br.edu.ifpb.padroes.domain.Order;
import br.edu.ifpb.padroes.service.order.OrderManager;
import br.edu.ifpb.padroes.service.payment.PaymentCrediCard;
import br.edu.ifpb.padroes.service.payment.PaymentStrategy;

public class Client {
    public static void main(String[] args) {

        Order order = new Order();
        OrderManager orderManager = new OrderManager(order);
       
        PaymentStrategy payment = orderManager.payOrder(new PaymentCrediCard());
        payment.pay();
        
    }
}
