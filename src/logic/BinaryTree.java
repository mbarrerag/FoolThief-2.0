/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logic;

/**
 *
 * @author Stepe
 */
public class BinaryTree implements ImplementationTree<Tops> {

    NodeTree root;
    private BinaryTree left;
    private BinaryTree right;
    private Tops value;

    @Override
    public boolean isEmpty() {
        return value == null;
    }

    @Override
    public boolean isLeaf() {
        return value != null && left == null && right == null;
    }

    @Override
    public void insert(Tops top) {
        if (value == null) {
            this.value = top;
        } else {
            if (top.compareTo(value) < 0) {
                if (left == null) {
                    left = new BinaryTree();
                }
                left.insert(top);
            } else if (top.compareTo(top) > 0) {
                if (right == null) {
                    right = new BinaryTree();
                }
                right.insert(top);
            } else {
                throw new RuntimeException("Insertando un dato duplicado");
            }

        }
    }

    @Override
    public boolean exist(int id) {
        if (value == null) {
            if (id == value.getNumber()) {
                return true;

            } else if (id < value.getNumber() && left != null) {
                return left.exist(id);
            } else if (id < value.getNumber() && right != null) {
                return right.exist(id);
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    @Override
    public Tops obtein(int id) {
        if (value != null) {
            if (id == value.getNumber()) {
                return value;
            } else if (id < value.getNumber() && left != null) {
                return left.obtein(id);
            } else if (id > value.getNumber() && left != null) {
                return right.obtein(id);
            } else {
                return null;
            }
        } else {
            return null;
        }
    }
    
    @Override
    public void preorden() {
        if (value != null) {
            System.out.println(value.getNumber());
            if (left != null) {
                left.preorden();
            }
            if (right != null) {
                right.preorden();
            }
        }
    }
    public void inorden(){
        if( value != null){
            if(left != null){
                left.inorden();
            }
            System.out.println(value.getNumber());
            if( right != null){
                right.inorden();
    
                }
            }
        }

    @Override
    public void deleted(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void postorden() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}



    


     

