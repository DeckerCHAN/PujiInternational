package com.deckerchan.puji.entities.transfer.inbound;

public class SummariesRequest extends Request {
    private int page;
    private int numberEachPage;

    public int getNumberEachPage() {
        return numberEachPage;
    }

    public void setNumberEachPage(int numberEachPage) {
        this.numberEachPage = numberEachPage;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }
}
