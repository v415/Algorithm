package data.tree;

import data.line.LinkedList.LinkedList;
import data.set.Set;

public class LinkedListSet<E> implements Set<E>{
	LinkedList<E> list =new LinkedList<>();

	@Override
	public void add(E e) {
		if(!list.contains(e))
			list.addFirst(e);
	}

	@Override
	public void remove(E e) {
		list.removeElement(e);
		
	}

	@Override
	public boolean contains(E e) {
		return list.contains(e);
	}

	@Override
	public int getSize() {
		return list.getSize();
	}

	@Override
	public boolean isEmpty() {
		return list.isEmpty();
	}

}
