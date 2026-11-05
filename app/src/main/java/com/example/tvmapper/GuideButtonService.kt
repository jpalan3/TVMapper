package com.example.tvmapper

import android.accessibilityservice.AccessibilityService
import android.view.KeyEvent
import android.view.accessibility.AccessibilityEvent
import android.util.Log

class GuideButtonService : AccessibilityService() {
    override fun onAccessibilityEvent(event: AccessibilityEvent?) {}
    override fun onInterrupt() {}

    override fun onKeyEvent(event: KeyEvent?): Boolean {
        if (event != null && event.keyCode == KeyEvent.KEYCODE_GUIDE) {
            if (event.action == KeyEvent.ACTION_DOWN) {
                Log.d("GuideButtonMap", "Guide button intercepted!")
                // Your custom launch code will go here
            }
            return true
        }
        return super.onKeyEvent(event)
    }
}
