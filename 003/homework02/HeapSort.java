public class HeapSort {
    public static void main(String[] args) {
        int[] numbers = new int[] {5, 3, 5, 3, 4, 4, 3, 2, 5, 4};
        sort(numbers);
        System.out.print("[ ");
        for (int element : numbers) {
            System.out.print(element + " ");
        }
        System.out.print("]");
    }

    public static void sort(int[] array) {
        int arrayLength = array.length;
        // Построение кучи (перегруппировка массива)
        for (int i = arrayLength / 2 - 1; i >= 0; i--) {
            heapify(array, arrayLength, i);
        }

        // Один за другим извлекаем элементы из кучи
        for (int i = arrayLength - 1; i >= 0; i--) {
            // Перемещаем текущий корень в конец
            int temp = array[0];
            array[0] = array[i];
            array[i] = temp;

            // Вызываем процедуру heapify на уменьшенной куче
            heapify(array, i, 0);
        }
    }

    private static void heapify(int[] array, int heapSize, int rootIndex) {
        int largest = rootIndex; // инициализируем наибольший элемент как корень
        int leftChild = 2 * rootIndex + 1; // левый = 2 * rootIndex + 1
        int rightChild = 2 * rootIndex + 2; // правый = 2 * rootIndex + 2

        // Если левый дочерний элемент больше, чем самый большой элемент на данный момент
        if (leftChild < heapSize && array[leftChild] > array[largest]) {
            largest = rightChild;
        }
        // Если самы большой элемент не корень
        if (largest != rootIndex) {
            int temp = array[rootIndex];
            array[rootIndex] = array[largest];
            array[largest] = temp;

            // Рекурсивно преобразуем в двоичную кучу затронутое поддерево
            heapify(array, heapSize, largest);
        }

    }
}
