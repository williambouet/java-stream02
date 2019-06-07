import java.util.ArrayList;
import java.util.List;

public class Shield {

    public static void main(String[] args) {

        List<String> agentsName = new ArrayList<>();
        agentsName.add("Phil Coulson");
        agentsName.add("Melinda May");
        agentsName.add("Daisy Johnson");
        agentsName.add("Leopold Fitz");
        agentsName.add("Jemma Simmons");

        // TODO 1 : map names to agent set
        List<Agent> agents = new ArrayList<>();

        showAgents(agents);
    }

    // don't touch anything here !
    private static void showAgents(List<Agent> agents) {
        System.out.println("\nAgents:");
        for (Agent agent : agents) {
            System.out.println(agent.getLastName() + " " + agent.getFirstName());
        }
    }
}