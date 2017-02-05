package com.example.parktaejun.d3s;

/**
 * Created by parktaejun on 2017. 2. 5..
 */

public class Data {
    private String name;
    private String subject;
    private String job;
    private String room;

    public Data(String name, String subject, String job, String room){
        this.name = name;
        this.subject = subject;
        this.job = job;
        this.room = room;
    }

    public String getName(){
        return name;
    }

    public String getSubject(){
        return subject;
    }

    public String getJob(){
        return job;
    }

    public String getRoom(){
        return room;
    }
}
