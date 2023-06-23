package com.efrei.uml.session;

import com.efrei.uml.course.CourseFrequency;
import com.efrei.uml.entity.Client;
import com.efrei.uml.entity.Trainee;
import com.efrei.uml.entity.Trainer;

import java.util.Date;

public class SessionBuilder {
    private Session session;

    public SessionBuilder() {
        this.session = new Session();
    }

    public PersonalizedSessionBuilder personalized() {
        var personalizedSession = new PersonalizedSession(
                this.session.getDate(),
                this.session.getAddress(),
                this.session.getSessionType(),
                this.session.getTrainer(),
                this.session.getCourseFrequency(),
                null,
                null
        );
        return new PersonalizedSessionBuilder(this);
    }

    public SessionBuilder trainee(Trainee trainee) {
        this.session.addTrainee(trainee);
        return this;
    }

    public SessionBuilder trainer(Trainer trainer) {
        this.session.setTrainer(trainer);
        return this;
    }

    public SessionBuilder type(SessionType sessionType) {
        this.session.setSessionType(sessionType);
        return this;
    }

    public SessionBuilder frequency(CourseFrequency frequency) {
        this.session.setCourseFrequency(frequency);
        return this;
    }

    public SessionBuilder date(Date date) {
        this.session.setDate(date);
        return this;
    }

    public Session build() {
        return this.session;
    }

    public static class PersonalizedSessionBuilder {
        private PersonalizedSession session;
        public PersonalizedSessionBuilder(SessionBuilder builder) {
            this.session = new PersonalizedSession(
                    builder.session.getDate(),
                    builder.session.getAddress(),
                    builder.session.getSessionType(),
                    builder.session.getTrainer(),
                    builder.session.getCourseFrequency(),
                    null,
                    null
            );
        }

        public PersonalizedSessionBuilder client(Client client) {
            this.session.setClient(client);
            return this;
        }

        public PersonalizedSessionBuilder trainingPlan(TrainingPlan trainingPlan) {
            this.session.setTrainingPlan(trainingPlan);
            return this;
        }

        public PersonalizedSession build() {
            return this.session;
        }
    }
}
