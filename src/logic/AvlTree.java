/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logic;

public class AvlTree implements ImplementationTree<Stolen> {

    private NodeTree root;

    AvlTree() {
        root = null;
    }

    @Override
    public boolean isEmpty() {
        return root == null;
    }

    public void makeEmpty() {
        this.root = null;
    }

    @Override
    public boolean exist(int id) {
        NodeTree node = searchNode(root, id);
        if (node != null) {
            if (node.getData().getId() == id) {
                return true;
            }
        }
        return false;
    }

    @Override
    public Stolen get(int id) {
        NodeTree node = searchNode(root, id);
        if (node != null) {
            return node.getData();
        }
        return null;
    }

    public void insert(Stolen obj) {
        root = insert(root, obj);
    }

    private NodeTree insert(NodeTree node, Stolen obj) {
        if (node == null) {
            return new NodeTree(obj);
        } else if (obj.compareTo(node.getData()) == 1) {
            node.right = insert(node.right, obj);
        } else if (obj.compareTo(node.getData()) == -1) {
            node.left = insert(node.left, obj);
        } else {
            throw new RuntimeException("ERROR: Duplicated insertion");
        }
        return rebalance(node);
    }
    public void delete(int id) {
        root = delete(root, id);
    }

    private NodeTree delete(NodeTree node, int id) {
        if (node == null) {
            return node;
        } else if (id > node.getData().getId()) {
            node.right = delete(node.right, id);
        } else if (id < node.getData().getId()) {
            node.left = delete(node.left, id);
        } else {
            if (node.left == null || node.right == null) {
                if (node.left == null) {
                    node = node.right;
                } else {
                    node = node.left;
                }
            } else {
                NodeTree mostLeftChild = mostLeftChild(node.right);
                node.setData(mostLeftChild.getData());
                node.right = delete(node.right, node.getData().getId());
            }
        }
        if (node != null) {
            node = rebalance(node);
        }
        return node;
    }

    private NodeTree searchNode(NodeTree node, int id) {
        if (node == null || id == node.getData().getId()) {
            return node;
        }
        if (id < node.getData().getId()) {
            return searchNode(node.left, id);
        } else {
            return searchNode(node.right, id);
        }
    }

    private NodeTree mostLeftChild(NodeTree node) {
        NodeTree current = node;
        while (current.left != null) {
            current = current.left;
        }
        return current;
    }

    private NodeTree rebalance(NodeTree node) {
        updateHeight(node);
        int balance = getBalance(node);
        if (balance > 1) {
            if (height(node.right.right) > height(node.right.left)) {
                node = rotateLeft(node);
            } else {
                node.right = rotateRight(node.right);
                node = rotateLeft(node);
            }
        } else if (balance < -1) {
            if (height(node.left.left) > height(node.left.right)) {
                node = rotateRight(node);
            } else {
                node.left = rotateLeft(node.left);
                node = rotateRight(node);
            }

        }
        return node;
    }

    private NodeTree rotateRight(NodeTree y) {
        NodeTree x = y.left;
        NodeTree z = x.right;
        x.right = y;
        y.left = z;
        updateHeight(y);
        updateHeight(x);
        return x;
    }

    private NodeTree rotateLeft(NodeTree y) {
        NodeTree x = y.right;
        NodeTree z = x.left;
        x.left = y;
        y.right = z;
        updateHeight(y);
        updateHeight(x);
        return x;
    }

    private void updateHeight(NodeTree node) {
        node.height = 1 + Math.max(height(node.left), height(node.right));
    }

    public int getBalance(NodeTree node) {
        if (node == null) {
            return 0;
        } else {
            return height(node.right) - height(node.left);
        }
    }

    private int height(NodeTree node) {
        if (node == null) {
            return -1;
        } else {
            return node.height;
        }
    }

    public void preorder() {
        preorderHelper(root);
    }

    public void inorder() {
        inorderHelper(root);
    }

    public void postorder() {
        postorderHelper(root);
    }

    private void inorderHelper(NodeTree node) {
        if (node != null) {
            inorderHelper(node.left);
            printData(node.getData());
            inorderHelper(node.right);
        }
    }

    private void preorderHelper(NodeTree node) {
        if (node != null) {
            printData(node.getData());
            preorderHelper(node.left);
            preorderHelper(node.right);
        }
    }

    private void postorderHelper(NodeTree node) {
        if (node != null) {
            postorderHelper(node.left);
            postorderHelper(node.right);
            printData(node.getData());
        }
    }

    private void printData(Stolen stolen) {
        System.out.println("=======================");
        System.out.println("ID: " + stolen.getId());
        System.out.println("Nombre: " + stolen.getName());
        System.out.println("Fecha: " + stolen.getDate());
        System.out.println("Hora: " + stolen.getHour());
        System.out.println("Localidad: " + stolen.getNeighborhood());
        System.out.println("Objeto: " + stolen.getObject());
        System.out.println("Modalidad: " + stolen.getModusOperandi());
        System.out.println("Lugar: " + stolen.getPlace());
        System.out.println("Descripcion: " + stolen.getDescription());
        System.out.println("");
    }

    @Override
    public void deleted(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean isLeaf() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

 
}
