/**
 * Created by pst on 06.02.2017.
 */
public class Box {

    int height, depth, width;
    private int boxID; // Скрытые переменные
    final int GRANI = 6;
    static int count;

    public void setBoxID(int boxID) { // Установить значение скрытой переменной
        this.boxID = boxID;
    }
    public int getBoxID() { // Получить значение скрытой переменной
        return boxID;
    }

    Box(int height, int depth, int width) {
        this.height = height;
        this.depth = depth;
        this.width = width;
        count++;
    }

    Box() {
    }

    Box(int r) {
        this.height = r;
        this.depth = r;
        this.width = r;
    }

    public int getVolume() {
        int volume = height * depth * width;
        // System.out.println("Объём коробки равен: " + volume);
        return volume;
    }

    public boolean equals(Box box) {
        if ((box.height == height) &&
                (box.width == width) &&
                (box.depth == depth))
            return true;
        else return false;
    }

    public boolean equalsByVolume(Box box) {
        if (box.getVolume() == getVolume())
            return true;
        else return false;
    }
}
