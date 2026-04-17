package life.light.agentCucumber;

import java.util.List;

public class ScenarioTemplate {
    private String title;
    private String description;
    private List<Step> steps;

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
    private String action;

    public Step(String action) {
        this.action = action;
    }

    public String getAction() { return action; }
}


import java.util.List;

public class ScenarioTemplate {
    private String title;
    private String description;
    private List<Step> steps;

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
    private String action;

    public Step(String action) {
        this.action = action;
    }

    public String getAction() { return action; }
}
