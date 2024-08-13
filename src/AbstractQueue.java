public abstract class AbstractQueue<T> implements Queue<T>{

    protected int top = -1;
    protected int base = -1;
    protected T[] data;

    public AbstractQueue(int size) {
        this.data = (T[]) new Object[size];
    }

    public void add(T data){
        try{
            if(this.top == this.data.length) {
                throw new Exception("A fila chegou ao fim \uD83D\uDE2D");
            }
            this.top += 1;
            this.data[this.top] = data;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    public T retrieve() {
        try {
            if(this.base == this.top) {
                throw new Exception("Sem itens na fila \uD83D\uDE2D");
            }
            this.base += 1;
            return this.data[this.base];
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }

    }

    public void clear() {
        this.top = -1;
        this.base = -1;
    }

    public boolean isFull() {
        return this.top == this.data.length;
    }

    public boolean isEmpty() {
        return this.top == this.base;
    }



}
