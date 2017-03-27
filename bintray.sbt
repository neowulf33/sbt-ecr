bintrayOrganization  := Some("neowulf33")
bintrayRepository    := "sbt-plugins"
bintrayVcsUrl        := Some("git@github.com:neowulf33/sbt-ecr.git")

publishMavenStyle       := false
publishArtifact in Test := false

publish <<= publish dependsOn (test in Test)
