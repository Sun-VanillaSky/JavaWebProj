package test.sun.logging;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;
import org.junit.Test;

/**
 *log4j使用的jar包 log4j-api-2.11.0.jar log4j-core-2.11.0.jar
 *
 * @author sun
 */
public class TestLog4j {
	// 使用log4j2
    private static final Logger logger = LogManager.getLogger(TestLog4j.class);

	@Test
	public  void test(){
		logger.debug("调试");
		logger.info("信息");
		logger.warn("警告");
		logger.error("错误");
		logger.fatal("严重错误");
	}
}
