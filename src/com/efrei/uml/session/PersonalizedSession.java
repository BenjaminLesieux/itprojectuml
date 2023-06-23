package com.efrei.uml.session;

import com.efrei.uml.course.CourseFrequency;
import com.efrei.uml.entity.Client;
import com.efrei.uml.entity.Trainee;
import com.efrei.uml.entity.Trainer;

import java.util.Date;

public class PersonalizedSession extends Session {
    private Client client;
    private TrainingPlan trainingPlan;

    public PersonalizedSession(Date date, String address, SessionType sessionType, Trainer trainer, CourseFrequency courseFrequency, Client client, TrainingPlan trainingPlan) {
        super(date, address, sessionType, trainer, courseFrequency);
        this.client = client;
        this.trainingPlan = trainingPlan;
    }

    public PersonalizedSession(Client client, TrainingPlan trainingPlan) {
        this.client = client;
        this.trainingPlan = trainingPlan;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public void setTrainingPlan(TrainingPlan trainingPlan) {
        this.trainingPlan = trainingPlan;
    }

    public Client getClient() {
        return client;
    }

    public TrainingPlan getTrainingPlan() {
        return trainingPlan;
    }
}
