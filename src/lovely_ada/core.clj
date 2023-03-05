(ns lovely-ada.core
  (:gen-class))

;; This is where the bulk of the work will go.
;;
;; The -main function is called when the program is run.

(def family
  {:dad "John"
   :mom "Jane"
   :kids ["Ada" "Grace" "Lovelace"]})

(def students
  [{:name "Ada"
    :age 12
    :grade "7th"}
   {:name "Grace"
    :age 10
    :grade "5th"}])

(def heists [{:location "Cologne, Germany"
              :cheese-name "Archbishop Hildebold's Cheese Pretzel"
              :lat 50.95
              :lng 6.97}
             {:location "Zurich, Switzerland"
              :cheese-name "The Standard Emmental"
              :lat 47.37
              :lng 8.55}
             {:location "Marseille, France"
              :cheese-name "Le Fromage de Cosquer"
              :lat 43.30
              :lng 5.37}
             {:location "Zurich, Switzerland"
              :cheese-name "The Lesser Emmental"
              :lat 47.37
              :lng 8.55}
             {:location "Vatican City"
              :cheese-name "The Cheese of Turin" 
              :lat 41.90
              :lng 12.45}])

(def keyboard-shortcuts {:zen-mode "Cmd-k z"})

(def todos [{:title "Get milk"
             :done false}
            {:title "Get cheese"
             :done false}
            {:title "Get bread"
             :done true}])

(defn say-hi 
  "Says hi to the user."
  []
  
  (println "Hi!"))

(comment
  (say-hi)

  ;; What is the name of the first kid?

  ;; What is the name of the last kid?
  
  )





(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World!"))
