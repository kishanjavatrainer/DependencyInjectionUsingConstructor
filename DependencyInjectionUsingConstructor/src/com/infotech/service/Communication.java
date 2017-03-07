package com.infotech.service;

import com.infotech.messge.ActiveMQMessage;

public class Communication {

	private ActiveMQMessage activeMQMessage;

	public Communication(ActiveMQMessage activeMQMessage) {
		super();
		this.activeMQMessage = activeMQMessage;
	}
	
	public void comminicate(){
		activeMQMessage.sendMessage();
	}
}
