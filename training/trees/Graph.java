import java.util.*;

public class Graph{

    static class Edge{
        int src;
        int dst;
        public Edge(int s, int d){
            this.src = s;
            this.dst = d;
        }
    }

    public void createGraph(ArrayList<Edge> graph[]){
        for(int i=0;i<graph.length;i++){
            graph[i] = new ArrayList<Edge>();
        }
        graph[0].add(new Edge(0,3));
        graph[0].add(new Edge(0,2));
        graph[0].add(new Edge(0,2));

        graph[1].add(new Edge(1,0));
        graph[1].add(new Edge(1,4));

        graph[2].add(new Edge(2,0));
        graph[2].add(new Edge(2,4));

        graph[3].add(new Edge(3,0));
        graph[3].add(new Edge(3,4));

        graph[4].add(new Edge(4,1));
        graph[4].add(new Edge(4,2));
        graph[4].add(new Edge(4,3));
        
    }


    public static void main(String[] args){

        int v = 4;
        ArrayList<Edge> graph[] = new ArrayList[v];
        createGraph(graph);

        //check2's adj

        for(int i=0; i<graph[2].size();i++){
            Edge e =
        }
    }
}