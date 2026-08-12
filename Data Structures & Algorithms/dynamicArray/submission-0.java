class DynamicArray {

    private int [] array;
    private int capacity;
    private int size;

    public DynamicArray(int capacity) {
        this.array = new int[capacity];
        this.capacity = capacity;
        this.size = 0;
    }

    public int get(int i) {
        return this.array[i];
    }

    public void set(int i, int n) {
        this.array[i] = n;
    }

    public void pushback(int n) {
        if(this.size == this.array.length){
            this.resize();
        }
        this.array[this.size] = n;
        this.size += 1;
    }

    public int popback() {
        int return_value = this.array[this.size-1];
        this.array[this.size-1] = 0;
        this.size -= 1;
        return return_value;
    }

    private void resize() {
        int [] temparray = new int[this.capacity*2];
        for(int i=0;i<this.capacity;i++){
            temparray[i] = this.array[i];
        }
        this.array = temparray;
        this.capacity *= 2;
    }

    public int getSize() {
        return this.size;
    }

    public int getCapacity() {
        return this.capacity;
    }
}
