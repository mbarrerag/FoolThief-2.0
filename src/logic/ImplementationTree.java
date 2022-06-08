/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logic;

public interface ImplementationTree<T extends Comparable>  {
  
    boolean itsEmpty();
    
    void makeEmpty();
    
    boolean exist(int id);
    
    T get(int id);
    
    void insert(T obj);
    
    void delete(int id);

    void preorder();
    
    void inorder();
    
    void postorder();
    
    boolean isLeaf();
}    
