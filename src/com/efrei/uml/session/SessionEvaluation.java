package com.efrei.uml.session;

import com.efrei.uml.entity.Trainee;

public class SessionEvaluation {
    private Trainee trainee;
    private float grade;
    public SessionEvaluation(Trainee trainee, float grade) {
        this.trainee = trainee;
        this.grade = grade;
    }

    public Trainee getTrainee() {
        return trainee;
    }

    public float getGrade() {
        return grade;
    }
}
