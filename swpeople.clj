; Require clj-http.client and cheshire
(ns swpeople 
    (:require [clj-http.client :as client] 
              [cheshire.core :as cheshire]))
              
; request the star wars api's people
(defn getPeople
    []
    (let [response (client/get "https://swapi.co/api/people")
          body (cheshire/parse-string (:body response) true)]
          (:results body)))

; anonymous function to bring the name of the people
(map #(:name %) people)