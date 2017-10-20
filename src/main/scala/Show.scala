package showInterpolator

object Show {
    def apply[T](implicit ev:Show[T]):Show[T]   = ev

    def instance[T](func:T=>String):Show[T] =
            new Show[T] {
                def show(it:T):String   = func(it)
            }

    def doit[T](value:T)(implicit S:Show[T]):String = S show value

    //------------------------------------------------------------------------------

    implicit val StringShow:Show[String]    = instance(identity[String])
    implicit val ByteShow:Show[Byte]        = toStringInstance
    implicit val ShortShow:Show[Short]      = toStringInstance
    implicit val IntShow:Show[Int]          = toStringInstance
    implicit val LongShow:Show[Long]        = toStringInstance
    implicit val FloatShow:Show[Float]      = toStringInstance
    implicit val DoubleShow:Show[Double]    = toStringInstance
    implicit val CharShow:Show[Char]        = toStringInstance
    implicit val BooleanShow:Show[Boolean]  = toStringInstance

    def toStringInstance[T]:Show[T] = Show instance (_.toString)
}

trait Show[T] {
    def show(it:T):String
}
