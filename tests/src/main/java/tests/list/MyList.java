//package tests.list;
//
//import java.util.Collection;
//import java.util.Iterator;
//import java.util.List;
//import java.util.ListIterator;
//
///**
// * @author amos
// * @date 2017-09-18
// */
//public interface MyList<E>{
//
//    public int size();
//
//    default boolean isEmpty() {
//        return size() == 0;
//    }
//
//    public boolean contains(Object o);
//
//    public Iterator<E> iterator();
//
//    default Object[] toArray() {
//        Iterator<E> iterator = iterator();
//        Object[] objs = new Object[size()];
//        int i = 0;
//        while (iterator.hasNext()) {
//            objs[i++] = iterator.next();
//        }
//
//        return objs;
//    }
//
//    public <T> T[] toArray(T[] a);
//
//    @Override
//    public boolean add(E e) {
//        return false;
//    }
//
//    @Override
//    public boolean remove(Object o) {
//        return false;
//    }
//
//    @Override
//    public boolean containsAll(Collection<?> c) {
//        return false;
//    }
//
//    @Override
//    public boolean addAll(Collection<? extends E> c) {
//        return false;
//    }
//
//    @Override
//    public boolean addAll(int index, Collection<? extends E> c) {
//        return false;
//    }
//
//    @Override
//    public boolean removeAll(Collection<?> c) {
//        return false;
//    }
//
//    @Override
//    public boolean retainAll(Collection<?> c) {
//        return false;
//    }
//
//    @Override
//    public void clear() {
//
//    }
//
//    @Override
//    public boolean equals(Object o) {
//        return false;
//    }
//
//    @Override
//    public int hashCode() {
//        return 0;
//    }
//
//    @Override
//    public E get(int index) {
//        return null;
//    }
//
//    @Override
//    public E set(int index, E element) {
//        return null;
//    }
//
//    @Override
//    public void add(int index, E element) {
//
//    }
//
//    @Override
//    public E remove(int index) {
//        return null;
//    }
//
//    @Override
//    public int indexOf(Object o) {
//        return 0;
//    }
//
//    @Override
//    public int lastIndexOf(Object o) {
//        return 0;
//    }
//
//    @Override
//    public ListIterator<E> listIterator() {
//        return null;
//    }
//
//    @Override
//    public ListIterator<E> listIterator(int index) {
//        return null;
//    }
//
//    @Override
//    public List<E> subList(int fromIndex, int toIndex) {
//        return null;
//    }
//}
