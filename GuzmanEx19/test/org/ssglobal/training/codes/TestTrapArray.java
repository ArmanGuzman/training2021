package org.ssglobal.training.codes;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestTrapArray {
	
	private TrapArray trapArray;
	
	@BeforeEach
	public void setup() {
		trapArray = new TrapArray();
	}
	
	@Test
	public void testTransactArray() {
		trapArray.arrayTransact();
	}
	
	@AfterEach
	public void teardown() {
		trapArray = null;
	}

}
