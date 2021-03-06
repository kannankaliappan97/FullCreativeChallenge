package io.testproject.generated.tests.fullcreativechallange;

import io.testproject.java.enums.AutomatedBrowserType;
import io.testproject.java.execution.results.StepExecutionResult;
import io.testproject.java.sdk.v2.Runner;
import java.lang.Exception;
import java.lang.String;

/**
 * This class was automatically generated by TestProject
 * Provides an example how to run coded TestProject tests
 */
public class FullcreativechallangeRunner {
  public static String developerToken = "DcWUAq9A5TcfAXo44BFSoFvNF7OO_LULeQlcg0Azcmk1";

  public static AutomatedBrowserType browserType = AutomatedBrowserType.Chrome;

  public static void main(String[] args) {
    try {
      runDarwcreate();
    }
    catch (Exception e) {
    }
  }

  /**
   * Runs "Darwcreate"
   */
  public static StepExecutionResult runDarwcreate() throws Exception {
    Runner runner = Runner.createWeb(developerToken,browserType);
    return runner.run(new Darwcreate(), true);
  }
}
