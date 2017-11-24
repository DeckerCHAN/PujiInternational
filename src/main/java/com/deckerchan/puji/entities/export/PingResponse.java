package com.deckerchan.puji.entities.export;

import com.deckerchan.puji.entities.Response;

public class PingResponse extends Response {

    public long responseTime;

    public long getDifference() {
        return difference;
    }

    public void setDifference(long difference) {
        this.difference = difference;
    }

    public long difference;

    public long getResponseTime() {
        return responseTime;
    }

    public void setResponseTime(long responseTime) {
        this.responseTime = responseTime;
    }

}
