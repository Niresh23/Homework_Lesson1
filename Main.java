

public class Main {
    public static int[] getAfterFour ( int[] array){
        int indexLastFour = 0;
        boolean isFour = false;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 4) {
                indexLastFour = i;
                isFour = true;
            }
        }
        int[] result = new int[array.length - indexLastFour - 1];
        if (!isFour) throw new RuntimeException("There isn't four");
        int k = 0;
        for (int i = (indexLastFour + 1); i < array.length; i++) {
            result[k] = array[i];
            k++;
        }
        return result;
    }

    public boolean checkOneAndFour(int[] array) {
        boolean result = false;
        for(int i : array) {
            if(i == 1 || i == 4){
                result = true;
                break;
            }
        }
        return result;
    }
}
