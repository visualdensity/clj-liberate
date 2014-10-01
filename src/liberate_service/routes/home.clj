(ns liberate-service.routes.home
  (:require [compojure.core :refer :all]
            [liberator.core :refer [defresource resource request-method-in]]
  )
)

(defresource home
  :handle-ok "Hello fucka!"
  :etag "fixed-tag"
  :available-media-types ["text/plain"]
)

(defroutes home-routes
  (ANY "/" request home)
);;defroutes
