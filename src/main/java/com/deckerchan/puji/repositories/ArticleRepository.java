package com.deckerchan.puji.repositories;

import com.deckerchan.puji.entities.storage.Article;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.UUID;

@Repository
public interface ArticleRepository extends MongoRepository<Article, UUID> {
    public Article findArticleById(UUID id);

    public Collection<Article> findArticlesByAuthorOrderByPostDate(String author);

    public Page<Article> getArticlesByOrderByPostDate(Pageable pageable);
}
