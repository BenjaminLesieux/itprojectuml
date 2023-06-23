package com.efrei.uml.entity;

import com.efrei.uml.session.Session;

import java.util.HashMap;
import java.util.Map;

public class Trainer extends Person {
    private float avgEvaluationGrade = 0.0f;
    private Map<Session, Float> sessionGrades;

    public Trainer(String lastName, String firstName, String phoneNumber) {
        super(lastName, firstName, phoneNumber);
        this.avgEvaluationGrade = avgEvaluationGrade;
        this.sessionGrades = new HashMap<>();
    }

    public float getAvgEvaluationGrade() {
        return avgEvaluationGrade;
    }

    public Map<Session, Float> getSessionGrades() {
        return sessionGrades;
    }

    public void addGrade(Session session, float grade) {
        sessionGrades.put(session, grade);
        avgEvaluationGrade = sessionGrades.values().stream().reduce(0.0f, Float::sum) / sessionGrades.size();
    }
}
