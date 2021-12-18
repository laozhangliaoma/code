package com.laozhangliaoma.p01_singleton.example;

/**
 * @author laozhang
 * @create 2021/12/18 下午7:03
 */
public abstract class BaseController {
    protected SuccessResponse success = SuccessResponse.getInstance();

    public BaseController() {
    }

    protected SessionInfo getSession() {
        // TODO: 2021/12/18  具体实现
        return null;
    }

    protected RequestHeader getHeaders() {
        // TODO: 2021/12/18 具体实现
        return null;
    }
}
