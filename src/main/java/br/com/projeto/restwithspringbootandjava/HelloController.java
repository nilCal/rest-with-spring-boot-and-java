package br.com.projeto.restwithspringbootandjava;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	private final AtomicLong counter = new AtomicLong();
	private static final String template = "Hello, %s!";

	@RequestMapping("/hello")
	public Hello hello(@RequestParam(value = "name", defaultValue = "world") String name) {
		return new Hello(counter.incrementAndGet(), String.format(template, name));
	}

}
