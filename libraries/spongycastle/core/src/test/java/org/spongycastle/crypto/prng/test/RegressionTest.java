package org.spongycastle.crypto.prng.test;

import org.spongycastle.util.test.Test;
import org.spongycastle.util.test.TestResult;

public class RegressionTest
{
    public static Test[]    tests = {
        new CTRDRBGTest(),
        new DualECDRBGTest(),
        new HashDRBGTest(),
        new HMacDRBGTest(),
        new SP800RandomTest(),
        new FixedSecureRandomTest()
    };

    public static void main(
        String[]    args)
    {
        for (int i = 0; i != tests.length; i++)
        {
            TestResult  result = tests[i].perform();
            
            if (result.getException() != null)
            {
                result.getException().printStackTrace();
            }
            
            System.out.println(result);
        }
    }
}

