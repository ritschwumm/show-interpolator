import scala.language.experimental.macros

package object showInterpolator {
    implicit final class ShowStringContextExt(peer:StringContext) {
        def show(args:Any*):String  = macro ShowMacros.showImpl
    }
}
