package com.deckerchan.puji.entities.export;

import com.deckerchan.puji.entities.Request;

public class PingRequest extends Request {

    public long requestTime;

    public long getRequestTime() {
        return requestTime;
    }

    public void setRequestTime(long requestTime) {
        this.requestTime = requestTime;
    }

}
