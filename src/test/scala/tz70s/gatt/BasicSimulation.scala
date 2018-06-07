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

package tz70s.gatt

import io.gatling.core.Predef._
import io.gatling.http.Predef._

class BasicSimulation extends Simulation {

  import scala.concurrent.duration._

  val httpConf = http.baseURL("http://www.google.com").acceptHeader("text/html")

  val scene = scenario("BasicSimulation")
    .repeat(5) {
      exec(
        http("request-1")
          .get("/"))
    }

  setUp(scene.inject(atOnceUsers(1))).protocols(httpConf)

}
