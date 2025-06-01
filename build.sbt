val scala2Version = "2.13.16"
val scala3Version = "3.3.6"

lazy val root = project
  .in(file("."))
  .settings(
    name := "cats-effect",
    version := "0.1.0",
    scalaVersion := scala2Version,
    libraryDependencies ++= Seq(
      "org.typelevel" %% "cats-effect" % "3.6.1",
    )
  )
