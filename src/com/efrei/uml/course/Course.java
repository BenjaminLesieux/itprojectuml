package com.efrei.uml.course;

import com.efrei.uml.session.Session;

import java.util.ArrayList;
import java.util.List;

public class Course {
    private Theme theme;
    private Topic topic;
    private List<SubTopic> subTopics;
    private List<Session> sessions;
    private String description;
    private String testPrerequisiteLink;
    private static String salesDptLink = "link";
    private float price;

    public Course(Theme theme, Topic topic, String description, String testPrerequisiteLink, float price) {
        this.theme = theme;
        this.topic = topic;
        this.subTopics = new ArrayList<>();
        this.sessions = new ArrayList<>();
        this.description = description;
        this.testPrerequisiteLink = testPrerequisiteLink;
        this.price = price;
    }

    public Course() {
    }

    public Theme getTheme() {
        return theme;
    }

    public Topic getTopic() {
        return topic;
    }

    public List<SubTopic> getSubTopics() {
        return subTopics;
    }

    public List<Session> getSessions() {
        return sessions;
    }

    public String getDescription() {
        return description;
    }

    public String getTestPrerequisiteLink() {
        return testPrerequisiteLink;
    }

    public static String getSalesDptLink() {
        return salesDptLink;
    }

    public float getPrice() {
        return price;
    }

    public void setTheme(Theme theme) {
        this.theme = theme;
    }

    public void setTopic(Topic topic) {
        this.topic = topic;
    }

    public void addSubTopic(SubTopic subTopic) {
        this.subTopics.add(subTopic);
    }

    public void removeSubTopic(SubTopic subTopic) {
        this.subTopics.remove(subTopic);
    }

    public void addSession(Session session) {
        this.sessions.add(session);
    }

    public void removeSession(Session session) {
        this.sessions.remove(session);
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setTestPrerequisiteLink(String testPrerequisiteLink) {
        this.testPrerequisiteLink = testPrerequisiteLink;
    }

    public static void setSalesDptLink(String salesDptLink) {
        Course.salesDptLink = salesDptLink;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}
