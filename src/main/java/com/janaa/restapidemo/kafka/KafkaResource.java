package com.janaa.restapidemo.kafka;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KafkaResource {

	@Autowired
	private KafkaDaoService dao;

	@GetMapping("/details")
	public List<KafkaDetails> getAll() {
		return dao.getAll();
	}

	@GetMapping("/details/{id}")
	public KafkaDetails getOne(@PathVariable Integer id) {
		KafkaDetails detail = dao.getOne(id);
		if (detail == null)
			throw new UserDefinedExceptionKafka(id + " not found......");
		return detail;
	}
}
