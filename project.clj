 (defproject message "0.1.0"
   :description "A simple message app"
   :dependencies [[environ "1.0.0"]
                  [org.clojure/clojure "1.8.0"]
                  [metosin/compojure-api "1.1.11"]]
   :ring {:handler message.handler/app}
   :uberjar-name "server.jar"
   :plugins [[lein-environ "1.0.0"]]
   :profiles {:dev {:dependencies [[javax.servlet/javax.servlet-api "3.1.0"]
                                  [cheshire "5.5.0"]
                                  [ring/ring-mock "0.3.0"]]
                   :plugins [[lein-ring "0.12.0"]]}})
