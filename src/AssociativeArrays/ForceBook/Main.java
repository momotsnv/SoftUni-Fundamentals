package AssociativeArrays.ForceBook;

import java.util.*;

import static java.lang.System.in;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(in);


        String input = sc.nextLine();
        Map<String, List<String>> teams = new LinkedHashMap<>();

        while (!input.equals("Lumpawaroo")) {

            if (input.contains("|")) {

                String teamName = input.split(" \\| ")[0];
                String playerName = input.split(" \\| ")[1];

                if (!teams.containsKey(teamName)) {
                    teams.put(teamName, new ArrayList<>());
                }

                boolean isThisPlayerPartOfAnotherTeam = false;
                for (List<String> team : teams.values()) {
                    if (team.contains(playerName)) {
                        isThisPlayerPartOfAnotherTeam = true;
                        break;
                    }
                }

                if (!isThisPlayerPartOfAnotherTeam) {
                    teams.get(teamName).add(playerName);
                }
            } else if (input.contains("->")) {

                String playerName = input.split(" -> ")[0];
                String teamName = input.split(" -> ")[1];

                for (List<String> team : teams.values()) {
                    team.remove(playerName);
                }

                if (teams.containsKey(teamName)) {
                    teams.get(teamName).add(playerName);
                } else {
                    teams.put(teamName, new ArrayList<>());
                    teams.get(teamName).add(playerName);
                }
                System.out.printf("%s joins the %s side!%n", playerName, teamName);
            }

            input = sc.nextLine();
        }

        for (Map.Entry<String, List<String>> entry : teams.entrySet()) {
            String teamName = entry.getKey();
            List<String> players = entry.getValue();

            if (!players.isEmpty()) {
                System.out.println("Side: " + teamName + ", Members: " + players.size());
                players.forEach(player -> System.out.println("! " + player));
            }
        }
    }
}