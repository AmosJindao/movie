package org.movie.commons.utils;


import org.testng.Assert;
import org.testng.annotations.Test;

public class CommonUtilsTest{

    @Test
    public void isEmail(){
        Assert.assertTrue(CommonUtils.isEmail("123@jjk.com"));
    }
}
