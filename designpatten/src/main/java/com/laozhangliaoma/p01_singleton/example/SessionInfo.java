package com.laozhangliaoma.p01_singleton.example;

/**
 * @author laozhang
 * @create 2021/12/18 下午7:09
 */
public class SessionInfo {
    private String userId;
    private String clientId;

    public SessionInfo() {
    }

    public SessionInfo(String userId, String clientId) {
        this.userId = userId;
        this.clientId = clientId;
    }

    public String getUserId() {
        return this.userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getClientId() {
        return this.clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }
}
