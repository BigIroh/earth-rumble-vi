(defproject earth-rumble-vi "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :dependencies [[org.clojure/clojure "1.4.0"]
                 [markdown-clj "0.9.19"]
                 [hiccup "1.0.2"]
                 [lib-noir "0.3.5"]
                 [compojure "1.1.5"]]
  :plugins [[lein-ring "0.8.2"]]
  :ring {:handler earth-rumble-vi.handler/app}
  :profiles
  {:dev {:dependencies [[lein-cljsbuild "0.3.0"]
                        [ring-mock "0.1.3"]]}})
