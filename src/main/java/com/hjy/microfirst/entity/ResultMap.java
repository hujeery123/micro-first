package com.hjy.microfirst.entity;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

/**
 * 描述信息：返回信息
 *
 * @author hujieyun
 * since:2020/5/7 18:41
 */
@Component
public class ResultMap {

    private String result;

    private String message;

    public ResultMap success(){
        this.result = "success";
        return this;
    }

    public ResultMap fail(){
        this.result = "fail";
        return this;
    }

    public ResultMap message(String message) {
        this.message = message;
        return this;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
