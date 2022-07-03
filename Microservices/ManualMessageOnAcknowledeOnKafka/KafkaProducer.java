package kafka.attempt.kafkaAttempt1.kafka;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaProducer {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(KafkaProducer.class);

	private KafkaTemplate<String, String> kafkaTemplate;

	public KafkaProducer(KafkaTemplate<String, String> kafkaTemplate) {
		this.kafkaTemplate = kafkaTemplate;
	}
	
	public void sendMessage(String message) {
		LOGGER.info(String.format("Message sent %s",message));		

		//if(message=="run") {
		for(int i=1;i<501;i++) {
			kafkaTemplate.send("javaguides", String.valueOf(i));				
		}
		
		//}
		



	}
}
