package logic;


public class Tops implements Comparable<Tops> {
    public String data;
    public int numRobberies; // Número de reportes en el lugar

    public Tops(String data, int number) {
        this.numRobberies = number;
        this.data = data;
    }

    public int getNumRobberies() {
        return numRobberies;
    }

    public void setNumRobberies(int numRobberies) {
        this.numRobberies = numRobberies;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
    
    @Override
    public int compareTo(Tops top) {
        if (numRobberies > top.numRobberies) {
            return 1;
        } else if (numRobberies < top.numRobberies) {
            return -1;
        } else {
            return 0;
        }
    }

}
