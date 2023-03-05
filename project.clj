(defproject lovely-ada "0.0.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "MIT"
            :url "https://choosealicense.com/licenses/mit"}
  :dependencies [[org.clojure/clojure "1.11.1"]]
  :main ^:skip-aot lovely-ada.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all
                       :jvm-opts ["-Dclojure.compiler.direct-linking=true"]}})
