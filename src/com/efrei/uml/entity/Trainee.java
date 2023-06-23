package com.efrei.uml.entity;

import com.efrei.uml.session.Session;
import com.efrei.uml.session.SessionEvaluation;

public class Trainee extends Client {
    public Trainee(String lastName, String firstName, String phoneNumber, Company company, String username) {
        super(lastName, firstName, phoneNumber, company, username);
    }

    public void evaluateSession(Session session, float grade) {
        session.getSessionEvaluations().add(new SessionEvaluation(this, grade));
    }

    public void evaluateTrainer(Session session, float grade) {
        Trainer trainer = session.getTrainer();
        trainer.addGrade(session, grade);
    }
}
