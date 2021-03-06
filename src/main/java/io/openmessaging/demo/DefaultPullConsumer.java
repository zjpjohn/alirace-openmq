package io.openmessaging.demo;

import io.openmessaging.KeyValue;
import io.openmessaging.Message;
import io.openmessaging.PullConsumer;

import java.io.File;
import java.util.Collection;
import java.util.LinkedList;

public class DefaultPullConsumer implements PullConsumer {
    private MessageFetch messageFetch;
    private KeyValue properties;
    private String queue;

    public DefaultPullConsumer(KeyValue properties) {
        this.properties = properties;
        String storePath = properties.getString("STORE_PATH");
        messageFetch = new MessageFetch(storePath);
    }


    @Override
    public KeyValue properties() {
        return properties;
    }


    @Override
    public Message poll() {
        return messageFetch.pullMessage();
    }

    @Override
    public Message poll(KeyValue properties) {
        throw new UnsupportedOperationException("Unsupported");
    }

    @Override
    public void ack(String messageId) {
        throw new UnsupportedOperationException("Unsupported");
    }

    @Override
    public void ack(String messageId, KeyValue properties) {
        throw new UnsupportedOperationException("Unsupported");
    }

    @Override
    public void attachQueue(String queueName, Collection<String> topics) {
        if (queue != null && !queue.equals(queueName)) {
            throw new ClientOMSException("You have already attached to a queue " + queue);
        }
        queue = queueName;
        messageFetch.attachQueue(queueName, topics);
    }


}
