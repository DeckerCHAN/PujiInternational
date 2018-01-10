package com.deckerchan.puji.entities.transfer.outbound;

import com.deckerchan.puji.entities.storage.Article;

public class ArticleResponse extends Response {
    private Article article;

    public Article getArticle() {
        return article;
    }

    public void setArticle(Article article) {
        this.article = article;
    }
}
