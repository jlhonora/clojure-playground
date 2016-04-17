(ns hello-world.core
  (:gen-class))

(defn get-names
  ([names]
   (if (== (count names) 0) "World" names)))

(defn get-phrase
  ([names]
    (str "Hello, " (clojure.string/join (get-names names)))
  )
)

(defn -main
  [& args]
  (println (get-phrase args)))
