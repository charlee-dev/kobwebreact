package com.charleex.kobwebreact.pages

import androidx.compose.runtime.*
import browser.document
import com.charleex.kobwebreact.react.App
import com.varabyte.kobweb.core.Page
import react.create
import react.dom.client.createRoot

@Page
@Composable
fun HomePage() {
    val container = document.getElementById("root") ?: error("Couldn't find root container!")
    createRoot(container).render(App.create())
}
