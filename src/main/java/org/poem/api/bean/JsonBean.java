package org.poem.api.bean;

import java.io.Serializable;

public class JsonBean implements Serializable {

    private Integer status = 0;

    private String message;

    private Object result;

    public JsonBean() {
        this.status= 0;
    }

    public JsonBean(Integer status, String message) {
        this.status = status;
        this.message = message;
    }

    public JsonBean(Integer status, String message, Object result) {
        this.status = status;
        this.message = message;
        this.result = result;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getResult() {
        return result;
    }

    public void setResult(Object result) {
        this.result = result;
    }
}
