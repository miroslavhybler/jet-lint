@file:Suppress("UnstableApiUsage", "RemoveEmptyPrimaryConstructor")

package mir.oslav.jet.lint

import com.android.tools.lint.client.api.IssueRegistry
import com.android.tools.lint.client.api.Vendor
import com.android.tools.lint.detector.api.Issue
import com.google.auto.service.AutoService
import com.android.tools.lint.detector.api.CURRENT_API


/**
 * @author Miroslav Hýbler <br>
 * created on 06.08.2023
 */
@AutoService(value = [IssueRegistry::class])
class JetIssueRegistry constructor() : IssueRegistry() {


    override val api: Int
        get() = CURRENT_API

    override val minApi: Int
        get() = 7

    override val vendor: Vendor
        get() = Vendor(
            vendorName = "miroslavhybler/jet-lint",
            identifier = "mir.oslav.jet.annotations",
            feedbackUrl = "https://github.com/miroslavhybler/jet-annotations/issues",
        )

    //TODO
    override val issues: List<Issue> = listOf()
}