package com.laozhangliaoma.p05_builder;

import java.util.List;

/**
 * 题目实体
  @author laozhang
  @create 2021/12/20 下午2:10
*/
public class QuestionEntity {
    private String id;

    /**
     * 题型结构（选择题、填空题、口语题）
     */
    private String structure;
    /**
     * 分类id
     */
    private Integer categoryId;
    /**
     * 试题解析
     */
    private String explain;
    /**
     * 题干
     */
    private String body;
    /**
     * 题目配置
     */
    private Config config;
    /**
     * 题干展示形式
     */
    private String bodyShowType;

    /**
     * 资源
     */
    private Source source;
    /**
     * 题干音频对象
     */
    private List<AudioInfo> bodyAudioInfos;
    /**
     * 答案
     */
    private List<Answer> answerList;

    /**
     * 资源
     */
    public static class Source {
        /**
         * 资源来源Id
         */
        private String resourcesId;
        /**
         * 资源来源类型
         */
        private String resourcesType;

        /**
         * 内容库试题Id
         */
        private String resQuestionId;
    }

    public static class AudioInfo {

        /**
         * url
         */
        private String url;

        /**
         * 时长
         */
        private Integer duration;

        /**
         * 单位
         */
        private String unit;
    }

    /**
     * 答案
     */
    public static class Answer {
        /**
         * contentId
         */
        private String contentIdx;

        /**
         * 答案内容
         */
        private String content;

        /**
         * 答案图片URL
         */
        private String answerImg;

        /**
         * 解析
         */
        private String explain;

        /**
         * 复合题中的答案，答案和子题Id绑定
         */
        private String questionId;
    }

    /**
     * 题型配置
     */
    public static class Config{

    }

    @Override
    public String toString() {
        return "QuestionEntity{" +
                "id='" + id + '\'' +
                ", structure='" + structure + '\'' +
                ", categoryId=" + categoryId +
                ", explain='" + explain + '\'' +
                ", body='" + body + '\'' +
                ", config=" + config +
                ", bodyShowType='" + bodyShowType + '\'' +
                ", source=" + source +
                ", bodyAudioInfos=" + bodyAudioInfos +
                ", answerList=" + answerList +
                '}';
    }

    /**
     * 定义构造方法
     * @param builder
     */
    public QuestionEntity(Builder builder){
        this.id = builder.id;
        this.structure = builder.structure;
        this.categoryId = builder.categoryId;
        this.explain = builder.explain;
        this.body = builder.body;
        this.config = builder.config;
        this.bodyShowType = builder.bodyShowType;
        this.source = builder.source;
        this.bodyAudioInfos = builder.bodyAudioInfos;
        this.answerList = builder.answerList;
    }

    public static class Builder{
        private String id;
        private String structure;
        private Integer categoryId;
        private String explain;
        private String body;
        private Config config;
        private String bodyShowType;
        private Source source;
        private List<AudioInfo> bodyAudioInfos;
        private List<Answer> answerList;

        public Builder id(String id){
            this.id = id;
            return this;
        }

        public Builder structure(String structure){
            this.structure = structure;
            return this;
        }

        public Builder categoryId(Integer categoryId){
            this.categoryId = categoryId;
            return this;
        }

        public Builder explain(String explain) {
            this.explain = explain;
            return this;
        }

        public Builder body(String body){
            this.body = body;
            return this;
        }

        public Builder config(Config config){
            this.config = config;
            return this;
        }

        public Builder bodyShowType(String bodyShowType){
            this.bodyShowType = bodyShowType;
            return this;
        }

        public Builder source(Source source){
            this.source = source;
            return this;
        }

        public Builder bodyAudioInfos(List<AudioInfo> bodyAudioInfos){
            this.bodyAudioInfos = bodyAudioInfos;
            return this;
        }

        public Builder answerList(List<Answer> answerList){
            this.answerList = answerList;
            return this;
        }

        /**
         * 返回QuestionEntity对象
         * @return
         */
        public QuestionEntity create(){
            return new QuestionEntity(this);
        }

    }


}
