/**
 * 
 */
package tomboja_mpp_java_lambdas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.*;

/**
 * @author: tdessalegn
 * @email: tdessalegn@miu.edu
 * @date: Oct 12, 2021
 */
public class _MyConsumer {

	String names[] = new String[]{"James", "Todd", "Sara"};
	List<String> randomList = Arrays.asList(names);
	List<String> upperCased = new ArrayList<>();
	
	// Local inner class implementing Consumer
	class MyConsumer implements Consumer<String> {

		@Override
		public void accept(String t) {
			// make it upper case 
			// access to upperCased var is because of closure
			String upper = t.toUpperCase();
			upperCased.add(upper);	
		}		
	}
	
	public void print() {
		MyConsumer consumer = new MyConsumer();
		randomList.forEach(consumer);
		System.out.println(upperCased);
		
	}
	
	
	
	public static void main(String[] args) {
		_MyConsumer myConsumer = new _MyConsumer();
		myConsumer.print();

	}

}
