package com.distribuida.alfa.services;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient("beta")
public interface BetaServiceInterface {
    @RequestMapping(method = RequestMethod.GET, value = "/beta", consumes = "application/json")
    String getData();
}