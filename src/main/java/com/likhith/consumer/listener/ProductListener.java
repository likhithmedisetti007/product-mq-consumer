package com.likhith.consumer.listener;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class ProductListener {

	@RabbitListener(queues = "productQueue")
	public void receiveSelectedProduct(String message) {
		System.out.println("Selected Product: " + message);
	}

}