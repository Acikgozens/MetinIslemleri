package tr.edu.medipol.yoa.metin;

import static org.junit.Assert.*;

import org.junit.Test;

public class MetinIslemleriTest {

	@Test
	public void testBosluklariTemizle() {
		// GIVEN - N HAZIRLIKLAR
		String orjinalMetin = "Uc tas hos     ho saf . . . ";

		// WHEN - ASIL TEST GEREKLTR
		String sonuc = MetinIslemleri.bosluklariTemizle(orjinalMetin);
		
		// THEN - KONTROLLER
		assertEquals("Uctashoshosaf...", sonuc);

	}
	
	@Test
	public void testBosluklariTemizle2() {
		// GIVEN - N HAZIRLIKLAR
		String orjinalMetin = "Merhaba Arkadaslar";

		// WHEN - ASIL TEST GEREKLTR
		String sonuc = MetinIslemleri.bosluklariTemizle(orjinalMetin);
		
		// THEN - KONTROLLER
		assertEquals("MerhabaArkadaslar", sonuc);

	}

}
