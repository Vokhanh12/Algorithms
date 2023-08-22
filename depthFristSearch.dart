import 'dart:collection';
import 'dart:ffi';
import 'dart:io';

void main() {
  Graph graph;

  graph = Graph(5);

  graph.addNode(Node('A'));
  graph.addNode(Node('B'));
  graph.addNode(Node('C'));
  graph.addNode(Node('D'));
  graph.addNode(Node('E'));

  graph.addEgde(0, 1);
  graph.addEgde(1, 2);
  graph.addEgde(1, 4);
  graph.addEgde(2, 3);
  graph.addEgde(2, 4);
  graph.addEgde(4, 0);
  graph.addEgde(4, 2);

  graph.printGraph();
  graph.print_matrix();
  graph.depthFristSearch(3);
}

class Graph {
  int _size;
  List<List<Node>> aList = [];
  List<List<int>> matrix = [];

  Graph(this._size) {
    matrix = List.generate(_size, (i) => List<int>.filled(_size, 0));
  }

  void addNode(Node node) {
    List<Node> currentLst = [];

    currentLst.add(node);

    aList.add(currentLst);
  }

  void addEgde(int src, int dst) {
    List<Node> currentLst = aList[src];

    Node dstNode = aList[dst][0];

    currentLst.add(dstNode);
    matrix[src][dst] = 1;
  }

  bool checkEgde(int src, int dst) {
    List<Node> currenList = aList[src];
    Node dstNode = aList[dst][0];

    for (Node node in currenList) {
      if (node == dstNode) {
        return true;
      }
    }

    return false;
  }

  void printGraph() {
    for (List<Node> currenList in aList) {
      for (Node node in currenList) {
        stdout.write("${node.data} -> ");
      }
      stdout.write('\n');
    }
  }

  void print_matrix() {
    for (int i = 0; i < _size; i++) {
      for (int j = 0; j < _size; j++) {
        stdout.write(' ${matrix[i][j]}');
      }
      stdout.write('\n');
    }
  }

  void depthFristSearch(int src) {
    List<bool> visited = List.filled(matrix.length, false);
    dFSHelper(src, visited);
  }

  void dFSHelper(int src, List<bool> visisted) {
    if (visisted[src]) {
      return;
    } else {
      visisted[src] = true;

      stdout.write('${aList[src][0].data} == visited \n');
    }

    for (int i = 0; i < matrix[src].length; i++) {
      if (matrix[src][i] == 1) {
        dFSHelper(i, visisted);
      }
    }
    return;
  }
}

class Node {
  String? data;

  Node(this.data);
}
