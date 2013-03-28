organization := "info.schleichardt"

name := "play-2-mailplugin"

version := "0.6.1"

scalaVersion := "2.10.0"

resolvers ++= Seq(
  "Alfresco Maven Repository" at "https://maven.alfresco.com/nexus/content/groups/public/")

libraryDependencies ++= Seq(
  "play" %% "play" % "2.1.0",
  "org.apache.commons" % "commons-email" % "1.2")

publishTo <<= version { (v: String) =>
  Some(Resolver.url("Elogistics Artifactory", new URL("http://artifactory.elogistics.net/artifactory/third-party-releases/")))
}