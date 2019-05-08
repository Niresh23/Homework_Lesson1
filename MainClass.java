import java.awt.*;

public class MainClass {
    public static void main(String[] args) {
        String[][] array = new String[5][4];
        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array[0].length; j++) {
                array[i][j] = "" + j;
            }
        }

        try {
            System.out.println(sum(array));
        } catch(MyArraySizeException e) {

        } catch(MyArrayDataException e) {

        }
    }

    public static int sum(String[][] array) throws MyArraySizeException, MyArrayDataException {
        int result = 0;
        if(array.length != 4 || array[0].length != 4) throw new MyArraySizeException(array.length, array[0].length);
        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array[0].length; j++) {
                if(!array[i][j].matches("\\d+")) throw new MyArrayDataException(array[i][j], i, j);
                result += Integer.parseInt(array[i][j]);
            }
        }
        return result;
    }
}
