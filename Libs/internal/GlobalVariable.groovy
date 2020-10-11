package internal

import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.main.TestCaseMain


/**
 * This class is generated automatically by Katalon Studio and should not be modified or deleted.
 */
public class GlobalVariable {
     
    /**
     * <p></p>
     */
    public static Object username
     
    /**
     * <p></p>
     */
    public static Object usernames
     
    /**
     * <p></p>
     */
    public static Object URL
     
    /**
     * <p></p>
     */
    public static Object UsernameDev
     
    /**
     * <p></p>
     */
    public static Object UsernameQA
     
    /**
     * <p></p>
     */
    public static Object UsernameFail
     
    /**
     * <p></p>
     */
    public static Object PassQA
     
    /**
     * <p></p>
     */
    public static Object PassFail
     

    static {
        try {
            def selectedVariables = TestCaseMain.getGlobalVariables("default")
			selectedVariables += TestCaseMain.getGlobalVariables(RunConfiguration.getExecutionProfile())
            selectedVariables += RunConfiguration.getOverridingParameters()
    
            username = selectedVariables['username']
            usernames = selectedVariables['usernames']
            URL = selectedVariables['URL']
            UsernameDev = selectedVariables['UsernameDev']
            UsernameQA = selectedVariables['UsernameQA']
            UsernameFail = selectedVariables['UsernameFail']
            PassQA = selectedVariables['PassQA']
            PassFail = selectedVariables['PassFail']
            
        } catch (Exception e) {
            TestCaseMain.logGlobalVariableError(e)
        }
    }
}
