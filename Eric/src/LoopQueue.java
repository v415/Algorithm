
public class LoopQueue<E> implements Queue<E> {

	private E[] data;
	private int front, tail;
	private int size;// 队列中元素的多少

	public LoopQueue(int capacity) {
		data = (E[]) new Object[capacity + 1];
		front = 0;// 初始化
		tail = 0;
		size = 0;
	}

//	public LoopQueue() {//无参的构造函数,因为有的时候并不预先给出数组的capacity
//		this(capacity:10); //直接调用，为capacity赋值为10
//	}

	public int getCapacity() {
		return data.length - 1;// LoopQueue内部E[]数组中会有一个单位是被有意识的浪费了，所以真正的容量是数组长度减1
	}

	@Override
	public boolean isEmpty() {
		return front == tail;
	}

	@Override
	public int getSize() {
		return size;
	}

	@Override
	public void enqueue(E e) {
		if ((tail + 1) % data.length == front) {
			resize(getCapacity() * 2);// 扩容
			data[tail] = e;
			tail = (tail + 1) % data.length;
			size++;
		}
	}

	@Override
	public E dequeue() {
		if (isEmpty())
			throw new IllegalArgumentException("空队列不能进行删除操作");
		E ret = data[front];
		data[front] = null;
		front = (front + 1) % data.length;
		size--;
		// 缩小容量
		if (size == getCapacity() / 4 && getCapacity() / 2 != 0)
			resize(getCapacity() / 2);
		return ret;
	}

	@Override
	public E getFront() {
		if (isEmpty())
			throw new IllegalArgumentException("队列为空");
		return data[front];
	}

	private void resize(int newCapacity) {
		E[] newData = (E[]) new Object[newCapacity + 1];
		for (int i = 0; i < size; i++)
			newData[i] = data[(i + front) % data.length];
		data = newData;
		front = 0;
		tail = size;
	}

	@Override
	public String toString() {
		StringBuilder res = new StringBuilder();
		// append()是往动态字符串数组添加，跟“xxxx”+“yyyy”相当那个‘+’号 
		res.append(String.format("Queue:size =%d, capacity =%d\n", size, getCapacity()));
		res.append("front [");
		for (int i = front; i != tail; i = (i + 1) % data.length) {
			res.append(data[i]);// 注意此处调用的方法为get（i）
			if ((i + 1) % data.length != tail)
				res.append(", ");
		}
		res.append("] tail");
		return res.toString();
	}

	public static void main(String[] args) {
		LoopQueue<Integer> queue = new LoopQueue<>(10);
	       for(int i=0;i<10;i++) {
	    	   queue.enqueue(i);   	  
	    	   System.out.println(queue);
	    	   if(i % 3==2) {//每隔3个数字，执行出队操作
	        	   queue.dequeue();
	        	   System.out.println(queue);
	           }
	       }
	}

}
