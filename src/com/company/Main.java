package com.company;
import ibadts.Collection;
import static ibio.Helpers.*;

public class Main {

    public static void main(String[] args) {
		Collection <Integer> numbers = new Collection<> ();
		numbers.add( new Integer[] {1,2,3,4,5,6,7,8,9,10,11});
		double largest = 0;
		int x = 0;
		while (numbers.hasNext()){
	    	x = numbers.getNext();
	    	if (x > largest)
	        	largest = x;
    	}
		numbers.resetNext();
		while(numbers.hasNext()){
	    	x = numbers.getNext();
	    	if (x<largest/2)
            	System.out.println(x);
    	}
		Collection <String> names = new Collection<> ();
		names.add(new String[] {"John", "Marie"});
		for (int i = 0; i <= 2; i++) {
			names.resetNext();
			while(names.hasNext()){
				System.out.println(names.getNext());
			}
		}
		Collection <Integer> nums = new Collection<>();
		boolean flag = true;
		int t = 0;
		while(flag){
			int number = inputInt("number pls");
			if(number<=0)
				flag = false;
			else{
				nums.addItem(number);
				t = number;
			}
		}
		while(nums.hasNext()){
			int number = nums.getNext();
			if(number<t)
				output(number);
		}
		Collection <Integer> numeros = new Collection<>();
		flag = true;
		int sum = 0;
		int length = 0;
		while(flag){
			int number = inputInt("number pls");
			if(number<=0)
				flag = false;
			else{
				numeros.addItem(number);
				sum += number;
				length ++;
			}
		}
		double average = sum/length;
		System.out.println(average);
		while(numeros.hasNext()){
			int number = numeros.getNext();
			if(number/average<0.5 || number/average>1.5)
				output(number);
		}
    }
}
