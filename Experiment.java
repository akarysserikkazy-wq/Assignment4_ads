public class Experiment {

    private long bfsTime;
    private long dfsTime;

    public void runTraversals(Graph g, int start) {
        long startBFS = System.nanoTime();
        g.bfs(start);
        long endBFS = System.nanoTime();
        bfsTime = endBFS - startBFS;

        long startDFS = System.nanoTime();
        g.dfs(start);
        long endDFS = System.nanoTime();
        dfsTime = endDFS - startDFS;
    }

    public void runMultipleTests() {
        System.out.println("Running multiple graph experiments...");
    }

    public void printResults() {
        System.out.println("\nPerformance Results");
        System.out.println("BFS Time: " + bfsTime);
        System.out.println("DFS Time: " + dfsTime);
    }

    public void printCustomResults(long bfsTime, long dfsTime, int size) {
        System.out.println("\n[Graph Size: " + size + "]");
        System.out.println("BFS: " + bfsTime);
        System.out.println("DFS: " + dfsTime);
    }
}