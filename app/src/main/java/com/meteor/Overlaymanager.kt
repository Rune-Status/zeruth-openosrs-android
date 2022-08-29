package com.meteor

object Overlaymanager {
    val overlays = ArrayList<Overlay>()

    fun renderOverlays() {
        for (overlay in overlays) {
            MainActivity.gameImage
        }
    }
}