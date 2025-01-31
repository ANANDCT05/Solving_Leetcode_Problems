class Solution {
    private int longestCycle = -1; 
    private int maxPairsAndChains = 0; 

    public int maximumInvitations(int[] favorite) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        int n = favorite.length;
        for (int i = 0; i < n; i++)
            adj.add(new ArrayList<>());

        for (int i = 0; i < n; i++) {
            adj.get(i).add(favorite[i]);
        }

        int longestCycleLength = findLongestCycle(adj);
        int chainAndPairLength = handleChainsAndPairs(favorite);

        return Math.max(longestCycleLength, chainAndPairLength);
    }
    
    public int findLongestCycle(ArrayList<ArrayList<Integer>> adj) {
        int n = adj.size();
        boolean[] visited = new boolean[n];
        boolean[] currVisited = new boolean[n];
        int[] discoveryTime = new int[n];
        Arrays.fill(discoveryTime, -1);

        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                cycle(i, visited, currVisited, discoveryTime, 0, adj);
            }
        }

        return longestCycle;
    }

    private void cycle(int node, boolean[] visited, boolean[] currVisited, int[] discoveryTime, int time, ArrayList<ArrayList<Integer>> adj) {
        visited[node] = true;
        currVisited[node] = true;
        discoveryTime[node] = time;

        for (int neighbor : adj.get(node)) {
            if (!visited[neighbor]) {
                cycle(neighbor, visited, currVisited, discoveryTime, time + 1, adj);
            } else if (currVisited[neighbor]) {
                int cycleLength = time - discoveryTime[neighbor] + 1; 
                longestCycle = Math.max(longestCycle, cycleLength);  
            }
        }

        currVisited[node] = false;
    }

    private int handleChainsAndPairs(int[] favorite) {
        int n = favorite.length;
        int[] inDegree = new int[n];
        for (int i = 0; i < n; i++) {
            inDegree[favorite[i]]++;
        }

        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            if (inDegree[i] == 0) {
                queue.add(i);
            }
        }

        int[] chainLengths = new int[n];
        while (!queue.isEmpty()) {
            int node = queue.poll();
            int fav = favorite[node];
            chainLengths[fav] = Math.max(chainLengths[fav], chainLengths[node] + 1);
            inDegree[fav]--;
            if (inDegree[fav] == 0) {
                queue.add(fav);
            }
        }

        boolean[] visited = new boolean[n];
        int totalPairsAndChains = 0;

        for (int i = 0; i < n; i++) {
            if (favorite[favorite[i]] == i && i < favorite[i]) { 
                int chain1 = chainLengths[i];
                int chain2 = chainLengths[favorite[i]];
                totalPairsAndChains += 2 + chain1 + chain2; 
            }
        }

        return totalPairsAndChains;
    }
}
