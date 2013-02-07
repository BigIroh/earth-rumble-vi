(ns earth-rumble-vi.handler
  (:use compojure.core
        hiccup.core)
  (:require [compojure.handler :as handler]
            [compojure.route :as route]))

(defn hello-user
  [id]
  (prn id)
  (html
    [:p "hello " id]))

(defroutes app-routes
  (GET "/:id" [id] (hello-user id))
  (route/not-found "Not Found"))

(def app
  (handler/site app-routes))
