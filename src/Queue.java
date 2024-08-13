public interface Queue <T>{

    public void add(T data);
    public T retrieve();
    public void clear();
    public boolean isFull();
    public boolean isEmpty();
}
