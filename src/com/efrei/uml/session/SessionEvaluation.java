package com.efrei.uml.session;

import com.efrei.uml.entity.Trainee;

public class SessionEvaluation {
    private Trainee trainee;
    private float grade;
    private Session session;

    public SessionEvaluation(Trainee trainee, float grade, Session session) {
        this.trainee = trainee;
        this.grade = grade;
        this.session = session;
    }

    public Trainee getTrainee() {
        return trainee;
    }

    public float getGrade() {
        return grade;
    }

    public Session getSession() {
        return session;
    }
}
