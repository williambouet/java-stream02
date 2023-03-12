import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Shield {

    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        names.add("Phil Coulson");
        names.add("Melinda May");
        names.add("Daisy Johnson");
        names.add("Leopold Fitz");
        names.add("Jemma Simmons");

        //  1 : map names to agents list
        List<Agent> agents = names.stream()
                .map(name -> stringToAgent(name))
                .collect(Collectors.toList());

        showAgents(agents);
    }

    private static Agent stringToAgent(String name) {
        return new Agent(name.split(" ")[0], name.split(" ")[1]);
    }


    // don't touch anything here !
    private static void showAgents(List<Agent> agents) {
        System.out.println("\nAgents:");
        for (Agent agent : agents) {
            System.out.println(agent.getLastName() + " " + agent.getFirstName());
        }
    }
}