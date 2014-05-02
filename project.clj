(defproject visualizer "0.1.0-SNAPSHOT"
  :description "FIXME: write this!"
  :url "http://exampl.com/FIXME"
  :jvm-opts ["-Xmx3g" "-server"] 
  :min-lein-version "2.0.0"
  :dependencies [[org.clojure/clojure "1.5.1"]
                 [ring/ring-core "1.1.8"]
                 [ring/ring-jetty-adapter "1.1.8"]
                 ;[enfocus "2.0.0-SNAPSHOT"]
                 [domina "1.0.2"]
                 [me.raynes/laser "1.1.1"]
                 [net.mikera/core.matrix "0.17.0"]
                 [compojure "1.1.6"]
                 [suub/error-codes "0.1.0"]] 
  :plugins [[lein-cljsbuild "0.3.2"]
            [lein-ring "0.8.3"]]
  :cljsbuild {:builds [{:source-paths ["src"],
                        :compiler {:output-to "resources/public/js/main.js"}}]}
  :ring {:handler ocr-visualizer.server/app})