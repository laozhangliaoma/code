package com.laozhangliaoma.p05_builder;

import java.util.Collections;

/**
 * @author laozhang
 * @create 2021/12/20 下午2:44
 */
public class Client {
    public static void main(String[] args) {
        QuestionEntity questionEntity = new QuestionEntity.Builder()
                .id("q123456")
                .body("How many dogs in the picture?")
                .structure("select")
                .categoryId(1)
                .source(new QuestionEntity.Source())
                .config(new QuestionEntity.Config())
                .answerList(Collections.emptyList())
                .create();
        System.out.println(questionEntity);

    }
}
