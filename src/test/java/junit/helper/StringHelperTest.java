package junit.helper;


import org.junit.Assert;
import org.junit.Test;

public class StringHelperTest {


    @Test
    public void testTruncateAInFirst2Positions_Ainfirst2Positions() {
        //Ex: AACD => Res: CD
        Assert.assertEquals(new StringHelper().truncateAInFirst2Positions("AACD"), "CD");
    }

    @Test
    public void testTruncateAInFirst2Positions2_Ainfirst1Position() {
        //Ex:ACD=>  Res: CD
        Assert.assertEquals(new StringHelper().truncateAInFirst2Positions("ACD"), "CD");
    }

    @Test
    public void testTruncateAInFirst2Positions2_AinAnyPosition() {
        //Ex:CDEF=>  Res: CDEF
        Assert.assertEquals(new StringHelper().truncateAInFirst2Positions("CDEF"), "CDEF");
    }

    @Test
    public void testTruncateAInFirst2Positions2_Ain2lastPosition() {
        //Ex:CDAA=>  Res: CDAA
        Assert.assertEquals(new StringHelper().truncateAInFirst2Positions("CDAA"), "CDAA");
    }


    @Test
    public void testAreFirstAndLastTwoCharactersTheSameTheBasicNegativeScenario() {
        //ABCD => FALSE,A=>FALSE
        Assert.assertFalse(new StringHelper().areFirstAndLastTwoCharactersTheSame("A"));
        Assert.assertFalse(new StringHelper().areFirstAndLastTwoCharactersTheSame("ABCD"));
    }

    @Test
    public void testAreFirstAndLastTwoCharactersTheSameTheBasicPositiveScenario() {
        //ABAB=>TRUE,AB=>TRUE,
        Assert.assertTrue(new StringHelper().areFirstAndLastTwoCharactersTheSame("ABAB"));
        Assert.assertTrue(new StringHelper().areFirstAndLastTwoCharactersTheSame("AB"));
    }
}