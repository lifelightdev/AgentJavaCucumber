package src.main.java.agent.cucumber;

import java.util.List;

public class ScenarioTemplate {
    private final String title;
    private final String description;
    private final List<Step> steps;

    public ScenarioTemplate(String title, String description, List<Step> steps) {
        this.title = title;
        this.description = description;
        this.steps = steps;
    }

    // Getters
    public String getTitle() { return title; }
    public String getDescription() { return description; }
    public List<Step> getSteps() { return steps; }
}

class Step {
    private final String action;

    public Step(String action) {
        this.action = action;
    }

    public String getAction() { return action; }
}
