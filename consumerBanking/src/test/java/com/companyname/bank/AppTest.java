package com.companyname.bank;

import org.junit.Before;
import org.junit.Test;

public class AppTest {
	 
	@Before
    public void testcaseFirst()
    {
        App.N = 7;
        App.K = 3;
        long[] temp = {10l, 100l, 300l, 200l, 1000l, 20l, 30l};
        App.arr = temp;
    }
    
    @Test
    public void testcaseSecond()
    {
    	
    	App.max_min(App.N, App.K, App.arr);
        
    }


}
