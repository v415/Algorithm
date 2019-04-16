
public class Array<E> {
	private int size;
	private E[] data;

	// 构造函数，传入数组的容量capacity构造Array
	public Array(int capacity) {
		data = (E[]) new Object[capacity];
		size = 0;
		
	}

	// 无参数的构造，默认数组大小是10
	//public Array() { this(capacity:10);}

	// 获取数组长度
	public int getLength() {
		return data.length;
	}

	// 获取数组元素个数
	public int getSize() {
		return size;
	}

	// 获取数组是否为空
	public boolean isEmpty() {
		return size == 0;
	}

	// 在index索引位置插入一个新元素e
	public void add(int index, E e) {
		if (index < 0 || index > size)
			throw new IllegalArgumentException("Add failed. Require index >= 0 and index <= size.");
		if (size == data.length)
			resize(2 * data.length);
		for (int i = size - 1; i >= index; i--)
			data[i + 1] = data[i];

		data[index] = e;

		size++;
	}

	public int getCapacity() {

		return 0;
	}
	private void resize(int newCapacity){

	        E[] newData = (E[])new Object[newCapacity];
	        for(int i = 0 ; i < size ; i ++)
	            newData[i] = data[i];
	        data = newData;
	    }
	  //向数组的末尾加入元素
    public void addLast(E e){
        add(size, e);
    }

    // 向数组的开头加入元素
    public void addFirst(E e){
        add(0, e);
    }
    //删除元素
    public E removeFirst(){
        return remove(0);
    }
    //取出队首元素
    public E getFirst(){
        return get(0);
    }
    //获得某个index位置的值
    public E get(int index){
        if(index < 0 || index >= size)
            throw new IllegalArgumentException("Get failed. Index is illegal.");
        return data[index];
    }
    //删除某个index位置的值
    public E remove(int index){
        if(index < 0 || index >= size)
            throw new IllegalArgumentException("Remove failed. Index is illegal.");
        E ret = data[index];
        for(int i = index + 1 ; i < size ; i ++)
            data[i - 1] = data[i];
        size --;
        data[size] = null; // loitering objects != memory leak

        if(size == data.length / 4 && data.length / 2 != 0)
            resize(data.length / 2);
        return ret;
    }

}
