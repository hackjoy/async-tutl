nil (do (set! *warn-on-reflection* nil) (require (quote cljsbuild.compiler) (quote cljsbuild.crossover) (quote cljsbuild.util)) (try (do (do (clojure.core/letfn [(copy-crossovers__1397__auto__ [] (cljsbuild.crossover/copy-crossovers "/Users/jackhoy/code/toys/async-tutl/target/cljsbuild-crossover" (quote [])))] (copy-crossovers__1397__auto__) (clojure.core/when true (cljsbuild.util/once-every-bg 1000 "copying crossovers" copy-crossovers__1397__auto__)) (clojure.core/let [crossover-macro-paths__1398__auto__ (cljsbuild.crossover/crossover-macro-paths (quote [])) builds__1399__auto__ (clojure.core/for [opts__1400__auto__ (quote ({:parsed-notify-command {:shell ()}, :id "dev", :source-paths ["src"], :jar false, :notify-command nil, :incremental true, :assert true, :compiler {:output-dir "out", :externs ["closure-js/externs"], :cache-analysis true, :optimizations :none, :warnings true, :output-to "out/async_tutl.js", :source-map true, :libs ["closure-js/libs"], :main async-tutl.core, :pretty-print true}}))] [opts__1400__auto__ (cljs.env/default-compiler-env (:compiler opts__1400__auto__))])] (clojure.core/loop [dependency-mtimes__1401__auto__ (clojure.core/repeat (clojure.core/count builds__1399__auto__) {})] (clojure.core/let [builds-mtimes__1402__auto__ (clojure.core/map clojure.core/vector builds__1399__auto__ dependency-mtimes__1401__auto__) new-dependency-mtimes__1403__auto__ (clojure.core/doall (clojure.core/for [[[build__1404__auto__ compiler-env__1405__auto__] mtimes__1406__auto__] builds-mtimes__1402__auto__] (clojure.core/binding [cljs.env/*compiler* compiler-env__1405__auto__] (cljsbuild.compiler/run-compiler (:source-paths build__1404__auto__) "/Users/jackhoy/code/toys/async-tutl/target/cljsbuild-crossover" crossover-macro-paths__1398__auto__ (:compiler build__1404__auto__) (:parsed-notify-command build__1404__auto__) (:incremental build__1404__auto__) (:assert build__1404__auto__) mtimes__1406__auto__ true))))] (clojure.core/when true (java.lang.Thread/sleep 100) (recur new-dependency-mtimes__1403__auto__))))))) (java.lang.System/exit 0)) (catch cljsbuild.test.TestsFailedException e__1393__auto__ (java.lang.System/exit 1)) (catch java.lang.Exception e__1393__auto__ (do (.printStackTrace e__1393__auto__) (java.lang.System/exit 1)))))