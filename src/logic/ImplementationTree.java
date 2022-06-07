/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logic;

public interface ImplementationTree<T extends Comparable>  {
  
    void insert(T top);
    
    boolean exist(int id);
    
    T get(int id);
    
    void deleted(int id);
    
    boolean isLeaf();
    
    boolean isEmpty();
    
    void preorder();
    
    void inorder();
    
    void postorder();
}    
