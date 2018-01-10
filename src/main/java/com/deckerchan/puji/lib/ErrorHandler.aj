package com.deckerchan.puji.lib;


import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public aspect ErrorHandler {

    @Pointcut("execution(* com.deckerchan.puji.lib.ArticleMamger.upload(..))")
    public void uploading() {

    }


    @Before("uploading()")
    public void BeforeUpload() {
        System.out.println("Before upload!");
    }


}
