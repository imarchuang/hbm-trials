package com.imarchuang.hbm.helloworld;

public class Message {
	
	private Long id;
	private String text;
	private Message nextMessage;

	public Message() {
	}

	public Message(String text) {
		this.text = text;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Message getNextMessage() {
		return nextMessage;
	}

	public void setNextMessage(Message nextMessage) {
		this.nextMessage = nextMessage;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	@Override
	public String toString() {
		return "Message{" + "id=" + id + ", text=" + text + ", nextMessage=" + nextMessage + '}';
	}
}
