
public class ArrayQueue<E> implements Queue<E> {
	private Array<E> array;

	public ArrayQueue(int capacity) {
		array = new Array<>(capacity);
	}
	// public ArrayQueue() {
	// array=new Array<>();
	// }
	@Override
	public int getSize() {
		return array.getSize();
	}

	@Override
	public boolean isEmpty() {
		return array.isEmpty();
	}

	@Override
	public int getCapacity() {
		return array.getCapacity();
	}
	
	@Override
	public E getFront() {
		return array.getFirst();
	}
	
	@Override
	public void enqueue(E e) {
		array.addLast(e);	//�Ӷ�β��Ԫ��
	}
	
	@Override
	public E dequeue() {
		return array.removeFirst();//�Ӷ���ͷȡԪ�أ������Ƚ��ȳ�
	}

	@Override
	public String toString() {
		StringBuilder res = new StringBuilder();
		res.append("Queue:");
		res.append("front [");
		for (int i = 0; i < array.getSize(); i++) {
			res.append(array.get(i));//ע��˴����õķ���Ϊget��i��
			if (i != array.getSize() - 1)
				res.append(", ");
		}
		res.append("] tail");
		return res.toString();
	}

	public static void main(String[] args) {
       ArrayQueue<Integer> queue = new ArrayQueue<>(10);
       for(int i=0;i<10;i++) {
    	   queue.enqueue(i);   	  
    	   System.out.println(queue);
    	   if(i % 3==2) {
        	   queue.dequeue();
        	   System.out.println(queue);
           }
       }
         
	}	

}
