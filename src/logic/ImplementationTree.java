/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logic;

public interface ImplementationTree<T extends Comparable>  {
  
    void insert(T obj);
    
    boolean exist(int id);
    
    T get(int id);
    
    void delete(int id);
    
    boolean isLeaf();
    
    boolean isEmpty();
    
    void preorder();
    
    void inorder();
    
    void postorder();
}    
