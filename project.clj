(defproject threejs-eggs-cljs "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.6.0"]
                 [org.clojure/clojurescript "0.0-2202"]
                 [compojure "1.1.6"]
                 [ring "1.2.2"]
                 [cljsthree "0.1.2-SNAPSHOT"]]
  :repositories [["cljsthree-local"
                  "file:///D:/cygwin/home/l.jones/professional/projects/cljsthree/target/cljsthree-0.1.2-SNAPSHOT.jar"]]
  :source-paths ["src/clj"]
  :plugins [[lein-cljsbuild "1.0.3"]
            [lein-ring "0.8.10"]]
  :ring {:handler c3js_eggs.core/handler}
  :hooks [leiningen.cljsbuild]
  :cljsbuild {:builds
              {:debug {:source-paths ["src/cljs"]
                       :compiler {:output-to
                                  "resources/public/examples.js"
                                  :optimizations :whitespace
                                  :pretty-print true}}}})
