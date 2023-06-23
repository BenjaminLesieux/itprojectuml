package com.efrei.uml;

import com.efrei.uml.course.*;
import com.efrei.uml.entity.Client;
import com.efrei.uml.entity.Company;
import com.efrei.uml.entity.Trainee;
import com.efrei.uml.entity.Trainer;
import com.efrei.uml.session.Session;
import com.efrei.uml.session.SessionBuilder;
import com.efrei.uml.session.SessionType;

public class Main {
    public static void main(String[] args) {
        Website website = Website.getInstance();
        Trainer trainer = new Trainer("Doe", "John", "0123456789");
        Trainee client = new Trainee("Doe", "John", "0123456789", new Company("t", "d"), "johndoe");

        Course chemistry = new CourseBuilder()
                .withTheme(Theme.CHEMISTRY)
                .withPrice(2000)
                .withDescription("Learn how to make a bomb")
                .withTopic(Topic.BIO_ENGINEERING)
                .withSubTopic(SubTopic.ATOMS)
                .withSubTopic(SubTopic.FRENCH_REVOLUTION)
                .build();

        Session session = new SessionBuilder()
                .trainer(trainer)
                .trainee(client)
                .trainee(new Trainee("Doe", "Jane", "0123456789", new Company("t", "d"), "janedoe"))
                .type(SessionType.INTRA_COMPANY)
                .frequency(CourseFrequency.WEEKLY)
                .build();

        website.getTrainingManager().addCourse(website, chemistry);
        website.getLogisticManager().addSession(chemistry, session);
        website.getSalesManager().deliverSession(chemistry, client);

        if (session.getTrainees().size() < 4) {
            website.getLogisticManager().cancelSession(chemistry, session);
        }

        client.evaluateSession(session, 3.2f);
        client.evaluateTrainer(session, 4.5f);
    }
}
