package com.deckerchan.puji.entities.transfer.outbound;

import com.deckerchan.puji.entities.storage.Summary;

import java.util.Collection;

public class SummariesResponse extends Response {
    private Collection<Summary> summaries;

    public Collection<Summary> getSummaries() {
        return summaries;
    }

    public void setSummaries(Collection<Summary> summaries) {
        this.summaries = summaries;
    }

}
