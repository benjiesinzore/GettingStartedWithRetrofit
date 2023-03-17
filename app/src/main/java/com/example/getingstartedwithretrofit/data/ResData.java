package com.example.getingstartedwithretrofit.data;

public class ResData {

    int code;
    String msg;
    data data;
    int count;
    String listData;


    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public com.example.getingstartedwithretrofit.data.data getData() {
        return data;
    }

    public void setData(com.example.getingstartedwithretrofit.data.data data) {
        this.data = data;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getListData() {
        return listData;
    }

    public void setListData(String listData) {
        this.listData = listData;
    }
}

class data {
    String status;
}
