package org.ds.stack;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * @author amos
 * @date Sep 17, 2016
 * @version V0.1
 */
public class StackTest {
	
	@Test
	public void push(){
		Stack<String> stack = new ArrayStack<>();
		
		stack.push("first");
		
		Assert.assertEquals(stack.size(), 1);
		Assert.assertEquals(stack.top(), "first");
		Assert.assertEquals(stack.pop(), "first");
		Assert.assertEquals(stack.size(), 0);
	}
}
