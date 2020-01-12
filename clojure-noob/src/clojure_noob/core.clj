(ns clojure-noob.core
  (:gen-class))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, dood"))

(comment
  (if true
    (do (println "Success!")
        "By Zeus's hammer!")
    (do (println "Failure!")
        "By Aquaman's trident!")) 
  (-main))