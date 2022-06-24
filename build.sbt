organization := "dev.guardrail"
name := "guardrail-all"
description := "An aggregator that depends on all standard guardrail modules"

licenses += ("MIT", url("http://opensource.org/licenses/MIT"))

crossScalaVersions := Seq("2.12.15", "2.13.8")
scalaVersion := "2.12.15"

resolvers += Resolver.sonatypeRepo("releases")
