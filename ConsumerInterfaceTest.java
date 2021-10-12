/**
 * 
 */
package tomboja_mpp_java_lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Consumer;

/**
 * @author: tdessalegn
 * @email: tdessalegn@miu.edu
 * @date: Oct 12, 2021
 */
public class ConsumerInterfaceTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<String> names = Arrays.asList(new String[]{"James", "Todd", "Sara"});
		ConsumerInterface consumer = new ConsumerInterface() {
			
			@Override
			public void accept() {
				//compiler error because of self referal
				//System.out.println("Nothing! in " + consumer.getClass().getSimpleName());
			}
		};
		
		Consumer<String> consumer2 = new Consumer<String>() {	
			@Override
			public void accept(String t) {
				System.out.println(t.toUpperCase());
				
			}
		};
		
		BiFunction<Integer, Integer, Integer> twoXplusY = new BiFunction<Integer, Integer, Integer>() {
			
			@Override
			public Integer apply(Integer t, Integer u) {
				return 2 * t + u;
			}
		};
		
		// BiFunction with 𝝺 expression
		BiFunction<Integer, Integer, Integer> adder = (x, y) -> 2 * x + y;
		names.forEach(consumer2);
		
		System.out.println("=========Using 𝝺 expression============");
		names.forEach(name -> System.out.println(name.toUpperCase()));
		
		System.out.println("=========Using BiFunction==============");
		System.out.println(twoXplusY.apply(3, 4)); // 2 * 3 + 4 = 10
		
		System.out.println("====BiFunction using 𝝺 expression======");
		System.out.println(adder.apply(3, 4));
		
	}
}
