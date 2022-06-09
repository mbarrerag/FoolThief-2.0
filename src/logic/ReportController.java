package logic;


public class ReportController {

    public static AvlTree reportTree = new AvlTree();
    public static LinkedList<Attempt> caseList = new LinkedList<>();

    public static int id = 0;
    
    /*
    public static void generateId(int lastId) {
        try {

        } catch (NegativeArraySizeException e) {

        }
    }*/

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

        // Añadiendo al arbol AVL
        Stolen stolen = new Stolen();
        String[] stolenData = new String[9];
        stolenData[0] = Integer.toString(id);
        for (int i = 1; i < 9; i++) {
            stolenData[i] = data[i - 1];
        }
        stolen.setAllData(stolenData);
        reportTree.insert(stolen);

        // Añadiendo a la lista
        Attempt report = new Attempt();
        String[] attemptData = {Integer.toString(id), data[1], data[2], data[3], data[4], data[5]};
        report.setAllData(attemptData);
        caseList.add(report);
    }

    public static String[][] queryDataTable() {
        try {
            int length = caseList.size();
            String[][] data = new String[length][6];
            for (int i = 0; i < data.length; i++) {
                Attempt infoNode = caseList.get(i);
                if (infoNode != null) {
                    data[i] = infoNode.getAllData();
                }
            }
            return data;
        } catch (NegativeArraySizeException e) {
            String[][] data = new String[0][0];
            return data;
        }
    }

    public static boolean existReport(String id) {
        int idInt = Integer.parseInt(id);
        return reportTree.exist(idInt);
    }

    public static String[] queryReportById(String id) {
        try {
            int idInt = Integer.parseInt(id);
            String[] data = new String[9];
            if (reportTree.exist(idInt)) {
                Stolen stolen = reportTree.get(idInt);
                data = stolen.getAllData();
            }

            return data;
        } catch (NegativeArraySizeException e) {
            String[] data = new String[9];
            return data;
        }
    }

    public static void updateReport(String id, String[] data) {
        int idInt = Integer.parseInt(id);
        int index = browseReport(idInt);

        // Modificando en el árbol AVL
        Stolen stolen = reportTree.get(idInt);
        if (stolen == null) {
            throw new RuntimeException("ERROR: El ID no existe");
        } else {
            String[] stolenData = new String[9];
            stolenData[0] = id;
            for (int i = 1; i < 9; i++) {
                stolenData[i] = data[i - 1];
            }
            stolen.setAllData(stolenData);
        }

        // Modificando en lista
        Attempt attempt = caseList.get(index);
        if (attempt.getId() == idInt) {
            String[] attemptData = {id, data[1], data[2], data[3], data[4], data[5]};
            attempt.setAllData(attemptData);
        }
    }

    public static void deleteReport(String id) {
        int idInt = Integer.parseInt(id);
        int index = browseReport(idInt);

        // Eliminando en lista
        Attempt report = caseList.get(index);
        if (report.getId() == idInt) {
            caseList.remove(index);
        }

        // Eliminando en árbol AVL
        if (reportTree.exist(idInt)) {
            reportTree.delete(idInt);
        }
    }
}
