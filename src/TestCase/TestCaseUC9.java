package TestCase;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import Classes.UC9;

class TestCaseUC9 {

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void passTest() {
		UC9 uc =new UC9();
		int result=uc.deleteAfter(40);
		assertEquals(1, result);
	}

}
