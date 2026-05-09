package application;

import entities.Order;
import entitiesEnums.OrderStatus;

import java.util.Date;

public class Progam {
    public static void main(String[] args){

        Order order  = new Order(1080, new Date(), OrderStatus.DELIVERED);

        System.out.println(order);

        OrderStatus os1 = OrderStatus.DELIVERED;
        OrderStatus os2 = OrderStatus.valueOf("DELIVERED");//Verifica se existe esse valor nos status e retorna
        System.out.println(os1);
        System.out.println(os2);

    }
}
