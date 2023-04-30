package pl.gers.jacocomultikconflict

import org.jetbrains.kotlinx.multik.api.linalg.inv
import org.jetbrains.kotlinx.multik.api.mk
import org.jetbrains.kotlinx.multik.api.ndarray
import org.jetbrains.kotlinx.multik.ndarray.operations.stack
import org.junit.Test

/**
 * A unit test that fails with java verifyError when run with JaCoCo
 */
class ExampleUnitTest {
    @Test
    fun multikest() {
        val top = mk.ndarray(doubleArrayOf(1.0, 2.0))
        val bottom = mk.ndarray(doubleArrayOf(6.0, 7.0))
        val matrix = mk.stack(top, bottom)
        mk.linalg.inv(matrix)
    }
}