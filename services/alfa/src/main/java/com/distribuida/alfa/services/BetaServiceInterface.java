package com.distribuida.alfa.services;

import io.github.resilience4j.bulkhead.annotation.Bulkhead;
import io.github.resilience4j.bulkhead.annotation.Bulkhead.Type;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import io.github.resilience4j.retry.annotation.Retry;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient("beta")
@CircuitBreaker(name = "beta")
@Retry(name = "beta")
@Bulkhead(name = "beta", type= Type.THREADPOOL)
public interface BetaServiceInterface {
    @RequestMapping(method = RequestMethod.GET, value = "/beta", consumes = "application/json")
    String getData();
}