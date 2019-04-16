package models;

import com.google.gson.annotations.SerializedName;

public class LoginResponse {
    @SerializedName("state")
    private String state;

    @SerializedName("msg")
    private String msg;
    public LoginResponse() {
    }

    public LoginResponse(String state, String msg) {
        this.state = state;
        this.msg = msg;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }


}
