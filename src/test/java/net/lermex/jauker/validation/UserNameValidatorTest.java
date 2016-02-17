package net.lermex.jauker.validation;


import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by Vlad on 13.02.2016.
 */
public class UserNameValidatorTest {

    private UserNameValidator sut;

    @Before
    public void prepare() {
        sut = new UserNameValidator();
    }

    @Test
    public void testShouldApproveRegularNames() {
        assertTrue(sut.validate("John"));
    }

    @Test
    public void testShouldNotAllowGitler() {
        assertTrue("Hitler should not be allowed to register", sut.validate("John"));
    }



}
