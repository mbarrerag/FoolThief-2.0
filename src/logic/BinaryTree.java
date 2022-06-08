package logic;


public class BinaryTree implements ImplementationTree<Tops> {

    private BinaryTree left;
    private BinaryTree right;
    private Tops value;

    @Override
    public boolean itsEmpty() {
        return value == null;
    }

    @Override
    public void makeEmpty() {
        value = null;
        right = null;
        left = null;
    }

    @Override
    public boolean exist(int id) {
        if (value == null) {
            if (id == value.getNumRobberies()) {
                return true;

            } else if (id < value.getNumRobberies() && left != null) {
                return left.exist(id);
            } else if (id < value.getNumRobberies() && right != null) {
                return right.exist(id);
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    @Override
    public Tops get(int id) {
        if (value != null) {
            if (id == value.getNumRobberies()) {
                return value;
            } else if (id < value.getNumRobberies() && left != null) {
                return left.get(id);
            } else if (id > value.getNumRobberies() && left != null) {
                return right.get(id);
            } else {
                return null;
            }
        } else {
            return null;
        }
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
            } else if (top.compareTo(top) >= 0) {
                if (right == null) {
                    right = new BinaryTree();
                }
                right.insert(top);
            } else {
                //throw new RuntimeException("Insertando un dato duplicado");
                System.out.println("No se inserto " + top.getData() + ", dato duplicado");
            }
        }
    }

    @Override
    public void delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void preorder() {
        if (value != null) {
            System.out.println(value.getData());
            if (left != null) {
                left.preorder();
            }
            if (right != null) {
                right.preorder();
            }
        }
    }

    @Override
    public void inorder() {
        if (value != null) {
            if (left != null) {
                left.inorder();
            }
            System.out.println(value.getData());
            if (right != null) {
                right.inorder();
            }
        }
    }

    @Override
    public void postorder() {
        if (value != null) {
            if (left != null) {
                left.postorder();
            }
            if (right != null) {
                right.postorder();
            }
            System.out.println(value.getData());
        }
    }
    
    public String inorderData() {
        String data = "";
        if (value != null) {
            if (left != null) {
                data += left.inorderData();
            }
            data += value.getData() + ",";
            if (right != null) {
                data += right.inorderData();
            }
        }
        return data;
    }

    @Override
    public boolean isLeaf() {
        return value != null && left == null && right == null;
    }
}
