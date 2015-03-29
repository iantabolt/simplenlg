organization := "simplenlg"

name := "simplenlg"

version := "4.4.4-SNAPSHOT"

resourceDirectory in Compile := baseDirectory.value / "res"

javaSource in Compile := baseDirectory.value / "src"

scalaSource in Compile := baseDirectory.value / "scalasrc"

javaSource in Test := baseDirectory.value / "testsrc"

libraryDependencies ++= Seq(
  "junit" % "junit" % "4.4",
  "com.sun.xml.bind" % "jaxb-impl" % "2.2.4-1"
)
