@file:Suppress("RemoveEmptyPrimaryConstructor", "unused")

package mir.oslav.jet.annotations

import androidx.annotation.experimental.Experimental

/**
 * Annotates target as "Experimental" which means annotated target's implementation can change at
 * any time without warning.
 * @since 1.0.0
 * @author Miroslav Hýbler <br>
 * created on 06.08.2O23
 */
@Retention(value = AnnotationRetention.BINARY)
@Target(
    AnnotationTarget.FUNCTION,
    AnnotationTarget.CLASS
)
@RequiresOptIn
annotation class JetExperimental constructor()
