package com.up.stores.until;

import java.io.Serializable;

//主要用于构建JSON格式的响应结果。通过设置不同的状态码、描述信息和数据，
// 可以方便地生成符合统一格式的JSON响应对象，
// 用于返回给客户端或在程序中进行处理。
// 泛型参数E可以根据具体的业务需求来指定不同的数据类型。
public class JsonResult<E> implements Serializable {
//    状态码
    private Integer state;
//    描述信息
    private String message;
//    数据
    private E data;

    public JsonResult() {
        super();
    }

    public JsonResult(Integer state) {
        super();
        this.state = state;
    }

    public JsonResult(Throwable e) {
        super();
        this.message = e.getMessage();
    }

    public JsonResult(Integer state,E data) {
        super();
        this.state = state;
        this.data = data;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public E getData() {
        return data;
    }

    public void setData(E data) {
        this.data = data;
    }
}
