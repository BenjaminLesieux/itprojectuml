package com.efrei.uml.session;

import com.efrei.uml.course.CourseFrequency;
import com.efrei.uml.entity.Trainee;
import com.efrei.uml.entity.Trainer;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Session {
    private Date date;
    private String address;
    private SessionType sessionType;
    private Trainer trainer;
    private List<Trainee> trainees;
    private CourseFrequency courseFrequency;
    private List<SessionEvaluation> sessionEvaluations;

    public Session(Date date, String address, SessionType sessionType, Trainer trainer, CourseFrequency courseFrequency) {
        this.date = date;
        this.address = address;
        this.sessionType = sessionType;
        this.trainer = trainer;
        this.courseFrequency = courseFrequency;
        this.sessionEvaluations = new ArrayList<>();
    }

    public Session() {

    }

    public void evaluate(SessionEvaluation evaluation) {
        this.sessionEvaluations.add(evaluation);
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setSessionType(SessionType sessionType) {
        this.sessionType = sessionType;
    }

    public void setTrainer(Trainer trainer) {
        this.trainer = trainer;
    }

    public void addTrainee(Trainee trainee) {
        this.trainees.add(trainee);
    }

    public void setCourseFrequency(CourseFrequency courseFrequency) {
        this.courseFrequency = courseFrequency;
    }

    public Date getDate() {
        return date;
    }

    public String getAddress() {
        return address;
    }

    public SessionType getSessionType() {
        return sessionType;
    }

    public Trainer getTrainer() {
        return trainer;
    }

    public List<Trainee> getTrainees() {
        return trainees;
    }

    public CourseFrequency getCourseFrequency() {
        return courseFrequency;
    }

    public List<SessionEvaluation> getSessionEvaluations() {
        return sessionEvaluations;
    }
}
