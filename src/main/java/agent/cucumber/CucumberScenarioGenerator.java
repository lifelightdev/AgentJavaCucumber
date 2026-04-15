package src.main.java.agent.cucumber;

import java.util.List;

public class CucumberScenarioGenerator {

    public static void main(String[] args) {
        // Exemple : Générer un scénario de connexion
        List<ScenarioTemplate> scenarios = List.of(
                new ScenarioTemplate(
                        "Connexion utilisateur",
                        "En tant qu'utilisateur, je veux me connecter pour accéder à mon compte.",
                        List.of(
                                new Step("Étant donné que l'utilisateur est sur la page de connexion"),
                                new Step("Quand l'utilisateur entre un nom d'utilisateur et un mot de passe valides"),
                                new Step("Alors l'utilisateur devrait être redirigé vers le tableau de bord")
                        )
                ),
                new ScenarioTemplate(
                        "Connexion échouée",
                        "En tant qu'utilisateur, je veux recevoir une erreur si mes identifiants sont invalides.",
                        List.of(
                                new Step("Étant donné que l'utilisateur est sur la page de connexion"),
                                new Step("Quand l'utilisateur entre un nom d'utilisateur ou mot de passe invalide"),
                                new Step("Alors un message d'erreur devrait s'afficher")
                        )
                )
        );

        // Générer le fichier .feature
        FeatureWriter.writeFeatureFile("login.feature", scenarios);
    }
}
