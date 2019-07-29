package com.janaa.restapidemo.kafka;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class KafkaDaoService {

	private static List<KafkaDetails> kafkaDetailsList = new ArrayList<>();
	private int count = 3;

	static {
		kafkaDetailsList.add(new KafkaDetails(1, "broker1.com", "topic1"));
		kafkaDetailsList.add(new KafkaDetails(2, "broker2.com", "topic2"));
		kafkaDetailsList.add(new KafkaDetails(3, "broker3.com", "topic3"));

	}

	public List<KafkaDetails> getAll() {
		return kafkaDetailsList;
	}

	public KafkaDetails saveOne(KafkaDetails detail) {
		if (detail.getId() == null)
			detail.setId(++count);
		kafkaDetailsList.add(detail);
		return detail;
	}

	public KafkaDetails getOne(int id) {
		for (KafkaDetails detail : kafkaDetailsList) {
			if (detail.getId() == id)
				return detail;

		}
		return null;
	}
}
