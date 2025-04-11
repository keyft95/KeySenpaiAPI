package com.keysenpai.keysenpaiAPI.responses;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class GenericResponse {
    private LocalDateTime dateTime;
    private ArrayList<Object> data;

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }

    public ArrayList<Object> getData() {
        return data;
    }

    public void setData(ArrayList<Object> data) {
        this.data = data;
    }

    public GenericResponse(ArrayList<Object> data) {
        this.dateTime = LocalDateTime.now();
        this.data = data;
    }

    public GenericResponse(Object data) {
        this.dateTime = LocalDateTime.now();
        this.data = new ArrayList<>();
        this.data.add(data);
    }
}
