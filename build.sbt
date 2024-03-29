/*
 * Copyright 2018 Tzu-Chiao Yeh.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

name := "gatt"

val settings = Seq(
  version := "0.1",
  scalaVersion := "2.12.6"
)

val dependencies = Seq(
  "io.gatling.highcharts" % "gatling-charts-highcharts" % "2.3.1",
  "io.gatling" % "gatling-test-framework" % "2.3.1" % "test"
)

enablePlugins(GatlingPlugin)

lazy val root = (project in file("."))
  .settings(
    settings,
    libraryDependencies ++= dependencies
  )