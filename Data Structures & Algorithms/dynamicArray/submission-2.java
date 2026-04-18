class DynamicArray {
    private int capacity ;
    private int[] arr ;
    private int s;

    public DynamicArray(int Capacity) {
        capacity = Capacity;
        arr = new int[capacity];
    }

    public int get(int i) {
        return arr[i];
        
    }

    public void set(int i, int n) {
        arr[i] = n;
        
    }

    public void pushback(int n) {
        
         
      if (s < capacity) {
        arr[s] = n; 
        s++;
        }else{
            this.resize();
            arr[s] = n; 
            s++;
        }

    }

    public int popback()throws  Exception {
        if (s == 0) {
            throw new Exception("OOOOUUUTTT!!");
        }
        s--;
        return arr[s];
    }

    private void resize() {
        int[] a = new int[capacity*2];
        for(int i = 0; i<capacity;i++){
            a[i]= arr[i];
        }
        arr = a;
        capacity=capacity*2 ;
        
    }

    public int getSize() {

        return s;
    }

    public int getCapacity() {
        return capacity;
    }
}
