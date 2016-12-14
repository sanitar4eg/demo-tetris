(defproject demo-tetris "0.1.0-SNAPSHOT"
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [org.clojure/clojurescript "1.9.293"]
                 [org.clojure/core.async "0.2.395"]
                 [rum "0.10.7"]
                 [figwheel-sidecar "0.5.8"]]
  :plugins [[lein-cljsbuild "1.1.5"]]
  :figwheel {:nrepl-port 7888
             :css-dirs ["css"]}
  :source-paths ["src"]
  :clean-targets ^{:protect false} [:target-path "resources/public/out" "resources/public/game.js"]
  :cljsbuild {:builds [{:id           "dev"
                        :source-paths ["src"]
                        :figwheel     true
                        :compiler     {:main       game.core
                                       :asset-path "out"
                                       :output-to  "resources/public/game.js"
                                       :output-dir "resources/public/out"}}]})
