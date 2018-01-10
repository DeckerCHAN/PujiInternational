package com.deckerchan.puji.controllers;


import com.deckerchan.puji.entities.storage.Article;
import com.deckerchan.puji.entities.storage.Summary;
import com.deckerchan.puji.entities.transfer.inbound.AddArticleRequest;
import com.deckerchan.puji.entities.transfer.inbound.ArticleRequest;
import com.deckerchan.puji.entities.transfer.inbound.SummariesRequest;
import com.deckerchan.puji.entities.transfer.outbound.ArticleResponse;
import com.deckerchan.puji.entities.transfer.outbound.Response;
import com.deckerchan.puji.entities.transfer.outbound.SummariesResponse;
import com.deckerchan.puji.repositories.ArticleRepository;
import com.deckerchan.puji.utils.DateTimeUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@RestController
public class ArticleController {

    @Autowired
    private ArticleRepository articleRepository;

    @CrossOrigin
    @RequestMapping(value = "articleById", method = RequestMethod.POST)
    public Response getArticleById(@RequestBody ArticleRequest request) {

        Article article = this.articleRepository.findArticleById(UUID.fromString(request.getByField()));
        ArticleResponse response = new ArticleResponse();
        response.setArticle(article);
        response.setSuccessful(true);
        return response;
    }

    @CrossOrigin
    @RequestMapping(value = "addArticle", method = RequestMethod.POST)
    public Response addArticle(@RequestBody AddArticleRequest request) {
        Article article = request.getArticle();
        this.articleRepository.insert(article);
        Response response = new Response();
        response.setSuccessful(true);
        return response;

    }

    @CrossOrigin
    @RequestMapping(value = "getSummaries", method = RequestMethod.POST)
    public Response getSummaries(@RequestBody SummariesRequest SummariesRequest) {
        PageRequest pageable = new PageRequest(SummariesRequest.getPage(),
                SummariesRequest.getNumberEachPage());

        Page<Article> page = this.articleRepository.getArticlesByOrderByPostDate(pageable);

        List<Summary> summaries = page.getContent().stream().map(x -> {

            Summary summary = new Summary();
            summary.setId(x.getId());
            summary.setTitle(x.getTitle());
            summary.setSubTitle(x.getSubTitle());
            summary.setAuthor(x.getAuthor());
            summary.setPostDate(DateTimeUtils.defaultDateFormat().format(x.getPostDate()));
            return summary;

        }).collect(Collectors.toList());

        SummariesResponse response = new SummariesResponse();
        response.setSummaries(summaries);
        response.setSuccessful(true);

        return response;
    }

}
