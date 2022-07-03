package kafka.attempt.kafkaAttempt1.kafka;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.handler.annotation.Header;
import org.springframework.messaging.handler.annotation.Payload;

@Service
public class KafkaConsumer {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(KafkaConsumer.class);
	
	/*@KafkaListener(topics = "javaguides", groupId = "myGroup")//use to subscribe to a topic
	public void consume(String message) {
		
		LOGGER.info(String.format("Message recieved -> %s", message));//print to console
	}*/
	
    @KafkaListener(topics = "javaguides")
    public void receive(@Payload List<String> messages,
                        @Header(KafkaHeaders.RECEIVED_PARTITION_ID) List<Integer> partitions,
                        @Header(KafkaHeaders.OFFSET) List<Long> offsets) {

    	LOGGER.info("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - -");
        LOGGER.info("Starting the process to recieve batch messages");

        for (int i = 0; i < messages.size(); i++) {

        	LOGGER.info("received message='{}' with partition-offset='{}'",
                    messages.get(i), partitions.get(i) + "-" + offsets.get(i));

        }
        LOGGER.info("all the batch messages are consumed");
    }
    
}