package Solutions;

import Solutions.Programmers.TransformBracelets;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TransformBraceletsTest {
    @Test
    public void Case1()
    {
        TransformBracelets sol = new TransformBracelets();
        assertEquals(sol.solution("(()())()"), "(()())()");
    }

}