package com.RegisterLogin.response;

public class LoginResponse {
    String messgae;
    Boolean status;

    public LoginResponse() {
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public String getMessgae() {
        return messgae;
    }

    public void setMessgae(String messgae) {
        this.messgae = messgae;
    }

    @Override
    public String toString() {
        return "LoginResponse{" +
                "messgae='" + messgae + '\'' +
                ", status=" + status +
                '}';
    }




    public LoginResponse(String messgae, Boolean status) {
        this.messgae = messgae;
        this.status = status;


    }
}
