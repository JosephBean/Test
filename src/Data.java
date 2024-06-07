import java.util.ArrayList;
import java.util.List;


import java.util.List;

class Data<T, E> {
	
	
	  private T t;
	  private E e;
	  private List<Object[]> list;
	  public Data() {
	    list = new ArrayList<Object[]>();
	  }
	  public void put(T t, E e) {
	    Object[] o = new Object[2];
	    o[0] = t;
	    o[1] = e;
	    list.add(o);
	  }
	  public E get(T t) {
	    for(Object[] o : list) {
	      if(t.equals(o[0])) e = (E) o[1];
	    }
	    return e;
	  }
	  
	  
	}


