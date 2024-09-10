import java.util.*;

public class rank_List{
    static class Team {
        int problemsSolved;
        int penaltyTime;

        public Team(int problemsSolved, int penaltyTime) {
            this.problemsSolved = problemsSolved;
            this.penaltyTime = penaltyTime;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();


        List<Team> teams = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int problemsSolved = scanner.nextInt();
            int penaltyTime = scanner.nextInt();
            teams.add(new Team(problemsSolved, penaltyTime));
        }


        teams.sort((team1, team2) -> {
            if (team1.problemsSolved != team2.problemsSolved) {
                return Integer.compare(team2.problemsSolved, team1.problemsSolved);  
            } else {
                return Integer.compare(team1.penaltyTime, team2.penaltyTime);  
            }
        });


        Team kthTeam = teams.get(k - 1);


        int count = 0;
        for (Team team : teams) {
            if (team.problemsSolved == kthTeam.problemsSolved && team.penaltyTime == kthTeam.penaltyTime) {
                count++;
            }
        }


        System.out.println(count);

        scanner.close();
    }
}
// Solution by piyush patel codes https://codeforces.com/profile/piyushpatelcodes   https://www.linkedin.com/in/piyushpatelcodes/
