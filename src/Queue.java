public interface Queue<T> 

{
public T serve( );

public void enqueue(T e);

public int length( );

public boolean full( );

public int multiEnqueue(T cls[], int k);

public int multiServe(T cls[], int k);



}
