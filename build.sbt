name := "batchStream"

version := "1.0"

scalaVersion := "2.10.5"

val sparkVersion = "1.6.0"

libraryDependencies ++= Seq(
 "org.apache.spark" %% "spark-core" % sparkVersion % "provided",
 "org.apache.spark" %% "spark-streaming" % sparkVersion % "provided",
 "org.apache.spark" %% "spark-mllib" % sparkVersion % "provided"
)

bintrayOrganization := Some("spark-clustering-notebook")

bintrayEnsureLicenses := false

