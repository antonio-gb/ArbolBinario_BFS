package Estructura_2_Parcial;

import java.util.LinkedList;
import java.util.Queue;

public class ArbolBinBFS {
    public static void main (String[] args){


Node a = new Node(1); 
Node b = new Node(2);
Node c = new Node(3);
Node d = new Node(4);
Node e = new Node(5);
Node f = new Node(6);
Node g = new Node(7);

a.left =b;
a.right=c;
b.left=d;
b.right=e;
c.right=g;
c.left=f;

System.out.println("Metodo de recorrida BFS (Breath First Search)");
BFS(a);


}


public static void BFS(Node raiz){
Queue<Node> cola = new LinkedList<>();

cola.add(raiz);

while(!cola.isEmpty()){
    Node temp = cola.poll();
    if(temp!=null)
        System.out.print(temp.value + " ");

    if(temp == null) { //Si hay algun nodo vacío, le da el valor de null y continua con el siguiente.
        System.out.println();
        if(cola.isEmpty()) break;
        cola.add(null);
        continue;
    }

 
    if (temp.left != null) {
        cola.add(temp.left);
    }

    if (temp.right != null) {
        cola.add(temp.right);
}
}

}
}