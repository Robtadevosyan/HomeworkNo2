package classwork.lesson7;

public class Room {

    int height;
    int length;
    int width;

    Room() {
    }

    public Room(int height, int length, int width) {
        this.height = height;
        this.length = length;
        this.width = width;
    }

    long calculateVolume(int length, int height, int width) {
        return length * height * width;


    }
}
