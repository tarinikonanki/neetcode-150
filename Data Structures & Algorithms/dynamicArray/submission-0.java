class DynamicArray {

    private Integer[] dynamicArray;

    private int size;

    public DynamicArray(int capacity) {
        dynamicArray = new Integer[capacity];
        size = 0;
    }

    public int get(int i) {
        return dynamicArray[i];
    }

    public void set(int i, int n) {
        dynamicArray[i] = n;
    }

    public void pushback(int n) {
       if(size == dynamicArray.length){
            resize();
       }
       dynamicArray[size] = n;
       size++;
    }

    public int popback() {
        int temp = dynamicArray[size - 1];
        dynamicArray[size - 1] = null;
        size--;
        return temp;
    }

    private void resize() {
        int newSize = dynamicArray.length * 2;
        Integer[] dynamicArray2 = new Integer[newSize];
        for(int i = 0; i < dynamicArray.length; i++){
            dynamicArray2[i] = dynamicArray[i];
        }
        dynamicArray = dynamicArray2;
    }

    public int getSize() {
        return size;
    }

    public int getCapacity() {
        return dynamicArray.length;
    }
}
