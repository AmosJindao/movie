package org.movie.commons.utils;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * @author amos
 * @date May 3, 2014 4:17:36 PM
 */
public class MD5Test {

	@Test
	public void md5() {
		String codeStr = "amos";
		Assert.assertEquals(MD5.md5(codeStr), "2869191f3991a5611e8991dd59f9987d");
	}
	
	@Test
	public void md5L16(){
		String codeStr = "amos";
		Assert.assertEquals(MD5.md5L16(codeStr),"3991a5611e8991dd");
	}
}
