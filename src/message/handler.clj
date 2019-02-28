(ns message.handler
  (:require [compojure.api.sweet :refer :all]
            [environ.core :refer [env]]
            [ring.util.http-response :refer :all]
            [schema.core :as s]))

(defn- get-message []
  {:message (env :message)})

(s/defschema Message
  {:message s/Str})

(def app
  (api
    {:swagger
     {:ui "/"
      :spec "/swagger.json"
      :data {:info {:title "Message"
                    :description "Compojure Api example"}
             :tags [{:name "api", :description "some apis"}]}}}
    (GET "/health" []
         :return {:health s/Str}
         :summary "health check url"
         (ok {:health "ok"}))

    (GET "/message" []
         :return Message
         :summary "Echos a message"
         (ok (get-message)))))
