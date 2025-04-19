package com.example.backend.entity;

import java.util.List;

import jakarta.persistence.*;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    private String name;
    private Integer age;
    private String gender;
    private Integer height;
    private String race;
    private String religion;

    @ElementCollection
    private List<String> interests;

    private String instagram;
    private String spotify;
    private String leetcode;
    private String picture;
	private String description;
    private String college;

    @ElementCollection
    private List<String> categories;

    // Getters and Setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public String getReligion() {
        return religion;
    }

    public void setReligion(String religion) {
        this.religion = religion;
    }

    public List<String> getInterests() {
        return interests;
    }

    public void setInterests(List<String> interests) {
        this.interests = interests;
    }

    public String getInstagram() {
        return instagram;
    }

    public void setInstagram(String instagram) {
        this.instagram = instagram;
    }

    public String getSpotify() {
        return spotify;
    }

    public void setSpotify(String spotify) {
        this.spotify = spotify;
    }

    public String getLeetcode() {
        return leetcode;
    }

    public void setLeetcode(String leetcode) {
        this.leetcode = leetcode;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public List<String> getCategories() {
        return categories;
    }

    public void setCategories(List<String> categories) {
        this.categories = categories;
    }
    public void setDescription(String d) {
        description=d;
    }
    public void setCollege(String c) {
        college=c;
    }
    public String toString() {
        return "ID:"+id+"\n"+name+"\n"+"Age:"+age+"\n"+gender+"\n"+"Height (cm):"+height+"\n"+
         race+"\n"+religion+"\n"+interests.toString()+"\n"+instagram+"\n"+spotify+"\n"+leetcode+"\n"
         +picture+"\n"+description+"\n"+college+"\n";
    }
}
