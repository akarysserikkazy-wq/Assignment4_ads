# Assignment4_ads

#Student: Serikkazy Akarys
#Group: SE-2514

# 1) Algorithm Requirement
1. Breadth-First Search (BFS): traverses the graph level by level and uses a queue.
2. Depth-First Search (DFS): traverses the graph deeply before backtracking and uses a stack or recursion.

    Both algorithms visit every vertex exactly once

# 2) Core Class Implementations
<img width="472" height="392" alt="Снимок экрана 2026-05-10 232823" src="https://github.com/user-attachments/assets/b5f4ca04-d4bc-450e-bfce-d3abf98aaff2" />
<img width="560" height="526" alt="Снимок экрана 2026-05-10 232835" src="https://github.com/user-attachments/assets/d923bbe7-73bb-475f-9d84-3073961563c2" />
<img width="633" height="832" alt="Снимок экрана 2026-05-10 232858" src="https://github.com/user-attachments/assets/8cec3153-eed5-4654-9ce6-0d4fdd037fa5" />
<img width="740" height="876" alt="Снимок экрана 2026-05-10 232914" src="https://github.com/user-attachments/assets/1f2912bd-c789-4ce9-9ba9-d3180b96ab3f" />
<img width="638" height="629" alt="Снимок экрана 2026-05-10 233014" src="https://github.com/user-attachments/assets/109c9d7d-020d-4a9f-8a15-46e52dec2c63" />

# 3) Implementation Requirements (Part 1)
<img width="778" height="913" alt="Снимок экрана 2026-05-10 233610" src="https://github.com/user-attachments/assets/22145d09-de14-48b2-90f1-d5cd759eb40e" />
<img width="783" height="375" alt="Снимок экрана 2026-05-10 233634" src="https://github.com/user-attachments/assets/5e434ad9-9e4d-44dc-90b3-fae14e3caaa1" />
<img width="576" height="556" alt="Снимок экрана 2026-05-10 234136" src="https://github.com/user-attachments/assets/77a4a71c-5c0e-40dc-8dcb-539cb181ff4c" />
<img width="579" height="256" alt="Снимок экрана 2026-05-10 234147" src="https://github.com/user-attachments/assets/17984625-94c6-4abd-a3ef-58c29dc8c2d7" />
<img width="1230" height="296" alt="Снимок экрана 2026-05-10 234157" src="https://github.com/user-attachments/assets/edd6bba1-9703-466d-b0ba-e29a2a7f4085" />

# 4) Data Processing Tasks (Part 2 – Analysis)
1. How does graph size affect BFS and DFS performance?
As the number of vertices increases, the execution time of BFS and DFS increases. For example:
10 vertices: very fast execution
30 vertices: noticeable increase in execution time
100 vertices: significantly longer execution time
This happens because the AliExpress algorithm requires more vertices and nodes.

2. Which traversal is faster in your experiments?
I think that BFS is slightly faster than DFS.
But the difference is small and depends on:graph structure, starting node, edge distribution
In random graphs, performance is almost identical.
   
3. Do results match the expected complexity O(V + E)?
Yes, the results match the theoretical complexity: BFS, DFS → O(V + E).
Each vertex is visited once, and each edge is processed once.
As the graph size increases, the time increases almost linearly, confirming the theory.

4. How does graph structure affect traversal order?
BFS: visits nodes level by level, produces shortest-path-like expansion.
DFS:goes deep along one path first, backtracks when no unvisited neighbors exist.
Random graph structure changes the order heavily because adjacency lists are unordered.

5. When is BFS preferred over DFS?
BFS is used when it is necessary to: find the shortest path in an unweighted graph, traverse a graph level by level, model information dissemination
   
6. What are the limitations of DFS?
Limitations of DFS: can go too deep on a single path, uses recursion → risk of stack overflow, not suitable for finding the shortest path, dDepends on graph structure.

