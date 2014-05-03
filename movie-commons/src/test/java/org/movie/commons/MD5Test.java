package org.movie.commons;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author amos
 * @date May 3, 2014 4:17:36 PM
 */
public class MD5Test {

	@Test
	public void md5() {
		String codeStr = "amos";
		Assert.assertEquals("2869191f3991a5611e8991dd59f9987d",
				MD5.md5(codeStr));
	}
	
	@Test
	public void md5L16(){
		String codeStr = "amos";
		Assert.assertEquals("3991a5611e8991dd",
				MD5.md5L16(codeStr));
	}
}
