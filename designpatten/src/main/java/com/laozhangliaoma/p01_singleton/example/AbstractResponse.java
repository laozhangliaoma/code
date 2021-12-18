package com.laozhangliaoma.p01_singleton.example;

/**
 * @author laozhang
 * @create 2021/12/18 下午7:05
 */
public abstract class AbstractResponse {
    public static String SUCCESS_CODE = "200";
    private String code;
    private String msg;

    public AbstractResponse() {
        this.code = SUCCESS_CODE;
        this.msg = "";
    }

    public String getCode() {
        return this.code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return this.msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
