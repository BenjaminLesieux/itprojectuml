package com.efrei.uml.session;

import java.util.ArrayList;
import java.util.List;

public class TrainingPlan {
    private List<String> objectives;

    public TrainingPlan() {
        this.objectives = new ArrayList<>();
    }

    public void addObject(String objective) {
        this.objectives.add(objective);
    }

    public List<String> getObjectives() {
        return objectives;
    }
}
