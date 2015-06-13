package org.vaadin.spring.events;

public class HierachyTopicFilter implements TopicFilter {

    @Override
    public boolean validTopic(String eventTopic, String listenerTopic) {
        return eventTopic.startsWith(listenerTopic);
    }
}
