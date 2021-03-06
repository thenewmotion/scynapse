resolvers += Resolver.url(
  "bintray-sbt-plugin-releases",
    url("http://dl.bintray.com/content/sbt/sbt-plugin-releases"))(
        Resolver.ivyStylePatterns)
        
addSbtPlugin("com.github.gseitz" % "sbt-release" % "0.8.4")

addSbtPlugin("com.orrsella" % "sbt-sublime" % "1.0.9")

addSbtPlugin("me.lessis" % "bintray-sbt" % "0.1.2")
