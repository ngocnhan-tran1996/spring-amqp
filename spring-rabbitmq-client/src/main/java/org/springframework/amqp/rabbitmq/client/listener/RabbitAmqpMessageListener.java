/*
 * Copyright 2021-present the original author or authors.
 */

package org.springframework.amqp.rabbitmq.client.listener;

import com.rabbitmq.client.amqp.Consumer;
import com.rabbitmq.client.amqp.Message;
import org.jspecify.annotations.Nullable;

import org.springframework.amqp.core.MessageListener;

/**
 * A message listener that receives native AMQP 1.0 messages from RabbitMQ.
 *
 * @author Artem Bilan
 * @author Ngoc Nhan
 *
 * @since 4.0
 */
public interface RabbitAmqpMessageListener extends MessageListener {

	/**
	 * Process an AMQP message.
	 * @param message the message to process.
	 * @param context the consumer context to settle message.
	 *                {@code null} if container is configured for {@code autoSettle}.
	 * @param queueName the queue name to be consumed.
	 */
	void onAmqpMessage(Message message, Consumer.@Nullable Context context, String queueName);

}
