    package controllers;

    import java.util.HashSet;
    import java.util.List;
    import java.util.Set;
    import models.Node;

    public class Graph {
        private Set<Node> nodes;  

        public Graph(){
            nodes = new HashSet<>();
        }

        // Agregar un nodo
        public Node addNode(int value){
            Node node = new Node(value);
            nodes.add(node);

            return node;
        }

        // Metodo para agregar una arista
        public void addEdge(Node src, Node dest){
            src.addNeighbor(dest);
            dest.addNeighbor(src);
        }

        public void addEdgeUni(Node scr, Node dest){
            scr.addNeighbor(dest);
        }

        // Metodo para impromir el grafo
        // Para cada nodo imprime sus conexiones.
        public void printGraph() {
            for (Node node : nodes) {
                System.out.print("Vertex " + node.getValue() + ": ");
                List<Node> vecinos = node.getNeighbors();
                
                vecinos.sort((n1, n2) -> Integer.compare(n1.getValue(), n2.getValue()));

                if (vecinos != null && !vecinos.isEmpty()) {
                    for (int i = 0; i < vecinos.size(); i++) {
                        System.out.print(vecinos.get(i).getValue());
                        if (i < vecinos.size() - 1) { 
                            System.out.print(" -> ");
                        }
                    }
                } 
                System.out.println();
            }
        }

        // Metodo DFS
        public void getDFS(Node startNode){

        }

        private void getDFSUtil(Node node, Boolean[] visited){

        }

        public void getBFS(Node startNode){

        }

        public int[][] getAdjacencyMatrix(){
            return null;
        }

        public void printAdjacencyMatrix(){

        }
    }
