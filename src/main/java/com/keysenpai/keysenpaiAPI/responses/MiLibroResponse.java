package com.keysenpai.keysenpaiAPI.responses;

public class MiLibroResponse {

    private Long id;

    public MiLibroResponse(Long id){
        setID(id);
    }

    public Long getID() {
        return id;
    }

    public void setID(Long id) {
        this.id = id;
    }
}
