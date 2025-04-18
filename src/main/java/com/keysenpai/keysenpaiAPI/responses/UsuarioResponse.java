package com.keysenpai.keysenpaiAPI.responses;

public class UsuarioResponse {

    private Long id;

    public UsuarioResponse(Long id) {
        setID(id);
    }

    public Long getID() {
        return id;
    }

    public void setID(Long id) {
        this.id = id;
    }

}
