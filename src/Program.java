import java.util.*;

class Bowling {
    HashMap<String, Integer> players;
    Bowling() {
        players = new HashMap<String, Integer>();
    }
    public void addPlayer(String name, int point) {
        players.put(name, point);
    }
  public void getWinner() {
        String [] x = new String [players.size()];
        x =players.keySet().toArray(x);
        String best = x[0];
        int max = players.get(x[0]);
        for (String emp : x) {
if (players.get(emp)>max){
    best = emp;
max=players.get(emp); }
        }
            System.out.println(best);
    }
}
public class Program {
    public static void main(String[] args) {
        Bowling game= new Bowling();
        Scanner sc = new Scanner(System.in);
        for(int i = 0;i<3;i++){
            String input = sc.nextLine();
            String[] values = input.split(" ");
            String name = values[0];
            int points = Integer.parseInt(values[1]);
            game.addPlayer(name,points);
        }
        game.getWinner();
    }
}



