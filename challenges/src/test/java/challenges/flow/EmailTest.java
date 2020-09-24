package challenges.flow;

import flow.*;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.util.HashMap;
import java.util.Map;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.BasicConfigurator;

@RunWith(JUnit4.class)
public class EmailTest {

    private static final Logger logger = Logger.getLogger(EmailTest.class);

  @Test
  public void testRun_AdapterIsCompliantWithProtocol_AppHasHelloMessage() throws Exception {
    BasicConfigurator.configure();
    logger.setLevel(Level.ERROR);
    logger.info("[*] STARTING TESTS");
    IAgent user = new UserAgent();
    Map<String, IAdapter> adapters = new HashMap<String, IAdapter>();
    adapters.put("EMAIL", new EmailAdapter());
    adapters.put("SMS", new EmailAdapter());

    EmailApp app = new EmailApp();
    Engine engine = new Engine(user, adapters, app);
    engine.run();
    Assert.assertEquals("hello", app.popMessage());
  }
}
