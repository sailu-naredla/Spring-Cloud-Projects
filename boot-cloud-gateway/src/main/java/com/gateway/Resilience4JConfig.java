/**
 * 
 */
package com.gateway;

import java.time.Duration;

import org.springframework.cloud.circuitbreaker.resilience4j.ReactiveResilience4JCircuitBreakerFactory;
import org.springframework.cloud.circuitbreaker.resilience4j.Resilience4JConfigBuilder;
import org.springframework.cloud.client.circuitbreaker.Customizer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.github.resilience4j.circuitbreaker.CircuitBreakerConfig;
import io.github.resilience4j.circuitbreaker.CircuitBreakerRegistry;
import io.github.resilience4j.timelimiter.TimeLimiterConfig;
import io.github.resilience4j.timelimiter.TimeLimiterRegistry;

/**
 * @author snaredla
 *
 */
@Configuration
public class Resilience4JConfig {

	@Bean
	public Customizer<ReactiveResilience4JCircuitBreakerFactory> defaultCustomizer() {
	    return factory -> factory.configureDefault(id -> new Resilience4JConfigBuilder(id)
	            .circuitBreakerConfig(CircuitBreakerConfig.ofDefaults())
	            .timeLimiterConfig(TimeLimiterConfig.custom().timeoutDuration(Duration.ofSeconds(12)).build()).build());
	}
	
	/*
	 * @Bean public ReactiveResilience4JCircuitBreakerFactory
	 * reactiveResilience4JCircuitBreakerFactory(final CircuitBreakerRegistry
	 * circuitBreakerRegistry, final TimeLimiterRegistry timeLimiterRegistry) {
	 * ReactiveResilience4JCircuitBreakerFactory
	 * reactiveResilience4JCircuitBreakerFactory = new
	 * ReactiveResilience4JCircuitBreakerFactory();
	 * reactiveResilience4JCircuitBreakerFactory.configureCircuitBreakerRegistry(
	 * circuitBreakerRegistry);
	 * reactiveResilience4JCircuitBreakerFactory.configureDefault(id -> {
	 * CircuitBreakerConfig circuitBreakerConfig =
	 * circuitBreakerRegistry.find(id).isPresent() ?
	 * circuitBreakerRegistry.find(id).get().getCircuitBreakerConfig() :
	 * circuitBreakerRegistry.getDefaultConfig(); TimeLimiterConfig
	 * timeLimiterConfig = timeLimiterRegistry.find(id).isPresent() ?
	 * timeLimiterRegistry.find(id).get().getTimeLimiterConfig() :
	 * timeLimiterRegistry.getDefaultConfig();
	 * 
	 * return new Resilience4JConfigBuilder(id)
	 * .circuitBreakerConfig(circuitBreakerConfig)
	 * .timeLimiterConfig(timeLimiterConfig) .build(); }); return
	 * reactiveResilience4JCircuitBreakerFactory; }
	 */
}
