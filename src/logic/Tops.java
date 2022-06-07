/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logic;

public class Tops implements Comparable<Tops> {

    public int number;
    public String located;

    public Tops(int number, String located) {

        this.number = number;
        this.located = located;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getLocated() {
        return located;
    }

    public void setLocated(String located) {
        this.located = located;
    }

    public int compareTo(Tops top) {
        if (number > top.number) {
            return 1;
        } else if (number < top.number) {
            return -1;
        } else {
            return 0;
        }
    }

}
