public class classwork5 {

    public static void main(String[] args) {
        long arrName[] = new long[3];
        arrName[0] = 1l;
        arrName[1] = 3l;
        arrName[2] = 4l;
        for (int i = 0; i < 3; i++) {
            System.out.println(arrName[i]);
        }
        for (long elem : arrName) {
            System.out.println(elem);
        }

        int arrNam[] = new int[10];
        arrNam[0] = 34;
        arrNam[1] = 4;
        arrNam[2] = 6;
        arrNam[3] = 87;
        arrNam[4] = 98;
        arrNam[5] = 33;
        arrNam[6] = 8;
        arrNam[7] = 123;
        arrNam[8] = 78;
        arrNam[9] = 24;

        int max = arrNam[0];

        for (int i = 0; i < arrNam.length; i++) {
            if (max < arrNam[i]) {
                max = arrNam[i];

            }
        }
        System.out.println(max);
    }
    }
