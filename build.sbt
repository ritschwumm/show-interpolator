name			:= "show-interpolator"
organization	:= "de.djini"
version			:= "0.0.1"
scalaVersion	:= "2.12.4"
scalacOptions	++= Seq(
	"-deprecation",
	"-unchecked",
	"-language:implicitConversions",
	"-feature",
	"-Ywarn-unused-import",
	"-Xfatal-warnings",
	"-Xlint"
)
libraryDependencies	+= "org.scala-lang"	%	"scala-reflect"	% scalaVersion.value	% "provided"
libraryDependencies	+= "org.specs2"		%%	"specs2-core"	% "4.0.1"				% "test"
