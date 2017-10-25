package com.example.iis5.movieapp;

/**
 * Created by IIS 5 on 24-10-2017.
 */

 //created a model class and implementing getters and setters
public class Model {

    //taking string variables as name votes and id
    String name,Votes,id;

    // creating parameterized  constructor
    public Model(String name, String votes, String id) {
        this.name = name;
        Votes = votes;
        this.id = id;
    }

    //creating a default constructor
    public Model() {
    }
//creating  getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVotes() {
        return Votes;
    }

    public void setVotes(String votes) {
        Votes = votes;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
