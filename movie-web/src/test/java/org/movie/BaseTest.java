package org.movie;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
//import org.testng.annotations.Test;

/**
 * @author amos
 * @since 1.0, Sep 8, 2014 9:42:30 PM
 */

@ContextConfiguration(locations = { "classpath*:spring/context-*.xml" })
public class BaseTest extends AbstractTestNGSpringContextTests{

}
