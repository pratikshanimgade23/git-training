package testing;

import static org.junit.Assert.assertEquals;

import org.junit.*;
public class MeasurementTest 
{
	Measurement m = new Measurement(5);
	@Test
	public void testAdd()
	{
		m.add(m);
		assertEquals(10, m.getValue());
	}
	public void testSub()
	{
		m.sub(m);
		assertEquals(10, m.getValue());
	}
}
