import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.stream.Collectors;

//BFS using Queue

public class BFS {
    public static ArrayList<Integer> doBFS(ArrayList<ArrayList<Integer>> adj, int V) {

        // Initialize result ArrayList
        ArrayList<Integer> res = new ArrayList<>();

        // Start from a source vertice s=0
        int s = 0;

        // Initialize a boolean array to store visited vertice status
        boolean visited[] = new boolean[V];

        // Initialize Queue
        Queue<Integer> q = new LinkedList<Integer>();

        // Change status of first vertice to visited and add it to queue
        visited[s] = true;
        q.add(s);

        // Check queue and change status of visited array accordingly
        while (q.isEmpty() == false) {
            int u = q.poll();
            res.add(u);

            for (int v : adj.get(u)) {
                if (visited[v] == false) {
                    visited[v] = true;
                    q.add(v);
                }
            }
        }

        System.out.println("BFS: " + res);
        return res;
    }

    public static void main(String[] args) {
        int V = 5;
        int E = 4;

        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

        int[][] ab = { { 0, 1 }, { 0, 2 }, { 0, 3 }, { 2, 4 } ,{}};

        for (int i = 0; i < ab.length; i++) {
            List<Integer> list = Arrays.stream(ab[i]).boxed().collect(Collectors.toList());
            ArrayList<Integer> tempList = new ArrayList<Integer>(list);
            adj.add(tempList);
        }

        System.out.println(adj);

        doBFS(adj, V);
    }
}
