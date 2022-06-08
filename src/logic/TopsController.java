package logic;


public class TopsController {
    
    public static BinaryTree treeTop = new BinaryTree();
    private static String[] neighborhoods = new String[]{"Usaquen", "Chapinero", "Santa Fe", "San Cristobal", "Usme", "Tunjuelito", "Bosa", "Kennedy", "Fontibon", "Engativa", "Suba", "Barrios Unidos", "Teusaquillo", "Los Martires", "Antonio Nariño", "Puente Aranda", "La Candelaria", "Rafael Uribe Uribe", "Ciudad Bolivar", "Sumapaz"};
    private static String[] objects = new String[] {"Billetera", "Celular", "Bolso", "Bicicleta", "Vehiculo", "Computador", "Papeles"};
    private static String[] modusOperandi = new String[] {"Raponazo", "Cosquilleo", "Asalto", "Paseo Millonario", "Estafa"};
    private static int[] countNeighborhoods  = new int[neighborhoods.length];
    private static int[] countObjects = new int[objects.length];
    private static int[] countModusOperandi = new int[modusOperandi.length];
    
    public static String[] getNeighborhoods() {
        return neighborhoods;
    }

    public static String[] getObjects() {
        return objects;
    }
    
    public static String[] getModusOperandi() {
        return modusOperandi;
    }
    
    public static void addReportCount(String neighborhood, String object, String modus) {
        int n = countNeighborhoods.length;
        for (int i=0; i<n; i++) {
            if (neighborhood == neighborhoods[i]) {
                countNeighborhoods[i]++;
                break;
            }
        }
        
        int m = countObjects.length;
        for (int i=0; i<m; i++) {
            if (object == objects[i]) {
                countObjects[i]++;
                break;
            }
        }
        
        int l = countModusOperandi.length;
        for (int i=0; i<l; i++) {
            if (modus == modusOperandi[i]) {
                countModusOperandi[i]++;
                break;
            }
        }
    }
    
    public static void deleteReportCount(String neighborhood, String object, String modus) {
        int n = countNeighborhoods.length;
        for (int i=0; i<n; i++) {
            if (neighborhood == neighborhoods[i]) {
                countNeighborhoods[i]--;
                break;
            }
        }
        
        int m = countObjects.length;
        for (int i=0; i<m; i++) {
            if (object == objects[i]) {
                countObjects[i]--;
                break;
            }
        }
        
        int l = countModusOperandi.length;
        for (int i=0; i<l; i++) {
            if (modus == modusOperandi[i]) {
                countModusOperandi[i]--;
                break;
            }
        }
    }
    
    public static String[] topNeighborhoods() {
        if (treeTop.itsEmpty() == false) {
            treeTop.makeEmpty();
        }
        
        int n = countNeighborhoods.length;
        for (int i=0; i<n; i++) {
            Tops top = new Tops(neighborhoods[i], countNeighborhoods[i]);
            treeTop.insert(top);
        }
        
        String dataString = treeTop.inorderData();
        String[] data = dataString.split(",");
        return data;
    }
    
    public static String[] topObjects() {
        if (treeTop.itsEmpty() == false) {
            treeTop.makeEmpty();
        }
        
        int n = countObjects.length;
        for (int i=0; i<n; i++) {
            Tops top = new Tops(objects[i], countObjects[i]);
            treeTop.insert(top);
        }
        
        String dataString = treeTop.inorderData();
        String[] data = dataString.split(",");
        return data;
    }
    
    public static String[] topModusOperandi() {
        if (treeTop.itsEmpty() == false) {
            treeTop.makeEmpty();
        }
        
        int n = countModusOperandi.length;
        for (int i=0; i<n; i++) {
            Tops top = new Tops(modusOperandi[i], countModusOperandi[i]);
            treeTop.insert(top);
        }
        String dataString = treeTop.inorderData();
        String[] data = dataString.split(",");
        return data;
    }
    
    public static void displayData() {
        int n = countNeighborhoods.length;
        for (int i=0; i<n; i++) {
            System.out.println(neighborhoods[i] + ": " + countNeighborhoods[i]);
        }
        System.out.println("");
        int m = countObjects.length;
        for (int i=0; i<m; i++) {
            System.out.println(objects[i] + ": " + countObjects[i]);
        }
        System.out.println("");
        int l = countModusOperandi.length;
        for (int i=0; i<l; i++) {
            System.out.println(modusOperandi[i] + ": " + countModusOperandi[i]);
        }
        System.out.println("");
    }
}
