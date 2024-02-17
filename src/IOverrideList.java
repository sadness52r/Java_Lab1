import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public interface IOverrideList<T> {
    public int size();
    public boolean isEmpty();
    public boolean contains(T val);
    public Iterator<List<T>> iterator();
    public T[] toArray();
    //public <T> T[] toArray(T[] a);
    public boolean add(List<T> ts);
    public boolean remove(T o);
    public boolean containsAll(Collection<?> c);
    public boolean addAll(Collection<? extends List<T>> c);
    public boolean addAll(int index, Collection<? extends List<T>> c);
    public boolean removeAll(Collection<?> c);
    public boolean retainAll(Collection<?> c);
    public void clear();
    public List<T> get(int index);
    public List<T> set(int index, List<T> element);
    //public void add(int index, List<T> element);
    public List<T> remove(int index);
    public int indexOf(T t);
    public int lastIndexOf(T t);
    public ListIterator<List<T>> listIterator();
    public ListIterator<List<T>> listIterator(int index);
    public List<List<T>> subList(int fromIndex, int toIndex);
}
