organization := "spartakus"

name := "batchStream"

version := "1.0.0"

scalaVersion := "2.10.5"

val sparkVersion = "1.6.2"

libraryDependencies ++= Seq(
 "org.apache.spark" %% "spark-core" % sparkVersion % "provided",
 "org.apache.spark" %% "spark-streaming" % sparkVersion % "provided",
 "org.apache.spark" %% "spark-mllib" % sparkVersion % "provided"
)

bintrayOrganization := Some("spark-clustering-notebook")

licenses += ("Apache-2.0", url("https://www.apache.org/licenses/LICENSE-2.0.html"))

credentials += Credentials(Path.userHome / ".bintray" / ".credentials")

