(ns async-tutl.core
  (:require [clojure.browser.repl :as repl]
            [goog.dom :as dom]))

;; (repl/connect "http://localhost:9000/repl")

(enable-console-print!)

(println "Hello world!")

(.log js/console (dom/getElement "query"))