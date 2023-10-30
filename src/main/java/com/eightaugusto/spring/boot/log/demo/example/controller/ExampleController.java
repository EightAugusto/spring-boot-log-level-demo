package com.eightaugusto.spring.boot.log.demo.example.controller;

import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Log4j2
@RestController
@RequestMapping("/v1/example")
public class ExampleController {

  @GetMapping
  public void getExample() {
    log.fatal("Fatal");
    log.error("Error");
    log.warn("Warn");
    log.info("Info");
    log.debug("Debug");
    log.trace("Trace");
  }
}
