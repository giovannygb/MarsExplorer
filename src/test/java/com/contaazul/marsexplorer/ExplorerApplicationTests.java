package com.contaazul.marsexplorer;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Rule;
import org.junit.Test;
import org.springframework.boot.test.rule.OutputCapture;

public class ExplorerApplicationTests {
	@Rule
	public OutputCapture outputCapture = new OutputCapture();

	private static final String SPRING_STARTUP = "root of context hierarchy";

	@Test
	public void shouldInitApplication() throws Exception {
		ExplorerApplication.main(new String[] {});
		assertThat(this.outputCapture.toString().contains(SPRING_STARTUP), is(true));
	}
}
