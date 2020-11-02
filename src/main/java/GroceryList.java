public class GroceryList {
    private String [] arr;

    public GroceryList() {
        this.arr = new String[10];
    }

    public void add(String item) {
        for (int i = 0; i < 10; i++) {
            if (arr[i] == null) {
                arr[i] = item;
                break;
            }

        }
    }

    public void remove(String item) {
        
    }
    
}