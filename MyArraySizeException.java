public class MyArraySizeException extends Exception {
    public  MyArraySizeException(int a, int b) {
        System.out.printf("Ваш передаваемый массив размера [%d][%d], а нужно передать размером [4][4].\n", a, b);
    }
}
