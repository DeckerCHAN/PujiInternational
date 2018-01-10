package com.deckerchan.puji.entities.transfer.inbound;

public class PingRequest extends Request {

    private long requestTime;

    public long getRequestTime() {
        return requestTime;
    }

    public void setRequestTime(long requestTime) {
        this.requestTime = requestTime;
    }

}
