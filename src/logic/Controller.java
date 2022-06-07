package logic;


public class Controller {
    // Data structures of project
    public static LinkedList<Attempt> caseList = new LinkedList<>();
    public static int id = 0;
    
    public static void generateId(int lastId) {
        try {
            
        } catch(NegativeArraySizeException e) {
            
        }
    }
    
    private static int browseReport(int id) {
        int length = caseList.size();
        boolean flag = true;
        int counter = 0;
        
        while (counter < length && flag == true) {
            
            Attempt report = caseList.get(counter);
            int idReport = report.getId();
            if (id == idReport) {
                flag = false;
            }
            counter++;
        }
        
        if (flag == true) {
            return -1;
        } else {
            return counter - 1;
        }
    }
    
    public static boolean isOnTheList(String id) {
        int idInt = Integer.parseInt(id);
        int index = browseReport(idInt);
        return index != -1;
    }
    
    public static void addReport(String[] data) {
        id++;
        // CODIGO DE GENERACIÓN DE ID AQUÍ
        
        // Añadiendo en lista
        Attempt report = new Attempt();
        String[] attemptData = {Integer.toString(id), data[1], data[2], data[3], data[4], data[5]};
        report.setAllData(attemptData);
        caseList.add(report);
        
        // Añadiendo en árbol
        // ...
    }
    
    public static String[] queryReportById(String id) {
        try {
            int length = caseList.size();
            int idInt = Integer.parseInt(id);
            String[] data = new String[9];
            // Consultese en árbol y retorne todos los datos en Stolen
            
            
            return data;
        } catch (NegativeArraySizeException e) {
            String[] data = new String[9];
            return data;
        }
    }

    public static String[][] queryDataTable() {
        try {
            int length = caseList.size();
            String[][] data = new String[length][6];
            for (int i=0; i<data.length; i++) {
                Attempt infoNode = caseList.get(i);
                data[i] = infoNode.getAllData();
            }
            return data;
        } catch (NegativeArraySizeException e) {
            String[][] data = new String[0][0];
            return data;
        }
    }
    
    public static void updateReport(String id, String[] data) {
        int idInt = Integer.parseInt(id);
        int index = browseReport(idInt);
        Attempt report = caseList.get(index);
        if (report.getId() == idInt) {
            String[] attemptData = {id, data[1], data[2], data[3], data[4], data[5]};
            report.setAllData(attemptData);
        }
        
        // Agregar código para árbol
    }
    
    public static void deleteReport(String id) {
        int idInt = Integer.parseInt(id);
        int index = browseReport(idInt);
        Attempt report = caseList.get(index);
        if (report.getId() == idInt) {
            caseList.remove(index);
        }
    }
}