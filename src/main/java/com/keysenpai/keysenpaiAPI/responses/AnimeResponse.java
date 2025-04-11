package com.keysenpai.keysenpaiAPI.responses;

public class AnimeResponse {

    private Long id;

    public AnimeResponse(Long id){
        setID(id);
    }

    public Long getID() {
        return id;
    }

    public void setID(Long id) {
        this.id = id;
    }

}
