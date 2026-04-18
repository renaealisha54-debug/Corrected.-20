package com.corrected

import android.inputmethodservice.InputMethodService
import android.view.View
import android.view.LayoutInflater
import android.view.inputmethod.EditorInfo

class CorrectedService : InputMethodService() {

    // This is called when the keyboard is first created
    override fun onCreateInputView(): View {
        // You need to create a layout file at: res/layout/keyboard_view.xml
        // If you don't have that file yet, the build will fail.
        val inflater = LayoutInflater.from(this)
        return inflater.inflate(R.layout.keyboard_view, null)
    }

    // This handles what happens when a text field is clicked
    override fun onStartInputView(info: EditorInfo?, restarting: Boolean) {
        super.onStartInputView(info, restarting)
        // Your logic to initialize your keyboard goes here
    }
}
