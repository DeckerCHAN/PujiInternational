package com.deckerchan.puji.entities.transfer.inbound;

import com.deckerchan.puji.entities.storage.Article;

public class AddArticleRequest extends Request {
    private Article article;

    public Article getArticle() {
        return article;
    }

    public void setArticle(Article article) {
        this.article = article;
    }
}
