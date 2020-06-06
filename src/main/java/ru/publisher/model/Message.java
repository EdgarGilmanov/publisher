package ru.publisher.model;

import java.util.Objects;

public class Message {
    private int msisdn;
    private Type type;
    private long timestamp;

    public Message() { }

    public Message(int msisdn, Type type, long timestamp) {
        this.msisdn = msisdn;
        this.type = type;
        this.timestamp = timestamp;
    }

    public void setMsisdn(int msisdn) {
        this.msisdn = msisdn;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }

    public int getMsisdn() {
        return msisdn;
    }

    public Type getType() {
        return type;
    }

    public long getTimestamp() {
        return timestamp;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Message message = (Message) o;
        return msisdn == message.msisdn &&
                type == message.type;
    }

    @Override
    public int hashCode() {
        return Objects.hash(msisdn, type);
    }

    public enum Type {
        PURCHASE,
        SUBSCRIPTION
    }
}
