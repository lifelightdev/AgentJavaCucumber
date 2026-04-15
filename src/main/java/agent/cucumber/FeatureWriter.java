package src.main.java.agent.cucumber;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class FeatureWriter {

    public static void writeFeatureFile(String filename, List<ScenarioTemplate> scenarios) {
        try (FileWriter writer = new FileWriter(filename)) {
            // Écrire l'en-tête de la fonctionnalité
            writer.write("Fonctionnalité: " + scenarios.getFirst().getTitle() + "\n");
            writer.write("  " + scenarios.getFirst().getDescription() + "\n\n");

            // Écrire chaque scénario
            for (ScenarioTemplate scenario : scenarios) {
                writer.write("  Scénario: " + scenario.getTitle() + "\n");
                for (Step step : scenario.getSteps()) {
                    writer.write("    " + step.getAction() + "\n");
                }
                writer.write("\n"); // Espace entre les scénarios
            }

            System.out.println("Fichier généré : " + filename);
        } catch (IOException e) {
            System.err.println("Erreur lors de l'écriture du fichier : " + e.getMessage());
        }
    }
}
