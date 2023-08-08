@file:Suppress("RemoveEmptyPrimaryConstructor", "unused")

package mir.oslav.jet.annotations


/**
 * Signals that annotated target is heavy for ui performance and should not be used without
 * <a href="https://developer.android.com/topic/performance/baselineprofiles/overview"> Baseline
 * Profiles</a> and <a href="https://developer.android.com/topic/performance/benchmarking/macrobenchmark-overview">
 * Macro benchmark</a>.
 * @author Miroslav Hýbler <br>
 * created on 08.08.2023
 */
@Retention(value = AnnotationRetention.BINARY)
@Target(
    AnnotationTarget.FUNCTION,
    AnnotationTarget.CLASS
)
@RequiresOptIn
annotation class JetBenchmark constructor()