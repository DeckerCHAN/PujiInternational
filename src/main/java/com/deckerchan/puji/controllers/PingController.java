package com.deckerchan.puji.controllers;

import com.deckerchan.puji.entities.transfer.inbound.PingRequest;
import com.deckerchan.puji.entities.transfer.outbound.PingResponse;
import com.deckerchan.puji.entities.transfer.outbound.Response;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Calendar;
import java.util.TimeZone;


@RestController
public class PingController {


    @RequestMapping(value = "ping", method = RequestMethod.POST)
    public Response greeting(@RequestBody PingRequest pingRequest) {

        Calendar cal = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
        long time = cal.getTimeInMillis();

        PingResponse response = new PingResponse();
        response.setResponseTime(time);
        response.setDifference(time - pingRequest.getRequestTime());
        return response;
    }
}
