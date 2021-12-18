package com.laozhangliaoma.p01_singleton.example;

/**
 * @author laozhang
 * @create 2021/12/18 下午7:06
 */
public class SuccessResponse extends AbstractResponse {
    private static SuccessResponse successResponse = new SuccessResponse();
    private String data = null;

    public static SuccessResponse getInstance() {
        return successResponse;
    }

    private SuccessResponse() {
    }

    public String getData() {
        return this.data;
    }

    public void setData(String data) {
        this.data = data;
    }
}
