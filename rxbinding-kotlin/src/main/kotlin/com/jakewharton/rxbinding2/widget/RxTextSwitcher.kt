@file:Suppress(
    names = "NOTHING_TO_INLINE"
)

package com.jakewharton.rxbinding2.widget

import android.widget.TextSwitcher
import io.reactivex.functions.Consumer
import kotlin.Suppress

/**
 * An action which sets the text property of `view`.
 *
 * *Warning:* The created observable keeps a strong reference to `view`. Unsubscribe
 * to free this reference.
 */
inline fun TextSwitcher.text(): Consumer<in CharSequence> = RxTextSwitcher.text(this)

/**
 * An action which sets the current text property of `view`.
 *
 * *Warning:* The created observable keeps a strong reference to `view`. Unsubscribe
 * to free this reference.
 */
inline fun TextSwitcher.currentText(): Consumer<in CharSequence> = RxTextSwitcher.currentText(this)
