(ns earth-rumble-vi.handler
  (:use compojure.core
        hiccup.core)
  (:require [compojure.handler :as handler]
            [compojure.route :as route]
            [earth-rumble-vi.contest :as contest]))

(defn hello-user
  [id]
  (prn id)
  (html
    [:p "hello " id]))

(defroutes app-routes
  (GET "/contest/:id" [id] (contest/page id))
  (GET "/problem/:id/:file" [id file] (slurp-resource (str "public/problem/" id "/" file))
  (route/not-found "Not Found"))

(def app
  (handler/site app-routes))
