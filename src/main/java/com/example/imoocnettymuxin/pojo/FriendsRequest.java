package com.example.imoocnettymuxin.pojo;

import java.util.Date;
import javax.persistence.*;

@Table(name = "friends_request")
public class FriendsRequest {

    @Id
    private String id;

    @Column(name = "send_user_id")
    private String sendUserId;

    @Column(name = "accept_user_id")
    private String acceptUserId;

    @Column(name = "request_date_time")
    private Date requestDateTime;

    /**
     * @return id
     */
    public String getId() {
        return id;
    }

    /**
     *
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return send_user_id
     */
    public String getSendUserId() {
        return sendUserId;
    }

    /**
     *
     */
    public void setSendUserId(String sendUserId) {
        this.sendUserId = sendUserId;
    }

    /**
     * @return accept_user_id
     */
    public String getAcceptUserId() {
        return acceptUserId;
    }

    /**
     *
     */
    public void setAcceptUserId(String acceptUserId) {
        this.acceptUserId = acceptUserId;
    }

    /**
     * @return request_date_time
     */
    public Date getRequestDateTime() {
        return requestDateTime;
    }

    /**
     *
     */
    public void setRequestDateTime(Date requestDateTime) {
        this.requestDateTime = requestDateTime;
    }
}