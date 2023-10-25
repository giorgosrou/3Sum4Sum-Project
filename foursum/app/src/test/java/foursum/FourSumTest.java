package foursum;

import org.junit.Test;
import static org.junit.Assert.*;

public class FourSumTest {
        @Test
        public void testQuartic() {
                assertNull(FourSum.fourSumQuartic(
                                new int[] { 1, 2, 3 }));
                assertNull(FourSum.fourSumQuartic(
                                new int[] { 1, 2 }));
                assertNull(FourSum.fourSumQuartic(
                                new int[] {}));
                assertNull(FourSum.fourSumQuartic(
                                new int[] { 2, 2, 2 }));
                assertNull(FourSum.fourSumQuartic(
                                new int[] { 1, 2, 3, 4, 5, 6, 8, 9, 7, 4, 5 }));
                assertNotNull(FourSum.fourSumQuartic(
                                new int[] { 1, 2, -3, 0 }));
                assertNotNull(FourSum.fourSumQuartic(
                                new int[] { 0, 0, 0, 0 }));
                assertNotNull(FourSum.fourSumQuartic(
                                new int[] { 8, -3, 0, -5, 7, 10 }));
                assertArrayEquals(new int[] { 1, 2, -3, 0 },
                                FourSum.fourSumQuartic(
                                                new int[] { 1, 2, -3, 0 }));
                assertArrayEquals(new int[] { 0, 0, 0, 0 },
                                FourSum.fourSumQuartic(
                                                new int[] { 0, 0, 0, 0, 5, 4, 8 }));
        }

        @Test
        public void testCubic() {
                assertNull(FourSum.fourSumCubic(
                                new int[] { 1, 1, 2, 3 }));
                assertNull(FourSum.fourSumCubic(
                                new int[] { 1, 2 }));
                assertNull(FourSum.fourSumCubic(
                                new int[] {}));
                assertNull(FourSum.fourSumCubic(
                                new int[] { 2, 2, 2 }));
                assertNull(FourSum.fourSumCubic(
                                new int[] { 1, 2, 3, 4, 5, 6, 8, 9, 7, 4, 5 }));
                assertNotNull(FourSum.fourSumCubic(
                                new int[] { 1, 2, -3, 0 }));
                assertNotNull(FourSum.fourSumCubic(
                                new int[] { 0, 0, 0, 0 }));
                assertNotNull(FourSum.fourSumCubic(
                                new int[] { 8, -3, 0, -5, 7, 10 }));
                assertArrayEquals(new int[] { -3, 0, 1, 2 },
                                FourSum.fourSumCubic(
                                                new int[] { 1, 2, -3, 0 }));
                assertArrayEquals(new int[] { 0, 0, 0, 0 },
                                FourSum.fourSumCubic(
                                                new int[] { 0, 0, 0, 0, 5, 4, 8 }));

        }

        @Test
        public void testHashMap() {
                assertNull(FourSum.fourSumHashMap(
                                new int[] { 1, 2, 3 }));
                assertNull(FourSum.fourSumHashMap(
                                new int[] { 1, 2 }));
                assertNull(FourSum.fourSumHashMap(
                                new int[] {}));
                assertNull(FourSum.fourSumHashMap(
                                new int[] { 2, 2, 2, 2 }));
                assertNull(FourSum.fourSumHashMap(
                                new int[] { 1, 2, 3, 4, 5, 6, 8, 9, 7, 4, 5 }));
                assertNotNull(FourSum.fourSumHashMap(
                                new int[] { 1, 2, -3, 0 }));
                assertNotNull(FourSum.fourSumHashMap(
                                new int[] { 0, 0, 0, 0 }));
                assertArrayEquals(new int[] { 1, 2, -3, 0 },
                                FourSum.fourSumHashMap(
                                                new int[] { 1, 2, -3, 0 }));
                assertArrayEquals(new int[] { 0, 0, 0, 0 },
                                FourSum.fourSumHashMap(
                                                new int[] { 0, 0, 0, 0, 5, 4, 8 }));
        }
}
