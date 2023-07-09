@file:JsModule("react-player")
@file:JsNonModule

package com.charleex.kobwebreact.react

import react.*

@JsName("default")
external val ReactPlayer: ComponentClass<ReactPlayerProps>

external interface ReactPlayerProps : Props {
    var url: String
    var controls: Boolean
}
