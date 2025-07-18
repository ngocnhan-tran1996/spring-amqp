/*
 * Copyright 2021-present the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.springframework.rabbit.stream.producer;

import java.util.function.BiConsumer;

import com.rabbitmq.stream.ProducerBuilder;

/**
 * Called to enable customization of the {@link ProducerBuilder} when a new producer is
 * created. The first parameter should be the bean name of the component that calls this
 * customizer. Refer to the RabbitMQ Stream Java Client for customization options.
 *
 * @author Gary Russell
 * @since 2.4
 *
 */
@FunctionalInterface
public interface ProducerCustomizer extends BiConsumer<String, ProducerBuilder> {
}
