package org.ssglobal.training.codes;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestMixMatrix {
	
	private MixTransaction mix;
	
	@BeforeEach
	public void setup() {
		mix = new MixTransaction();
	}
	
	@Test
	public void testTransactArray() {
		
	}
	
	@AfterEach
	public void teardown() {
		mix = null;
	}
}
