package com.janaa.restapidemo.kafka;

public class KafkaDetails {

	private Integer id;
	private String broker;
	private String topic;

	public KafkaDetails() {

	}

	public KafkaDetails(Integer id, String broker, String topic) {
		super();
		this.id = id;
		this.broker = broker;
		this.topic = topic;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getBroker() {
		return broker;
	}

	public void setBroker(String broker) {
		this.broker = broker;
	}

	public String getTopic() {
		return topic;
	}

	public void setTopic(String topic) {
		this.topic = topic;
	}

}
