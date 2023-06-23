package com.efrei.uml.course;

public class CourseBuilder {
    private Course course;

    public CourseBuilder() {
        this.course = new Course();
    }

    public CourseBuilder withTheme(Theme theme) {
        this.course.setTheme(theme);
        return this;
    }

    public CourseBuilder withTopic(Topic topic) {
        this.course.setTopic(topic);
        return this;
    }

    public CourseBuilder withDescription(String description) {
        this.course.setDescription(description);
        return this;
    }

    public CourseBuilder withSubTopic(SubTopic subTopic) {
        this.course.getSubTopics().add(subTopic);
        return this;
    }

    public CourseBuilder withTestPrerequisiteLink(String testPrerequisiteLink) {
        this.course.setTestPrerequisiteLink(testPrerequisiteLink);
        return this;
    }

    public CourseBuilder withPrice(float price) {
        this.course.setPrice(price);
        return this;
    }

    public Course build() {
        return this.course;
    }
}
