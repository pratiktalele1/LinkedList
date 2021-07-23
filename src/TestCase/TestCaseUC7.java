package TestCase;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Classes.UC7;

class TestCaseUC7 {

	@Test
	void passTest() {
		UC7 uc7 = new UC7();
		int check = uc7.search(56);
		assertEquals(1, check);
	}
	
	@Test
	void failTest() {
		UC7 uc7 = new UC7();
		int check = uc7.search(56);
		assertEquals(0, check);
	}

}
