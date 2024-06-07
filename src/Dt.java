import java.util.List;

public interface Dt<T, E> {

		public void put(T t, E e);
		public E get(T t);
		public List<T> getkey();
		
}
