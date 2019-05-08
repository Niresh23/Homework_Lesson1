public class MyArrayDataException extends Exception {
    public MyArrayDataException(String string, int i, int j) {
        System.out.printf("Ошибка в ячейке[%d][%d]. Строка %s не может быть преобразована в числовое значение.\n", i, j, string);
    }
}
