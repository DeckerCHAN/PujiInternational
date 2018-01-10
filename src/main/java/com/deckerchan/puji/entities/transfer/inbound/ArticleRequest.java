package com.deckerchan.puji.entities.transfer.inbound;

public class ArticleRequest extends Request {
    private String byField;

    public String getByField() {
        return byField;
    }

    public void setByField(String byField) {
        this.byField = byField;
    }
}
